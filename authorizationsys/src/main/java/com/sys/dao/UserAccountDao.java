package com.sys.dao;

import org.apache.ibatis.annotations.Param;


public interface UserAccountDao {
	public boolean addua(@Param("tuaId")int tuaId,@Param("userId")int userId,@Param("accId")String accId);
	public boolean deleteua(int id);
}
