package com.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sys.pro.User;

public interface UserService {
	public ArrayList<User> queryAlluer(String acc);
	
	public boolean editUser(User user);
	
	public User finduserByid(int id);
	
	public boolean deleteUser(int id);
	
	public boolean deleteBatchUser(int[] id);
	
	public boolean addUser(User user);
}
