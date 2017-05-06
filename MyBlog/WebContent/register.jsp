<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>注册界面</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
<script type="text/javascript">
	function check(){
		if(document.getElementById("a1").value==""||document.getElementById("a2").value==""||document.getElementById("a3").value==""||document.getElementById("a4").value==""||document.getElementById("a5").value==""){
			alert("请输入注册信息！");
			return false;}
	}
</script>
<script type="text/javascript">
	function login(){
			alert("请先登入");
			return false;}
</script>
<script type="text/javascript">
	function quit(){
		session.setAttribute("loggedIn", "no");
		alert("退出成功!");}
</script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default"role="form">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span>
					 <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Register</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							 <a href="login.jsp#jump">Login</a>
						</li>
						<li class="active">
							 <a href="#">Register</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#" onclick="login();">Main</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Choose<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="GetPostPageServlet">Read Blog</a> 
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									  <a href="QuitServlet">Quit</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</nav>
			<div class="row clearfix">
		<div class="col-md-6 column">
			<img alt="140x140" src="picture/num.jpg" />
		</div>
		<div class="col-md-6 column">
			<form class="form-horizontal" role="form"action="RegServlet" method="post"onsubmit="return check();">
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">YourName</label>
					<div class="col-sm-10">
						<input  type="text" name="Username" id="a1" class="form-control"  />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputEmail3" class="col-sm-2 control-label">Account</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="account" id="a2" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" name ="password"id="a3" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">QQ</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name ="qq"id="a4" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">E-mail</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name ="mail"id="a5" />
					</div>
				</div>
				<div class="form-group">
					 <label for="inputPassword3" class="col-sm-2 control-label">PersonalExplanation</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name ="personal"id="a6" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <button type="submit" class="btn btn-default">Sign in</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

 <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
      <script src="https://code.jquery.com/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="js/bootstrap.min.js"></script>	
</body>
</html>