package com.xhz.dao;

import java.util.List;

import com.xhz.bean.User;

public interface UserDao {
	List<User> findAllUser();
}
