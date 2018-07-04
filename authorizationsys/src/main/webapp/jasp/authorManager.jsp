<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
.STYLE1 {font-size: 12px}
.STYLE3 {font-size: 12px; font-weight: bold; }
.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
-->
</style>

<script>
var  highlightcolor='#c1ebff';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function fun_delAu(auId,auName){
  	if(confirm("你确定要删除"+auName+"这个权限吗")){
    	    //发送请求
    	     window.location="/authorizationsys/listManager/"+auId+"/deleteAu";
    	  }
}
function fun_editAu(auId)
{
    window.location="/authorizationsys/listManager/"+auId+"/editfindkao";
}
function detelebatchAu()
{
	if(confirm("你确定要删除"))
	{
    	    //发送请求   
    	    document.myform.action="/authorizationsys/listManager/deletbatcheAu";  
            document.myform.submit();  
    }
}
function fun_addAu(){
  window.location="/authorizationsys/listManager/AddAu";
}

//授予角色菜单事件
function grantMenuToRole(){
  //alert('授予角色菜单事件');
  //获取选中的角色(暂不考虑批量处理)
  var roleCheckArray = 
  		document.getElementsByName('rolenoes');
  var choiceRoleId;//选中的角色编号
  var roleName;//选中的角色名称
  for(var i=0;i<roleCheckArray.length;i++){
  	  if(roleCheckArray[i].checked==true){
  	  	  choiceRoleId=roleCheckArray[i].value;
  	  	  roleName = roleCheckArray[i].id;
  	  	  break;
  	  }
  }
  //alert(choiceRoleId);
  var url="${pageContext.request.contextPath}/grantMenuToRole?roleId="+choiceRoleId+"&name="+roleName;
  url=encodeURI(encodeURI(url));
  window.location=url;
}
</script>

</head>

<body style="margin-right:10px;padding:10px;">
<form action="" name="myform" id="mainForm" method="post">
<div style="top:50px;position:relative;width:100%;">
<table width="98%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" background="../tabimages/tab_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="30"><img src="../tabimages/tab_03.gif" width="12" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="5%"><div align="center"><img src="../tabimages/tb.gif" width="16" height="16" /></div></td>
                <td width="95%" class="STYLE1"><span class="STYLE3">你当前的位置</span>：[系统管理]-[权限管理]</td>
              </tr>
            </table></td>
            <td width="54%"><table border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                <td width="60"><table width="87%" border="0" cellpadding="0" cellspacing="0">
                  <tr style="cursor:pointer;">
                    <td class="STYLE1"><div align="center">
                      <input type="checkbox" name="checkbox62" value="checkbox" />
                    </div></td>
                    <td class="STYLE1"><div align="center">全选</div></td>
                  </tr>
                </table></td>
                <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr  style="cursor:pointer;">
                    <td class="STYLE1"><div align="center" onclick="fun_addAu();"><img src="../tabimages/22.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center" onclick="fun_addAu();">新增</div></td>
                  </tr>
                </table></td>
                <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr style="cursor:pointer;"> 
                    <td class="STYLE1"><div align="center"><img src="../tabimages/33.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center">修改</div></td>
                  </tr>
                </table></td>
                <td width="52"><table width="88%" border="0" cellpadding="0" cellspacing="0">
                  <tr style="cursor:pointer;">
                    <td class="STYLE1"><div align="center" onclick="detelebatchAu()"><img src="../tabimages/11.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center" onclick="detelebatchAu()">删除</div></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="16"><img src="../tabimages/tab_07.gif" width="16" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="8" background="../tabimages/tab_12.gif">&nbsp;</td>
        <td><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
          <tr>
            <td width="3%" height="22" background="../tabimages/bg.gif" bgcolor="#FFFFFF"><div align="center">
              <input type="checkbox" name="checkbox" value="checkbox" />
            </div></td>
            <td width="3%" height="22" background="../tabimages/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">序号</span></div></td>
            <td width="12%" height="22" background="../tabimages/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">权限名称</span></div></td>
            <td width="12%" height="22" background="../tabimages/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">权限URL</span></div></td>
            <td width="14%" height="22" background="../tabimages/bg.gif" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">角色状态</span></div></td>
            <td width="15%" height="22" background="../tabimages/bg.gif" bgcolor="#FFFFFF" class="STYLE1"><div align="center">基本操作</div></td>
          </tr>
          <!-- 显示菜单 start -->
          <c:forEach items="${authors }" var="auth"
          	varStatus="row">
          <tr>
            <td height="20" bgcolor="#FFFFFF"><div align="center">
              <input type="checkbox" name="auId" value="${auth.auId }" id="${auth.auName }"/>
            </div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
              <div align="center">${row.index+1 }</div>
            </div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${auth.auName }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${auth.auUrl }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE1">${auth.status==0?'正常':'已删除' }</span></div></td>
            <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE4"><a  style="cursor:pointer;"  onclick="fun_editAu(${auth.auId});"><img src="../tabimages/edt.gif" width="16" height="16" />编辑</a>&nbsp; &nbsp;<a  style="cursor:pointer;"  onclick="fun_delAu(${auth.auId},'${auth.auName }');"><img src="../tabimages/del.gif" width="16" height="16"  />删除</a></span></div></td>
          </tr>
          </c:forEach>
          <!-- 显示菜单 end -->
        </table></td>
        <td width="8" background="../tabimages/tab_15.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="35" background="../tabimages/tab_19.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="35"><img src="../tabimages/tab_18.gif" width="12" height="35" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="STYLE4">&nbsp;&nbsp;共有 120 条记录，当前第 1/10 页</td>
            <td><table border="0" align="right" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="40"><img src="../tabimages/first.gif" width="37" height="15" /></td>
                  <td width="45"><img src="../tabimages/back.gif" width="43" height="15" /></td>
                  <td width="45"><img src="../tabimages/next.gif" width="43" height="15" /></td>
                  <td width="40"><img src="../tabimages/last.gif" width="37" height="15" /></td>
                  <td width="100"><div align="center"><span class="STYLE1">转到第
                    <input name="textfield" type="text" size="4" style="height:12px; width:20px; border:1px solid #999999;" /> 
                    页 </span></div></td>
                  <td width="40"><img src="../tabimages/go.gif" width="37" height="15" /></td>
                </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="16"><img src="../tabimages/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</div>
</form>
</body>
</html>
