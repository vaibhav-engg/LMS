package com.arisglobal.dao.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.CategoryDao;
import com.arisglobal.entity.Category;
@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractDao implements CategoryDao {

	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Category.class);
		criteria.add(Restrictions.eq("id",id));
		return (Category)criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Category.class);
		return (ArrayList<Category>)criteria.list();
	}

	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		super.save(category);

	}

	public void deleteCategory(Category category) {
		// TODO Auto-generated method stub
		Query query = super.getSession().createQuery("delete from category where id=:id");
		query.setInteger("id", category.getId());
		query.executeUpdate();

	}

	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		super.update(category);

	}

}
