<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>企业信息管理系统</title>
<style type="text/css">
</style>
</head>
 <frameset rows="16%,*,2%" border="0" >
   <frame name="topFrame" src="<%=basePath %>jasp/top.jsp"></frame>
   <frameset cols="12%,6,*" border="0" id="middleFrame" >
     <frame name="leftFrame" src="<%=basePath %>jasp/left.jsp" scrolling="no"></frame>
	 <frame name="doorFrame" src="<%=basePath %>jasp/door.jsp"></frame>
	 <frame name="rightFrame" src="<%=basePath %>jasp/welcome.jsp"></frame>
   </frameset>
   <frame name="downFrame" src="<%=basePath %>jasp/down.jsp"></frame>
 </frameset>
</html>
