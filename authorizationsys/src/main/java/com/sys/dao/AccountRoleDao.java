package com.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountRoleDao {
	public boolean addar(@Param("arId")int arId,@Param("acId")String acId,@Param("roleId")int roleId);
	public boolean deletear(int id);
}
