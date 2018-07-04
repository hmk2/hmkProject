package com.sys.web;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sys.pro.Account;
import com.sys.pro.Menu;
import com.sys.service.LoginServie;
import com.sys.service.MenuService;

@Controller
@SessionAttributes({"user_menu","account","time"})
@RequestMapping(value="/list", method = RequestMethod.POST)
public class LoginControl {
	@Autowired
	private MenuService menuService;
	@Autowired
	private LoginServie loginServie;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
    public String list(Account account,  Model model ,RedirectAttributes mode) {

		boolean flag=loginServie.checkAccount(account.getAccount(), account.getPassword());
		if(flag)
		{
			HashMap<Menu,ArrayList<Menu>> userMenus=menuService.queryallMenByAccount(account.getAccount());
			Format format=new SimpleDateFormat("yyyy-MM-dd");
			String dateString=format.format(new Date());
			model.addAttribute("time", dateString);
			model.addAttribute("user_menu", userMenus);
			return "index";
		}
		else {
			mode.addFlashAttribute("msg", "账号和密码不正确!");
			return "redirect:/list/loginss";
		}
    }
	@RequestMapping(value="/loginss",method=RequestMethod.GET)
	public String loginlist(String msg)
	{
		return "logins";
	}
}