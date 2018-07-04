package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.DeJobDao;
import com.sys.dao.DeptDao;
import com.sys.dao.EmDeJobDao;
import com.sys.dao.EmployeeDao;
import com.sys.dao.JobDao;
import com.sys.enity.Dept;
import com.sys.enity.Employee;
import com.sys.enity.Job;
import com.sys.enity.Page;
import com.sys.service.EmployeeService;
import com.sys.service.JobService;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private JobDao jobDao;
	@Autowired
	private DeptDao deptDao;
	@Autowired
	private EmDeJobDao emDeJobDao;
	@Autowired
	private DeJobDao deJobDao;
	
	@Override
	public List<Map<String, Object>> queryEmployeePage(Page page) {
		int i=(page.getPage()-1)*page.getRows();
		return employeeDao.queryEmployeePage(i,page.getRows());
	}

	@Override
	public ArrayList<Employee> findEmployeeById(int id) {
		return employeeDao.findEmployeeById(id);
	}

	@Override
	public int addEmployee(Employee employee,String deptName,String jobName) {
		employeeDao.addEmployee(employee);
		int jobId=jobDao.findJobByname(jobName).getJobId();
		int deptId=deptDao.findDeptByname(deptName).getDeptId();
		int i=deJobDao.findDeJonb(deptId,jobId);
		if(i!=1)
		{
			deJobDao.addDj(deptId,deptId);
		}
		Employee employee2=employeeDao.findEmployeeByName(employee.getEmployeeName());
		return emDeJobDao.addEDj(employee2.getEmployeeId(), deptId,jobId);
	}

	@Override
	public int queryAllEmployee() {
		return employeeDao.queryAllEmployee();
	}

	@Override
	public ArrayList<Integer> queryAllEmployeeId() {
		return employeeDao.queryAllEmployeeId();
	}

	@Override
	public ArrayList<Long> queryAllEmployeePhone() {
		return employeeDao.queryAllEmployeePhone();
	}

	@Override
	public ArrayList<String> queryAllEmployeeName() {
		return employeeDao.queryAllEmployeeName();
	}

	@Override
	public int updateEmployee(Employee employee,String deptName,String jobName) {
		employeeDao.updateEmployee(employee);
		int jobId=jobDao.findJobByname(jobName).getJobId();
		int deptId=deptDao.findDeptByname(deptName).getDeptId();
		int i=deJobDao.findDeJonb(deptId, jobId);
		if(i!=1)
		{
			deJobDao.addDj(deptId, jobId);
		}
		return emDeJobDao.addEDj(employee.getEmployeeId(), deptId, jobId);
	}

	@Override
	public int deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

	@Override
	public List<Map<String, Object>> searchEmployee(String id, String phone,
			String name,Page page) {
		Employee employee=new Employee();
		Map<String, Object> map=new HashMap<String, Object>();
		if(id!=null&&!"".equals(id))
		{
			employee.setEmployeeId(Integer.valueOf(id));
		}
		else {
			employee.setEmployeeId(0);			
		}
		if(phone!=null&&!"".equals(phone))
		{
			employee.setEmployeePhone(Long.valueOf(phone));
		}
		else {
			employee.setEmployeePhone(0L);		
		}
		page.setPage((page.getPage()-1)*page.getRows());
		employee.setEmployeeName(name);
		map.put("employee", employee);
		map.put("page", page);
		return employeeDao.searchEmployee(map);
	}

	@Override
	public int querysearchEmployeeacount(String id, String name, String phone) {
		Employee employee=new Employee();
		if(id!=null&&!"".equals(id))
		{
			employee.setEmployeeId(Integer.valueOf(id));
		}
		else {
			employee.setEmployeeId(0);			
		}
		if(phone!=null&&!"".equals(phone))
		{
			employee.setEmployeePhone(Long.valueOf(phone));
		}
		else {
			employee.setEmployeePhone(0L);		
		}
		employee.setEmployeeName(name);
		return employeeDao.querysearchEmployeeacount(employee);
	}

	@Override
	public int deleeteemdejob(int employeeID, String jobName,
			String deptname) {
		int jobId=jobDao.findJobByname(jobName).getJobId();
		int deptId=deptDao.findDeptByname(deptname).getDeptId();
		int i=emDeJobDao.deleteEDj(employeeID, deptId, jobId);
		int j=deJobDao.deleteDj(deptId, jobId);
		if(i==1&&j==1)
		{
			return 1;
		}
		return 0;
	}

}
