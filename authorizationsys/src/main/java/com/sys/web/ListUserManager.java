package com.sys.web;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.pro.Account;
import com.sys.pro.Menu;
import com.sys.pro.User;
import com.sys.service.UserService;

@Controller
public class ListUserManager {
	@Autowired
	private UserService userService;

	@RequestMapping(value="/listManager/queryUser" , method=RequestMethod.GET)
	public String queryUser(HttpSession session,Model model)
	{
		Account acc=(Account) session.getAttribute("account");
		ArrayList<User> users=userService.queryAlluer(acc.getAccount());
		model.addAttribute("users", users);
		return "userManager";
	}
	@RequestMapping(value="/listManager/addsaveUser" ,method=RequestMethod.POST)
	public String addsaveuser(User user )
	{
		userService.addUser(user);
		return "redirect:/listManager/queryUser";
	}
	@RequestMapping(value="/listManager/AddUser",method=RequestMethod.GET)
	public String adduser()
	{
		return "addUser";
	}
	@RequestMapping(value="/listManager/{userId}/deleteUser" ,method=RequestMethod.GET)
	public String deleteuser(@PathVariable("userId")int userId)
	{
		userService.deleteUser(userId);
		return "redirect:/listManager/queryUser";
	}
	@RequestMapping(value="/listManager/deletbatcheuser" ,method=RequestMethod.POST)
	public String deletebatchuser(int[] userId)
	{
		userService.deleteBatchUser(userId);
		return "redirect:/listManager/queryUser";
	}
	@RequestMapping(value="/listManager/{userId}/editfinduser" ,method=RequestMethod.GET)
	public String editfinduser(@PathVariable("userId") int userId,Model model)
	{
		User user=userService.finduserByid(userId);
		model.addAttribute("user", user);
		return "editUser";
	}
	
	@RequestMapping(value="/listManager/addUser" ,method=RequestMethod.POST)
	public String addUser(User user)
	{
		userService.editUser(user);
		return "redirect:/listManager/queryUser";
	}
}
