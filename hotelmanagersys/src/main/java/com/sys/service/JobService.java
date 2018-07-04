package com.sys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.sys.enity.Job;
import com.sys.enity.Page;

public interface JobService {
	//通过当前页数和总数进行分页查询
	public List<Map<String, Object>> queryJobPage(Page page);
	//通过职位ID查询出员工
	public ArrayList<Job> findJobById(int id);
	//添加职位
	public int addJob(Job job,String deptname);
	//查询出职位的总数
	public int queryAllJob();
	//查询出所有职位的ID
	public ArrayList<Integer> queryAllJobId();
	//查询出所有的职位的名称
	public ArrayList<String> queryAllJobName();
	//对职位进行更新
	public int updateJob(Job job,String name);
	public int deletedeeJob(String name,int id);
	//通过职位ID删除职位
	public int  deleteJob(int id);
	public int querysearchJobcount(String id,String name);
	//通过职位对象来查询出房间
	public List<Map<String, Object>> searchJob(String id,String name,Page page);
}
