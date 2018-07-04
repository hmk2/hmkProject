package com.sys.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.Menu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class TestMenuService {
	@Autowired
	private MenuService menuService;
	@Test
	public void queryallMen()
	{
		System.out.println(menuService.queryallMen().size());
	}
	@Test
	public void queryallMenByAccount()
	{
		HashMap<Menu,ArrayList<Menu>> saHashMap=menuService.queryallMenByAccount("hmk");
		System.out.print(saHashMap.size());
	}
	@Test
	public void editMenu()
	{

	}
	@Test
	public void deleteMenu()
	{

	}
	@Test
	public void deleteBatchMen()
	{

	}
	@Test
	public void addMen()
	{
		Menu menu =new Menu();
		menu.setMenuId(9);
		menu.setMenuName("test2");
		menu.setMenTarget("#");
		menu.setMenuUrl("#");
		menu.setParentId(1);
		menu.setStatus(0);
		//menuService.addMen(menu);
	}
	@Test
	public void queryMenuByid()
	{
		System.out.println(menuService.queryMenuByid(1).getMenuName());
	}

}
