package com.sys.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sys.enity.Dept;
import com.sys.enity.Page;
import com.sys.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping("queryDept")
	@ResponseBody
	public Map<String,Object> queryDept(Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		ArrayList<Dept> depts=deptService.queryDeptPage(page);
		int count=deptService.queryAllDept();
		map.put("rows", depts);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/addsaveDept",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> savedept(Dept dept)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=deptService.addDept(dept);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("deleteDept")
	@ResponseBody
	public Map<String,String> deletedept(int deptid)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=deptService.deleteDept(deptid);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("editSaveDept")
	@ResponseBody
	public Map<String,String> editsaveDept(Dept dept)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=deptService.updateDept(dept);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	} 
	@RequestMapping(value="/serachDeptid",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,Integer>> serachdeptId()
	{
		List<Map<String,Integer>> list=new ArrayList<Map<String,Integer>>();
		ArrayList<Integer> idsArrayList=deptService.queryAllDeptId();
		for(Integer i:idsArrayList)
		{
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list;
	}
	@RequestMapping(value="/serachDeptName",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<String> serachdeptname()
	{
		return deptService.queryAllDeptName();
	}
	@RequestMapping(value="/searchDept",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> searchnews(String id,String name,Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		ArrayList<Dept> depts=deptService.searchDept(id, name,page);
		int count=deptService.querysearchDeptcount(id, name);
		map.put("rows", depts);
		map.put("total", count);
		return map;
	}
}
