package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mchange.v2.c3p0.impl.AuthMaskingProperties;
import com.sys.dao.AuthorizationDao;
import com.sys.dao.MenuDao;
import com.sys.dao.RoleAuDao;
import com.sys.dao.RoleDao;
import com.sys.dao.RoleMenDao;
import com.sys.pro.Account;
import com.sys.pro.Menu;
import com.sys.pro.Role;
import com.sys.service.RoleService;
@Service
public class RoleServiceImp implements RoleService {
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private RoleMenDao roleMenDao;
	@Autowired
	private RoleAuDao roleAuDao;
	@Autowired
	private AuthorizationDao aDao;
	@Override
	public Role queryRoleByAccount(String acc) {
		return roleDao.queryRoleByAccount(acc);
	}

	@Override
	public boolean addRole(Role role) {
		return roleDao.addRole(role);
	}

	@Override
	public boolean editRole(Role role) {
		return roleDao.editRole(role);
	}

	@Override
	public Role findRoleByid(int id) {
		return roleDao.findRoleByid(id);
	}

	@Override
	public ArrayList<Role> queryRole() {
		ArrayList<Role> roles=roleDao.queryRole();
		return roles;
	}

	@Override
	public boolean deleteRole(int id) {
		return roleDao.deleteRole(id);
	}

	@Override
	public boolean deletebatchRole(int[] id) {
		ArrayList<Integer> sid=new ArrayList<Integer>();
		for(int i:id)
		{
			sid.add(i);
		}
		return roleDao.deletebatchRole(sid);
	}

	@Override
	public boolean grandrolemenu(int roleid, int[] ids) {
		int num=roleMenDao.queryMaxId();
		roleMenDao.deleterm(roleid);
		for(int i:ids)
		{
			roleMenDao.addrm(++num, roleid, i);
		}
		return true;
	}

	@Override
	public int grandroleAu(Account account, String url) {
		return aDao.checkAu(account.getAccount(), url);
	}

	@Override
	public boolean grandroleAu(int roleid, int[] ids) {
		int num=roleAuDao.queryMaxAu();
		System.out.println(num);
		System.out.println(roleAuDao.deleterad(roleid));
		for(int i:ids)
		{
			roleAuDao.addrad(++num, roleid, i);
		}
		return true;
	}

}
