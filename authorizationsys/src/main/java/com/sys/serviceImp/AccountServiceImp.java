package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.AccountDao;
import com.sys.dao.RoleDao;
import com.sys.pro.Account;
import com.sys.pro.Role;
import com.sys.service.AccountService;
@Service
public class AccountServiceImp implements AccountService {
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AccountDao accountDao;
	@Override
	public Account findAccountById(String accno) {
		Account account=accountDao.findAccountById(accno);
		return account;
	}

	@Override
	public ArrayList<Account> queryAccount(String account) {
		Role role=roleDao.queryRoleByAccount(account);
		ArrayList<Account> arrayList=accountDao.queryAccount(account, role.getRoleName());
		return arrayList;
	}

	@Override
	public boolean deleteAccount(String accno) {
		return accountDao.updateAccount(accno);
	}

	@Override
	public boolean editAccount(Account account) {
		return accountDao.editAccount(account);
	}

	@Override
	public boolean addAccount(Account account) {
		
		return accountDao.addAccount(account);
	}

	@Override
	public boolean deletebatch(String[] accno) {
		List<String> strings=new ArrayList<String>();
		for(String s:accno)
		{
			strings.add(s);
		}
		return accountDao.deletebatch(strings);
	}

}
