package com.arisglobal.dao.impl;

import com.arisglobal.dao.BaseDao;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
public abstract class AbstractDao implements BaseDao {
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	public void save(Object object)
	{
		getSession().persist(object);
	}
	public void update(Object object)
	{
		getSession().update(object);
	}
	
}
