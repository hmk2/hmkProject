package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.MenuDao;
import com.sys.pro.Menu;
import com.sys.service.MenuService;
import com.sys.until.UntilMenu;
@Service
public class MenuServiceImp implements MenuService {

	@Autowired
	private MenuDao menuDao;
	@Override
	public ArrayList<Menu> queryallMen() {
		ArrayList<Menu>  menus=menuDao.queryallMen();
		return menus;
	}

	@Override
	public HashMap<Menu,ArrayList<Menu>> queryallMenByAccount(String acc) {
		ArrayList<Menu> menuList=menuDao.queryallMenByAccount(acc);
		HashMap<Menu,ArrayList<Menu>> 
		userMenus = UntilMenu.buildUserMenu(menuList);
		return userMenus;
	}

	@Override
	public boolean editMenu(Menu menu) {
		return menuDao.editMenu(menu);
	}

	@Override
	public boolean deleteMenu(String sid) {
		int id=Integer.valueOf(sid);
		return menuDao.deleteMenu(id);
	}

	@Override
	public boolean deleteBatchMen(int[] sid) {
		ArrayList<Integer> id=new ArrayList<Integer>();
		for(int i:sid)
		{
			id.add(i);
		}
		return menuDao.deleteBatchMen(id);
	}

	@Override
	public boolean addMen(Menu menu) {
		return menuDao.addMen(menu);
	}

	@Override
	public Menu queryMenuByid(int id) {
		return menuDao.queryMenuByid(id);
	}

	@Override
	public ArrayList<Menu> queryParentmen(int id) {
		return menuDao.queryParentmen(id);
	}

	@Override
	public ArrayList<Menu> queryAllParentmen() {
		return menuDao.queryAllParentmen();
	}

}
