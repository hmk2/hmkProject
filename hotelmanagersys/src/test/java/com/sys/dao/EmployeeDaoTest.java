package com.sys.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class EmployeeDaoTest {
	
	@Autowired
	private EmployeeDao employeeDao;
	@Test
	public void testQueryEmployeePage() {
		List<Map<String, Object>> employees=employeeDao.queryEmployeePage(1, 10);
		System.out.println(employees.size());
		System.out.println(employees.get(2));
	}

	@Test
	public void testFindEmployeeById() {
		ArrayList<Employee> employees=employeeDao.findEmployeeById(12);
		System.out.println(employees.size());
		System.out.println(employees);
	}

	@Test
	public void testAddEmployee() {
		Employee employee=new Employee();
		employee.setEmployeeIncome(1000);
		employee.setEmployeeMail("1774331087@qq.com");
		employee.setEmployeeName("周伟");
		employee.setEmployeePhone(13203043767L);
		employee.setEmployeePwd("test");
		employee.setEmployeeRemark("123");
		employeeDao.addEmployee(employee);
		System.out.println(employeeDao.findEmployeeById(12));
	}

	@Test
	public void testQueryAllEmployee() {
		System.out.println(employeeDao.findEmployeeByName("黄明凯"));
		/*System.out.println(employeeDao.queryAllEmployee());*/
	}

	@Test
	public void testQueryAllEmployeeId() {
		System.out.println(employeeDao.queryAllEmployeeId());
	}

	@Test
	public void testQueryAllEmployeePhone() {
		ArrayList<Integer> eArrayList=employeeDao.queryAllEmployeePhone();
		System.out.println(eArrayList.size());
		System.out.println(eArrayList);
	}

	@Test
	public void testQueryAllEmployeeName() {
		ArrayList<String> eArrayList=employeeDao.queryAllEmployeeName();
		System.out.println(eArrayList.size());
		System.out.println(eArrayList);
	}

	@Test
	public void testUpdateEmployee() {
		Employee employee=new Employee();
		employee.setEmployeeId(12);
		employee.setEmployeeIncome(1000);
		employee.setEmployeeMail("1774331087@qq.com");
		employee.setEmployeeName("test1");
		employee.setEmployeePhone(13203043767L);
		employee.setEmployeePwd("test1");
		employee.setEmployeeRemark("123");
		employee.setEmployeeStatus(2);
		employeeDao.updateEmployee(employee);
		System.out.println(employeeDao.findEmployeeById(12));
	}

	@Test
	public void testDeleteEmployee() {
		employeeDao.deleteEmployee(12);
		System.out.println(employeeDao.findEmployeeById(12));
	}

	@Test
	public void testSearchEmployee() {
		Employee employee=new Employee();
		/*employee.setEmployeeId(12);*/
		employee.setEmployeeName("黄明凯");
		/*employee.setEmployeePhone(13203043767L);*/
		List<Map<String, Object>> employees=employeeDao.searchEmployee(employee);
		System.out.println(employees);
	}

}
