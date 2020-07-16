package com.xhz.sql;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xhz.bean.User;
import com.xhz.druid.JDBCUtils;

public class FindUser {
	public static void main(String[] args) {
		findUser();
	}

	private static void findUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		//jt.queryForObject(sql, requiredType,args)
		User user = jt.queryForObject("select * from person where id=?",new BeanPropertyRowMapper<>(User.class),3);
		
		System.out.println(user);

		
		
	}
}
