package com.xhz.bean;

public class User {
	private Integer id;
	private String name;
	private String uesrname;
	private String password;
	private Integer age;
	private String des;
	private double height;
	public String getUesrname() {
		return uesrname;
	}
	public void setUesrname(String uesrname) {
		this.uesrname = uesrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", uesrname=" + uesrname
				+ ", password=" + password + ", age=" + age + ", des=" + des
				+ ", height=" + height + "]";
	}
	
	
	
}
