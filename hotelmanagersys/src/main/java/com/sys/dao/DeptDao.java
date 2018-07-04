package com.sys.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.sys.enity.Dept;



public interface DeptDao {
		//通过当前页数和总数进行分页查询
		public ArrayList<Dept> queryDeptPage(@Param("page")int page,@Param("rows")int rows);
		//通过部门ID查询出部门
		public ArrayList<Dept> findDeptById(int id);
		//通过部门查询出部门
		public Dept findDeptByname(String name);
		//添加部门
		public int addDept(Dept dept);
		//查询出部门的总数
		public int queryAllDept();
		//查询出所有部门的ID
		public ArrayList<Integer> queryAllDeptId();
		//查询出所有的部门的名称
		public ArrayList<String> queryAllDeptName();
		//对部门进行更新
		public int updateDept(Dept dept);
		//通过部门ID删除部门
		public int  deleteDept(int id);
		public int querysearchDeptcount(Dept dept);
		//通过部门对象来查询出部门
		public ArrayList<Dept> searchDept(Map<String, Object> map);
}
