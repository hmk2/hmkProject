package com.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface EmDeJobDao {
	//增加
	public int addEDj(@Param("employeeId")int employeeId,@Param("deptId")int deptId,@Param("jobId")int jobId);
	//删除
	public int deleteEDj(@Param("employeeId")int employeeId,@Param("deptId")int deptId,@Param("jobId")int jobId);
}
