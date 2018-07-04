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

import com.sys.enity.Employee;
import com.sys.enity.Job;
import com.sys.enity.Page;
import com.sys.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("queryEmployee")
	@ResponseBody
	public Map<String,Object> queryDept(Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> news=employeeService.queryEmployeePage(page);
		int count=employeeService.queryAllEmployee();
		map.put("rows", news);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/serachEmployeeName",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,String>> serachEmployeeName()
	{
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		ArrayList<String> ArrayList=employeeService.queryAllEmployeeName();
		for(String i:ArrayList)
		{
			Map<String, String> map=new HashMap<String, String>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list; 
	}
	@RequestMapping(value="/serachEmployeeId",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,Integer>> serachEmployeeId()
	{
		List<Map<String,Integer>> list=new ArrayList<Map<String,Integer>>();
		ArrayList<Integer> idsArrayList=employeeService.queryAllEmployeeId();
		for(Integer i:idsArrayList)
		{
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list;
	}
	@RequestMapping(value="/serachEmployeePhone",method=RequestMethod.POST)
	@ResponseBody
	public List<Map<String,Long>> serachEmployeePhone()
	{
		List<Map<String,Long>> list=new ArrayList<Map<String,Long>>();
		ArrayList<Long> idsArrayList=employeeService.queryAllEmployeePhone();
		for(long i:idsArrayList)
		{
			Map<String, Long> map=new HashMap<String, Long>();
			map.put("value", i);
			map.put("text", i);
			list.add(map);
		}
		return list;
	}
	@RequestMapping(value="/searchEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> searchEmployee(String id,String name,String phone,Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String, Object>> eMaps=employeeService.searchEmployee(id, phone, name, page);
		int count=employeeService.querysearchEmployeeacount(id, name, phone);
		map.put("rows", eMaps);
		map.put("total", count);
		return map;
	}
	@RequestMapping("deleteEmployee")
	@ResponseBody
	public Map<String,String> deleteEmployee(int employeeId)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=employeeService.deleteEmployee(employeeId);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping(value="/addsaveEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> addsavejob(Employee employee,String deptName,String jobName)
	{
		System.out.println(employee);
		System.out.println(deptName);
		System.out.println(jobName);
		Map<String,String> map = new HashMap<String,String>();
		int flag=employeeService.addEmployee(employee,deptName,jobName);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("deleteemdejob")
	@ResponseBody
	public Map<String,String> deleteEmdeJob(String jobName,int employeeId,String deptsname)
	{
		System.out.println(jobName);
		System.out.println(employeeId);
		System.out.println(deptsname);
		Map<String,String> map = new HashMap<String,String>();
		int flag=employeeService.deleeteemdejob(employeeId, jobName, deptsname);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	} 
	@RequestMapping("editSaveEmployee")
	@ResponseBody
	public Map<String,String> editSaveEmployee(Employee employee,String deptName,String jobName)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=employeeService.updateEmployee(employee, deptName, jobName);
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
