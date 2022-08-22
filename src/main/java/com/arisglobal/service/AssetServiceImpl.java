package com.arisglobal.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arisglobal.dao.AssetDao;
import com.arisglobal.entity.Asset;

@Service("assetService")
@Transactional
public class AssetServiceImpl implements AssetService {
	
	@Autowired
	private AssetDao assetDao;
	public void saveAsset(Asset asset) {
		assetDao.saveAsset(asset);
	}

	public void deleteAsset(int asset_id) {
		assetDao.deleteAsset(asset_id);
	}

	public void updateAsset(Asset asset) {
		assetDao.updateAsset(asset);
	}

	public Asset getAssetById(int asset_id) {
		return assetDao.getAssetById(asset_id);
	}

	public ArrayList<Asset> getAllAsset() {
		return assetDao.getAllAsset();
	}

}
