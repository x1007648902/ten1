package com.xhz.sql;

import org.springframework.jdbc.core.JdbcTemplate;

import com.xhz.druid.JDBCUtils;

public class DeleteUser {
	public static void main(String[] args) {
		deleteUser2();
	}

	private static void deleteUser() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		int update =jt.update("delete from person where id=? ",6);
		System.out.println(update);
	}
	private static void deleteUser2() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		int update =jt.update("delete from person where name=? ","¹¬±¾Îä²Ø");
		System.out.println(update);
	}
}
