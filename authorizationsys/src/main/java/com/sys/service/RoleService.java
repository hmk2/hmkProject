package com.sys.service;

import java.util.ArrayList;
import java.util.List;

import com.sys.pro.Account;
import com.sys.pro.Role;

public interface RoleService {

		public Role queryRoleByAccount(String acc);

		public boolean addRole(Role role);

		public boolean editRole(Role role);

		public Role findRoleByid(int id);

		public ArrayList<Role> queryRole();

		public boolean deleteRole(int id);

		public boolean deletebatchRole(int[] id);
		
		public boolean grandrolemenu(int roleid,int[] ids);
		public boolean grandroleAu(int roleid,int[] ids);
		
		public int grandroleAu(Account account,String url);
		
}
