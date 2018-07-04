package com.sys.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sys.pro.Kaoqin;

public interface KaoqinDao {

		public ArrayList<Kaoqin> queryallKaoqin(@Param("account")String account,@Param("roleName")String roleName);

		public Kaoqin findKaoqinByid(int kaoId);
		
		public boolean updateKaoqin(Kaoqin kaoqin);

		public boolean deleteKaoqinByid(int kaoId);

		public boolean addKaoqin(Kaoqin kaoqin);
		
		public boolean debatchKaoqinByid(List<Integer>  kaoId);
		
		
}
