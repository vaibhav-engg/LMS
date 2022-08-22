package com.arisglobal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arisglobal.entity.Asset;
import com.arisglobal.service.AssetListService;


@Controller
public class AssetListController {
	
	@Autowired
	private AssetListService assetListService;
	
	@RequestMapping("/assetlist")
	public String redirectAssetList(Model model)
	{
		List<Asset> list = assetListService.getAllAsset();
		model.addAttribute("assetList", list);
		return "assetlist";
	}
	
	
}
