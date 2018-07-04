package com.sys.dao;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Dept;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DeptDaoTest {
	
	@Autowired
	private DeptDao deptDao;
	@Test
	public void testQueryDeptPage() {
		ArrayList<Dept> depts=deptDao.queryDeptPage(2, 10);
		System.out.println(depts.size());
		System.out.println(depts);
	}
	@Test
	public void testFindDeptById() {
		ArrayList<Dept> depts=deptDao.findDeptById(2);
		System.out.println(depts);
	}
	@Test
	public void findDeptByname() {
		Dept depts=deptDao.findDeptByname("前厅部");
		System.out.println(depts.getDeptId());
	}
	@Test
	public void testAddDept() {
		Dept dept=new Dept();
		dept.setDeptName("test");
		/*dept.setDeptRemark("test");*/
		System.out.println(dept);
		/*deptDao.addDept(dept);*/
	}

	@Test
	public void testQueryAllDept() {
		System.out.println(deptDao.queryAllDept());
	}

	@Test
	public void testQueryAllDeptId() {
		System.out.println(deptDao.queryAllDeptId());
	}

	@Test
	public void testQueryAllDeptName() {
		System.out.println(deptDao.queryAllDeptName());
	}

	@Test
	public void testUpdateDept() {
		Dept dept=new Dept();
		dept.setDeptId(11);
		dept.setDeptName("test1");
		dept.setDeptRemark("test1");
		dept.setDeptStatus(2);
		deptDao.updateDept(dept);
	}

	@Test
	public void testDeleteDept() {
		deptDao.deleteDept(11);
	}

	@Test
	public void testSearchDept() {
		Dept dept=new Dept();
		dept.setDeptId(11);
		dept.setDeptName("test1");
		
		System.out.println(deptDao.searchDept(dept));
	}

}
