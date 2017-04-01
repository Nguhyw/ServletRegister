<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.message{
			width: 120;
		}
	</style>
  </head>
  
  <body>
    <center>
    
    <jsp:useBean id="regUser" class="entity.Users" scope="session"/>
    
    <table width="400" bgcolor="#e9e9e9" border="1">
 
		 <tr>
			<td class="message">用户名：</td><td><jsp:getProperty name="regUser" property="username"/> </td>
		</tr>   
		<tr>
			<td class="message">密码：</td><td><jsp:getProperty name="regUser" property="password"/></td>
		</tr>   
		<tr>
			<td class="message">性别：</td><td>
			<%
				String sex; 
				if(regUser.getSex().equals("man")){
					sex = "男";
				}
				else{
					sex = "女";
				}
			 %>
			 <%=sex %>
			</td>
		</tr>   
		<tr>
			<td class="message">E-mail：</td><td><jsp:getProperty name="regUser" property="email"/></td>
		</tr>  
		<tr>
			<td class="message">出生日期：</td>
			<td>
				<%
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
					String date = sdf.format(regUser.getBirthday());
				 %>
				 <%=date %>
			</td>
		</tr>    
		<tr>
			<td class="message">爱好：</td>
			<td>
			<%
				String[] interest = regUser.getInterest();
				for(String s: interest){
			%>
				<%=s %>&nbsp;&nbsp;
			<%
				}
			 %>
			</td>
		</tr>   
		<tr>
			<td class="message">自我介绍：</td><td><jsp:getProperty name="regUser" property="introduce"/></td>
		</tr>   
		<tr>
			<td class="message">是否接受协议：</td>
			<td>
				<%
					String isAccpet="否";
					if(regUser.getFlag()){
						isAccpet="是";
					}
				 %>
				 <%=isAccpet %>
			</td>
		</tr>   
    </table>
    </center>
  </body>
</html>
