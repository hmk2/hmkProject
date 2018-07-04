package com.sys.dao;



import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestUserAccountDao {
	@Resource
	private UserAccountDao userAccountDao;
	
	@Test
	public void add()
	{
		userAccountDao.addua(5,1, "hmk");
	}
	@Test
	public void delete()
	{
		userAccountDao.deleteua(5);
	}
}
