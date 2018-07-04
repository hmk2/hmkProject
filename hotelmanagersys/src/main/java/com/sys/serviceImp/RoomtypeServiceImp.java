package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.RoomtypeDao;
import com.sys.enity.Page;
import com.sys.enity.Roomtype;
import com.sys.service.RoomtypeService;

@Service
public class RoomtypeServiceImp implements RoomtypeService {

	@Autowired
	private RoomtypeDao roomtypeDao;
	@Override
	public ArrayList<Roomtype> queryRoomtypePage(Page page) {
		int i=(page.getPage()-1)*page.getRows();
		return roomtypeDao.queryRoomtypePage(i,page.getRows());
	}

	@Override
	public ArrayList<Roomtype> findRoomtypeById(int id) {
		return roomtypeDao.findRoomtypeById(id);
	}

	@Override
	public int addRoomtype(Roomtype roomtype) {
		return roomtypeDao.addRoomtype(roomtype);
	}

	@Override
	public int queryAllRoomtype() {
		return roomtypeDao.queryAllRoomtype();
	}

	@Override
	public ArrayList<Integer> queryAllRoomtypeId() {
		return roomtypeDao.queryAllRoomtypeId();
	}

	@Override
	public ArrayList<String> queryAllRoomtypeName() {
		return roomtypeDao.queryAllRoomtypeName();
	}

	@Override
	public int updateRoomtype(Roomtype roomtype) {
		return roomtypeDao.updateRoomtype(roomtype);
	}

	@Override
	public int deleteRoomtype(int id) {
		return roomtypeDao.deleteRoomtype(id);
	}

	@Override
	public ArrayList<Roomtype> searchNews(String id, String name,Page page) {
		Roomtype roomtype=new Roomtype();
		Map<String, Object> map=new HashMap<String, Object>();
		if(id!=null&&!"".equals(id))
		{
			roomtype.setRoomTypeId(Integer.valueOf(id));
		}
		else {
			roomtype.setRoomTypeId(0);			
		}
		page.setPage((page.getPage()-1)*page.getRows());
		roomtype.setRoomTypeName(name);
		map.put("roomtype", roomtype);
		map.put("page", page);
		return roomtypeDao.searchNews(map);
	}

	@Override
	public int querysearchRoomTypecount(String id, String name) {
		Roomtype roomtype=new Roomtype();
		if(id!=null&&!"".equals(id))
		{
			roomtype.setRoomTypeId(Integer.valueOf(id));
		}
		else {
			roomtype.setRoomTypeId(0);			
		}
		roomtype.setRoomTypeName(name);
		return roomtypeDao.querysearchRoomTypecount(roomtype);
	}

}
