package com.arisglobal.service;

import com.arisglobal.entity.User;
import java.util.List;
public interface UserService {
	public static final int ROLE_ADMIN=101;
	 public static final int ROLE_Librarian=102;
	  public static final int ROLE_USER=103;
	void saveUser(User user);
	List<User> findAllUsers();
	void deleteUserByID(int id);
	User findById(int id);
	void updateUser(User user);
	public User login(String email,String password);
}
