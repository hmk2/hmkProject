<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>录入菜单信息</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript">
    	function goHome(){
    		window.location="/authorizationsys/listManager/queryMenu";
    	}
    	


    </script>
    
  </head>
  <body>
    <h1 style="text-align: center;margin-top:50px">|请修改您自定义的子菜单信息</span></br></h1>
    <p style="text-align: center;margin-top:20px">（Please updata your menu's information that user-defined.）</p>
    <form style="margin-top:60px;margin-left:225px" action="/authorizationsys/listManager/savemen" method="post">
    	<table width="80%" align="center">
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>编号：</td>
    	   	 <td><input type="text" name="menuId" value="${menus.menuId }"  readonly="readonly"/><span style="font-size:12px;color:#8e8e8e">//请输入新的菜单编号.</span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right">名称：</td>
    	   	 <td><input type="text" name="menuName" value="${menus.menuName }" /><span style="font-size:12px;color:#8e8e8e">//请输入新的菜单名称.</span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>处理：</td>
    	   	 <td><input type="text" name="menuUrl" value="${menus.menuUrl }"/><span style="font-size:12px;color:#8e8e8e">//请输入您的新处理Servlet.</span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>目标窗口：</td>
    	   	 <td><input type="text" name="menTarget" value="${menus.menTarget }"/><span style="font-size:12px;color:#8e8e8e">//请输入新的目标显示窗口，如：leftFrame/rightFrame/topFrame/bottomFrame.</span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>状态：</td>
    	   	 <td><input type="text" name="status" value="${menus.status }"/><span style="font-size:12px;color:#8e8e8e">//请输入新的目标显示窗口，如：leftFrame/rightFrame/topFrame/bottomFrame.</span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>父菜单：</td>
    	   	 <td>
    	   	 	<select name="parentId">
    	   	 		<option value="${parentMenu1.menuId}">${parentMenu1.menuName}</option>
    	   	 		<c:forEach items="${parentMenus}" var="pmenu">
    	   	 			<option value="${pmenu.menuId}">${pmenu.menuName }</option>
    	   	 		</c:forEach>
    	   	 	</select>
    	   	 	<span style="font-size:12px;color:#8e8e8e">//请选择新的父菜单.</span>
    	   	 </td>
    	   </tr>
    	   <tr>
    	   	 <td align="center"></td>
    	   	 <td>
    	   	    <input type="submit" value="保存"/>
    	   	    <input type="reset" value="重置"/>
    	   	     <input type="button" value="返回" onclick="goHome();" /></a>
    	   	 </td>
    	</table>   
    </form>
     <p style="margin-left:440px;color:#8e8e8e">*说明：标注为*号的选项都是必填的内容。   </p>
  </body>
</html>
