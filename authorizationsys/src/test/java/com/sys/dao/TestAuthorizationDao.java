package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.Authorization;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestAuthorizationDao {
	@Resource
	private AuthorizationDao authorizationDao;
	
	@Test
	public void addAuth()
	{
		Authorization authorization=new Authorization();
		authorization.setAuId(4);
		authorization.setAuName("test1");
		authorization.setAuUrl("#");
		authorization.setStatus(0);
		authorizationDao.addAuth(authorization);
	}
	@Test
	public void editAuth()
	{
		Authorization authorization=new Authorization();
		authorization.setAuId(4);
		authorization.setAuName("test2");
		authorization.setAuUrl("#");
		authorization.setStatus(0);
		authorizationDao.editAuth(authorization);
	}
	@Test
	public void deleteAuth()
	{
		authorizationDao.deleteAuth(4);
	}
	@Test
	public void deleteBatchAuth()
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		authorizationDao.deleteBatchAuth(list);
	}
	@Test
	public void queryAllau()
	{
		System.out.print(authorizationDao.queryAllau().get(0).getAuName());
	}
	@Test
	public void findAuByid()
	{
		System.out.print(authorizationDao.findAuByid(4).getAuName());
	}
	@Test
	public void check()
	{
		System.out.println(authorizationDao.checkAu("admin", "/authorizationsys/listManager/queryMenu"));
	}
}
