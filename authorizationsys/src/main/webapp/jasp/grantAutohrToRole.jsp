<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>授予角色菜单</title>
  <script type="text/javascript">
     function gohome(){
     
        window.location="/authorizationsys/listManager/queryRole";
     }
     function help(){
        window.location="/authorizationsys/jasp/help.jsp";
     }
  </script>
  </head>
  <body>
  <h1 style="text-align: center;margin-top:50px"><span style="color:red">|</span>请为${requestScope.role_name }授予角色权限</span></br></h1>
  <p style="text-align: center;margin-top:20px">（Please grant your menu that user-defined the authority.）</p>
    <table style="margin-top:60px;margin-left:490px">
    	<tr>
    		<td>角色编号：</td>
    		<td style="color:red">${id}</td>
    	</tr>
    	<tr>
    		<td>角色名称：</td>
    		<td style="color:green">${name}</td>
    	</tr>
    </table>
    <form style="margin-top:60px;margin-left:490px" action="/authorizationsys/listManager/grandSaveAu" method="post">
     <input type="hidden" name="roleId" value="${id}"/>
     <c:forEach items="${author_map}" var="Au">
    <div>
	    <span>
	        <input type="checkbox" name="grantAu" value="${Au.auId }"/>
	    	${Au.auName }
	    </span>
	    
    </div>
    </c:forEach>
    <input type="submit" value="保存"/>
    <input type="button" value="返回" onclick="gohome();"/>
    <input type="button" value="帮助" onclick="help();"/>
    </form>
  </body>
</html>
