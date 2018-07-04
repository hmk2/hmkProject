<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {
	font-size: 12px;
	color: #FFFFFF;
}
.STYLE2 {font-size: 9px}
.STYLE3 {
	color: #033d61;
	font-size: 12px;
}
.navPoint{cursor:pointer;}
-->
</style></head>
<script>
  var flag=undefined;
  function switchSysBar(){
	  if(flag==undefined){
		 parent.middleFrame.cols="0,6,*";
		 document.img1.src="images/main_55_1.gif";
		 flag="hide";
	  }else{
		 parent.middleFrame.cols="12%,6,*";
		 document.img1.src="images/main_55.gif";
		 flag=undefined;
	  }			
  }
</script>
<body>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout:fixed;">

<tr>
  <td width="6"  style="width:6px;"valign="middle" bgcolor="1873aa" onclick=switchSysBar();><SPAN class=navPoint 
id=switchPoint title="关闭/打开左栏"><img src="../images/main_55.gif" name="img1" width=6 height=40 id=img1></SPAN></td>
</tr>
</table>
</body>
</html>
