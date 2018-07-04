package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import com.sys.pro.Menu;

public interface MenuDao {	

	public ArrayList<Menu> queryallMen();

	public ArrayList<Menu> queryallMenByAccount(String acc);
	
	public ArrayList<Menu> queryParentmen(int id);
	public ArrayList<Menu> queryAllParentmen();

	public Menu queryMenuByid(int id);

	public boolean editMenu(Menu menu);

	public boolean deleteMenu(int id);

	public boolean deleteBatchMen(List<Integer> id);

	public boolean addMen(Menu menu);
	
}
