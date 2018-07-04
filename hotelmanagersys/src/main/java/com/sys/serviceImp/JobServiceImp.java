package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.DeJobDao;
import com.sys.dao.DeptDao;
import com.sys.dao.JobDao;
import com.sys.enity.Dept;
import com.sys.enity.Job;
import com.sys.enity.Page;
import com.sys.service.JobService;

@Service
public class JobServiceImp implements JobService {

	@Autowired
	private JobDao jobDao;
	@Autowired
	private DeptDao deptDao;
	@Autowired
	private DeJobDao deJobDao;
	@Override
	public List<Map<String, Object>> queryJobPage(Page page) {
		int i=(page.getPage()-1)*page.getRows();
		return jobDao.queryJobPage(i, page.getRows());
	}

	@Override
	public ArrayList<Job> findJobById(int id) {
		return jobDao.findJobById(id);
	}

	@Override
	public int addJob(Job job,String deptname) {
		jobDao.addJob(job);
		Job job2=jobDao.findJobByname(job.getJobName());
		Dept dept=deptDao.findDeptByname(deptname);
		return deJobDao.addDj(dept.getDeptId(), job2.getJobId());
	}

	@Override
	public int queryAllJob() {
		return jobDao.queryAllJob();
	}

	@Override
	public ArrayList<Integer> queryAllJobId() {
		
		return jobDao.queryAllJobId();
	}

	@Override
	public ArrayList<String> queryAllJobName() {
		// TODO Auto-generated method stub
		return jobDao.queryAllJobName();
	}

	@Override
	public int updateJob(Job job,String name) {
		jobDao.updateJob(job);
		Dept dept= deptDao.findDeptByname(name);
		int i=deJobDao.findDeJonb(dept.getDeptId(), job.getJobId());
		if(i==1)
		{
			return 1;
		}
		return deJobDao.addDj(dept.getDeptId(), job.getJobId());
	}

	@Override
	public int deleteJob(int id) {
		// TODO Auto-generated method stub
		return jobDao.deleteJob(id);
	}
	@Override
	public int deletedeeJob(String name,int id) {
		Dept dept=deptDao.findDeptByname(name);	
		return deJobDao.deleteDj(dept.getDeptId(), id);
	}
	@Override
	public List<Map<String, Object>> searchJob(String id, String name,Page page) {
		Job job=new Job();
		Map<String, Object> map=new HashMap<String, Object>();
		if(id!=null&&!"".equals(id))
		{
			job.setJobId(Integer.valueOf(id));
		}
		else {
			job.setJobId(0);			
		}
		job.setJobName(name);
		page.setPage((page.getPage()-1)*page.getRows());
		map.put("job", job);
		map.put("page", page);
		return jobDao.searchJob(map);
	}

	@Override
	public int querysearchJobcount(String id, String name) {
		Job job=new Job();
		if(id!=null&&!"".equals(id))
		{
			job.setJobId(Integer.valueOf(id));
		}
		else {
			job.setJobId(0);			
		}
		job.setJobName(name);
		return jobDao.querysearchJobcount(job);
	}

}
