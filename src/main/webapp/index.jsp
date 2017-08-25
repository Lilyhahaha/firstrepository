<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" isELIgnored="false" %>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/themes/metro-orange/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/css/IconExtension.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/form.validator.rules.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/editor/kindeditor-common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/editor/kindeditor.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/editor/lang/zh_CN.js"></script>
</head>
    <script type="text/javascript" src="easyui/js/jquery-1.8.3.min.js">
        //$(function () {
            $('#cc').combo({
                required:true,
                multiple:false,
                editable:false
            });
            //提交表单
            function aa() {
                $('#ff').form('submit',{
                    url:"http://localhost:8080/imagemanage/regist.jsp",
                    //提交之前触发的回调函数
                    onSubmit: function(){
                        alert("提交前~~");
                        console.log("ok");
                        // do some check
                        // return false to prevent submit;
                    },
                    //提交成功后的回调函数
                    success:function(){
                        alert("哈哈哈哈~");
                    }
                });
            }
        //})
    </script>
<body>

    <div>
        <form id="ff" method="post">
            <select id="cc">
                <option>选项一</option>
                <option>选项二</option>
                <option>选项三</option>
            </select>
            <input class="easyui-textbox" type="text" name="" value="请输入商品码"/> &nbsp;
            <a id="sch" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="aa()">搜索</a>
        </form>
    </div>
</body>
</html>
