package com.arisglobal.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arisglobal.dao.impl.TransactionDaoImpl;
import com.arisglobal.entity.Transaction;
@Controller
public class BorrowController {
	@RequestMapping(value="/borrow/{asset_id}")
	public String borrower(@PathVariable("asset_id") int asset_id, Model m) {
		Transaction transaction = new Transaction();
		TransactionDaoImpl obj = new TransactionDaoImpl();
		Date date = new Date();
		long ltime = date.getTime()+15*24*60*60*1000;
		Date due_date = new Date(ltime);
		transaction.setAsset_id(asset_id);
		transaction.setDue_date((java.sql.Date) due_date);
		transaction.setIssue_date((java.sql.Date)date);
		obj.persist(transaction);
		String msg = "Borrowed Successfully";
		m.addAttribute("message", msg);
		return "assetlist";
	}
}
