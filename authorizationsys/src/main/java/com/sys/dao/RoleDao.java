package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import com.sys.pro.Role;

public interface RoleDao {

	public Role queryRoleByAccount(String acc);

	public boolean addRole(Role role);

	public boolean editRole(Role role);

	public Role findRoleByid(int id);

	public ArrayList<Role> queryRole();

	public boolean deleteRole(int id);

	public boolean deletebatchRole(List<Integer> id);

	public boolean addbatchRole(List<Role> roles);
	
}
