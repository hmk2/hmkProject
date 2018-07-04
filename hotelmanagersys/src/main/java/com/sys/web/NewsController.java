package com.sys.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sys.enity.Dept;
import com.sys.enity.News;
import com.sys.enity.Page;
import com.sys.enity.Room;
import com.sys.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping("queryNews")
	@ResponseBody
	public Map<String,Object> queryDept(Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		ArrayList<News> news=newsService.queryNewsPage(page);
		int count=newsService.queryAllNews();
		map.put("rows", news);
		map.put("total", count);
		return map;
	}
	@RequestMapping(value="/addsaveNews",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> saveroom(News news)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=newsService.addNews(news);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("deleteNews")
	@ResponseBody
	public Map<String,String> deletenews(int newsId)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=newsService.deleteNews(newsId);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping("editSaveNews")
	@ResponseBody
	public Map<String,String> editsaveDept(News news)
	{
		Map<String,String> map = new HashMap<String,String>();
		int flag=newsService.updateNews(news);
		if(flag==1)
		{
			map.put("status", "success");
		}
		else {
			map.put("status", "fail");
		}
		return map;
	}
	@RequestMapping(value="/serachNewsid",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Integer> serachnewsId()
	{
		return newsService.queryAllNewsId();
	}
	@RequestMapping(value="/serachNewsauthor",method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<String> serachnewsauthor()
	{
		return newsService.queryAllNewsAuthor();
	}
	@RequestMapping(value="/searchNews",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> searchnews(String id,String author,Page page)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		ArrayList<News> news=newsService.searchNews(id, author,page);
		int count=newsService.querysearchNewscount(id, author);
		map.put("rows", news);
		map.put("total", count);
		return map;
	}
}
