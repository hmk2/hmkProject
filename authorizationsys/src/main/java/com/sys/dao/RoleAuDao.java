package com.sys.dao;

import org.apache.ibatis.annotations.Param;


public interface RoleAuDao {
	public boolean addrad(@Param("raId")int raId,@Param("roleId")int roleId,@Param("auId")int auId);
	public boolean deleterad(int id);
	public int queryMaxAu();
}
