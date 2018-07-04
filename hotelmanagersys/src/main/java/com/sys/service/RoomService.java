package com.sys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.sys.enity.Page;
import com.sys.enity.Room;


public interface RoomService {
	public ArrayList<Room> findRoomById(int id);
	public List<Map<String, Object>> queryRoompage(Page page);
	public int addRoom(Room room,String name);
	public int queryallRoom();
	public int updateRoom(Room room,String roomTypeName);	
	public int deleteRoom(int id);
	public List<Map<String, Object>> searchRoom(Room room,Page page);
	public ArrayList<Integer> searchId();
	public ArrayList<Integer> searchPrice();
	public int querysearchRoomcount(Room room);
	public int deleteRoom(String roomTypeName,int roomId);
}
