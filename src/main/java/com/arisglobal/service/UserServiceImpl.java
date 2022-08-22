package com.arisglobal.service;

import java.util.List;
import java.util.HashMap;
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
	public User login(String email, String password)  {
        String sql = "SELECT id,user_name,role_id,email,mobile_number,address"
                + " FROM lms_user WHERE email=:em AND password=:pw";
        Map m = new HashMap();
        m.put("em", email);
        m.put("pw", password);
       
        try {
        	 User u = getNamedParameterJdbcTemplate().queryForObject(sql, m, new UserRowMapper());
            return u;
           
        } catch (EmptyResultDataAccessException ex) {
        	 return null;
        }

}
