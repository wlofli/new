<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



<title>test2</title>

</head>
<body>



	<s:form action="Customerjson" method="post" theme="simple">
	<table>
	<tr>
		<td>用户名：</td>
		<td><s:textfield  label="用户名" name="customer.eluserLoginname"></s:textfield></td>
	</tr>
	
	<tr> 
		<td>密码：</td>
		<td><s:password   label="密码" name="customer.eluserPassword" ></s:password></td>
	</tr>
	</table>	
	<font color="red"><s:property value="error"></s:property></font>
	<s:submit value="登入2014年10月15日17:43:24"  name="customerLoad"    method="cstlgn"    /> 
	<s:reset value="清空"/>
	</s:form>
	<s:debug></s:debug>

</body>
</html>