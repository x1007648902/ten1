package com.xhz.jdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xhz.druid.JDBCUtils;
import com.xhz.bean.User;

public class TestJdbcTemplate02 {
	public static void main(String[] args) {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "select* from person";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		
		for (User user : list){
			System.out.println(user);
		}
		
	}
}
