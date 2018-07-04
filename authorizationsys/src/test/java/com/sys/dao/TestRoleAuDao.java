package com.sys.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestRoleAuDao {
	@Resource
	private RoleAuDao auDao;
	@Test
	public void add()
	{
		auDao.addrad(3, 3, 3);
	}
	@Test
	public void delete()
	{
		auDao.deleterad(5);
	}
}
