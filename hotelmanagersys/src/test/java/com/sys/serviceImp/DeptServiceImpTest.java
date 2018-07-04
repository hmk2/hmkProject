package com.sys.serviceImp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Dept;
import com.sys.enity.Page;
import com.sys.service.DeptService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class DeptServiceImpTest {
	
	@Autowired
	private DeptService deptService;
	@Test
	public void testQueryDeptPage() {
		Page page=new Page();
		page.setPage(1);
		page.setRows(10);
		System.out.println(deptService.queryDeptPage(page));
	}

	@Test
	public void testFindDeptById() {
		System.out.println(deptService.findDeptById(2));
	}

	@Test
	public void testAddDept() {
		Dept dept=new Dept();
		dept.setDeptName("test2");
		dept.setDeptRemark("test2");
		deptService.addDept(dept);
	}

	@Test
	public void testQueryAllDept() {
		System.out.println(deptService.queryAllDept());
	}

	@Test
	public void testQueryAllDeptId() {
		System.out.println(deptService.queryAllDeptId());
	}

	@Test
	public void testQueryAllDeptName() {
		System.out.println(deptService.queryAllDeptName());
	}

	@Test
	public void testUpdateDept() {
		Dept dept=new Dept();
		dept.setDeptId(12);
		dept.setDeptName("test2");
		dept.setDeptRemark("test2");
		dept.setDeptStatus(2);
		deptService.updateDept(dept);
	}

	@Test
	public void testDeleteDept() {
		deptService.deleteDept(12);
	}

	@Test
	public void testSearchDept() {
		Page page=new Page();
		page.setPage(1);
		page.setRows(10);
		System.out.println(deptService.searchDept("39", "a", page));
	}
}
