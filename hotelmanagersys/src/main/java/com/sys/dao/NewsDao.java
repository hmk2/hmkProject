package com.sys.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sys.enity.Dept;
import com.sys.enity.News;

public interface NewsDao {

	//通过当前页数和总数进行分页查询
	public ArrayList<News> queryNewsPage(@Param("page")int page,@Param("rows")int rows);
	//通过新闻ID查询出新闻
	public ArrayList<News> findNewsById(int id);
	//添加新闻
	public int addNews(News news);
	//查询出新闻的总数
	public int queryAllNews();
	
	//查询出所有新闻的发布人
	public ArrayList<String> queryAllNewsAuthor();
	//查询出所有部门的ID
	public ArrayList<Integer> queryAllNewsId();
	//对新闻进行更新
	public int updateNews(News news);
	//通过新闻ID删除新闻
	public int  deleteNews(int id);
	public int querysearchNewscount(News news);
	//通过新闻对象来查询出新闻
	public ArrayList<News> searchNews(Map<String, Object> map);
}
