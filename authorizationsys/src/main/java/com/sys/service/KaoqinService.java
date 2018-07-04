package com.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sys.pro.Kaoqin;

public interface KaoqinService {
	public ArrayList<Kaoqin> queryallKaoqin(String account);

	public Kaoqin findKaoqinByid(int kaoId);
	
	public boolean updateKaoqin(Kaoqin kaoqin);

	public boolean deleteKaoqinByid(int kaoId);

	public boolean addKaoqin(Kaoqin kaoqin);

	public boolean debatchKaoqinByid(int[]  kaoId);
}
