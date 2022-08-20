package com.arisglobal.dao;

import java.util.ArrayList;

import com.arisglobal.entity.User;

public interface UserDao {
	public User getUserById(int id);
	public ArrayList<User> getAllCategories();
	public void saveUser(User User);
	public void deleteUser(User User);
	public void updateUser(User User);
}
