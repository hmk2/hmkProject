<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>录入角色信息</title>


 <script type="text/javascript">
    	function goHome(){
    		window.location="/authorizationsys/listManager/querykao";
    	}
    </script>
    
  </head>
  <body>
    <h1 style="text-align: center;margin-top:50px">|请修改您自定义的用户信息</span></br></h1>
    <p style="text-align: center;margin-top:20px">（Please updata your user's information that user-defined.）</p>
    <form style="margin-top:60px;margin-left:225px" action="/authorizationsys/listManager/addsavekao" method="post">
      <table width="80%" align="center">
         <tr>
           <td align="right"><span style="color:red">*</span>编号：</td>
           <td><input type="text" name="kaoId" value="${kao.kaoId }"  readonly="readonly"/><span style="font-size:12px;color:#8e8e8e">//请输入编号.</span></td>
         </tr>
         <tr>
           <td align="right">姓名：</td>
           <td><input type="text" name="kaoName" value="${kao.kaoName }" /><span style="font-size:12px;color:#8e8e8e">//请输入姓名.</span></td>
         </tr>
         <tr>
           <td align="right">性别：</td>
           <td><input type="text" name="kaoSex" value="${kao.kaoSex }" /><span style="font-size:12px;color:#8e8e8e">//请输入性别.</span></td>
         </tr>
         <tr>
           <td align="right">状态：</td>
           <td><input type="text" name="status" value="${kao.status }" /><span style="font-size:12px;color:#8e8e8e">//请输入状态.</span></td>
         </tr>
         <tr>
           <td align="right">缺勤次数：</td>
           <td><input type="text" name="kaoNumber" value="${kao.kaoNumber }" /><span style="font-size:12px;color:#8e8e8e">//请输入缺勤次数.</span></td>
         </tr>
         <tr>
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
