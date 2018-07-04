package com.sys.dao;

import org.apache.ibatis.annotations.Param;


public interface AccountKaoqinDao {
	public boolean addak(@Param("akId")int akId,@Param("acId")int acId,@Param("KaoId")int KaoId);
	public boolean deleteak(int id);
}
