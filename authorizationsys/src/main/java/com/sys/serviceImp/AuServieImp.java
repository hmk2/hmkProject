package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.AuthorizationDao;
import com.sys.pro.Authorization;
import com.sys.service.AuServie;
@Service
public class AuServieImp implements AuServie {
	@Autowired
	private AuthorizationDao authorizationDao;

	@Override
	public boolean addAuth(Authorization auth) {
		return authorizationDao.addAuth(auth);
	}

	@Override
	public boolean editAuth(Authorization auth) {
		return authorizationDao.editAuth(auth);
	}

	@Override
	public boolean deleteAuth(int id) {
		return authorizationDao.deleteAuth(id);
	}

	@Override
	public boolean deleteBatchAuth(int[] id) {
		List<Integer> sid=new ArrayList<Integer>();
		for(int i:id)
		{
			sid.add(i);
		}
		return authorizationDao.deleteBatchAuth(sid);
	}

	@Override
	public ArrayList<Authorization> queryAllau() {
		ArrayList<Authorization> aus=authorizationDao.queryAllau();
		return aus;
	}

	@Override
	public Authorization findAuByid(int id) {
		return authorizationDao.findAuByid(id);
	}

}
