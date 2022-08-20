package com.arisglobal.dao.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.UserDao;
import com.arisglobal.entity.User;
@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao{

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		return (User)criteria.uniqueResult();
		
	}

	@SuppressWarnings("unchecked")
	public ArrayList<User> getAllCategories() {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(User.class);
		return (ArrayList<User>)criteria.list();
	}

	public void saveUser(User User) {
		// TODO Auto-generated method stub
		super.save(User);
		
	}

	public void deleteUser(User User) {
		// TODO Auto-generated method stub
		Query query = super.getSession().createQuery("Delete from lms_user where id=:id");
		query.setInteger("id", User.getId());
		query.executeUpdate();
	}

	public void updateUser(User User) {
		// TODO Auto-generated method stub
		super.update(User);
		
	}

}
