package com.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface RoomsDao {
	//增加
	public int addrooms(@Param("roomId")int roomId,@Param("roomTypeId")int roomTypeId);
	//删除
	public int deleterooms(@Param("roomId")int roomId,@Param("roomTypeId")int roomTypeId);
	public int findrooms(@Param("roomId")int roomId,@Param("roomTypeId")int roomTypeId);
}
