package com.arisglobal.service;

import java.util.ArrayList;

import com.arisglobal.entity.LMSTransaction;

public interface TransactionService {
	public LMSTransaction getTransactionById(int id);
	public ArrayList<LMSTransaction> getAllCategories();
	public void saveTransaction(LMSTransaction Transaction);
	public void deleteTransaction(LMSTransaction Transaction);
	public void updateTransaction(LMSTransaction Transaction);
	public ArrayList<LMSTransaction> getUserTransaction(int lms_user_id);
}
