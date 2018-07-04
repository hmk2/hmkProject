package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestAccountDao {
	@Resource
	private AccountDao accountDao;
	
	@Test
	public void findAccountById()
	{
		String string="hmk";
		Account acc=accountDao.findAccountById(string);
		System.out.print(acc.getAccount());
		System.out.print(acc.getPassword());
	}
	@Test
	public void queryAccount()
	{
		ArrayList<Account> aList=accountDao.queryAccount("hmk","��ͨ�û�");
		System.out.print(aList.size());
		for(Account a:aList)
		{
			System.out.println("�˻���"+a.getAccount());
			System.out.println("���룺"+a.getPassword());
		}
	}
	@Test
	public void updateAccount()
	{
		String string="tangfang";
		accountDao.updateAccount(string);
	}
	
	@Test
	public void editAccount()
	{
		String s1="test1";
		String s2="test1";
		//accountDao.editAccount(s2, s1);
	}
	@Test
	public void addAccount()
	{
		Account account=new Account();
		account.setAccount("hmk");
		account.setPassword("hmk");
		account.setStatus(0);
		accountDao.addAccount(account);
	}
	@Test
	public void deletebatch()
	{
		List<String> list=new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		accountDao.deletebatch(list);
	}
}