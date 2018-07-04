package com.sys.dao;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.dao.RoomDao;
import com.sys.enity.Page;
import com.sys.enity.Room;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class RoomDaoTest {
	@Autowired
	private RoomDao roomDao;
	@Test
	public void searchRoom()
	{
		Room room=new Room();
		room.setRoomId(1002);
		room.setRoomPrice(300);
		room.setRoomStatus(0);
		Page page=new Page();
		page.setPage(0);
		page.setRows(10);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("room", room);
		map.put("page", page);
		System.out.println(roomDao.searchRoom(map));
		/*System.out.println(room.getRoomStatus());*/
	}
	@Test
	public void findByid()
	{
		/*Room room=roomDao.findRoomById(2);*/
		/*System.out.println(room.toString());*/
	}
	@Test
	public void addroom()
	{
		Room room=new Room();
		room.setRoomId(3);
		room.setRoomPrice(600);
		room.setRoomStatus(1);
		room.setRoomRemark("房间3号");
		roomDao.addRoom(room);
	}
	@Test
	public void updateRoom()
	{
		Room room=new Room();
		room.setRoomId(2);
		room.setRoomPrice(600);
		room.setRoomStatus(1);
		room.setRoomRemark("房间3号");
		System.out.println(roomDao.updateRoom(room));
	}
	@Test
	public void queryRoom()
	{
		System.out.println(roomDao.queryRoompage(0,10));
	}	
	@Test
	public void queryallRoom()
	{
		System.out.println(roomDao.queryallRoom());
	}	
}
