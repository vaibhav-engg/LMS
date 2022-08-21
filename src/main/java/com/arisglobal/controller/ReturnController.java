package com.arisglobal.controller;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arisglobal.dao.impl.AssetDaoImpl;
import com.arisglobal.dao.impl.TransactionDaoImpl;
import com.arisglobal.dao.impl.UserDaoImpl;
import com.arisglobal.entity.Asset;
import com.arisglobal.entity.Transaction;

@Controller
public class ReturnController {
	@RequestMapping("/return")
	public String returning(Model model, Principal principal) {
		TransactionDaoImpl obj = new TransactionDaoImpl();
		AssetDaoImpl assetDaoImpl = new AssetDaoImpl();
		UserDaoImpl user = new UserDaoImpl();
		List<Transaction> transactionlist = obj.getUserTransaction(user.findByEmail(principal.getName()).getId());
		List<Asset> assetlist = new ArrayList<Asset>();
		for(Transaction transaction:transactionlist) {
			assetlist.add(assetDaoImpl.getAssetById(transaction.getAsset_id()));
		}
		model.addAttribute("issuedassetlist", assetlist);
		model.addAttribute("transactionlist", transactionlist);
		return "return-page";
	}
	
	@RequestMapping(value="/returnbook/{asset_id}")
	public String returnbook(@PathVariable("asset_id") int asset_id, Model model) {
		TransactionDaoImpl obj = new TransactionDaoImpl();
		Transaction transaction = new Transaction();
		Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	    String str = formatter.format(date);
		transaction.setReturn_date((java.sql.Date) date);
		transaction.setAsset_id(asset_id);
		obj.updateTransaction(transaction);
		String msg = "Returned Successfully";
		model.addAttribute("message", msg);
		
		return "return-page";
	}
}
