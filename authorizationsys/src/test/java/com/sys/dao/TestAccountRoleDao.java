package com.sys.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestAccountRoleDao {
	@Resource
	private RoleMenDao roleMenDao;
	@Test
	public void addrm()
	{
		roleMenDao.addrm(14, 1, 1);
	}
	@Test
	public void deleterm()
	{
		roleMenDao.deleterm(5);
	}
}
