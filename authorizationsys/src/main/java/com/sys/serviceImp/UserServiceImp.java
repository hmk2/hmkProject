package com.sys.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.dao.RoleDao;
import com.sys.dao.UserDao;
import com.sys.pro.Role;
import com.sys.pro.User;
import com.sys.service.UserService;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	@Override
	public ArrayList<User> queryAlluer(String acc) {
		Role role=roleDao.queryRoleByAccount(acc);
		ArrayList<User> users=userDao.queryAlluer(acc,role.getRoleName());
		return users;
	}

	@Override
	public boolean editUser(User user) {
		return userDao.editUser(user);
	}

	@Override
	public User finduserByid(int id) {
		return userDao.finduserByid(id);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	@Override
	public boolean deleteBatchUser(int[] id) {
		List<Integer> sid=new ArrayList<Integer>();
		for(int i:id)
		{
			sid.add(i);
		}
		return userDao.deleteBatchUser(sid);
	}

	@Override
	public boolean addUser(User user) {
		
		return userDao.addUser(user);
	}

}
