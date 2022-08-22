package com.arisglobal.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arisglobal.dao.TransactionDao;
import com.arisglobal.entity.LMSTransaction;

@Service("transactionService")
@Transactional
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private TransactionDao transactionDao;
	
	public LMSTransaction getTransactionById(int id) {
		return transactionDao.getTransactionById(id);
	}

	public ArrayList<LMSTransaction> getAllCategories() {
		return transactionDao.getAllCategories();
	}

	public void saveTransaction(LMSTransaction Transaction) {
		transactionDao.saveTransaction(Transaction);
	}

	public void deleteTransaction(LMSTransaction Transaction) {
		transactionDao.deleteTransaction(Transaction);
	}

	public void updateTransaction(LMSTransaction Transaction) {
		transactionDao.updateTransaction(Transaction);
	}

	public ArrayList<LMSTransaction> getUserTransaction(int lms_user_id) {
		return transactionDao.getUserTransaction(lms_user_id);
	}

}
