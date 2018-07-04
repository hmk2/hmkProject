package com.sys.serviceImp;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.NewsDao;
import com.sys.enity.Dept;
import com.sys.enity.News;
import com.sys.enity.Page;
import com.sys.util.FormatTime;

@Service
public class NewsServiceImp implements com.sys.service.NewsService {

	@Autowired
	private NewsDao newsDao;
	@Override
	public ArrayList<News> queryNewsPage(Page page) {
		int i=(page.getPage()-1)*page.getRows();
		ArrayList<News> news=newsDao.queryNewsPage(i, page.getRows());
		for(News iNews:news)
		{
			String string=iNews.getNewsTime();
			String[] string1=string.split("[.]");
			iNews.setNewsTime(string1[0]);
		}
		return news;
	}

	@Override
	public ArrayList<News> findNewsById(int id) {
		return newsDao.findNewsById(id);
	}

	@Override
	public int addNews(News news) {
		return newsDao.addNews(news);
	}

	@Override
	public int queryAllNews() {
		return newsDao.queryAllNews();
	}

	@Override
	public ArrayList<String> queryAllNewsAuthor() {
		return newsDao.queryAllNewsAuthor();
	}

	@Override
	public ArrayList<Integer> queryAllNewsId() {
		return newsDao.queryAllNewsId();
	}

	@Override
	public int updateNews(News news) {
		return newsDao.updateNews(news);
	}

	@Override
	public int deleteNews(int id) {
		return newsDao.deleteNews(id);
	}

	@Override
	public ArrayList<News> searchNews(String id, String name,Page page) {
		News news=new News();
		Map<String, Object> map=new HashMap<String, Object>();
		if(id!=null&&!"".equals(id))
		{
			news.setNewsId(Integer.valueOf(id));
		}
		else {
			news.setNewsId(0);			
		}
		page.setPage((page.getPage()-1)*page.getRows());
		news.setNewsAuthor(name);
		map.put("news", news);
		map.put("page", page);
		return newsDao.searchNews(map);
	}

	@Override
	public int querysearchNewscount(String id,String name) {
		News news=new News();
		if(id!=null&&!"".equals(id))
		{
			news.setNewsId(Integer.valueOf(id));
		}
		else {
			news.setNewsId(0);			
		}
		news.setNewsAuthor(name);		
		return newsDao.querysearchNewscount(news);
	}
}
