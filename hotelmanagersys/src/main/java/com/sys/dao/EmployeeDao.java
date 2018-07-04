package com.sys.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.sys.enity.Employee;
import com.sys.enity.Job;

public interface EmployeeDao {

	//通过当前页数和总数进行分页查询
	public List<Map<String, Object>> queryEmployeePage(@Param("page")int page,@Param("rows")int rows);
	//通过员工ID查询出员工
	public ArrayList<Employee> findEmployeeById(int id);
	//通过员工姓名查询出员工
	public Employee findEmployeeByName(String name);
	//添加员工
	public int addEmployee(Employee employee);
	//查询出员工的总数
	public int queryAllEmployee();
	//查询出所有员工的ID
	public ArrayList<Integer> queryAllEmployeeId();
	//查询出所有的员工电话
	public ArrayList<Long> queryAllEmployeePhone();
	//查询出所有的员工邮箱
	public ArrayList<String> queryAllEmployeeName();
	//对员工进行更新
	public int updateEmployee(Employee employee);
	//通过员工ID删除房间
	public int  deleteEmployee(int id);
	public int querysearchEmployeeacount(Employee employee);
	//通过员工对象来查询出房间
	public List<Map<String, Object>> searchEmployee(Map<String, Object> map);
}
