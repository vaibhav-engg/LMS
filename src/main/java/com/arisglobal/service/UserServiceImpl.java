package com.arisglobal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arisglobal.entity.User;
import com.arisglobal.dao.UserDao;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);

	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAllUsers();
	}

	public void deleteUserByID(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUserByID(id);

	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);

	}

}
