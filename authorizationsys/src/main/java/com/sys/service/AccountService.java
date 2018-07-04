package com.sys.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;



import com.sys.pro.Account;

public interface AccountService {
	public Account findAccountById(String accno);
	
	public ArrayList<Account> queryAccount(String account);
	
	public boolean deleteAccount(String accno);
	
	public boolean editAccount(Account account);
	
	public boolean addAccount(Account account);
	
	public boolean deletebatch(String[] accno);
}
