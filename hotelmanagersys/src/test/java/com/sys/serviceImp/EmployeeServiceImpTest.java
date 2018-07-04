package com.sys.serviceImp;



import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Employee;
import com.sys.enity.Page;
import com.sys.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class EmployeeServiceImpTest {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testQueryEmployeePage() {
		Page page=new Page();
		page.setPage(1);
		page.setRows(10);
		System.out.println(employeeService.queryEmployeePage(page));
	}

	@Test
	public void testFindEmployeeById() {
		System.out.println(employeeService.findEmployeeById(11));
	}

	@Test
	public void testAddEmployee() {
		Employee employee=new Employee();
		employee.setEmployeeIncome(1000);
		employee.setEmployeeMail("1774331087@qq.com");
		employee.setEmployeeName("test3");
		employee.setEmployeePhone(13203043767L);
		employee.setEmployeePwd("test");
		employee.setEmployeeRemark("123");
		employeeService.addEmployee(employee);
		
	}

	@Test
	public void testQueryAllEmployee() {
		System.out.println(employeeService.queryAllEmployee());
	}

	@Test
	public void testQueryAllEmployeeId() {
		System.out.println(employeeService.queryAllEmployeeId());
	}

	@Test
	public void testQueryAllEmployeePhone() {
		System.out.println(employeeService.queryAllEmployeePhone());
	}

	@Test
	public void testQueryAllEmployeeName() {
		System.out.println(employeeService.queryAllEmployeeName());
	}

	@Test
	public void testUpdateEmployee() {
		Employee employee=new Employee();
		employee.setEmployeeId(18);
		employee.setEmployeeIncome(1000);
		employee.setEmployeeMail("1774331087@qq.com");
		employee.setEmployeeName("test1");
		employee.setEmployeePhone(13203043767L);
		employee.setEmployeePwd("test1");
		employee.setEmployeeRemark("123");
		employee.setEmployeeStatus(2);
		employeeService.updateEmployee(employee);
		System.out.println(employeeService.findEmployeeById(18));
	}

	@Test
	public void testDeleteEmployee() {
		System.out.println(employeeService.deleteEmployee(17));
	}

	@Test
	public void testSearchEmployee() {
	
		List<Map<String, Object>> employees=employeeService.searchEmployee(1, 0, null);
		System.out.println(employees);
	}

}
