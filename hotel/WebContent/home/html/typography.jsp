<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>征启</title>
<!-- custom-theme -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Mug house Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 





























</script>
<script language="javascript" type="text/javascript"
	src="My97DatePicker/My97DatePicker/WdatePicker.js"></script>
<link href="My97DatePicker/My97DatePicker/skin/WdatePicker.css"
	rel="stylesheet" type="text/css">
<!-- //custom-theme -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script src="js/main.js"></script>
<!-- //js -->
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- tabs -->
<link href="css/easy-responsive-tabs.css" rel='stylesheet'
	type='text/css' />
<!-- //tabs -->
<!-- //font-awesome-icons -->
<link
	href="//fonts.googleapis.com/css?family=Prompt:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,thai,vietnamese"
	rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Merriweather"
	rel="stylesheet">
</head>
<body>
	<!-- banner -->
	<div class="banner-1">
		<div class="header-bottom">
			<div class="header">
				<div class="container">
					<div class="w3_agile_logo">
						<h1>
							<a href="index.jsp"><span>征启</span>house</a>
						</h1>
					</div>
					<div class="header-nav">
						<nav class="navbar navbar-default">
						<div class="navbar-header navbar-left">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse navbar-right"
							id="bs-example-navbar-collapse-1">
							<nav class="link-effect-12">
							<ul class="nav navbar-nav w3_agile_nav">
								<li><a href="index.jsp"><span>主页</span></a></li>
								<li><a href="gallery.jsp"><span>画廊</span></a></li>
								<li><a href="about.jsp"><span>关于我们</span></a></li>
								<li class="active"><a href="typography.jsp"><span
										data-hover="Short Codes">预定</span></a></li>
								<li><a href="contact.jsp"><span>联系我们</span></a></li>

							</ul>
							</nav>
						</div>
						</nav>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!-- header -->
		</div>
	</div>
	<!-- //banner -->
	<!-- typography -->
	<div class="typo">


		<div class="container" style="text-align: center;">
			<div class="w3ls-heading">
				<div>
					<h2>预定</h2>
				</div>

			</div>
			<div class="ydmain" style="display:;">
				<div class="grid_3 grid_4 w3layouts">
					<h3 class="hdg">预定信息</h3>
					<div class="bs-example"></div>
				</div>
				<!-- 定房 -->
				<div class="input-group w3_w3layouts"
					style="width: 360px; margin: 0 auto;">
					<div class="roomchoose">
						<form class="f1" action="post">
							<span class="input-group-addon" id="basic-addon1">入住日期</span> <input
								style="width: 360px" class="Wdate" type="text" name="inroom"
								id="inroom"
								onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
							<span class="input-group-addon" id="basic-addon1">退房日期</span> <input
								style="width: 360px" class="Wdate" type="text" name="outroom"
								id="outroom"
								onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
							<span class="input-group-addon" id="basic-addon1">房间类型 </span> <select>
								<option value="0"></option>
							</select> <span class="input-group-addon">金额￥</span> <input type="text"
								class="form-control" readonly="readonly" id="money" value="10" />
							<div class="next1">
								<span class="input-group-addon" id="basic-addon1"
									style="background-color: orange; color: white;">下一步</span>
							</div>
						</form>
					</div>
				</div>
				<!-- 平时隐藏 填写信息 -->
				<div class="input-group w3_w3layouts"
					style="width: 360px; margin: 0 auto;">
					<form class="f2" action="post" style="width: 360px; display: none">
					<span class="input-group-addon" id="basic-addon1">姓名</span>
		<!-- 1 -->		 <input	type="text" class="form-control" placeholder="姓氏"	aria-describedby="basic-addon1" id="ydname" name="ydname"> 
						 <span class="input-group-addon" id="basic-addon1">人数</span>
		<!--  2-->		 <input	type="text" class="form-control" placeholder="人数"	aria-describedby="basic-addon1" id="ydrenshu" name="ydrenshu"> 
						<span class="input-group-addon" id="" >性别 </span> 
		<!-- 3 -->	    <select class="ydsex" name="ydsex"></select> 
						<span class="input-group-addon" id="" >客户类型 </span> 
		<!-- 4 -->	  	<select class="ydgusettype" name="ydgusettype"></select> 
						<span class="input-group-addon" id="" >客户类别 </span> 
		<!-- 5 -->	  <select class="ydgusetvip" name="ydgusetvip"></select> 
						 <span	class="input-group-addon" id="">手机号</span> 
		<!-- 6-->	     <input type="text"	class="form-control" placeholder="手机号码"	aria-describedby="basic-addon1" id="ydphone" name="ydphone"> 
							<span class="input-group-addon" id="" >证件类型 </span> 
		<!-- 7 -->	    	<select class="ydcardname" name="ydcardname"></select> 
						<span class="input-group-addon" id="basic-addon1">证件号码 </span>
		<!-- 8 -->		<input type="text" class="form-control" placeholder="证件号码"	aria-describedby="basic-addon1" id="ydcardid" name="ydcardid">						 
	 					 <span class="input-group-addon" id="basic-addon1">国籍</span> 
	    <!-- 9 -->	 	 <select class="ydcountry" name="ydcountry"></select>
						  <span class="input-group-addon" id="basic-addon1">邮编</span> 
		<!-- 10 -->	  <input type="text" class="form-control" placeholder="如2100000" aria-describedby="basic-addon1"  id="ydzip" name="ydzip"> 
						  <span class="input-group-addon" id="basic-addon1">地址</span>
		<!-- 11 -->		   <input type="text" class="form-control" placeholder="地址" aria-describedby="basic-addon1" id="ydaddress" name="ydaddress">
		 <span class="input-group-addon" id="basic-addon1">email地址</span>
		<!-- 12 -->		   <input type="text" class="form-control" placeholder="email" aria-describedby="basic-addon1" id="yddemail" name="yddemail">
						<div class="next3">
							<span class="input-group-addon" id="basic-addon1"
								style="background-color: orange; color: white;">确认订房</span>
						</div>
					</form>
				</div>
			</div>
			<div class="cxmain" style="display:;">
				<div class="grid_3 grid_4 w3layouts">
					<h3 class="hdg">查询信息</h3>
					<div class="bs-example"></div>
				</div>
				<div class="input-group w3_w3layouts"
					style="width: 360px; margin: 0 auto;">
					<div class="roomfind">
						<form class="f3" action="post">
							<span class="input-group-addon" id="basic-addon1">预留号码 </span> <input
								type="text" class="form-control" id="findphone" name="findphone" />
							<span class="input-group-addon" id="basic-addon1">验证码 </span> <input
								type="text" class="form-control"
								style="display: inline-block; width: 260px" id="yanzheng"
								name="yanzheng" /> <input id="second"
								;class="p-code text t-center" type="button"
								style="width: 100px; height: 34px; display: block; outline: none; border: 1px; background: #fff;"
								value="获取验证码" />
							<div class="next2">
								<span class="input-group-addon" id="basic-addon1"
									style="background-color: orange; color: white;">查找</span>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="bs-docs-example" style="margin-top: 15px; display: none">
				<table class="table">
					<thead>
						<tr>
							<th>姓名</th>
							<th>电话号码</th>
							<th>证件号码</th>
							<th>入住时间</th>
							<th>退房时间</th>
							<th>房间号码</th>
							<th>每天价格</th>
							<th>价格共计</th>

						</tr>
					</thead>
					<tbody>
						<tr>
							<td>aadasd</td>
							<td>158888222003</td>
							<td>330301299703240200</td>
							<td>1999999999</td>
							<td>1999999999</td>
							<td>123123</td>
							<td>123123</td>
							<td>123123</td>
						</tr>

					</tbody>
				</table>
			</div>
		</div>

	</div>

	<div class="input-group w3_w3layouts">

		<div class="clearfix"></div>
	</div>
	<div class="agileits-w3layouts-copyright">
		<p>
			© 2017 JourneySt house . All Rights Reserved | Design by <a
				href="http://w3layouts.com/"> 征启</a>
		</p>
	</div>
	</div>
	</div>
	<!-- //footer -->
	<!-- start-smooth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- start-smooth-scrolling -->
	<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->
	<script src='js/jquery.typer.js'></script>
	<script>
		var win = $(window), foo = $('#typer');

		foo.typer([ 'Luxury Hotels', 'Hotels & Resorts', 'Luxury Resorts' ]);

		// unneeded...
		win.resize(
				function() {
					var fontSize = Math.max(Math.min(win.width() / (1 * 10),
							parseFloat(Number.POSITIVE_INFINITY)),
							parseFloat(Number.NEGATIVE_INFINITY));

					foo.css({
						fontSize : fontSize * .8 + 'px'
					});
				}).resize();
	</script>
	<!--tabs-->
	<script src="js/easy-responsive-tabs.js"></script>
	<script>
		$(document).ready(function() {
			$('#horizontalTab').easyResponsiveTabs({
				type : 'default', //Types: default, vertical, accordion           
				width : 'auto', //auto or any width like 600px
				fit : true, // 100% fit in a container
				closed : 'accordion', // Start closed if in accordion view
				activate : function(event) { // Callback function if tab is switched
					var $tab = $(this);
					var $info = $('#tabInfo');
					var $name = $('span', $info);
					$name.text($tab.text());
					$info.show();
				}
			});
			$('#verticalTab').easyResponsiveTabs({
				type : 'vertical',
				width : 'auto',
				fit : true
			});
		});

		$(".next1").click(function() {
			var ojbk = 0;
			if ($("#inroom").val() == "") {
				alert("请选择入住日期");
				ojbk = 1;
			}
			if ($("#outroom").val() == "") {
				alert("请选择退房日期");
				ojbk = 1;
			}
			if ($("#money").val() == "") {
				alert("请选择正确房间类型");
				ojbk = 1;
			}

			if (ojbk == 0) {
				$(".f2").show();
			}

		});
		$(".next3").click(function(){	
			var ydphone = $("#ydphone").val();
			var myreg = /^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\d{8}$/;
			var ydcardid = $("#ydcardid").val();
			var mycardid = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
			var ydzip = $("#ydzip").val();
			var myzip = /^[1-9][0-9]{5}$/;
			var yddemail = $("#yddemail").val();
			var myemail = /\w@\w*\.\w/;
			if (!myreg.test(ydphone)) {alert("请输入正确手机号码");}
			if (!mycardid.test(ydcardid)) {alert("请输入正确身份证号码");}
			if (!myzip.test(ydzip)) {alert("请输入正确邮编");}
			if (!myemail.test(ydemail)) {alert("请输入正确邮箱地址");}
		});

		//发送验证码时添加cookie
		function addCookie(name, value, expiresHours) {
			var cookieString = name + "=" + escape(value);
			//判断是否设置过期时间,0代表关闭浏览器时失效
			if (expiresHours > 0) {
				var date = new Date();
				date.setTime(date.getTime() + expiresHours * 1000);
				cookieString = cookieString + ";expires=" + date.toUTCString();
			}
			document.cookie = cookieString;
		}
		//修改cookie的值
		function editCookie(name, value, expiresHours) {
			var cookieString = name + "=" + escape(value);
			if (expiresHours > 0) {
				var date = new Date();
				date.setTime(date.getTime() + expiresHours * 1000); //单位是毫秒
				cookieString = cookieString + ";expires=" + date.toGMTString();
			}
			document.cookie = cookieString;
		}
		//根据名字获取cookie的值
		function getCookieValue(name) {
			var strCookie = document.cookie;
			var arrCookie = strCookie.split("; ");
			for (var i = 0; i < arrCookie.length; i++) {
				var arr = arrCookie[i].split("=");
				if (arr[0] == name) {
					return unescape(arr[1]);
					break;
				} else {
					return "";
					break;
				}
			}

		}

		$(function() {
			$("#second").click(function() {
				sendCode($("#second"));
			});
			v = getCookieValue("secondsremained");//获取cookie值
			if (v > 0) {
				settime($("#second"));//开始倒计时
			}
		})
		//发送验证码
		function sendCode(obj) {
			var phonenum = $("#findphone").val();
			var result = isPhoneNum();
			if (result) {
				doPostBack('${base}/login/getCode.htm', backFunc1, {
					"phonenum" : phonenum
				});
				addCookie("secondsremained", 60, 60);//添加cookie记录,有效时间60s
				settime(obj);//开始倒计时
			}
		}
		//将手机利用ajax提交到后台的发短信接口
		function doPostBack(url, backFunc, queryParam) {
			$.ajax({
				async : false,
				cache : false,
				type : 'POST',
				url : "yzm.do?c=getMessageService",// 请求的action路径
				data : queryParam,
				error : function() {// 请求失败处理函数
				},
				success : backFunc
			});
		}
		function backFunc1(data) {
			var d = $.parseJSON(data);
			if (!d.success) {
				alert(d.msg);
			} else {//返回验证码
				alert("模拟验证码:" + d.msg);
				$("#yanzheng").val(d.msg);
			}
		}
		//开始倒计时
		var countdown;
		function settime(obj) {
			countdown = getCookieValue("secondsremained");
			if (countdown == 0) {
				obj.removeAttr("disabled");
				obj.val("获取验证码");
				return;
			} else {
				obj.attr("disabled", true);
				obj.val("重新发送(" + countdown + ")");
				countdown--;
				editCookie("secondsremained", countdown, countdown + 1);
			}
			setTimeout(function() {
				settime(obj)
			}, 1000) //每1000毫秒执行一次
		}
		//校验手机号是否合法
		function isPhoneNum() {
			var phonenum = $("#findphone").val();
			var myreg = /^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\d{8}$/;
			if (!myreg.test(phonenum)) {
				alert('请输入有效的手机号码！');
				return false;
			} else {
				return true;
			}
		}
		/* 
		 $("#yanzm").click(function() {
		 var num = $("#findphone").val();
		 var pattern = /^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\d{8}$/;
		 if(pattern.test(num)){
		 $.ajax({
		 "url":"yzm.do?c=setMessageService",
		 "type":"post",
		 "data":"findphone="+num,
		 "datatype":"JSON",
		 "success":function(res){
		 if(res){
		 alert("倒计时60秒");
		 }
		 }
		 })
		 }else{
		 alert("手机号不正确!");
		 }
		 });
		 $(".next2").click(function(){
		 var yzm = $("#yanzheng").val();
		 alert(yzm);
		 $.ajax({
		 "url":"yzm.do?c=getMessageService",
		 "type":"post",
		 "data":"yzm="+yzm,
		 "datatype":"JSON",
		 "success":function(res){
		 if(res){
		 alert("成功!");
		 }
		 }
		 })
		 }) */
	</script>
	<!--//tabs-->
</body>
</html>