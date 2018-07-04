package com.sys.serviceImp;

import com.sys.dao.AccountDao;
import com.sys.pro.Account;
import com.sys.service.LoginServie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginServie{
	@Autowired
	private AccountDao accountDao;
	@Override
	public boolean checkAccount(String account, String password) {
		Account acc=accountDao.findAccountById(account);
		boolean flag=acc.getAccount().equals(account)&&acc.getPassword().equals(password);
		return flag;
		
	}

}
