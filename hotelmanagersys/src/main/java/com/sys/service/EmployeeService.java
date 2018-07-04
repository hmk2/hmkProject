package com.sys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.sys.enity.Employee;
import com.sys.enity.Page;

public interface EmployeeService {
	//通过当前页数和总数进行分页查询
	public List<Map<String, Object>> queryEmployeePage(Page page);
	//通过员工ID查询出员工
	public ArrayList<Employee> findEmployeeById(int id);
	//添加员工
	public int addEmployee(Employee employee,String deptName,String jobName);
	//查询出员工的总数
	public int queryAllEmployee();
	//查询出所有员工的ID
	public ArrayList<Integer> queryAllEmployeeId();
	//查询出所有的员工电话
	public ArrayList<Long> queryAllEmployeePhone();
	//查询出所有的员工姓名
	public ArrayList<String> queryAllEmployeeName();
	//对员工进行更新
	public int updateEmployee(Employee employee,String deptName,String jobName);
	
	public int deleeteemdejob(int employeeId,String jobName,String deptname);
	//通过员工ID删除房间
	public int  deleteEmployee(int id);
	public int querysearchEmployeeacount(String id,String name,String phone);
	//通过员工对象来查询出房间
	public List<Map<String, Object>> searchEmployee(String id,String phone,String name,Page page);
}
