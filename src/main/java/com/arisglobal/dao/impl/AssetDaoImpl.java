package com.arisglobal.dao.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.AssetDao;
import com.arisglobal.entity.Asset;
@Repository("assetDao")
public class AssetDaoImpl extends AbstractDao implements AssetDao {

	public void saveAsset(Asset asset) {
		super.save(asset);
	}

	public void deleteAsset(int asset_id) {
		Query query = super.getSession().createSQLQuery("delete from asset where asset_id = :id");
		query.setInteger("id", asset_id);
		query.executeUpdate();
	}

	public void updateAsset(Asset asset) {
		super.update(asset);
		
	}

	public Asset getAssetById(int asset_id) {
		Criteria criteria = super.getSession().createCriteria(Asset.class);
		criteria.add(Restrictions.eq("id",asset_id));
		return (Asset)criteria.uniqueResult();
	
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Asset> getAllAsset() {
		Criteria criteria = super.getSession().createCriteria(Asset.class);
		return (ArrayList<Asset>)criteria.list();
	}

	
}
