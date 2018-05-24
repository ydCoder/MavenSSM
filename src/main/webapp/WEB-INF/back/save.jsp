<%--
  Created by IntelliJ IDEA.
  User: my-deepin
  Date: 18-4-14
  Time: 下午4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<link rel="stylesheet" href="<%=basePath%>/resources/bootstrap.min.css"/>
<script src="<%=basePath%>/resources/jquery.min.js"></script>
<head>
    <title>添加客户功能页面</title>
</head>
<body>
<!-- 导航栏 -->
<div class="sidebar text-left">
    <nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">后台数据管理系统</a>
            </div>
            <div>
                <ul class="nav navbar-nav">
                    <li><a href="<%=basePath%>/customer/toSavePage"><strong>添加信息功能</strong></a></li>
                    <li><a href="<%=basePath%>/customer/toListPage"><strong>分页查询功能</strong></a></li>
                    <li><a>Create by Ydcoder</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<div class="container">
    <h1 class="text-center" style="margin-top:66px;">客户信息添加</h1>
    <hr/>
    <br/>
    <form class="form-inline text-center"  name="form1"        action="<%=basePath%>/customer/save" method="post"   onSubmit="return myCheck()">
        <div hidden="hidden">
            <!-- 这个id值默认中数据库中查询 -->
            <input type="text" name="c_id" class="form-control" value="${newId}"/>
        </div>
        <div class="form-group form-inline">
            <label>客户姓名：</label>
            <input type="text" name="c_name" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>客户电话：</label>
            <input type="text" name="c_telephone" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>客户住址：</label>
            <input type="text" name="c_address" class="form-control"/>
        </div>
        <br/>
        <br/>
        <div class="form-group form-inline">
            <label>客户备注：</label>
            <input type="text" name="c_remark" class="form-control"/>
        </div>
        <br/>
        <br/>
        <br/>
        <input type="submit" class="btn btn-info text-center"   id="btn_add"/>
        <input type="reset" class="btn btn-danger text-center"/>
    </form>
</div>




<%--检测输入表单输入值是否为空--%>
<script type="text/javascript">
    function myCheck()
    {
        for(var i=0;i<document.form1.elements.length-1;i++)
        {
            if(document.form1.elements[i].value=="")
            {


               alert("当前输入框不能有空项");
                document.form1.elements[i].focus();
                return false;
            }
        }
        return true;

    }
</script>










</body>
</html>
