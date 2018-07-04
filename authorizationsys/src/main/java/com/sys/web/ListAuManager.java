package com.sys.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.pro.Account;
import com.sys.pro.Authorization;
import com.sys.pro.Kaoqin;
import com.sys.service.AuServie;

@Controller
public class ListAuManager {
	@Autowired
	private AuServie auServie;
	
	@RequestMapping(value="/listManager/queryAuthorization",method=RequestMethod.GET)
	public String queyau(Model model)
	{
		ArrayList<Authorization> authorizations=auServie.queryAllau();
		model.addAttribute("authors", authorizations);
		return "authorManager";
	}
	@RequestMapping(value="/listManager/AddAu",method=RequestMethod.GET)
	public String addAu()
	{
		return "addAu";
	}
	@RequestMapping(value="/listManager/addsaveAu" ,method=RequestMethod.POST)
	public String addsaveAu(Authorization authorization )
	{
		auServie.addAuth(authorization);
		return "redirect:/listManager/queryAuthorization";
	}
	@RequestMapping(value="/listManager/{auId}/deleteAu" ,method=RequestMethod.GET)
	public String deleteAccount(@PathVariable("auId")int auId)
	{
		auServie.deleteAuth(auId);
		return "redirect:/listManager/queryAuthorization";
	}
	@RequestMapping(value="/listManager/deletbatcheAu" ,method=RequestMethod.POST)
	public String deletebatchAu(int[] auId)
	{
		auServie.deleteBatchAuth(auId);
		return "redirect:/listManager/queryAuthorization";
	}
	@RequestMapping(value="/listManager/{auId}/editfindAu" ,method=RequestMethod.GET)
	public String editfindauth(@PathVariable("auId") int auId,Model model)
	{
		model.addAttribute("auth", auServie.findAuByid(auId));
		return "editAu";
	}
	@RequestMapping(value="/listManager/addsaveAuth" ,method=RequestMethod.POST)
	public String addsaveAuth(Authorization authorization)
	{
		auServie.editAuth(authorization);
		return "redirect:/listManager/queryAuthorization";
	}
}
