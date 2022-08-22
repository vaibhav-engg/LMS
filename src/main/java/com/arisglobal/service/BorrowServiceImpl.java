package com.arisglobal.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arisglobal.dao.AssetDao;
import com.arisglobal.dao.UserDao;
import com.arisglobal.entity.Asset;

@Service("borrowService")
@Transactional
public class BorrowServiceImpl implements BorrowService {
	@Autowired
	private AssetDao assetDao;

	public void saveAsset(Asset asset) {
		// TODO Auto-generated method stub
		assetDao.saveAsset(asset);
		
	}

	public void deleteAsset(int asset_id) {
		// TODO Auto-generated method stub
		assetDao.deleteAsset(asset_id);
		
	}

	public void updateAsset(Asset asset) {
		// TODO Auto-generated method stub
		assetDao.updateAsset(asset);
		
	}

	
	
	

}
