package com.arisglobal.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arisglobal.dao.TransactionDao;
import com.arisglobal.entity.Transaction;

@Service("transactionService")
@Transactional
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionDao transactionDao;
	
	public Transaction getTransactionById(int id) {
		return transactionDao.getTransactionById(id);
	}

	public ArrayList<Transaction> getAllCategories() {
		return transactionDao.getAllCategories();
	}

	public void saveTransaction(Transaction Transaction) {
		transactionDao.saveTransaction(Transaction);
	}

	public void deleteTransaction(Transaction Transaction) {
		transactionDao.deleteTransaction(Transaction);
	}

	public void updateTransaction(Transaction Transaction) {
		transactionDao.updateTransaction(Transaction);
	}

	public ArrayList<Transaction> getUserTransaction(int lms_user_id) {
		return transactionDao.getUserTransaction(lms_user_id);
	}

}
