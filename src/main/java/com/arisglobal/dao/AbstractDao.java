package com.arisglobal.dao;

import javax.sql.DataSource;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public abstract class AbstractDao extends NamedParameterJdbcDaoSupport{
    @Autowired
    public void setDataSource2(DataSource ds){
        super.setDataSource(ds); 
    }
    @Autowired
	private SessionFactory sessionFactory;
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	public void save(Object entity)
	{
		getSession().save(entity);
	}
	public void delete(Object entity)
	{
		getSession().delete(entity);
	}
	public void update(Object object)
	{
		getSession().update(object);
	}
}
