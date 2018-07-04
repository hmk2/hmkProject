package com.sys.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Roomtype;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class RoomtypeDaoTest {
	
	@Autowired
	private RoomtypeDao roomtypeDao;
	@Test
	public void testQueryRoomtypePage() {
		System.out.println(roomtypeDao.queryRoomtypePage(1, 10));
	}

	@Test
	public void testFindRoomtypeById() {
		System.out.println(roomtypeDao.findRoomtypeById(2));
	}

	@Test
	public void testAddRoomtype() {
		Roomtype roomtype=new Roomtype();
		roomtype.setRoomTypeName("test");
		roomtype.setRoomTypeRemark("test");
		System.out.println(roomtypeDao.addRoomtype(roomtype));
	}

	@Test
	public void testQueryAllRoomtype() {
		System.out.println(roomtypeDao.queryAllRoomtype());
	}

	@Test
	public void testQueryAllRoomtypeId() {
		System.out.println(roomtypeDao.queryAllRoomtypeId());
	}

	@Test
	public void testQueryAllRoomtypeName() {
		System.out.println(roomtypeDao.queryAllRoomtypeName());
	}

	@Test
	public void testUpdateRoomtype() {
		Roomtype roomtype=new Roomtype();
		roomtype.setRoomTypeId(9);
		roomtype.setRoomTypeRemark("test2");
		roomtype.setRoomTypeStatus(1);
		roomtype.setRoomTypeName("test2");
	System.out.println(roomtypeDao.updateRoomtype(roomtype));
	}

	@Test
	public void testDeleteRoomtype() {
		System.out.println(roomtypeDao.deleteRoomtype(9));
	}

	@Test
	public void testSearchNews() {
		Roomtype roomtype=new Roomtype();

		roomtype.setRoomTypeName("test2");
		System.out.println(roomtypeDao.searchNews(roomtype));
	}

}
