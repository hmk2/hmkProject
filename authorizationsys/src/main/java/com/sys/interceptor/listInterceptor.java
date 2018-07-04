package com.sys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sys.dao.AuthorizationDao;
import com.sys.pro.Account;

public class listInterceptor implements HandlerInterceptor {

	@Autowired
	private AuthorizationDao authorizationDao;
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String urlString=request.getRequestURI();
		if(urlString.indexOf("/list/login")>=0)
		{
			return true;
		}
		if(authorizationDao.findAuByUrl(urlString)==null)
		{
			return true;
		}
		Account account=(Account) request.getSession().getAttribute("account");
		int i=authorizationDao.checkAu(account.getAccount(), urlString);
		if(i>0)
		{
			return true;
		}
		request.getRequestDispatcher("/jasp/noAuthorization.jsp").forward(request, response);
		return false;
	}
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {


	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
