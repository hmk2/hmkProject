package com.sys.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestAccountKaoqinDao {
	@Resource
	private AccountKaoqinDao accountKaoqinDao;
	@Test
	public void addak()
	{
		accountKaoqinDao.addak(5, 5, 5);
	}
	@Test
	public void deleteak()
	{
		accountKaoqinDao.deleteak(5);
	}
}
