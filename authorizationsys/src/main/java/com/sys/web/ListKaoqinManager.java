package com.sys.web;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.dao.KaoqinDao;
import com.sys.pro.Account;
import com.sys.pro.Kaoqin;
import com.sys.pro.User;
import com.sys.service.KaoqinService;

@Controller
public class ListKaoqinManager {
	@Autowired
	private KaoqinService kaoqinService;
	
	@RequestMapping(value="/listManager/querykao",method=RequestMethod.GET)
	public String querykao(Model model ,HttpSession session)
	{
		Account account=(Account)session.getAttribute("account");
		ArrayList<Kaoqin> kaoqins=kaoqinService.queryallKaoqin(account.getAccount());
		model.addAttribute("kaoqin", kaoqins);
		return "kaoqinManager";
	}
	@RequestMapping(value="/listManager/Addkaoqin",method=RequestMethod.GET)
	public String addkaoqin()
	{
		return "addkaoqing";
	}
	@RequestMapping(value="/listManager/addsavekaoqin" ,method=RequestMethod.POST)
	public String addsavekaoqin(Kaoqin kaoqin )
	{
		kaoqinService.addKaoqin(kaoqin);
		return "redirect:/listManager/querykao";
	}
	@RequestMapping(value="/listManager/{kaoId}/deletekaoqin" ,method=RequestMethod.GET)
	public String deletekaoqin(@PathVariable("kaoId")int kaoId)
	{
		kaoqinService.deleteKaoqinByid(kaoId);
		return "redirect:/listManager/querykao";
	}
	@RequestMapping(value="/listManager/deletbatchekao" ,method=RequestMethod.POST)
	public String deletebatchkao(int[] kaoId)
	{
		kaoqinService.debatchKaoqinByid(kaoId);
		return "redirect:/listManager/querykao";
	}
	@RequestMapping(value="/listManager/{kaoId}/editfindkao" ,method=RequestMethod.GET)
	public String editfinduser(@PathVariable("kaoId") int kaoId,Model model)
	{
		Kaoqin kaoqin=kaoqinService.findKaoqinByid(kaoId);
		model.addAttribute("kao", kaoqin);
		return "editKao";
	}
	
	@RequestMapping(value="/listManager/addsavekao" ,method=RequestMethod.POST)
	public String addUser(Kaoqin kaoqin)
	{
		kaoqinService.updateKaoqin(kaoqin);
		return "redirect:/listManager/querykao";
	}
}
