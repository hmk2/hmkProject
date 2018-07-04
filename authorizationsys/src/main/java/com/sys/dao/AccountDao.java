package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sys.pro.Account;

public interface AccountDao {

	public Account findAccountById(String accno);
	
	public ArrayList<Account> queryAccount(@Param("account")String account,@Param("roleName")String roleName);
	
	public boolean updateAccount(String accno);
	
	public boolean editAccount(Account account);
	
	public boolean addAccount(Account account);
	
	public boolean deletebatch(List<String> accno);
}
