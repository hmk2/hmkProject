package com.sys.web;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.net.ano.AuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sys.pro.Account;
import com.sys.pro.Authorization;
import com.sys.pro.Menu;
import com.sys.pro.Role;
import com.sys.service.AuServie;
import com.sys.service.MenuService;
import com.sys.service.RoleService;

@Controller
public class ListRoleManager {
	@Autowired
	private AuServie auServie;
	@Autowired
	private MenuService menuService;
	@Autowired
	private RoleService roleService;
	@RequestMapping(value="/listManager/queryRole",method=RequestMethod.GET)
	public String queryRole(Model model)
	{
		ArrayList<Role> rList=roleService.queryRole();
		model.addAttribute("roles", rList);
		return "roleManager";
	}
	@RequestMapping(value="/listManager/AddRole",method=RequestMethod.GET)
	public String addRole()
	{
		return "addRole";
	}
	@RequestMapping(value="/listManager/addsaveRole" ,method=RequestMethod.POST)
	public String addsaveRole(Role role )
	{
		roleService.addRole(role);
		return "redirect:/listManager/queryRole";
	}
	@RequestMapping(value="/listManager/{roleId}/deleteRole" ,method=RequestMethod.GET)
	public String deleteRole(@PathVariable("roleId")int roleId)
	{
		roleService.deleteRole(roleId);
		return "redirect:/listManager/queryRole";
	}
	@RequestMapping(value="/listManager/deletbatcheRole" ,method=RequestMethod.POST)
	public String deletebatchRole(int[] roleId)
	{
		roleService.deletebatchRole(roleId);
		return "redirect:/listManager/queryRole";
	}
	@RequestMapping(value="/listManager/{roleId}/editfinRole" ,method=RequestMethod.GET)
	public String editfindrole(@PathVariable("roleId") int roleId,Model model)
	{
		model.addAttribute("roles", roleService.findRoleByid(roleId));
		return "roleedit";
	}
	@RequestMapping(value="/listManager/addsaveRl" ,method=RequestMethod.POST)
	public String addsaveRl(Role role)
	{
		roleService.editRole(role);
		return "redirect:/listManager/queryRole";
	}
	@RequestMapping(value="/listManager/listGrantMenu",method=RequestMethod.GET)
	public String grantMenu(Model model,@RequestParam("roleName")String  roleName,@RequestParam("roleId")String  roleId,HttpSession session)
	{
		HashMap<Menu,ArrayList<Menu>> menusHashMap=new HashMap<Menu, ArrayList<Menu>>();
	
		menusHashMap=(HashMap<Menu, ArrayList<Menu>>) 
												session.getAttribute("user_menu");
		Account account=(Account) session.getAttribute("account");
		model.addAttribute("menu_map", menusHashMap);
		model.addAttribute("name", roleName);
		model.addAttribute("id", roleId);
		return "grantMenuToRole";
	}
	@RequestMapping(value="/listManager/grandSavemenu",method=RequestMethod.POST)
	public String grantsaveMenu(Model model,@RequestParam("grantmenu")int[]  grantmenu,@RequestParam("roleId")int  roleId,HttpSession session)
	{
		Account account=(Account) session.getAttribute("account");
		Role role=roleService.queryRoleByAccount(account.getAccount());
		if("系统管理员".equals(role.getRoleName()))
		{
			roleService.grandrolemenu(roleId, grantmenu);
			return "redirect:/listManager/queryRole";
		}
		else {
			return "noAuthorization";
		}	
	}
	@RequestMapping(value="/listManager/listGrantAu",method=RequestMethod.GET)
	public String grantAu(Model model,@RequestParam("roleName")String  roleName,@RequestParam("roleId")String  roleId,HttpSession session)
	{
	ArrayList<Authorization> authorizations=auServie.queryAllau();
		model.addAttribute("name", roleName);
		model.addAttribute("id", roleId);
		model.addAttribute("author_map", authorizations);
		return "grantAutohrToRole";
	}
	@RequestMapping(value="/listManager/grandSaveAu",method=RequestMethod.POST)
	public String grantsaveAu(Model model,@RequestParam("grantAu")int[]  grantAu,@RequestParam("roleId")int  roleId,HttpSession session)
	{
		Account account=(Account) session.getAttribute("account");
		Role role=roleService.queryRoleByAccount(account.getAccount());
		if("系统管理员".equals(role.getRoleName()))
		{
			roleService.grandroleAu(roleId, grantAu);
			return "redirect:/listManager/queryRole";
		}
		else {
			return "noAuthorization";
		}	
	}
}
