<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>酒店管理系统</title>
	<link type="text/css" rel="stylesheet" href="<%=basePath %>easyui/css/easyui.css"/>
  	<link type="text/css" rel="stylesheet" href="<%=basePath %>easyui/css/icon.css">

  	<script type="text/javascript" src="<%=basePath %>easyui/js/jquery-1.12.4.js"></script>
  	<script type="text/javascript" src="<%=basePath %>easyui/js/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="<%=basePath %>easyui/js/easyui-lang-zh_CN.js"></script>  
	  
	<style type="text/css">
		body{
	 		margin: 0;
	 	}
		.easyui-layout {
		 height:630px;
		 width:1366px;
		 }
		 .top
		 {
		 	background: url("<%=basePath %>images/top.png");
		 	background-repeat: no-repeat;
		 	background-size:1660px,61px;
		 } 
		 .top-rirht
		 {
		 	float: right;
			font-size: 15px;	
			padding-top: 5px;
			color: #FFF5F1;
		 }
		 .operation
		 {
		 	line-height: 25px;
		 	float: right;	
		 }
		 .operation a{
		 	color: #FFF5F1;
		 	text-decoration: none
		 }
		.operation  a:HOVER {
				color:#FF0;
		}
	</style>
  </head>
  
  <body>
    <div class="easyui-layout" fit="true">	
		<div region="north"  style="height:63px;">	
				<div class="top" style="height: 61px;">
					<div class="top-rirht top-left" style="height: 50px" >
						<span id="time"></span><br>
						<span class="operation">
							<a href="#" >系统首页&nbsp;|</a>
							<a href="#">修改密码&nbsp;|</a>
							<a href="#">安全退出&nbsp;</a>
						</span>
					</div>
				</div>
		</div> 
	   <div region="west" iconCls="icon-application-osx-home" title="管理菜单"  style="width:177px;height: 567px;" split="true">	
		 <div class="easyui-accordion"  fit="true" style="width:100%;height: 100%;" >
			<div title="用户管理"  style="padding:0px;" iconCls="icon-user-group">
				<ul class="easyui-tree ">
					<li iconCls="icon-application-form">
							<span class="tree-title">
								<a data-icon="icon-application-form" data-link="jsp/back/JobManager.html" iframe="0">用户信息管理</a>
							</span>
				
					</li>
					<li iconCls="icon-application-key">
						<span class="tree-title">
							<a data-icon="icon-application-key" data-link="jsp/back/RoomContent.html" iframe="0">用户等级管理</a>
						</span>
					</li>
					<li iconCls="icon-application-form-edit">
						<span class="tree-title" >
							<a data-icon="icon-application-form-edit" data-link="jsp/back/JobManager.html" iframe="0">用户评论管理</a>
						</span>
					</li>
					<li iconCls="icon-calendar-link">
						<span class="tree-title" >
							<a data-icon="icon-calendar-link" data-link="jsp/back/JobManager.html" iframe="0">用户订单管理</a>
						</span>
					</li>
				</ul>
			</div>
			<div title="员工管理"  style="padding:0px;" iconCls="icon-group-link" >
				<ul class="easyui-tree">
					<li iconCls="icon-calendar-select-day">	
						<span class="tree-title">
							<a data-icon="icon-calendar-select-day" data-link="jsp/back/EmployeeManager.html" iframe="0">员工信息管理</a>
						</span>				
					</li>
					<li iconCls="icon-expand-all">
						<span class="tree-title">
							<a data-icon="icon-expand-all" data-link="jsp/back/JobManager.html" iframe="0">职位管理</a>
						</span>
					</li>
				</ul>
			</div>
			<div title="酒店业务管理"  style="padding:0px;"  iconCls="icon-telephone-red"   >
				<ul class="easyui-tree">
					<li iconCls="icon-pictures-thumbs">	
						<span class="tree-title">
							<a data-icon="icon-pictures-thumbs" data-link="jsp/back/DeptManager.html" iframe="0">部门管理</a>
						</span>				
					</li>
					<li iconCls="icon-printer-color">
						<span class="tree-title">
							<a data-icon="icon-printer-color" data-link="jsp/back/RoomContent.html" iframe="0">房间管理</a>
						</span>
					</li>
					<li iconCls="icon-printer-delete">
						<span class="tree-title">
							<a data-icon="icon-printer-delete" data-link="jsp/back/RoomTypeManager.html" iframe="0">房间类型管理</a>
						</span>
					</li>
					<li iconCls="icon-database-refresh">
						<span class="tree-title">
							<a data-icon="icon-database-refresh" data-link="jsp/back/NewsManager.html" iframe="0">酒店新闻管理</a>
						</span>
					</li>
				</ul>
			</div>
			<div title="权限管理"  style="padding:0px;"  iconCls="icon-sys"> 
				<ul class="easyui-tree">
					<li iconCls="icon-calendar-select-day">
						<span class="tree-title">
							<a data-icon="icon-calendar-link" data-link="jsp/back/JobManager.html" iframe="0">角色权限管理</a>
						</span>
					</li>
			</div>
			<div title="账户管理"  style="padding:0px;" iconCls="icon-advancedsettings">
				<ul class="easyui-tree">
					<li iconCls="icon-status-be-right-back">	
						<span class="tree-title">
							<a data-icon="icon-status-be-right-back" data-link="jsp/back/JobManager.html" iframe="0">账户信息</a>
						</span>				
					</li>
			</div>
		  </div>
		</div>
		 <div id="content" region="center"  style="padding:0px;height: 567px;width: 85%">
			<div class="easyui-tabs" id="wu-tabs" fit="true">
				<div title="home"  style="padding:10px; width: 100%" fit="true">
				</div>
			</div>
		 </div>	 	
	</div>
	<script type="text/javascript">
		  		
	  	$(function(){
			$('.easyui-tree a').bind("click",function(){
				var title = $(this).text();
				var url = $(this).attr('data-link');
				var iconCls = $(this).attr('data-icon');
				var iframe = $(this).attr('iframe')==1?true:false;
				addTab(title,url,iconCls,iframe);
			});	
		}); 
		
		/**
		* Name 载入树形菜单 
		*/
 		 $('#wu-side-tree').tree({
			url:'temp/menu.php',
			cache:false,
			onClick:function(node){
				var url = node.attributes['url'];
				if(url==null || url == ""){
					return false;
				}
				else{
					addTab(node.text, url, '', node.attributes['iframe']);
				}
			}
		}); 
		
		/**
		* Name 选项卡初始化
		*/
		$('.easyui-tabs').tabs({
			tools:[{
				iconCls:'icon-reload',
				border:false,
				handler:function(){
					$('#dg').datagrid('reload');
				}
			}]
		}); 
			
		/**
		* Name 添加菜单选项
		* Param title 名称
		* Param href 链接
		* Param iconCls 图标样式
		* Param iframe 链接跳转方式（true为iframe，false为href）
		*/	
		 function addTab(title, href, iconCls, iframe){
			var tabPanel = $('#wu-tabs');
			if(!tabPanel.tabs('exists',title)){
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
				if(iframe){
					tabPanel.tabs('add',{
						title:title,
						content:content,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
				else{
					tabPanel.tabs('add',{
						title:title,
						href:href,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
			}
			else
			{
				tabPanel.tabs('select',title);
			}
		} 
		/**
		* Name 移除菜单选项
		*/
		function removeTab(){
			var tabPanel = $('#wu-tabs');
			var tab = tabPanel.tabs('getSelected');
			if (tab){
				var index = tabPanel.tabs('getTabIndex', tab);
				tabPanel.tabs('close', index);
			}
		}
	  		var slidint;			
			function stopit() {
     			 clearTimeout(slidint);
    		}
		    function week() {
		      var d, day, x, s = " ";
		      var x = new Array("星期日", "星期一", "星期二");
		      var x = x.concat("星期三", "星期四", "星期五");
		      var x = x.concat("星期六");
		      d = new Date();
		      day = d.getDay();
		      return (s += x[day]);
		     }
		     function newTimer() {
			      stopit();
			      var today;
			      today = new Date();
			      var str = today.toLocaleDateString();
			      str += "  " + week();
			      str += "  " + today.toLocaleTimeString();
			      var o = document.getElementById("time");
			      o.innerHTML = "您好，欢迎光临|当前时间："+str+"&nbsp;";
			      slidint = setTimeout(newTimer, 1000);
    			}
    		window.onload = function() {
		      	newTimer();
		    }
		</script>
  </body>

</html>
