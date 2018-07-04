package com.sys.dao;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.sys.enity.Job;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class JobDaoTest {
	
	@Autowired
	private JobDao jobDaos;
	@Test
	public void testQueryJobPage() {
		List<Map<String, Object>> jobs=jobDaos.queryJobPage(2, 10);
		System.out.println(jobs.size());
		System.out.println(jobs);
	}

	@Test
	public void testFindJobById() {
		System.out.println(jobDaos.findJobById(12));
	}
	@Test
	public void findJobByname() {
		System.out.println(jobDaos.findJobByname("迎宾员").getJobId());
	}
	@Test
	public void testAddJob() {
		Job job= new Job();
		job.setJobName("test");
		job.setJobRemark("test");
		jobDaos.addJob(job);
	}

	@Test
	public void testQueryAllJob() {
		
		System.out.println(jobDaos.queryAllJob());
	}

	@Test
	public void testQueryAllJobId() {
		System.out.println(jobDaos.queryAllJobId());
	}

	@Test
	public void testQueryAllJobName() {
		System.out.println(jobDaos.queryAllJobName());
	}

	@Test
	public void testUpdateJob() {
		Job job= new Job();
		job.setJobId(17);
		job.setJobName("test1");
		job.setJobRemark("test1");
		jobDaos.updateJob(job);
	}

	@Test
	public void testDeleteJob() {
		jobDaos.deleteJob(17);
	}

	@Test
	public void testSearchJob() {
		Job job= new Job();
		job.setJobId(16);
		//job.setJobName("会记师");
		System.out.println(jobDaos.searchJob(job));
	}

}
