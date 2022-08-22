package com.arisglobal.dao;

import java.util.List;

import com.arisglobal.entity.User;

public interface UserDao {
	void saveUser(User user);
	List<User> findAllUsers();
	void deleteUserByID(int id);
	User findById(int id);
	void updateUser(User user);
	User findByEmail(String email);
}
