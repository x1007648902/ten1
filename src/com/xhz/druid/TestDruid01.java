package com.xhz.druid;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;


public class TestDruid01 {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		
		InputStream resourceAsStream = TestDruid01.class.getClassLoader().getResourceAsStream("jdbc");
		
		pro.load(resourceAsStream);
		
		String property = pro.getProperty("name");
		String password = pro.getProperty("password");
		System.out.println(password);
		System.out.println(property);
		
		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);
		
		System.out.println(datasource.getConnection());
		
		Connection connection = datasource.getConnection();
		System.out.println("获取的连接"+connection);
		
		Statement createStatement = connection.createStatement();
		
		String sql = "select * from t_user ";
		
		ResultSet rs = createStatement.executeQuery(sql);
		
		while (rs.next()){
			String name = rs.getString("name");
			String address = rs.getString("address");
			Integer age = rs.getInt("age");
			System.out.println(name+address+age);
		}
		
		connection.close();
		
	}
}
