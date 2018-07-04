package com.sys.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestRoleMenDao {
	@Resource
	private RoleMenDao roleMenDao;
	@Test
	public void add()
	{
		/*roleMenDao.add(14,1, 2);*/
	}
	@Test
	public void delete()
	{
		/*roleMenDao.delete(14);*/
	}
}
