<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>登入主界面</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- 引入 Bootstrap -->
      <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
      <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
      

   </head>
   <body>
     <div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					  <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span>
					  <span class="icon-bar"></span></button>
					  <a class="navbar-brand" href="#">Your Home </a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							 <a href="login.jsp#jump">Login</a>
						</li>
						<li>
							 <a href="register.jsp#jump">Register</a>
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
						<li class="active">
							 <a href="#">Main</a>
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
			<div class="container">

			<div class="carousel slide" id="carousel-18743">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-18743">
					</li>
					<li data-slide-to="1" data-target="#carousel-18743">
					</li>
					<li data-slide-to="2" data-target="#carousel-18743">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="picture/p1.jpg" />
						<div class="carousel-caption">
							<h4>
								First 
							</h4>
							<p>
								This is just for fun!
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="picture/p2.jpg" />
						<div class="carousel-caption">
							<h4>
								Second
							</h4>
							<p>
								This is just for fun!
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="picture/p3.jpg" />
						<div class="carousel-caption">
							<h4>
								Third
							</h4>
							<p>
								This is just for fun!
							</p>
						</div>
					</div>

				<a class="left carousel-control" href="#carousel-18743" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span></a>
				 <a class="right carousel-control" href="#carousel-18743" data-slide="next">
				 <span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
<div class="jumbotron">
				<h1>
					Hello, master!
				</h1>
				<p>
					This is your blog.Although it is very simple,it is easy to use.
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="WriteBlog.jsp#jump">Write Blog</a>
				</p>
				<p>
					 <a class="btn btn-primary btn-large" href="GetPostPageServlet">Read Blog</a>
				</p>
			</div>

		</div>
	</div>
</div>

</div>

</div>

 
      <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
      <script src="https://code.jquery.com/jquery.js"></script>
      <!-- 包括所有已编译的插件 -->
      <script src="js/bootstrap.min.js"></script>
   </body>
</html>