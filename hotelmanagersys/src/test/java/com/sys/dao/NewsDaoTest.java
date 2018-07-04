package com.sys.dao;



import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.enity.News;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class NewsDaoTest {

	@Autowired
	private NewsDao newsDao;
	@Test
	public void testQueryNewsPage() {
		System.out.println(newsDao.queryNewsPage(1, 10));
	}

	@Test
	public void testFindNewsById() {
		System.out.println(newsDao.findNewsById(2));
	}

	@Test
	public void testAddNews() {
		News news=new News();
		news.setNewsAuthor("test");
		news.setNewsContent("test");
		news.setNewsRemark("test");
		System.out.println(newsDao.addNews(news));

	}

	@Test
	public void testQueryAllNews() {
		System.out.println(newsDao.queryAllNews());
	}

	@Test
	public void testQueryAllNewsAuthor() {
		System.out.println(newsDao.queryAllNewsAuthor());
	}

	@Test
	public void testQueryAllNewsId() {
		System.out.println(newsDao.queryAllNewsId());
	}

	@Test
	public void testUpdateNews() {
		News news=new News();
		news.setNewsId(4);
		news.setNewsAuthor("test1");
		news.setNewsContent("test1");
		news.setNewsRemark("test1");
		news.setNewsStatus(1);
		news.setNewsTime("2016-9-10 06:12:12");
		System.out.println(newsDao.updateNews(news));
	}

	@Test
	public void testDeleteNews() {
		System.out.println(newsDao.deleteNews(4));
	}

	@Test
	public void testSearchNews() {
		News news=new News();
		String string=new String();
		news.setNewsId(1);
		news.setNewsAuthor(string);
		System.out.println(news.getNewsAuthor());
		System.out.println(newsDao.searchNews(news));
	}

}
