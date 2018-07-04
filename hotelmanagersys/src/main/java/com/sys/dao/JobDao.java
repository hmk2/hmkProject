package com.sys.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sys.enity.Dept;
import com.sys.enity.Job;


public interface JobDao {
		//通过当前页数和总数进行分页查询
		public List<Map<String, Object>> queryJobPage(@Param("page")int page,@Param("rows")int rows);
		//通过职位ID查询出员工
		public ArrayList<Job> findJobById(int id);
		//通过职位查询出员工
		public Job findJobByname(String name);
		//添加职位
		public int addJob(Job job);
		//查询出职位的总数
		public int queryAllJob();
		//查询出所有职位的ID
		public ArrayList<Integer> queryAllJobId();
		//查询出所有的职位的名称
		public ArrayList<String> queryAllJobName();
		//对职位进行更新
		public int updateJob(Job job);
		//通过职位ID删除职位
		public int  deleteJob(int id);
		public int querysearchJobcount(Job job);
		//通过职位对象来查询出房间
		public List<Map<String, Object>> searchJob(Map<String, Object> map);
}
