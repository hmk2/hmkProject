package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.Menu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestMenuDao {
	@Resource
	private MenuDao menuDao;
	@Test
	public void queryallMen()
	{
		System.out.println(menuDao.queryallMen().get(0).getMenTarget());
	
	}
	@Test
	public void queryallMenByAccount()
	{
		System.out.println(menuDao.queryallMenByAccount("hmk").size());
	}
	@Test
	public void queryMenuByid()
	{
		System.out.println(menuDao.queryMenuByid(2).getMenuName());
	}
	@Test
	public void editMenu()
	{
		Menu menu =new Menu();
		menu.setMenuId(9);
		menu.setMenuName("??¨??·????????????");
		menu.setMenTarget("rightFrame");
		menu.setMenuUrl("/listManager/queryUser");
		menu.setParentId(6);
		menu.setStatus(0);
		menuDao.editMenu(menu);
	}
	@Test
	public void deleteMenu()
	{
		menuDao.deleteMenu(9);
	}
	@Test
	public void deleteBatchMen()
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(9);
		list.add(10);
		menuDao.deleteBatchMen(list);
	}
	@Test
	public void addMen()
	{
		Menu menu =new Menu();
		menu.setMenuId(10);
		menu.setMenuName("test2");
		menu.setMenTarget("#");
		menu.setMenuUrl("#");
		menu.setParentId(1);
		menu.setStatus(0);
		menuDao.addMen(menu);
	}
}
