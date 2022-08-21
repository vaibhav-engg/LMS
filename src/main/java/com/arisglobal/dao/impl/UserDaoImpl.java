package com.arisglobal.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.AbstractDao;
import com.arisglobal.dao.UserDao;
import com.arisglobal.entity.User;
@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		persist(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>)criteria.list();
	}

	public void deleteUserByID(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("delete from lms_user where id=:id");
		query.setInteger("id", id);
		query.executeUpdate();
		
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id",id));
		return (User)criteria.uniqueResult();
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		getSession().update(user);
		
	}

}
