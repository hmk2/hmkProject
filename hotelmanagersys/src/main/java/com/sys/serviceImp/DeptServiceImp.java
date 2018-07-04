package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.DeptDao;
import com.sys.enity.Dept;
import com.sys.enity.Page;
import com.sys.service.DeptService;
@Service
public class DeptServiceImp implements DeptService {
	
	@Autowired
	private DeptDao deptDao;
	
	@Override
	public ArrayList<Dept> queryDeptPage(Page page) {
		int i=(page.getPage()-1)*page.getRows();
		return deptDao.queryDeptPage(i,page.getRows());
	}

	@Override
	public ArrayList<Dept> findDeptById(int id) {
		return deptDao.findDeptById(id);
	}

	@Override
	public int addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public int queryAllDept() {
		return deptDao.queryAllDept();
	}

	@Override
	public ArrayList<Integer> queryAllDeptId() {
		return deptDao.queryAllDeptId();
	}

	@Override
	public ArrayList<String> queryAllDeptName() {
		return deptDao.queryAllDeptName();
	}

	@Override
	public int updateDept(Dept dept) {
		return deptDao.updateDept(dept);
	}

	@Override
	public int deleteDept(int id) {
		return deptDao.deleteDept(id);
	}

	@Override
	public ArrayList<Dept> searchDept(String id,String name,Page page) {
		Dept dept=new Dept();
		Map<String, Object> map=new HashMap<String, Object>();
		if(id!=null&&!"".equals(id))
		{
			dept.setDeptId(Integer.valueOf(id));
		}
		else {
			dept.setDeptId(0);			
		}
		page.setPage((page.getPage()-1)*page.getRows());
		dept.setDeptName(name);
		map.put("dept", dept);
		map.put("page", page);
		return deptDao.searchDept(map);
	}

	@Override
	public int querysearchDeptcount(String id,String name) {
		Dept dept=new Dept();
		if(id!=null&&!"".equals(id))
		{
			dept.setDeptId(Integer.valueOf(id));
		}
		else {
			dept.setDeptId(0);			
		}
		dept.setDeptName(name);		
		return deptDao.querysearchDeptcount(dept);
	}

}
