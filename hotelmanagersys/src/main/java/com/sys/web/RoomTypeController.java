package com.sys.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.enity.Dept;
import com.sys.enity.Page;
import com.sys.enity.Roomtype;
import com.sys.service.RoomtypeService;

@Controller
public class RoomTypeController {

	@Autowired
	private RoomtypeService roomtypeService;
	
	@RequestMapping("/queryRoomtype")
	@ResponseBody
	public Map<String,Object> queryRoomType(Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		ArrayList<Roomtype> aRoomtypes=roomtypeService.queryRoomtypePage(page);
		int count=roomtypeService.queryAllRoomtype();
		map.put("rows", aRoomtypes);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/addsaveroomtpe",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> addSaveRoomTpe(Roomtype roomtype)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=roomtypeService.addRoomtype(roomtype);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("editSaveRoomType")
	@ResponseBody
	public Map<String,String> editsaveRoomType(Roomtype roomtype)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=roomtypeService.updateRoomtype(roomtype);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	} 
	@RequestMapping("deleteRoomType")
	@ResponseBody
	public Map<String,String> deleteroomType(int roomTypeid)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=roomtypeService.deleteRoomtype(roomTypeid);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping(value="/serachRoomTypeid",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Integer> serachroomTypeId()
	{
		return roomtypeService.queryAllRoomtypeId();
	}
	@RequestMapping(value="/serachRoomTypeName",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<String> serachroomTypeName()
	{
		return roomtypeService.queryAllRoomtypeName();
	}
	@RequestMapping(value="/searchRoomType",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> searchnews(String id,String name,Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		ArrayList<Roomtype> roomtypes=roomtypeService.searchNews(id, name,page);
		int count=roomtypeService.querysearchRoomTypecount(id, name);
		map.put("rows", roomtypes);
		map.put("total", count);
		return map;
	}
}
