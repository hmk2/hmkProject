package com.sys.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class EmDeJobDaoTest {
	
	@Autowired
	private EmDeJobDao emDeJobDao;
	@Test
	public void testAddEDj() {
		System.out.println(emDeJobDao.addEDj(22, 1 ,1));
	}

	@Test
	public void testDeleteEDj() {
		System.out.println(emDeJobDao.deleteEDj(22, 1 ,1));
	}
}
