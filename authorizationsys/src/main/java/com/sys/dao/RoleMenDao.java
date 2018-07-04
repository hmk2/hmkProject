package com.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface RoleMenDao {
	public boolean addrm(@Param("rmId")int rmId,@Param("roleId")int roleId,@Param("menuId")int menuId);
	public boolean deleterm(int id);
	public int queryMaxId();
}
