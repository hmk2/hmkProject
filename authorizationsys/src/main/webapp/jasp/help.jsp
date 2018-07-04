<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>授予角色菜单</title>
  </head>
  <body>
  <h1 style="text-align: center;margin-top:50px"><span style="color:green">|</span>关于帮助：授予角色菜单权限</span></br></h1>
  <p style="text-align: center;margin-top:20px">（Please get the help from the information that is greatful.）</p>
  <img style="margin-left:30%" alt="help" src="<%=basePath %>images/1447229776892.jpg">
  <p style="text-align:center"><span style="color:red">*</span>说明：1.请确认您已勾选需要授权的，不要重复勾选已拥有的菜单；确认授权后，请点击保存按钮.</p></br>
  </body>
</html>
