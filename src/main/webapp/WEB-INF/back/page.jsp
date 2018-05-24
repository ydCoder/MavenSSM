<%--
  Created by IntelliJ IDEA.
  User: my-deepin
  Date: 18-4-14
  Time: 下午3:47
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
    <style>
        .jumbotron{
            height:300px;
            background-image:url("<%=basePath%>/resources/1.png");
            background-size: cover;


        }
    </style>
</head>
<body>
<!-- 导航栏 -->
<div class='jumbotron' >
    <div class='container'>
    </div>
</div>
<div class="sidebar text-left">
    <nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">






                <a class="navbar-brand">后台数据管理系统</a>
            </div>
            <div>
                <ul class="nav navbar-nav">
                    <li><a href="<%=basePath%>/customer/toSavePage"><strong>添加信息功能</strong></a></li>
                    <li><a href="<%=basePath%>/customer/toListPage"><strong>用户详情页</strong></a></li>
                    <li><a>欢迎您：${sessionScope.admin.adminName}</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
</body>
</html>
