package com.sys.service;

import java.util.ArrayList;

import com.sys.enity.Page;
import com.sys.enity.Roomtype;

public interface RoomtypeService {
	//通过当前页数和总数进行分页查询
	public ArrayList<Roomtype> queryRoomtypePage(Page page);
	//通过房间类型ID查询出房间类型
	public ArrayList<Roomtype> findRoomtypeById(int id);
	//添加房间类型
	public int addRoomtype(Roomtype roomtype);
	//查询出房间类型的总数
	public int queryAllRoomtype();
	//查询出所有房间类型的ID
	public ArrayList<Integer> queryAllRoomtypeId();
	//查询出所有房间类型的ID
	public ArrayList<String> queryAllRoomtypeName();
	//对房间类型进行更新
	public int updateRoomtype(Roomtype roomtype);
	//通过房间类型ID删除新闻
	public int  deleteRoomtype(int id);
	public int querysearchRoomTypecount(String id,String name);
	//通过房间类型对象来查询出房间类型
	public ArrayList<Roomtype> searchNews(String id,String name,Page page);
}
