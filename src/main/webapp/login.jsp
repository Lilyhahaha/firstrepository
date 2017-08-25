<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/22
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login.jsp</title>
</head>
<body>
    <div style="text-align: center;margin-top: 100px">
        <form action="" method="post">
            用户名：<input type="text" name="username"/><br/><br/>
            密  码：<input type="password" name="password"/><br/><br/>
            请输入图片验证码：<input type="text"/><img src="" height="" width=""/><br/><br/>
            <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;<input type="reset" value="取消"/>
        </form>
    </div>

</body>
</html>
