package com.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface DeJobDao {
	//增加
	public int addDj(@Param("deptId")int deptId,@Param("jobId")int jobId);
	//删除
	public int deleteDj(@Param("deptId")int deptId,@Param("jobId")int jobId);
	public int findDeJonb(@Param("deptId")int deptId,@Param("jobId")int jobId);
}
