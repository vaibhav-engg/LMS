package com.arisglobal.dao;

import java.util.ArrayList;

import com.arisglobal.entity.Asset;

public interface AssetDao {

	public void saveAsset(Asset asset);

	public void deleteAsset(int asset_id);

	public void updateAsset(Asset asset);

	public Asset getAssetById(int asset_id);

	public ArrayList<Asset> getAllAsset();

}
