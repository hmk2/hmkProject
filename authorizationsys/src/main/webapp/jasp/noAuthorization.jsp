<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>权限提示页面</title>
  </head>
  <body>    
    <img  style="margin-left:30%;margin-top:50px" alt="警告" src="<%=basePath %>images/vote.png">
  </body>
</html>
