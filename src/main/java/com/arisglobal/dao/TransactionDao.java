package com.arisglobal.dao;

import java.util.ArrayList;

import com.arisglobal.entity.Transaction;

public interface TransactionDao {
	public Transaction getTransactionById(int id);
	public ArrayList<Transaction> getAllCategories();
	public void saveTransaction(Transaction Transaction);
	public void deleteTransaction(Transaction Transaction);
	public void updateTransaction(Transaction Transaction);
	public ArrayList<Transaction> getUserTransaction(int lms_user_id);
}
