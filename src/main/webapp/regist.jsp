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
    <title>regist.jsp</title>
</head>
<body>
    <div style="text-align: center;  margin-top: 100px">
        <form method="post" action="">
            <h2>请填入以下信息，完成注册</h2><br/><br/>
            用户名：<input type="text" name="username"/><br/><br/>
            密  码：<input type="password" name="password"/><br/><br/>
            确认密码：<input type="password" name="repassword"/><br/><br/>
            <input type="radio" name="role" value="11" checked="checked"/>摄影师
            <input type="radio" name="role" value="22"/>修图师
            <input type="radio" name="role" value="33"/>审核员<br/><br/>
            手机号：<input type="text" name="telphone"/><a href="">获取验证码</a><br/><br/>
            请输入验证码：<input type="type" name="code"/><br/><br/>
            <input type="submit" value="注册"/>&nbsp;<input type="reset" value="重置"/>
        </form>
    </div>
</body>
</html>
