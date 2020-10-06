<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/10/6
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/" method="post">
    <p align="center">类型：
    <select name="typeId">
        <option value="0">不限</option>
        <option value="1">支出</option>
        <option value="2">收入</option>
        <option value="3">转账</option>
        <option value="4">借出</option>
        <option value="5">借入</option>
        <option value="6">还入</option>
        <option value="7">还出</option>
    </select>
        <input type="submit" value="搜索">
        <a href="/toadd">记账</a>
    </p>
</form>
<table border="1px" align="center" width="800px">
    <tr>
        <td colspan="8"><h2 align="center">记账管理</h2></td>
    </tr>
    <tr id="a">
        <td>标题</td>
        <td>记账时间</td>
        <td>类别</td>
        <td>金额</td>
        <td>说明</td>
    </tr>
    <c:forEach items="${bills}" var="bills">
        <tr>
            <td>${bills.title}</td>
            <td>${bills.billTime}</td>
            <td>
                <c:if test="${bills.typeId==1}">支出</c:if>
                <c:if test="${bills.typeId==2}">收入</c:if>
                <c:if test="${bills.typeId==3}">转账</c:if>
                <c:if test="${bills.typeId==4}">借出</c:if>
                <c:if test="${bills.typeId==5}">借入</c:if>
                <c:if test="${bills.typeId==6}">还入</c:if>
                <c:if test="${bills.typeId==7}">还出</c:if>
            </td>
            <td>${bills.price}</td>
            <td>${bills.explainn}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
<script type="text/javascript">
$("tr:odd").css("background-color","rgb(148,236,139)");
$("#a").css("background-color","rgb(173,216,230)");
</script>
