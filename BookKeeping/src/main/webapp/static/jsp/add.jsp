<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/10/6
  Time: 10:54
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
<form action="/doadd" method="post">
    <table border="1px" align="center" width="600px">
        <tr>
            <td align="center" colspan="8"><h2>记账</h2></td>
        </tr>
        <tr>
            <td>类型：
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
            </td>

        </tr>
        <tr>
            <td>标题：<input type="text" name="title"></td>
        </tr>
        <tr>
            <td>
                日期：<input type="text" name="billTime">
                金额：<input type="text" name="price">
            </td>
        </tr>
        <tr>
            <td>说明：<input type="text" name="explainn"></td>
        </tr>
        <tr>
            <td align="center">
                <input type="reset" value="重置">
                <input type="submit" value="保存">
                <input type="button" value="返回" onclick="javascript:history.back(-1)">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script type="text/javascript">

</script>
