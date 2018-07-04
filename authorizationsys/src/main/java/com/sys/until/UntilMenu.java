package com.sys.until;

import java.util.ArrayList;
import java.util.HashMap;

import com.sys.pro.Menu;

public class UntilMenu {
	public static HashMap<Menu,ArrayList<Menu>> 
		buildUserMenu(ArrayList<Menu> menu){
			HashMap<Menu,ArrayList<Menu>> 
				userMenus = 
						new HashMap<Menu,ArrayList<Menu>>();
			for(int i=0;i<menu.size();i++){
					Menu menu2=menu.get(i);
						if(menu2.getParentId()==0){
							//temp对象当前菜单是父菜单
							ArrayList<Menu> childMenu = new ArrayList<Menu>();
							for(int j=0;j<menu.size();j++){
								Menu me = menu.get(j);
								if(me.getParentId()==menu2.getMenuId()){
									childMenu.add(me);
								}
							}
							userMenus.put(menu2, childMenu);
						}
					}		
				return userMenus;
		}
}
