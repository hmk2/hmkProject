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
import com.sys.enity.Job;
import com.sys.enity.Page;
import com.sys.service.DeptService;
import com.sys.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService jobService;
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("queryJob")
	@ResponseBody
	public Map<String,Object> queryDept(Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> news=jobService.queryJobPage(page);
		int count=jobService.queryAllJob();
		map.put("rows", news);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/serachdeptName",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,String>> serachddeptname()
	{
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		ArrayList<String> ArrayList=deptService.queryAllDeptName();
		for(String i:ArrayList)
		{
			Map<String, String> map=new HashMap<String, String>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list; 
	}
	@RequestMapping(value="/addsaveJob",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> addsavejob(Job job,String deptName)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=jobService.addJob(job, deptName);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("editSaveJob")
	@ResponseBody
	public Map<String,String> editsavejob(Job job,String deptName)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=jobService.updateJob(job,deptName);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	} 
	@RequestMapping("deletedejob")
	@ResponseBody
	public Map<String,String> deletedejob(String deptName,int jobId)
	{
		System.out.println(deptName);
		System.out.println(jobId);
		Map<String,String> map = new HashMap<String,String>();
		int flag=jobService.deletedeeJob(deptName, jobId);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	} 
	@RequestMapping("deleteJob")
	@ResponseBody
	public Map<String,String> deletejob(int jobId)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=jobService.deleteJob(jobId);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping(value="/serachjobid",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,Integer>> serachjobId()
	{
		List<Map<String,Integer>> list=new ArrayList<Map<String,Integer>>();
		ArrayList<Integer> idsArrayList=jobService.queryAllJobId();
		for(Integer i:idsArrayList)
		{
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list;
	}
	@RequestMapping(value="/serachjobName",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,String>> serachJobname()
	{
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		ArrayList<String> ArrayList=jobService.queryAllJobName();
		for(String i:ArrayList)
		{
			Map<String, String> map=new HashMap<String, String>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list; 
	}
	@RequestMapping(value="/searchJob",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> searchJob(String id,String name,Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> depts=jobService.searchJob(id, name, page);
		int count=deptService.querysearchDeptcount(id, name);
		map.put("rows", depts);
		map.put("total", count);
		return map;
	}
}
