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
import com.sys.pro.Authorization;
import com.sys.pro.Kaoqin;
import com.sys.service.AccountService;

@Controller

public class ListAccountManager {
	@Autowired
	private AccountService accountService;
	@RequestMapping(value="/listManager/queryaccount",method=RequestMethod.GET)
	public String queryaccout(HttpSession session,Model model)
	{
		Account account=(Account)session.getAttribute("account");
		ArrayList<Account> accounts=accountService.queryAccount(account.getAccount());
		model.addAttribute("account", accounts);
		return "accountManager";
	}
	@RequestMapping(value="/listManager/AddAccount",method=RequestMethod.GET)
	public String addaccount()
	{
		return "addAccount";
	}
	@RequestMapping(value="/listManager/addsaveAccount" ,method=RequestMethod.POST)
	public String addsaveAccount(Account account )
	{
		accountService.addAccount(account);
		return "redirect:/listManager/queryaccount";
	}
	@RequestMapping(value="/listManager/{account}/deleteAccount" ,method=RequestMethod.GET)
	public String deleteAccount(@PathVariable("account")String account)
	{
		accountService.deleteAccount(account);
		return "redirect:/listManager/queryaccount";
	}
	@RequestMapping(value="/listManager/deletbatcheAc" ,method=RequestMethod.POST)
	public String deletebatchac(String[] account)
	{
		accountService.deletebatch(account);
		return "redirect:/listManager/queryaccount";
	}
	@RequestMapping(value="/listManager/{account}/editfindAccount" ,method=RequestMethod.GET)
	public String editfinduser(@PathVariable("account") String account,Model model)
	{
		model.addAttribute("ac", accountService.findAccountById(account));
		return "editAccount";
	}
	@RequestMapping(value="/listManager/addsaveAc" ,method=RequestMethod.POST)
	public String addsaveAc(Account account)
	{
		accountService.editAccount(account);
		return "redirect:/listManager/queryaccount";
	}
}
