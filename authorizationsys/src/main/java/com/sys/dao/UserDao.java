package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sys.pro.User;

public interface UserDao {
	public ArrayList<User> queryAlluer(@Param("acc")String acc ,@Param("roleName")String roleName);
	
	public boolean editUser(User user);
	
	public User finduserByid(int id);
	
	public boolean deleteUser(int id);
	
	public boolean deleteBatchUser(List<Integer> id);
	
	public boolean addUser(User user);
}
