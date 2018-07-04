package com.sys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sys.dao.AuthorizationDao;
import com.sys.pro.Account;

public class LoginInterceptor implements HandlerInterceptor {

	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String urlString=request.getRequestURI();
		System.out.println(urlString);
		if(urlString.indexOf("/list/login")>=0)
		{
			return true;
		}
		Account account=(Account) request.getSession().getAttribute("account");
		if(account!=null)
		{
			return true;
		}
		
		request.getRequestDispatcher("/jasp/logins.jsp").forward(request, response);
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
