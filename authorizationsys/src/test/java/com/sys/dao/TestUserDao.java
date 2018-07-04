package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestUserDao {
	@Resource
	private UserDao userDao;
	@Test
	public void queryAlluer()
	{
		ArrayList<User> user=userDao.queryAlluer("hmk", "��ͨ�û�");
		System.out.print(user.size());
	}
	@Test
	public void editUser()
	{
		User user=new User();
		user.setUserId(1);
		user.setUserAge(20);
		user.setUserEmail("1774331087@qq.com");
		user.setUserMobile("13203043767");
		user.setUserName("������");
		user.setUserSex("��");
		userDao.editUser(user);
	}
	@Test
	public void finduserByid()
	{
		User user=userDao.finduserByid(3);
		System.out.print(user.getUserName());
	}
	@Test
	public void deleteUser()
	{
		
		userDao.deleteUser(5);
	}
	@Test
	public void deleteBatchUser()
	{
		List<Integer> idList=new ArrayList<Integer>();
		idList.add(5);
		idList.add(6);
		userDao.deleteBatchUser(idList);
	}
	
	@Test
	public void addUser()
	{
		User user=new User();
		user.setUserId(5);
		user.setUserAge(20);
		user.setUserEmail("1774331087@qq.com");
		user.setUserMobile("13203043767");
		user.setUserName("test1");
		user.setUserSex("nan");
		userDao.addUser(user);
	}
}
