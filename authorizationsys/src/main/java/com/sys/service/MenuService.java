package com.sys.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sys.pro.Menu;

public interface MenuService {
		public ArrayList<Menu> queryallMen();
		public Menu queryMenuByid(int id);
		public HashMap<Menu,ArrayList<Menu>> queryallMenByAccount(String acc);
		public boolean editMenu(Menu menu);
		public boolean deleteMenu(String sid);
		public boolean deleteBatchMen(int[] sid);
		public boolean addMen(Menu menu);
		public ArrayList<Menu> queryParentmen(int id);
		public ArrayList<Menu> queryAllParentmen();
}
