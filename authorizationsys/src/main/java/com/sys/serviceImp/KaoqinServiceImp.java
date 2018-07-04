package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.KaoqinDao;
import com.sys.dao.RoleDao;
import com.sys.pro.Kaoqin;
import com.sys.pro.Role;
import com.sys.service.KaoqinService;
@Service
public class KaoqinServiceImp implements KaoqinService{
	@Autowired
	private KaoqinDao kaoqinDao;
	@Autowired
	private RoleDao roleDao;
	@Override
	public ArrayList<Kaoqin> queryallKaoqin(String account) {
		Role role=roleDao.queryRoleByAccount(account);
		ArrayList<Kaoqin> ks=kaoqinDao.queryallKaoqin(account, role.getRoleName());
		return ks;
	}

	@Override
	public Kaoqin findKaoqinByid(int kaoId) {
		
		return kaoqinDao.findKaoqinByid(kaoId);
	}

	@Override
	public boolean updateKaoqin(Kaoqin kaoqin) {
		return kaoqinDao.updateKaoqin(kaoqin);
	}

	@Override
	public boolean deleteKaoqinByid(int kaoId) {
		return kaoqinDao.deleteKaoqinByid(kaoId);
	}

	@Override
	public boolean addKaoqin(Kaoqin kaoqin) {
		return kaoqinDao.addKaoqin(kaoqin);
	}

	@Override
	public boolean debatchKaoqinByid(int[] kaoId) {
		ArrayList<Integer> sid=new ArrayList<Integer>();
		for(int i:kaoId)
		{
			sid.add(i);
		}
		return kaoqinDao.debatchKaoqinByid(sid);
	}

}
