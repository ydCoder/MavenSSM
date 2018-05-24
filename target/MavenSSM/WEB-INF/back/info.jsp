<%--
  Created by IntelliJ IDEA.
  User: my-deepin
  Date: 18-4-7
  Time: 下午9:02
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
<head>
    <title>Title</title>
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
<br/>
<br/>
<br/>
<h1 class="text-center">${message}</h1>


</body>
</html>
