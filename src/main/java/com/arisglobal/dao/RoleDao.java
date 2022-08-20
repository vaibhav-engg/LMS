package com.arisglobal.dao;



import java.util.ArrayList;

import com.arisglobal.entity.Role;

public interface RoleDao {
	public Role getRoleById(int id);
	public ArrayList<Role> getAllRoles();
	public void saveRole(Role role);
	public void deleteRole(Role role);
	public void updateRole(Role role);
	
}
