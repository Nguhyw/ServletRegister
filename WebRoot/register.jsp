<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>用户注册</h1>
    <hr>
    <form name="regForm" action="servlet/RegServlet" method="post">
    <table border="0" width="450" height="auto" cellspacing="2" cellpadding="1">
    	<tr>
    		<td>用户名:&nbsp;&nbsp;</td>
    		<td><input type="text" name="username"> </td>
    	</tr>
    	<tr>
    		<td>密码:&nbsp;&nbsp;</td>
    		<td><input type="password" name="password"> </td>
    	</tr>
    	<tr>
    		<td>确认密码:&nbsp;&nbsp;</td>
    		<td><input type="password" name="confirmpassword"> </td>
    	</tr>
    	<tr>
    		<td>电子邮箱:&nbsp;&nbsp;</td>
    		<td><input type="text" name="email"> </td>
    	</tr>
    	<tr>
    		<td>性别:&nbsp;&nbsp;</td>
    		<td> 
    		<label>男<input type="radio" value="man" name="sex"> </label>
    		<label>女<input type="radio" value="female" name="sex"> </label>
    		</td>
    	</tr>
    	<tr>
    		<td>出生日期:&nbsp;&nbsp;</td>
    		<td><input type="text" name="birthday"> </td>
    	</tr>
    	<tr>
    		<td>爱好:&nbsp;&nbsp;</td>
    		<td> 
    		<label>篮球<input type="checkbox" value="篮球" name="interest"> </label>
    		<label>电影<input type="checkbox" value="电影" name="interest"> </label>
    		<label>音乐<input type="checkbox" value="音乐" name="interest"> </label>
    		<label>游戏<input type="checkbox" value="游戏" name="interest"> </label>
    		</td>
    	</tr>
    	<tr>
    		<td>自我介绍:&nbsp;&nbsp;</td>
    		<td><textarea rows="5" cols="23" name="introduce"></textarea> </td>
    	</tr>
    	<tr>
    		<td>是否接受协议:&nbsp;&nbsp;</td>
    		<td> 
    		<label>是否接受霸王条款<input type="checkbox" value="true" name="isAccpet"> </label>
    		</td>
    	</tr>
    	<tr>
    		<td></td>
    		<td><input type="submit" value="注册">&nbsp;&nbsp;<input type="submit" value="取消"></td>
    	</tr>
    </table>
    </form>
    
  </body>
</html>
