package com.xhz.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xhz.bean.User;
import com.xhz.druid.JDBCUtils;


public class UserDaoImpl implements UserDao{
	JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
	
	@Override
	public List<User> findAllUser(){
		String sql = "select * from t_user ";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return list;
		
	}
	
	
}