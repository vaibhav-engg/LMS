package com.arisglobal.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arisglobal.entity.Asset;
import com.arisglobal.entity.LMSTransaction;
import com.arisglobal.entity.LMSUser;
import com.arisglobal.service.TransactionService;
import com.arisglobal.service.UserService;
import com.arisglobal.service.AssetService;



@Controller
public class ReturnController {
	@Autowired
	private TransactionService transactionService;
	@Autowired
	private AssetService assetService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/return")
	public String returning(Model model, Principal principal) {
		
		LMSUser user = userService.findByEmail(principal.getName());
		List<LMSTransaction> transactionlist = transactionService.getUserTransaction(user.getId());
		
		List<Asset> assetlist = new ArrayList<Asset>();
		for(LMSTransaction transaction:transactionlist) {
			assetlist.add(assetService.getAssetById(transaction.getAsset_id()));
		}
		model.addAttribute("issuedassetlist", assetlist);
		model.addAttribute("transactionlist", transactionlist);
		return "return-page";
	}
	
	@RequestMapping(value="/returnbook/{asset_id}")
	public String returnbook(@PathVariable("asset_id") int asset_id, Model model) {
		LMSTransaction transaction = new LMSTransaction();
		Date date = new Date();
	    transaction.setReturn_date((java.sql.Date) date);
		transaction.setAsset_id(asset_id);
		transactionService.updateTransaction(transaction);
		String msg = "Returned Successfully";
		model.addAttribute("message", msg);
		
		return "return-page";
	}
}
