package com.sys.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sys.enity.Page;
import com.sys.enity.Room;
import com.sys.service.RoomService;
import com.sys.service.RoomtypeService;


@Controller
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	@Autowired
	private RoomtypeService roomtypeService;

	@RequestMapping("/queryRoom")
	@ResponseBody
	public Map<String,Object> query(Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> rooms=roomService.queryRoompage(page);
		int count=roomService.queryallRoom();
		map.put("rows", rooms);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/saveRoom",method=RequestMethod.POST)
	@ResponseBody
	public int saveroom(Room room,@RequestParam("fileimage") MultipartFile fileimage,
						@RequestParam("imagename")String imagename,String roomTypeName)
	{
		/*return roomService.updateRoom(room);*/
		System.out.println(fileimage.getOriginalFilename());
		try {
			String pathString="D:\\install\\Tomcat1\\webapps\\hotelmanagersys\\images\\";
			FileUtils.copyInputStreamToFile(fileimage.getInputStream(), new File(pathString, fileimage.getOriginalFilename()));
			room.setImage(fileimage.getOriginalFilename());
			return roomService.updateRoom(room,roomTypeName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			fileimage.transferTo(new File("C:\\Users\\asus-PC\\Desktop\\项目\\java项目练习\\hotelmanagersys\\src\\main\\webapp\\images\\", System.currentTimeMillis()+ fileimage.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return 1;
	}
	@RequestMapping(value="/addsaveRoom",method=RequestMethod.POST)
	@ResponseBody
	public int addsaveroom(Room room,String roomTypeName)
	{
		int i=roomService.addRoom(room,roomTypeName);
		return i;
	}
	@RequestMapping(value="/deleteRoom",method=RequestMethod.POST)
	@ResponseBody
	public int deleteroom(int roomid)
	{
		int i=roomService.deleteRoom(roomid);
		return i;
	}
	@RequestMapping(value="/searchRoomByid",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object>  searchRoomById(Room room,Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> rooms=roomService.searchRoom(room,page);
		int count=roomService.querysearchRoomcount(room);
		map.put("rows", rooms);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/serachroomid",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Integer> serachroomId()
	{
		return roomService.searchId();
	}
	@RequestMapping(value="/serachroomprice",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Integer> serachroomPrice()
	{
		return roomService.searchPrice();
	}
	@RequestMapping(value="/serachRoomTypeByName",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,String>> serachRoomTypeByName()
	{
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		ArrayList<String> idsArrayList=roomtypeService.queryAllRoomtypeName();
		for(String i:idsArrayList)
		{
			Map<String, String> map=new HashMap<String, String>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list;
	}
	@RequestMapping("deleteRooms")
	@ResponseBody
	public Map<String,String> deleteRooms(String roomTypeName,int roomId)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=roomService.deleteRoom(roomTypeName, roomId);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
}
