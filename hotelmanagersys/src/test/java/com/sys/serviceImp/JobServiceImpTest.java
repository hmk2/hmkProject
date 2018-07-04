package com.sys.serviceImp;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.Job;
import com.sys.enity.Page;
import com.sys.service.JobService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class JobServiceImpTest {
	
	@Autowired
	private JobService jobService;
	@Test
	public void testQueryJobPage() {
		Page page=new Page();
		page.setPage(1);
		page.setRows(10);
		System.out.println(jobService.queryJobPage(page));
	}

	@Test
	public void testFindJobById() {
		System.out.println(jobService.findJobById(1));
	}

	@Test
	public void testAddJob() {
		Job job=new Job();
		job.setJobName("test3");
		job.setJobRemark("test3");
		jobService.addJob(job);
	}

	@Test
	public void testQueryAllJob() {
		System.out.println(jobService.queryAllJob());
	}

	@Test
	public void testQueryAllJobId() {
		System.out.println(jobService.queryAllJobId());
	}

	@Test
	public void testQueryAllJobName() {
		System.out.println(jobService.queryAllJobName());
	}

	@Test
	public void testUpdateJob() {
		Job job=new Job();
		job.setJobId(18);
		job.setJobName("test2");
		job.setJobRemark("test2");
		job.setJobStatus(2);
		jobService.updateJob(job);
	}

	@Test
	public void testDeleteJob() {
		System.out.println(jobService.deleteJob(18));
	}

	@Test
	public void testSearchJob() {
		System.out.println(jobService.searchJob(12, null));
	}

}
