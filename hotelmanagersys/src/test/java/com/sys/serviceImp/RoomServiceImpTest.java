package com.sys.serviceImp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Room;
import com.sys.service.RoomService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class RoomServiceImpTest {
	
	@Autowired
	private RoomService roomService;
	@Test
	public void findByid()
	{
		/*Room room=roomService.findRoomById(3);
		System.out.println(room.toString());*/
	}
	@Test
	public void addroom()
	{
		Room room=new Room();
		room.setRoomId(3);
		room.setRoomPrice(600);
		room.setRoomStatus(1);
		room.setRoomRemark("房间3号");
		roomService.addRoom(room);
	}
	@Test
	public void updateRoom()
	{
		Room room=new Room();
		room.setRoomId(3);
		room.setRoomPrice(600);
		room.setRoomStatus(0);
		room.setRoomRemark("房间2号");
		System.out.println(roomService.updateRoom(room));
	}
	@Test
	public void queryRoom()
	{

		System.out.println(roomService.queryallRoom());
	}	
}
