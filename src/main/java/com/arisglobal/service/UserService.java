package com.arisglobal.service;

import com.arisglobal.entity.User;
import java.util.List;
public interface UserService {
	void saveUser(User user);
	List<User> findAllUsers();
	void deleteUserByID(int id);
	User findById(int id);
	void updateUser(User user);
}