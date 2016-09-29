<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>

<s:iterator value="%{petList}">
    <s:property value="%{petName}" />,
    <s:property value="%{ownerName}" />,
    <s:property value="%{price}" />,
    <s:property value="%{birthDate}" />
    <br>
</s:iterator>
<br><br>
<a href="menu">menu</a>

</body>
</html>