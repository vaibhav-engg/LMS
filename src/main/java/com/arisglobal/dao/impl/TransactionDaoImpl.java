package com.arisglobal.dao.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.TransactionDao;
import com.arisglobal.entity.Transaction;
@Repository("transactionDao")
public class TransactionDaoImpl extends AbstractDao implements TransactionDao {

	public Transaction getTransactionById(int id) {
		Criteria criteria = super.getSession().createCriteria(Transaction.class);
		criteria.add(Restrictions.eq("id",id));
		return (Transaction)criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Transaction> getAllCategories() {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Transaction.class);
		return (ArrayList<Transaction>)criteria.list();
	}

	public void saveTransaction(Transaction Transaction) {
		// TODO Auto-generated method stub
		super.save(Transaction);

	}

	public void deleteTransaction(Transaction Transaction) {
		// TODO Auto-generated method stub
		Query query = super.getSession().createQuery("Delete from lms_transaction where id=:id");
		query.setInteger("id", Transaction.getId());
		query.executeUpdate();

	}

	public void updateTransaction(Transaction Transaction) {
		// TODO Auto-generated method stub
		super.update(Transaction);

	}

}
