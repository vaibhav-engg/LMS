package com.arisglobal.dao.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.AuthorDao;
import com.arisglobal.entity.Author;
@Repository("authorDao")
public class AuthorDaoImpl extends AbstractDao implements AuthorDao {

	public Author getAuthorById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Author.class);
		criteria.add(Restrictions.eq("id",id));
		return (Author)criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Author> getAllCategories() {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Author.class);
		return (ArrayList<Author>)criteria.list();
	}

	public void saveAuthor(Author Author) {
		// TODO Auto-generated method stub
		super.save(Author);

	}

	public void deleteAuthor(Author Author) {
		// TODO Auto-generated method stub
		Query query = super.getSession().createQuery("delete from author where id=:id");
		query.setInteger("id", Author.getId());
		query.executeUpdate();

	}

	public void updateAuthor(Author Author) {
		// TODO Auto-generated method stub
		super.update(Author);

	}

}
