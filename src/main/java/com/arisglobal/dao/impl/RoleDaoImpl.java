package com.arisglobal.dao.impl;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.arisglobal.dao.RoleDao;
import com.arisglobal.entity.Role;

@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao implements RoleDao {

	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Role.class);
		criteria.add(Restrictions.eq("id",id));
		return (Role)criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Role> getAllRoles() {
		// TODO Auto-generated method stub
		Criteria criteria = super.getSession().createCriteria(Role.class);
		return (ArrayList<Role>)criteria.list();
	}

	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		super.save(role);

	}

	public void deleteRole(Role role) {
		// TODO Auto-generated method stub
		Query query = super.getSession().createQuery("delete from role where id=:id");
		query.setInteger("id", role.getId());
		query.executeUpdate();

	}

	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		super.update(role);

	}

}
