<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>录入角色信息</title>


 <script type="text/javascript">
    	function goHome(){
    		window.location="/authorizationsys/listManager/queryaccount";
    	}
    </script>
    
  </head>
  <body>
    <h1 style="text-align: center;margin-top:50px">|请修改您自定义的用户信息</span></br></h1>
    <p style="text-align: center;margin-top:20px">（Please updata your authorization's information that user-defined.）</p>
    <form style="margin-top:60px;margin-left:225px" action="/authorizationsys/listManager/addsaveAc" method="post">
      <table width="80%" align="center">
         <tr>
           <td align="right"><span style="color:red">*</span>账户：</td>
           <td><input type="text" name="account" value="${ac.account }"  readonly="readonly"/><span style="font-size:12px;color:#8e8e8e">//请输入账户.</span></td>
         </tr>
         <tr>
           <td align="right">密码：</td>
           <td><input type="text" name="password" value="${ac.password }" /><span style="font-size:12px;color:#8e8e8e">//请输入密码.</span></td>
         </tr>
         <tr>
           <td align="right">状态：</td>
           <td><input type="text" name="status" value="${ac.status }" /><span style="font-size:12px;color:#8e8e8e">//请输入状态.</span></td>
         </tr>
           <td align="center"></td>
           <td>
              <input type="submit" value="保存"/>
              <input type="reset" value="重置"/>
              <input type="button" value="返回"  onclick="goHome();"/></a>
           </td>
      </table>   
    </form>
     <p style="margin-left:440px;color:#8e8e8e">*说明：标注为*号的选项都是必填的内容。   </p>
  </body>
</html>
