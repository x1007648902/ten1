package com.xhz.jdbctemplate;

import java.util.List;

import com.xhz.bean.User;
import com.xhz.dao.UserDao;
import com.xhz.dao.UserDaoImpl;

public class TestJdbcTemplate {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		List<User> list = ud.findAllUser();
		
		for (User user : list){
			System.out.println(user);
		}
		
	}
}
