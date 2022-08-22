package com.arisglobal.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.arisglobal.entity.Asset;
import com.arisglobal.entity.User;

public interface BorrowService {
	public void saveAsset(Asset asset);

	public void deleteAsset(int asset_id);

	public void updateAsset(Asset asset);

	
}
