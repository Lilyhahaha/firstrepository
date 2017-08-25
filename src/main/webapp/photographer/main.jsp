<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/22
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form>
            <select name="id">
                <option value="请选择品牌"/>
                <c:forEach items="" var="">
                    <option value="" name=""/>
                </c:forEach>
            </select>
            <input type="text" name="" value="请输入商品码"/> &nbsp;
            <input type="submit" value="搜索"/>
        </form>
    </div>
    <div>
        <table id="">
            <tr>
                <td></td>
            </tr>
        </table>
    </div>
</body>
</html>
