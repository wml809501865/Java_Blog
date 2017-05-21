<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="textml; charset=utf-8" />
<title>Insert title here</title>
<style type="text/css">
body{ background:url(); background-size:cover}
*{ margin:0; padding:0;}
#content_top span{float:left; color:#FFF; line-height:50px; font-size:16px; margin-left:20px;}
#content_top a{float:right; text-decoration:none; color:#FFF; line-height:50px; margin-right:30px;  font-size:16px;
}
#content_top a:hover{background-color: #000; transition:all 0.5s linear .1s; opacity:0.5; color:red;}
.common{padding-top:10px; margin-top:10px; margin-bottom:10px;}
.common div{ text-align:center;}
.common input{width:100%; border:2px solod #666; height:30px; border-radius:20px; padding-left:10px; font: 16px/30px Verdana, Geneva, sans-serif}
#resume{width:100%;}
#resume textarea{ width:100%; margin:10px auto; border-radius:10px; padding-left:0;}
#_button{ width:100%; text-align:center;}
#_button button{ background:#09F; width:100px;margin:0 auto; cursor: pointer; border-radius:10px; height:30px;}

</style>

</head>
<body>
<!--<img src="lantian2.jpg" style="position: absolute; top:0; left:0 ;width:100%; height:100%; z-index:-1" />-->
<script language = "javascript"">
function go(){
	 var account=document.getElementById("account").value;
	if(account==0);
		alert("!!");
}
</script>
<div id="content_top" style="height:50px; background: rgba(0,0,0,0.5)">
  <span>博客注册界面</span>
  <a href="#" id="back_mainpage">返回主页</a>
</div>
<div id="content_middle" style="width:400px;margin: 30px auto; border-radius:10px;">
    <div id="account" class="common">
       <div>账号:</div> <input  type="text" placeholder="请输入账号"/>
    </div>
    <div id="password" class="common">
       <div>密码:</div> <input  type="password" placeholder="请输入密码"/>
    </div>
     <div id="nickname" class="common">
       <div>昵称:</div> <input  type="text" placeholder="请输入昵称"/>
    </div>
    <div id="qq" class="common">
       <div>qq:</div> <input  type="text" placeholder="请输入QQ"/>
    </div>
    <div id="mail" class="common">
       <div>邮箱:</div> <input  type="text" placeholder="请输入邮箱"/>
    </div>
    <div id="resume" class="common">
       <div>个人简介:</div> 
       <textarea placeholder="请输入个人简介" rows="16">
       
       </textarea>
       
    </div>
    <div id="_button" class="common" onclick="go()">
    <button>注册</button>
    </div>
</div>

</body>
</html>