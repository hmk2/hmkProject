package com.sys.serviceImp;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.News;
import com.sys.enity.Page;
import com.sys.service.NewsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class NewsServiceImpTest {
	
	@Autowired
	private NewsService newsService;

	@Test
	public void testQueryNewsPage() {
		Page page=new Page();
		page.setPage(1);
		page.setRows(10);
		ArrayList<News> news=newsService.queryNewsPage(page);
		System.out.println(news);
		for(News iNews:news)
		{
			String string=iNews.getNewsTime();
			String[] string1=string.split("[.]");
			System.out.println(string);
			System.out.println(string1[0]);
			iNews.setNewsTime(string1[0]);
			System.out.println(iNews.getNewsTime());
		}
	}

	@Test
	public void testFindNewsById() {
		System.out.println(newsService.findNewsById(1));
	}

	@Test
	public void testAddNews() {
		News news=new News();
		news.setNewsAuthor("test2");
		news.setNewsContent("test2");
		news.setNewsRemark("test2");
		System.out.println(newsService.addNews(news));
	}

	@Test
	public void testQueryAllNews() {
		System.out.println(newsService.queryAllNews());
	}

	@Test
	public void testQueryAllNewsAuthor() {
		System.out.println(newsService.queryAllNewsAuthor());
	}

	@Test
	public void testQueryAllNewsId() {
		System.out.println(newsService.queryAllNewsId());
	}

	@Test
	public void testUpdateNews() {
		News news=new News();
		news.setNewsId(5);
		news.setNewsAuthor("test3");
		news.setNewsContent("test3");
		news.setNewsRemark("test3");
		news.setNewsStatus(1);
		/*news.setNewsTime(new Date());*/
		System.out.println(newsService.updateNews(news));
	}

	@Test
	public void testDeleteNews() {
		System.out.println(newsService.deleteNews(5));
	}

	@Test
	public void testSearchNews() {
		System.out.println(newsService.searchNews(1, "null"));
	}

}
