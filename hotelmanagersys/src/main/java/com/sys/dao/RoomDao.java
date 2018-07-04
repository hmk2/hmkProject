package com.sys.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sys.enity.Job;
import com.sys.enity.Room;
/**
 * 
 * @author huangmingkai
 *
 */
public interface RoomDao {
	//通过房间ID查询出房间
	public ArrayList<Room> findRoomById(int id);
	//通过当前页数和总数分页查询
	public List<Map<String, Object>> queryRoompage(@Param("page")int page,@Param("rows")int rows);
	//添加房间
	public int addRoom(Room room);
	//查询出房间的总数
	public int queryallRoom();
	//查询出所有房间的ID
	public ArrayList<Integer> queryallRoomId();
	//对房间进行更新
	public int updateRoom(Room room);
	//通过房间ID删除房间
	public int  deleteRoom(int id);
	public int querysearchRoomcount(Room room);
	//通过房间对象来查询出房间
	public List<Map<String, Object>> searchRoom(Map<String, Object> map);
	//通过所有的房间价格
	public ArrayList<Integer> queryallRoomPrice();
}
