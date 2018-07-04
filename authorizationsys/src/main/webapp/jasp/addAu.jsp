<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>录入菜单信息</title>
    
     <script type="text/javascript">
    	function goHome(){
    		window.location="/authorizationsys/listManager/queryAuthorization";
    	}
    </script>
    
  </head>
  <body>
    <h1 style="text-align: center;margin-top:50px">|请添加您自定义的权限</span></br></h1>
    <p style="text-align: center;margin-top:20px">（Please add your menu that user-defined.）</p>
    <form style="margin-top:60px;margin-left:225px" action="/authorizationsys/listManager/addsaveAu" method="post" >
    	<table width="80%" align="center">
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>编号：</td>
    	   	 <td><input type="text" name="auId"/><span style="font-size:12px;color:#8e8e8e"></span></td>
    	   	 
    	   </tr>
    	   <tr>
    	   	 <td align="right">权限名称 ：</td>
    	   	 <td><input type="text" name="auName"/><span style="font-size:12px;color:#8e8e8e"></span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>权限URL：</td>
    	   	 <td><input type="text" name="auUrl"/><span style="font-size:12px;color:#8e8e8e"></span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="right"><span style="color:red">*</span>权限状态：</td>
    	   	 <td><input type="text" name="status"/><span style="font-size:12px;color:#8e8e8e"></span></td>
    	   </tr>
    	   <tr>
    	   	 <td align="center"></td>
    	   	 <td>
    	   	    <input type="submit" value="保存" />
    	   	    <input type="reset" value="重置" />
    	   	    <input type="button" value="返回" onclick="goHome();" /></a>
    	   	 </td>
    	</table>
    </form>
    <p style="margin-left:440px;color:#8e8e8e">*说明：标注为*号的选项都是必填的内容。   </p>
  </body>
</html>
