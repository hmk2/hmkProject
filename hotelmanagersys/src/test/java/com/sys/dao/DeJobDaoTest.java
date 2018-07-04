package com.sys.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DeJobDaoTest {

	@Autowired
	private DeJobDao deJobDao;
	@Test
	public void testAddDj() {
		System.out.println(deJobDao.addDj(10, 10));
	}

	@Test
	public void testDeleteDj() {
		System.out.println(deJobDao.deleteDj(10, 10));
	}
	@Test
	public void testDeletaeDj() {
		System.out.println(deJobDao.findDeJonb(1, 1));
	}

}
