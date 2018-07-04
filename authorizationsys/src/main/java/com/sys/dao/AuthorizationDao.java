package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sys.pro.Account;
import com.sys.pro.Authorization;

public interface AuthorizationDao {

	public boolean addAuth(Authorization auth);

	public boolean editAuth(Authorization auth);

	public boolean deleteAuth(int id);

	public boolean deleteBatchAuth(List<Integer> id);

	public ArrayList<Authorization> queryAllau();
	public Authorization findAuByid(int id);
	public Authorization findAuByUrl(String url);
	public int checkAu(@Param("account")String  account,@Param("url")String url);
}
