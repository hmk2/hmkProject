package com.sys.web;


import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.pro.Menu;
import com.sys.service.MenuService;

@Controller
public class ListMenuManager {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/listManager/queryMenu" ,method=RequestMethod.GET)
	public String querymenu(Model model)
	{
		ArrayList<Menu> menList = menuService.queryallMen();
		model.addAttribute("menus", menList);
		return "menuManager";
	}
	@RequestMapping(value="/listManager/{menuId}/editfindmen" ,method=RequestMethod.GET)
	public String editfindmen(@PathVariable("menuId") int menuId,Model model)
	{
		Menu menu=menuService.queryMenuByid(menuId);
		Menu parentMenu=new Menu();
		ArrayList<Menu> parentmenArrayList=new ArrayList<Menu>();
		if(menu.getParentId()==0)
		{
			parentmenArrayList=menuService.queryAllParentmen();
		}
		else {
			parentMenu=menuService.queryMenuByid(menu.getParentId());
			parentmenArrayList=menuService.queryParentmen(parentMenu.getMenuId());
		}
		model.addAttribute("parentMenus", parentmenArrayList);
		model.addAttribute("parentMenu1", parentMenu);
		model.addAttribute("menus", menu);
		return "menueditr";
	}
	@RequestMapping(value="/listManager/savemen" ,method=RequestMethod.POST)
	public String savemen(Menu menu )
	{
		menuService.editMenu(menu);
		return "redirect:/listManager/queryMenu";
	}
	@RequestMapping(value="/listManager/{menuId}/deletemen" ,method=RequestMethod.GET)
	public String deletemen(@PathVariable("menuId")int menuId)
	{
		menuService.deleteMenu(String.valueOf(menuId));
		return "redirect:/listManager/queryMenu";
	}
	@RequestMapping(value="/listManager/deletbatchemen" ,method=RequestMethod.POST)
	public String deletebatchmenu(int[] menuId)
	{
		menuService.deleteBatchMen(menuId);
		return "redirect:/listManager/queryMenu";
	}
	@RequestMapping(value="/listManager/Addmen",method=RequestMethod.GET)
	public String addmenu(Model model)
	{
		ArrayList<Menu> parentmenArrayList=menuService.queryAllParentmen();
		model.addAttribute("parentMenus", parentmenArrayList);
		return "addMenu";
	}
	@RequestMapping(value="/listManager/addsaveMenu" ,method=RequestMethod.POST)
	public String addsavemen(Menu menu )
	{
		menuService.addMen(menu);
		return "redirect:/listManager/queryMenu";
	}
}
