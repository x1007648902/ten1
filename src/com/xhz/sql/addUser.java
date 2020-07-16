package com.xhz.sql;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xhz.bean.User;
import com.xhz.druid.JDBCUtils;


public class addUser {
	public static void main(String[] args) {
		addUser1();
		
	} 

	private static void addUser1() {
		JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
		
		String sql = "insert into person(name,username,password,age,des,height) values (?,?,?,?,?,?)";
		int update = jt.update(sql,"貂蝉","diaoc","123",20,"想欣赏妾身的舞姿么",175);
		System.out.println(update);
		
		
	}
}
