package com.sys.serviceImp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Page;
import com.sys.enity.Roomtype;
import com.sys.service.RoomtypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class RoomtypeServiceImpTest {
	
	@Autowired
	private RoomtypeService roomtypeService;
	@Test
	public void testQueryRoomtypePage() {
		Page page=new Page();
		page.setPage(1);
		page.setRows(10);
		System.out.println(roomtypeService.queryRoomtypePage(page));
	}

	@Test
	public void testFindRoomtypeById() {
		System.out.println(roomtypeService.findRoomtypeById(1));
	}

	@Test
	public void testAddRoomtype() {
		Roomtype roomtype=new Roomtype();
		roomtype.setRoomTypeName("test");
		roomtype.setRoomTypeRemark("test");
		System.out.println(roomtypeService.addRoomtype(roomtype));
		
	}

	@Test
	public void testQueryAllRoomtype() {
		System.out.println(roomtypeService.queryAllRoomtype());
	}

	@Test
	public void testQueryAllRoomtypeId() {
		System.out.println(roomtypeService.queryAllRoomtypeId());
	}

	@Test
	public void testQueryAllRoomtypeName() {
		System.out.println(roomtypeService.queryAllRoomtypeName());
	}

	@Test
	public void testUpdateRoomtype() {
		Roomtype roomtype=new Roomtype();
		roomtype.setRoomTypeId(10);
		roomtype.setRoomTypeRemark("test2");
		roomtype.setRoomTypeStatus(1);
		roomtype.setRoomTypeName("test2");
		System.out.println(roomtypeService.updateRoomtype(roomtype));
	}

	@Test
	public void testDeleteRoomtype() {
		System.out.println(roomtypeService.deleteRoomtype(10));
	}

	@Test
	public void testSearchNews() {
		System.out.println(roomtypeService.searchNews(1, "test2"));
	}

}
