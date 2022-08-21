package com.arisglobal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssetListController {
	@RequestMapping("/assetlist")
	public String assetList()
	{
		return "assetlist";
	}
	
}
