
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<%--<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%=basePath%>/resources/bootstrap.min.css"/>
    <title>首页</title>
    <html>
<body>
<h2 class="text-center">管理员登录</h2>
<hr/>
<form action="<%=basePath%>/user/login" method="post" class="form-inline text-center">
    <label>username:</label>
    <input type="text" class="form-control" name="username"/>
    <br/>
    <br/>
    <label>password:</label>
    <input type="password" class="form-control" name="password"/>
    <br/>
    <br/>
    <input type="submit" value="登录" class="btn btn-default"/>
</form>
</body>
</html>--%>






<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <meta name="description" content="">
    <meta name="author" content="">

    <title>welcome Login!</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=basePath%>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="<%=basePath%>/resources/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=basePath%>/resources/css/starter-template.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/css/signin.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->



    <style type="text/css">
        .index #canvas{
            height: 94%;
            width: 100%;

            position: absolute;
        }
        .jumbotron{
            height:200px;
            background-image:url("<%=basePath%>/resources/1.png");


        }

    </style>

</head>

<body class="index">

<div class='jumbotron' >
    <div class='container'>
    </div>
</div>


<canvas id="canvas">
</canvas>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Login</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
   <form class="form-signin"   action="<%=basePath%>/user/login" method="post" >
        <h2 class="form-signin-heading">Please Login in</h2>
        <label for="inputEmail" class="sr-only">Username</label>
        <input type="text" id="inputEmail" name="username" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>





        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
    </form>



</nav>



<!-- <div class="container">

  <div class="starter-template">
    <h1>Bootstrap starter template</h1>
    <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
  </div>

</div> -->

<script src="<%=basePath%>/resources/js/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="<%=basePath%>/resources/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="<%=basePath%>/resources/js/ie10-viewport-bug-workaround.js"></script>
<script src="<%=basePath%>/resources/js/index.js" charset="utf-8"></script>
</body>

</html>




