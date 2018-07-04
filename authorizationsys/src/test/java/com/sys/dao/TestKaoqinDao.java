package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.Kaoqin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestKaoqinDao {
	@Resource
	private KaoqinDao kaoqinDao;
	@Test
	public void  queryallKaoqin()
	{
		ArrayList<Kaoqin> kArrayList=kaoqinDao.queryallKaoqin("hmk","ÆÕÍ¨ÓÃ»§");
		System.out.print(kArrayList.size());
		for(Kaoqin k:kArrayList)
		{
			System.out.println(k.getKaoName());
		}
	}
	@Test
	public void findKaoqinByid()
	{
		int id=1;
		Kaoqin kaoqin=kaoqinDao.findKaoqinByid(id);
		System.out.print(kaoqin.getKaoSex());
	}
	@Test
	public void  updateKaoqin()
	{
		Kaoqin kaoqin=new Kaoqin();
		kaoqin.setKaoId(2);
		kaoqin.setKaoName("hmk");
		kaoqin.setKaoNumber(1);
		kaoqin.setKaoSex("ÄÐ");
		kaoqin.setStatus(0);
		kaoqinDao.updateKaoqin(kaoqin);
	}
	@Test
	public void deleteKaoqinByid()
	{
		int id=2;
		kaoqinDao.deleteKaoqinByid(id);
	}
	@Test
	public void addKaoqin()
	{
		Kaoqin kaoqin=new Kaoqin();
		kaoqin.setKaoId(3);
		kaoqin.setKaoName("hmk");
		kaoqin.setKaoNumber(1);
		kaoqin.setKaoSex("ÄÐ");
		kaoqin.setStatus(0);
		kaoqinDao.addKaoqin(kaoqin);
	}
	@Test
	public void debatchKaoqinByid()
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		kaoqinDao.debatchKaoqinByid(list);
	}
}
