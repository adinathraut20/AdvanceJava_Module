package com.cdac.dao;

import com.cdac.dto.User;

public interface UserDao {
	 void insert(User user);
	 boolean checkUser(User user);
}
