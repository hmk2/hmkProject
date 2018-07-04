package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.RoomDao;
import com.sys.dao.RoomsDao;
import com.sys.dao.RoomtypeDao;
import com.sys.enity.Dept;
import com.sys.enity.Page;
import com.sys.enity.Room;
import com.sys.enity.Roomtype;
import com.sys.service.RoomService;
@Service
public class RoomServiceImp implements RoomService {

	@Autowired
	private RoomDao roomDao;
	@Autowired
	private RoomtypeDao roomtypeDao;
	@Autowired
	private RoomsDao roomsDao;
	
	@Override
	public ArrayList<Room> findRoomById(int id) {
		
		return roomDao.findRoomById(id);
	}

	@Override
	public List<Map<String, Object>> queryRoompage(Page page) {
		int i=(page.getPage()-1)*page.getRows();
		return roomDao.queryRoompage(i,page.getRows());
	}

	@Override
	public int queryallRoom() {
		
		return roomDao.queryallRoom();
	}

	@Override
	public int addRoom(Room room,String name) {
		roomDao.addRoom(room);
		Roomtype roomtype=roomtypeDao.findRoomtypeByName(name);
		return roomsDao.addrooms(room.getRoomId(), roomtype.getRoomTypeId());
	}

	@Override
	public int updateRoom(Room room,String roomTypeName) {
		roomDao.updateRoom(room);
		Roomtype roomtype= roomtypeDao.findRoomtypeByName(roomTypeName);
		int i=roomsDao.findrooms(room.getRoomId(), roomtype.getRoomTypeId());
		if(i==1)
		{
			return 1;
		}
		return roomsDao.addrooms(room.getRoomId(), roomtype.getRoomTypeId());
	}

	@Override
	public int deleteRoom(int id) {
		return roomDao.deleteRoom(id);
	}

	@Override
	public List<Map<String, Object>> searchRoom(Room room,Page page) {
		Map<String, Object> map=new HashMap<String, Object>();
		page.setPage((page.getPage()-1)*page.getRows());
		map.put("room", room);
		map.put("page", page);
		return roomDao.searchRoom(map);
	}

	@Override
	public ArrayList<Integer> searchId() {
		return roomDao.queryallRoomId();
	}

	@Override
	public ArrayList<Integer> searchPrice() {
		// TODO Auto-generated method stub
		return roomDao.queryallRoomPrice();
	}

	@Override
	public int querysearchRoomcount(Room room) {
		return roomDao.querysearchRoomcount(room);
	}

	@Override
	public int deleteRoom(String roomTypeName, int roomId) {
		Roomtype roomtype=roomtypeDao.findRoomtypeByName(roomTypeName);
		return roomsDao.deleterooms(roomId, roomtype.getRoomTypeId());
	}

}
