package com.xhz.sql;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xhz.bean.User;
import com.xhz.druid.JDBCUtils;

public class UpdateUser {
	public static void main(String[] args) {
		updateUser();
	}

	private static void updateUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		int update =jt.update("update person set name=?,username=?,password=?,age=?,des=?,height=?  where id=?","С��","xiaoq","123",18,"С�ǣ�Ŭ����ǿ",160,6);
		System.out.println(update);

		
		
	}
}
