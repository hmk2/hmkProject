package com.sys.service;

import java.util.ArrayList;
import java.util.List;

import com.sys.pro.Authorization;

public interface AuServie {

		public boolean addAuth(Authorization auth);

		public boolean editAuth(Authorization auth);

		public boolean deleteAuth(int id);

		public boolean deleteBatchAuth(int[] id);

		public ArrayList<Authorization> queryAllau();
		public Authorization findAuByid(int id);
}
