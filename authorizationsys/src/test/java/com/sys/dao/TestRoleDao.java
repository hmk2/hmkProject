package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sys.pro.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestRoleDao {
	@Resource
	private RoleDao roleDao;
	@Test
	public void queryRoleByAccount()
	{
		System.out.print(roleDao.queryRoleByAccount("hmk"));
	}
	@Test
	public void addRole()
	{
		Role role=new Role();
		role.setRoleId(5);
		role.setRoleName("test3");
		role.setParentId(0);
		role.setStatus(0);
		roleDao.addRole(role);
	}
	@Test
	public void editRole()
	{
		Role role=new Role();
		role.setRoleId(5);
		role.setRoleName("test3");
		role.setParentId(0);
		role.setStatus(0);
		roleDao.editRole(role);
	}
	@Test
	public void findRoleByid()
	{
		System.out.print(roleDao.findRoleByid(5).getRoleName());
	}
	@Test
	public void queryRole()
	{
		
		System.out.print(roleDao.queryRole().get(0).getRoleName());
	}
	@Test
	public void deleteRole()
	{
		roleDao.deleteRole(5);
	}
	@Test
	public void deletebatchRole()
	{
		List<Integer> roles=new ArrayList<Integer>();
		roles.add(4);
		roles.add(7);
		roleDao.deletebatchRole(roles);
	}
	@Test
	public void addbatchRole()
	{
		List<Role> role=new ArrayList<Role>();
		Role role1=new Role();
		role1.setRoleId(6);
		role1.setRoleName("test4");
		role1.setParentId(0);
		role1.setStatus(0);
		Role role2=new Role();
		role2.setRoleId(7);
		role2.setRoleName("test5");
		role2.setParentId(0);
		role2.setStatus(0);
		role.add(role1);
		role.add(role2);
		roleDao.addbatchRole(role);
	}
}
