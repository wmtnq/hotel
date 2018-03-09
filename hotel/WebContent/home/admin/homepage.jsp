<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>征启后台管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<link type="text/css" rel="stylesheet" href="css/adminstyle.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript" src="js/operatehomepage.js"></script>
<script language="javascript" type="text/javascript"
	src="My97DatePicker/My97DatePicker/WdatePicker.js"></script>
<style type="text/css">
a {
	cursor: pointer
}

button {
	color: #6a6f77;
	cursor: pointer color: #666;
	background-color: #EEE;
	border-color: #EEE;
	font-weight: 300;
	font-size: 16px;
	font-family: "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial,
		"Lucida Grande", sans-serif;
	text-decoration: none;
	text-align: center;
	line-height: 40px;
	height: 40px;
	padding: 0 40px;
	margin: 0;
	display: inline-block;
	appearance: none;
	cursor: pointer;
	border: none;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
	-webkit-transition-property: all;
	transition-property: all;
	-webkit-transition-duration: .3s;
	transition-duration: .3s;
}

button:visited {
	color: #666;
}

button:hover, button:focus {
	background-color: #f6f6f6;
	text-decoration: none;
	outline: none;
}

button:active {
	text-shadow: 0 1px 0 rgba(255, 255, 255, 0.3);
	text-decoration: none;
	background-color: #eeeeee;
	border-color: #cfcfcf;
	color: #d4d4d4;
	-webkit-transition-duration: 0s;
	transition-duration: 0s;
	-webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.2);
	box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.2);
}

div>button {
	margin: 0;
	padding: 0;
	font-size: 30px;
	width: 50px;
	height: 50px;
	border-radius: 50%;
	position: absolute;
	right: 20px;
	top: 0%;
	padding: 0;
}

h2 {
	text-align: center;
	position: relative;
	top: -50px;
	left: 0%;
}

.roompicul li {
	float: left;
	width: 76px;
	padding: 5px;
	text-align: center;
}

div .add {
	width: 200px;
	height: 50px;
	border-radius: 12px;
}
/*房图*/
#roomimg {
	position: fixed;
	top: 20%;
	left: 30%;
	display: none;
}

#roomimgleft {
	position: fixed;
	top: 0;
	left: 0;
	width: 30%;
	height: 100%;
	display: none;
}

#roomimgright {
	position: fixed;
	top: 0;
	right: 0;
	width: 24%;
	height: 100%;
	display: none;
}

#roomimgtop {
	position: fixed;
	top: 0;
	left: 0;
	width: 100%;
	height: 20%;
	display: none;
}

#roomimgbotton {
	position: fixed;
	bottom: 0;
	left: 0;
	width: 76%;
	height: 22%;
	display: none;
}

.roomimg {
	width: 600px;
	padding: 15px;
	border-radius: 10px;
	background-color: rgb(240, 240, 240);
}

.roomover {
	display: inline-block;
	position: absolute;
	right: 2px;
	top: -5px;
	cursor: pointer;
	font-size: 20px;
}

.roomover:hover {
	color: red;
}
/*table样式*/
div>table:nth-of-type(1) {
	clear: both;
	border: 1px solid #c9dae4;
	text-align: center;
	margin: 0 auto;
}

div>table:nth-of-type(1) tr th {
	color: #0d487b;
	background: #f2f4f8 url(images/tableth.jpg) repeat-x left bottom;
	line-height: 28px;
	border-bottom: 1px solid #9cb6cf;
	border-top: 1px solid #e9edf3;
	font-weight: normal;
	text-shadow: #e6ecf3 1px 1px 0px;
	padding-left: 5px;
	padding-right: 5px;
}

div>table:nth-of-type(1) tr td {
	border-bottom: 1px solid #e9e9e9;
	padding-bottom: 5px;
	padding-top: 5px;
	color: #444;
	border-top: 1px solid #FFFFFF;
	padding-left: 5px;
	padding-right: 5px;
	word-break: break-all;
}

div>table:nth-of-type(1) tr:nth-child(even) td {
	background: #ecf6fc;
	/*这行将给所有的tr加上背景色*/
}

div>table:nth-of-type(1) tr.over td {
	background: #bcd4ec;
	/*这个将是鼠标高亮行的背景色*/
}

li>input.search {
	box-sizing: border-box;
	font-size: 1.4em;
	border-radius: 4px;
	border: 1px solid #c8cccf;
	color: #6a6f77;
	-web-kit-appearance: none;
	-moz-appearance: none;
	display: inline-block;
	outline: 0;
	padding: 0 1em;
	text-decoration: none;
	width: 500px;
	height: 40px;
}

li>input.search:focus {
	border: 1px solid #ff7496;
}

.dengjifind {
	width: 100%;
	height: 100%;
}

.right-nav ul li img {
	cursor: pointer;
}

video {
	padding-left: 130px;
	padding-top: 15px;
}

/*后台设置修改*/
.opadd, .rmladd, .rmadd {
	position: fixed;
	top: 20%;
	right: 0;
	padding: 20px;
	padding-bottom: 0;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}

.fpxg, .tkxg, .opxg, .rmlxg {
	position: fixed;
	top: 40%;
	left: 53%;
	padding: 20px;
	padding-bottom: 0;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}
/*修改密码*/
.jurisdictionDiv {
	position: fixed;
	top: 5%;
	right: 1%;
	padding: 20px;
	padding-bottom: 0;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}
/*退房*/
.bmtf, .tfaddtkxxdiv, .tfaddfpxxdiv {
	position: fixed;
	top: 20%;
	left: 42%;
	padding: 20px;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}
/*解锁*/
.dellock {
	position: fixed;
	top: 42%;
	left: 42%;
	padding: 20px;
	padding-bottom: 0;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}

.fpxg .fp table tr:last-of-type, .tkxg .tk table tr:last-of-type, .opxg .op table tr:last-of-type,
	.rmlxg .rml table tr:last-of-type, .opadd .addopf table tr:last-of-type,
	.rmladd .addrmlf table tr:last-of-type, .rmxg .rm table tr:last-of-type,
	.rmadd .addrmf table tr:last-of-type, .jurisdictionDiv .oppassf table tr:last-of-type,
	.dellock .dellockf table tr:last-of-type, .bmtff .bmtf  table tr:last-of-type,
	.bmtff .tfaddfpxxdiv  table tr:last-of-type, .bmtff .tfaddtkxxdiv  table tr:last-of-type,
	.addrz .addrzf table tr:last-of-type {
	height: 50px;
}

.fpxg .fp table tr:last-of-type input, .tkxg .tk table tr:last-of-type input,
	.opxg .op table tr:last-of-type input, .rmlxg .rml table tr:last-of-type input,
	.opadd .addopf table tr:last-of-type input, .rmladd .addrmlf table tr:last-of-type input,
	.rmxg .rm table tr:last-of-type input, .rmadd .addrmf table tr:last-of-type input,
	.jurisdictionDiv .oppassf table tr:last-of-type input, .dellock .dellockf table tr:last-of-type input,
	.bmtff .bmtf table tr:last-of-type input, .bmtff .tfaddfpxxdiv table tr:last-of-type input,
	.addrz .addrzf table tr:last-of-type input {
	margin-left: 30px;
}

.fpxg .fp table tr:last-of-type input:nth-of-type(1), .tkxg .tk table tr:last-of-type input:nth-of-type(1),
	.opxg .op table tr:last-of-type input:nth-of-type(1), .jurisdictionDiv .oppassf table tr:last-of-type input:nth-of-type(1),
	.dellock .dellockf table tr:last-of-type input:nth-of-type(1) {
	margin-left: 50px;
}

.addrz .addrzf table tr:last-of-type input:nth-of-type(1) {
	margin-left: 95px;
}
/*新增效果*/
.opadd .addopf table tr:last-of-type input:nth-of-type(1) {
	margin-left: 70px;
}
/*客房修改*/
.rmxg {
	position: fixed;
	top: 20%;
	left: 45%;
	padding: 20px;
	padding-bottom: 0;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}

.addrz {
	position: fixed;
	top: 5%;
	left: 45%;
	padding: 20px;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}

.rmxg .rm table tr td:nth-child(1), .rmadd .addrmf table tr td:nth-child(1)
	{
	width: 100px;
}

.rmxg .rm table tr img, .rmadd .addrmf table tr img {
	margin-left: 80px;
}

.rmxg .rm table tr:last-of-type input:nth-of-type(1), .rmladd .addrmlf table tr:last-of-type input:nth-of-type(1),
	.rmadd .addrmf table tr:last-of-type input:nth-of-type(1) {
	margin-left: 95px;
}

.rmlxg .rml table tr:last-of-type input:nth-of-type(1) {
	margin-left: 75px;
}
/*解锁*/
.lockdiv {
	width: 100%;
	height: 100%;
	z-index: 10;
	background: white;
	position: fixed;
	display: none;
}

.lockdiv button {
	width: 200px;
	height: 200px;
	top: 25%;
	left: 45%;
}

/*登记查询查看详情*/
.getckxq {
	position: fixed;
	top: 40%;
	left: 65%;
	padding: 20px;
	padding-bottom: 0;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
	width: 300px;
	height: 100px;
}

.getckxq button:nth-child(1) {
	top: 34px;
	left: 45px;
	font-size: 12px;
}

.getckxq button:nth-child(2) {
	top: 35px;
	left: 145px;
	font-size: 12px;
}

.getckxq button:nth-child(3) {
	top: 35px;
	left: 245px;
	font-size: 12px;
}

.ckxqgsdiv, .ckxqcddiv, .ckxqzddiv {
	position: fixed;
	top: 20%;
	left: 22.5%;
	padding: 20px;
	background: #f6f6f6;
	border-radius: 10%;
	box-shadow: 2px 2px 1px #888888;
	display: none;
}

.ckxqcddiv {
	top: 20%;
}

.ckxqzddiv {
	top: 0%;
}

.ckxqgsdiv>span, .ckxqcddiv>span, .ckxqzddiv>span {
	display: inline-block;
	position: absolute;
	right: 6%;
	top: -5px;
	cursor: pointer;
	font-size: 20px;
}

.ckxqgsdiv>span:hover, .ckxqcddiv>span:hover, .ckxqzddiv>span:hover {
	color: red;
}

.getckxqtop {
	position: fixed;
	width: 100%;
	height: 40%;
	top: 0;
	left: 0;
	display: none;
}

.getckxqbotton {
	position: fixed;
	width: 100%;
	height: 42%;
	bottom: 0px;
	left: 0;
	display: none;
}

.getckxqleft {
	position: fixed;
	width: 65%;
	height: 100%;
	top: 0;
	left: 0;
	display: none;
}

.getckxqright {
	position: fixed;
	width: 10%;
	height: 100%;
	top: 0;
	right: 0;
	display: none;
}
</style>
</head>

<body>
	<div id="header">
		<div class="logo">征启后台管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a> <c:if test="${log.op_privilege==0}">前台</c:if> <c:if
							test="${log.op_privilege==1}">财务</c:if> <c:if
							test="${log.op_privilege==2}">管理员</c:if>
				</a></li>
				<li><a class="updoppass">修改密码</a></li>
				<li><a class="lock">锁定</a></li>
				<li><a class="exit">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="lockdiv">
			<button class="deblocking">解锁</button>
			<div class="dellock">
				<form class="dellockf">
					<table>
						<tr>
							<td>用户名</td>
							<td><input type="text" name="dellockname"
								class="dellockname" readonly="readonly" /></td>
						</tr>
						<tr>
							<td>密码</td>
							<td><input type="password" name="dellockpass"
								class="dellockpass" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="button" class="dellocksubmit"
								value="解锁" /><input type="button" class="dellockcolse"
								value="取消" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>酒店首页
					</h4>
					<div class="list-item none">
						<a href="http://locahost:8080/hotel/home/html/index.jsp"
							target="_blank">酒店首页</a> <a
							href="http://locahost:8080/hotel/home/html/gallery.jsp"
							target="_blank">酒店一景</a> <a
							href="http://locahost:8080/hotel/home/html/about.jsp"
							target="_blank">关于我们</a> <a
							href="http://locahost:8080/hotel/home/html/contact.jsp"
							target="_blank">联系我们</a>

					</div>
				</li>
				<li>
					<h4 class="M2">
						<span></span>入住管理
					</h4>
					<div class="list-item none">
						<a class="behindset_01">查询房间</a> <a class="behindset_02">申请退房</a>
						<a class="behindset_03">房间类型</a>

					</div>
				</li>
				<li>
					<h4 class="M3">
						<span></span>信息查询
					</h4>
					<div class="list-item none">
						<a class="infofind_01">登记查询</a> <a class="infofind_02">会员查询</a>
					</div>
				</li>
				<li>
					<h4 class="M4">
						<span></span>楼层管理
					</h4>
					<div class="list-item none">
						<a class="roomset_01">客房类型</a> <a class="roomset_02">客房详情</a>
					</div>
				</li>
				<li>
					<h4 class="M5">
						<span></span>后台设置
					</h4>
					<div class="list-item none">
						<a class="roommanage_01">操作员管理</a> <a class="roommanage_02">退款审核</a>
						<a class="roommanage_03">发票查询</a>
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
				<ul>
					<li><img src="images/home.png" class="home" style="top: 2px"></li>
					<li style="margin-left: 25px;">您当前的位置：</li>
					<li><a class="home">首页</a></li>
				</ul>
			</div>
			<div class="main">
				<video width="800px" height="" loop="loop"> <source
					src="img/20160903082432011330686_1_06400360_201835143746.mp4"
					type="video/mp4"></source> </video>
				<div class="behindset_01div">
					<div>
						<img src="images/type.jpg" />
					</div>
					<div class="roomdiv">
						<ul class="roompicul" style="width: 900px;"></ul>
					</div>
					<div class="addrz">
						<form class="addrzf">
							<table>
								<tr>
									<th colspan="2">订单信息</th>
								</tr>
								<tr>
									<td>入住日期</td>
									<td><input type="text" name="rzcdindatetime" class="rzcdindatetime"
										onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})" /></td>
								</tr>
								<tr>
									<td>退房日期</td>
									<td><input type="text" name="rzcdoutdatetime" class="rzcdoutdatetime"
										onclick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})" /></td>
								</tr>
								<tr>
									<td>客房编号</td>
									<td><input type="text" width="50px" name="rzcdrmlid"
										class="rzcdrmlid" readonly="readonly" /><input type="hidden" name="rzoperator" class="rzoperator"></td>
								</tr>
								<tr>
									<td>客房类型</td>
									<td><input type="text" name="rzcdrml" class="rzcdrml" disabled="disabled"/></td>
								</tr>
								<tr>
									<td>每天预定价格(元)</td>
									<td><input type="text" name="rzcdprctrice"
										class="rzcdprctrice" disabled="disabled" /></td>
								</tr>
								<tr>
									<td>人员数目</td>
									<td><input type="text" name="rzcdmannumber"
										class="rzcdmannumber" /></td>
								</tr>
								<tr>
									<td>房间状态</td>
									<td><select name="rzcdstate" class="rzcdstate">
										<option value="0">入住</option>
										<option value="1">预定</option>
									</select></td>
								</tr>
								<tr>
									<th colspan="2">个人信息</th>
								</tr>
								<tr>
									<td>姓名</td>
									<td><input type="text" name="rzgsname" class="rzgsname" /></td>
								</tr>
								<tr>
									<td>性别</td>
									<td><select name="rzgsgtgender" class="rzgsgtgender">
											<option value="0">女</option>
											<option value="1" selected="selected">男</option>
									</select></td>
								</tr>
								<tr>
									<td>客户类型</td>
									<td><select name="rzgstpye" class="rzgstpye"></select></td>
								</tr>
								<tr>
									<td>客户类别</td>
									<td><select name="rzgsgory" class="rzgsgory"></select></td>
								</tr>
								<tr>
									<td>证件类型</td>
									<td><select name="rzgscardcatalog" class="rzgscardcatalog"></select></td>
								</tr>
								<tr>
									<td>身份证号码</td>
									<td><input type="text" name="rzgscardid"
										class="rzgscardid" /></td>
								</tr>
								<tr>
									<td>国籍</td>
									<td><select name="rzgsgtcountry" class="rzgsgtcountry"></select></td>
								</tr>
								<tr>
									<td>邮编</td>
									<td><input type="text" name="rzgsgtzip" class="rzgsgtzip" /></td>
								</tr>
								<tr>
									<td>手机号码</td>
									<td><input type="text" name="rzgsphone" class="rzgsphone" /></td>
								</tr>
								<tr>
									<td>地址</td>
									<td><input type="text" name="rzgsaddress"
										class="rzgsaddress" /></td>
								</tr>
								<tr>
									<td>Email地址</td>
									<td><input type="email" name="rzgsemail" class="rzgsemail" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" class="rzgssubmit"
										value="提交" /><input type="button" class="rzgsclose"
										value="取消" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<div class="behindset_02div">
					<div class="tuifang">
						<h2>申请退房</h2>
						<table class="tabletf" cellspacing="0" cellpadding="0"></table>
					</div>

					<form class="bmtff">
						<div class="bmtf">
							<table>
								<tr>
									<td>登记表编号</td>
									<td><input type="text" name="tfckid" class="tfckid"
										readonly="readonly" /><input type="hidden" name="tfgsid"
										class="tfgsid" /><input type="hidden" name="tfbmoperator"
										class="tfbmoperator" /></td>
								</tr>
								<tr>
									<td>订单编号</td>
									<td><input type="text" name="tfcdid" class="tfcdid"
										readonly="readonly" /></td>
								</tr>
								<tr>
									<td>房间编号</td>
									<td><input type="text" name="tfrmid" class="tfrmid"
										readonly="readonly" /></td>
								</tr>
								<tr>
									<td>入住时间</td>
									<td><input type="text" name="tfindatetime"
										class="tfindatetime" readonly="readonly" /></td>
								</tr>
								<tr>
									<td>每日实际价格(元)</td>
									<td><input type="text" name="tfprctprice"
										class="tfprctprice" readonly="readonly" /></td>
								</tr>
								<tr>
									<td>应收金额(元)</td>
									<td><input type="text" name="tftotalrate"
										class="tftotalrate" readonly="readonly" /></td>
								</tr>
								<tr>
									<td>已付押金(元)</td>
									<td><input type="text" name="tfpaidmoney"
										class="tfpaidmoney" readonly="readonly" /></td>
								</tr>
								<tr>
									<td>续收金额(元)</td>
									<td><input type="text" name="tfreceivmoney"
										class="tfreceivmoney" readonly="readonly" /></td>
								</tr>
								<tr>
									<td>支付类型</td>
									<td><select name="tfpupayment" class="tfpupayment"></select></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" class="tfsubmit"
										value="退房支付" /><input type="button" class="tfclose"
										value="取消" /><input type="button" class="tfaddtkxx"
										value="需退款" /><input type="button" class="tfaddfpxx"
										value="需发票" /></td>
								</tr>
							</table>
						</div>
						<div class="tfaddtkxxdiv">
							<table>
								<tr>
									<td>退款金额</td>
									<td><input type="text" name="tfbmrefund"
										class="tfbmrefund" /></td>
								</tr>
								<tr>
									<td>卡号</td>
									<td><input type="text" name="tfbmcardnumber"
										class="bmcardnumber" /></td>
								</tr>
								<tr>
									<td>持卡人姓名</td>
									<td><input type="text" name="tfbmcardname"
										class="tfbmcardname" /></td>
								</tr>
								<tr>
									<td>持卡人身份证</td>
									<td><input type="text" name="tfbmcardid"
										class="tfbmcardid" /></td>
								</tr>
								<tr>
									<td>持卡人手机号</td>
									<td><input type="text" name="tfbmcardphone"
										class="bmcardphone" /></td>
								</tr>
								<tr>
									<td>退款原因</td>
									<td><input type="text" name="tfbmremark"
										class="tfbmremark" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" class="tftksubmit"
										value="保存" /></td>
								</tr>
							</table>
						</div>
						<div class="tfaddfpxxdiv">
							<table>
								<tr>
									<td>需发票</td>
									<td>否<input type="radio" name="tfbmreceipt"
										class="tfbmreceipt" value="0" checked="checked" />是<input
										type="radio" name="tfbmreceipt" class="tfbmreceipt" value="1" /></td>
								</tr>
								<tr>
									<td>公司名称</td>
									<td><input type="text" name="tfbmcompany"
										class="tfbmcompany" /></td>
								</tr>
								<tr>
									<td>收件人手机号</td>
									<td><input type="text" name="tfbmphone" class="tfbmphone" /></td>
								</tr>
								<tr>
									<td>收票地址</td>
									<td><input type="text" name="tfbmaddress"
										class="tfbmaddress" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" class="tffpsubmit"
										value="保存" /></td>
								</tr>
							</table>
						</div>
					</form>
				</div>
				<div class="behindset_03div">
					<h2>房间类型</h2>
					<table class="tableckrml" cellpadding="0" cellspacing="0"></table>
				</div>
				<div class="infofind_01div">
					<div class="getck">
						<ul>
							<li style="position: fixed; top: 25%; left: 40%;"><input
								type="text" class="search" name="search"
								placeholder="请输入身份证号或订单号或登记单号或账单号" />
								<button class="getckvalue">查询</button></li>
						</ul>
						<table class="tableck" cellspacing="0" cellpadding="0">
						</table>
					</div>
					<div class="getckxq">
						<button class="ckxqgs">查看客户</button>
						<button class="ckxqcd">查看订单</button>
						<button class="ckxqzd">查看账单</button>
					</div>
					<div class="getckxqtop"></div>
					<div class="getckxqbotton"></div>
					<div class="getckxqleft"></div>
					<div class="getckxqright"></div>
					<div class="ckxqgsdiv">
						<span>×</span>
						<table>
							<tr>
								<td>姓名</td>
								<td></td>
							</tr>
							<tr>
								<td>性别</td>
								<td></td>
							</tr>
							<tr>
								<td>身份证号</td>
								<td></td>
							</tr>
							<tr>
								<td>手机号</td>
								<td></td>
							</tr>
							<tr>
								<td>固定电话</td>
								<td></td>
							</tr>
							<tr>
								<td>客户类型</td>
								<td></td>
							</tr>
							<tr>
								<td>客户类别</td>
								<td></td>
							</tr>
							<tr>
								<td>地址</td>
								<td></td>
							</tr>
							<tr>
								<td>邮编</td>
								<td></td>
							</tr>
							<tr>
								<td>公司单位</td>
								<td></td>
							</tr>
							<tr>
								<td>邮箱</td>
								<td></td>
							</tr>
							<tr>
								<td>创建时间</td>
								<td></td>
							</tr>
						</table>
					</div>
					<div class="ckxqcddiv">
						<span>×</span>
						<table>
							<tr>
								<td>入住登记订单编号</td>
								<td></td>
							</tr>
							<tr class="ckxqgs" style="cursor: pointer;">
								<td>客户姓名</td>
								<td></td>
							</tr>
							<tr>
								<td>登记状态</td>
								<td></td>
							</tr>
							<tr>
								<td>客户入住时间</td>
								<td></td>
							</tr>
							<tr>
								<td>预计离开时间</td>
								<td></td>
							</tr>
							<tr>
								<td>实际离开时间</td>
								<td></td>
							</tr>
							<tr>
								<td>支付类型</td>
								<td></td>
							</tr>
							<tr>
								<td>已付押金</td>
								<td></td>
							</tr>
							<tr>
								<td>是否预定</td>
								<td></td>
							</tr>
							<tr>
								<td>操作员</td>
								<td></td>
							</tr>
							<tr>
								<td>总费用</td>
								<td></td>
							</tr>
							<tr>
								<td>额外消费</td>
								<td></td>
							</tr>
							<tr>
								<td>额外消费详情</td>
								<td></td>
							</tr>
						</table>
					</div>
					<div class="ckxqzddiv">
						<span>×</span>
						<table>
							<tr>
								<td>账单编号</td>
								<td></td>
							</tr>
							<tr class="ckxqgs" style="cursor: pointer;">
								<td>客户姓名</td>
								<td></td>
							</tr>
							<tr>
								<td>支付类型</td>
								<td></td>
							</tr>
							<tr>
								<td>应收金额</td>
								<td></td>
							</tr>
							<tr>
								<td>已付押金</td>
								<td></td>
							</tr>
							<tr>
								<td>退款金额</td>
								<td></td>
							</tr>
							<tr>
								<td>退款状态</td>
								<td></td>
							</tr>
							<tr>
								<td>持卡人姓名</td>
								<td></td>
							</tr>
							<tr>
								<td>卡号</td>
								<td></td>
							</tr>
							<tr>
								<td>持卡人身份证号</td>
								<td></td>
							</tr>
							<tr>
								<td>持卡人手机号</td>
								<td></td>
							</tr>
							<tr>
								<td>是否开票</td>
								<td></td>
							</tr>
							<tr>
								<td>收件人手机号</td>
								<td></td>
							</tr>
							<tr>
								<td>收票地址</td>
								<td></td>
							</tr>
							<tr>
								<td>开票状态</td>
								<td></td>
							</tr>
							<tr>
								<td>操作员</td>
								<td></td>
							</tr>
							<tr>
								<td>创建时间</td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="infofind_02div">
					<div class="dengjifind">
						<h2>客户信息</h2>
						<table class="tablegs" cellspacing="0" cellpadding="0"></table>
					</div>
				</div>
				<div class="roomset_01div">
					<div id="addrml">
						<button class="addrml">+</button>
					</div>
					<div class="getrml">
						<h2>客房类型</h2>
						<table class="tablerml" cellpadding="0" cellspacing="0"></table>
					</div>
					<div class="rmlxg">
						<form class="rml">
							<table>
								<tr>
									<td>客房类型编号</td>
									<td><input type="text" name="rcid" class="rcid" readonly /></td>
								</tr>
								<tr>
									<td>客房类型名</td>
									<td><select name="rcname" class="rcname"></select></td>
								</tr>
								<tr>
									<td>床位数</td>
									<td><input type="text" name="rcbednumber"
										class="rcbednumber" /></td>
								</tr>
								<tr>
									<td>预定价格(元)</td>
									<td><input type="text" name="rcpreprice"
										class="rcpreprice" /></td>
								</tr>
								<tr>
									<td>预定折扣(元)</td>
									<td><input type="text" name="rcprediscount"
										class="rcprediscount" /></td>
								</tr>
								<tr>
									<td>计时最低价(元)</td>
									<td><input type="text" name="rchourbaseprice"
										class="rchourbaseprice" /></td>
								</tr>
								<tr>
									<td>计时每小时价(元)</td>
									<td><input type="text" name="rcperhourprice"
										class="rcperhourprice" />
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="rcsubmit"
										class="rcsubmit" value="保存修改" /><input type="button"
										name="rcclose" class="rcclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
					<div class="rmladd">
						<form class="addrmlf">
							<table>
								<tr>
									<td>客房类型编号</td>
									<td><input type="text" name="rcaddid" class="rcaddid"
										placeholder="不填写默认最大编号加一" /></td>
								</tr>
								<tr>
									<td>客房类型名</td>
									<td><input type="text" name="rcaddname" class="rcaddname" /></td>
								</tr>
								<tr>
									<td>床位数</td>
									<td><input type="text" name="rcaddbednumber"
										class="rcaddbednumber" /></td>
								</tr>
								<tr>
									<td>预定价格(元)</td>
									<td><input type="text" name="rcaddpreprice"
										class="rcaddpreprice" /></td>
								</tr>
								<tr>
									<td>预定折扣(元)</td>
									<td><input type="text" name="rcaddprediscount"
										class="rcaddprediscount" /></td>
								</tr>
								<tr>
									<td>计时最低价(元)</td>
									<td><input type="text" name="rcaddhourbaseprice"
										class="rcaddhourbaseprice" /></td>
								</tr>
								<tr>
									<td>计时每小时价(元)</td>
									<td><input type="text" name="rcaddperhourprice"
										class="rcaddperhourprice" />
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="rcaddsubmit"
										class="rcaddsubmit" value="新增" /><input type="button"
										name="rcaddclose" class="rcaddclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<div class="roomset_02div">
					<div class="getrm">
						<h2>客房信息</h2>
						<table class="tablerm" cellpadding="0" cellspacing="0"></table>
					</div>
					<div id="roomimgtop"></div>
					<div id="roomimgbotton"></div>
					<div id="roomimgleft"></div>
					<div id="roomimgright"></div>
					<div id="roomimg">
						<span class="roomover">×</span> <img class="roomimg" src="" />
					</div>
					<div id="addrm">
						<button class="addroom">+</button>
					</div>
					<div class="rmxg">
						<form class="rm">
							<table>
								<tr>
									<td>客房编号</td>
									<td><input type="text" name="rmid" class="rmid" readonly /></td>
								</tr>
								<tr>
									<td>所属区域</td>
									<td><input type="text" name="rmarea" class="rmarea" /></td>
								</tr>
								<tr>
									<td>所属楼层</td>
									<td><input type="text" name="rmfloor" class="rmfloor" /></td>
								</tr>
								<tr>
									<td>实际价格(元)</td>
									<td><input type="text" name="rmprctprice"
										class="rmprctprice" /></td>
								</tr>
								<tr>
									<td>折扣价格(元)</td>
									<td><input type="text" name="rmprctdiscount"
										class="rmprctdiscount" />
								</tr>
								<tr>
									<td>分机号码</td>
									<td><input type="text" name="rmphone" class="rmphone" /></td>
								</tr>
								<tr>
									<td>客房状态</td>
									<td><select name="rmstate" class="rmstate">
											<option value="0">空闲</option>
											<option value="1">已预订</option>
											<option value="2">已入住</option>
											<option value="3">维修中</option>
									</select></td>
								</tr>
								<tr>
									<td>房间类型</td>
									<td><select name="rmcatalog" class="rmcatalog"></select>
								</tr>
								<tr>
									<td>房间图片</td>
									<td><input type="file" name="rmpicture" class="rmpicture" /><input
										type="hidden" name="rmimgsrc" class="rmimgsrc" /></td>
								</tr>
								<tr>
									<td colspan="2"><img class="rmimg" alt="" src=""
										width="200px"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="rmsubmit"
										class="rmsubmit" value="保存修改" /><input type="button"
										name="rmclose" class="rmclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
					<div class="rmadd">
						<form class="addrmf">
							<table>
								<tr>
									<td>客房编号</td>
									<td><input type="text" name="rmaddid" class="rmaddid"
										placeholder="不填写默认最大编号加一" /></td>
								</tr>
								<tr>
									<td>所属区域</td>
									<td><input type="text" name="rmaddarea" class="rmaddarea" /></td>
								</tr>
								<tr>
									<td>所属楼层</td>
									<td><input type="text" name="rmaddfloor"
										class="rmaddfloor" /></td>
								</tr>
								<tr>
									<td>实际价格(元)</td>
									<td><input type="text" name="rmaddprctprice"
										class="rmaddprctprice" /></td>
								</tr>
								<tr>
									<td>折扣价格(元)</td>
									<td><input type="text" name="rmaddprctdiscount"
										class="rmaddprctdiscount" />
								</tr>
								<tr>
									<td>分机号码</td>
									<td><input type="text" name="rmaddphone"
										class="rmaddphone" /></td>
								</tr>
								<tr>
									<td>客房状态</td>
									<td><select name="rmaddstate" class="rmaddstate">
											<option value="0">空闲</option>
											<option value="1">已预订</option>
											<option value="2">已入住</option>
											<option value="3">维修中</option>
									</select></td>
								</tr>
								<tr>
									<td>房间类型</td>
									<td><select name="rmaddcatalog" class="rmaddcatalog"></select>
								</tr>
								<tr>
									<td>房间图片</td>
									<td><input type="file" name="rmaddpicture"
										class="rmaddpicture" /><input type="hidden"
										name="rmaddimgsrc" class="rmaddimgsrc" /></td>
								</tr>
								<tr>
									<td colspan="2" width="200px"><img class="rmaddimg"
										alt="等待上传" src="" width="200px"></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="rmaddsubmit"
										class="rmaddsubmit" value="新增" /><input type="button"
										name="rmaddclose" class="rmaddclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<div class="roommanage_01div">
					<div class="operatorDiv">
						<h2>操作员管理</h2>
						<table class="tables" cellspacing="0" cellpadding="0"></table>
					</div>
					<div id="addop">
						<button class="addop">+</button>
					</div>
					<div class="opxg">
						<form class="op">
							<table>
								<tr>
									<td>用户名</td>
									<td><input type="text" name="opuser" class="opuser"
										readonly /></td>
								</tr>
								<tr>
									<td>密码</td>
									<td><input type="password" name="oppass" class="oppass" /></td>
								</tr>
								<tr>
									<td>身份</td>
									<td><select name="oppge" class="oppge">
											<option value="0">前台</option>
											<option value="1">财务</option>
											<option value="2">管理员</option>
									</select></td>
								</tr>
								<tr>
									<td>地址</td>
									<td><input type="text" name="opaddress" class="opaddress" /></td>
								</tr>
								<tr>
									<td>姓名</td>
									<td><input type="text" name="opname" class="opname"
										disabled="disabled" /></td>
								</tr>
								<tr>
									<td>手机号</td>
									<td><input type="text" name="opphone" class="opphone" /></td>
								</tr>
								<tr>
									<td>固定电话</td>
									<td><input type="text" name="opmobile" class="opmobile" />
								</tr>
								<tr>
									<td>邮编</td>
									<td><input type="text" name="opzip" class="opzip" />
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="opsubmit"
										class="opsubmit" value="保存修改" /><input type="button"
										name="opclose" class="opclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
					<div class="opadd">
						<form class="addopf">
							<table>
								<tr>
									<td>用户名</td>
									<td><input type="text" name="opadduser" class="opadduser" /></td>
								</tr>
								<tr>
									<td>密码</td>
									<td><input type="password" name="opaddpass"
										class="opaddpass" /></td>
								</tr>
								<tr>
									<td>校验密码</td>
									<td><input type="password" name="opaddpassx"
										class="opaddpassx" /></td>
								</tr>
								<tr>
									<td>身份</td>
									<td><select name="opaddpge" class="opaddpge">
											<option value="0">前台</option>
											<option value="1">财务</option>
											<option value="2">管理员</option>
									</select></td>
								</tr>
								<tr>
									<td>地址</td>
									<td><input type="text" name="opaddaddress"
										class="opaddaddress" /></td>
								</tr>
								<tr>
									<td>姓名</td>
									<td><input type="text" name="opaddname" class="opaddname" /></td>
								</tr>
								<tr>
									<td>手机号</td>
									<td><input type="text" name="opaddphone"
										class="opaddphone" /></td>
								</tr>
								<tr>
									<td>固定电话</td>
									<td><input type="text" name="opaddmobile"
										class="opaddmobile" />
								</tr>
								<tr>
									<td>邮编</td>
									<td><input type="text" name="opaddzip" class="opaddzip" />
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="opaddsubmit"
										class="opaddsubmit" value="新增" /><input type="button"
										name="opaddclose" class="opaddclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<div class="roommanage_02div">
					<div class="tksh">
						<h2>退款审核</h2>
						<table class="tablers" cellpadding="0" cellspacing="0"></table>
					</div>
					<div class="tkxg">
						<form class="tk">
							<table>
								<tr>
									<td>账单编号</td>
									<td><input type="text" name="tkbmid" class="tkbmid"
										readonly /></td>
								</tr>
								<tr>
									<td>退款金额</td>
									<td><input type="text" name="tkmoney" class="tkmoney" /></td>
								</tr>
								<tr>
									<td>持卡人姓名</td>
									<td><input type="text" name="tkcardname"
										class="tkcardname" /></td>
								</tr>
								<tr>
									<td>卡号</td>
									<td><input type="text" name="tkcardnumber"
										class="tkcardnumber" disabled /></td>
								</tr>
								<tr>
									<td>持卡人身份证号</td>
									<td><input type="text" name="tkcardid" class="tkcardid" /></td>
								</tr>
								<tr>
									<td>持卡人手机号</td>
									<td><input type="text" name="tkphone" class="tkphone" /></td>
								</tr>
								<tr>
									<td>退款状态</td>
									<td>未退款<input type="radio" name="tkstate" class="tkstate1"
										checked value="0" />已退款<input type="radio" name="tkstate"
										class="tkstate2" value="1" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="tksubmit"
										class="tksubmit" value="保存修改" /><input type="button"
										name="tkclose" class="tkclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<div class="roommanage_03div">
					<div class="fpcx">
						<h2>发票查询</h2>
						<table class="tablerp" cellpadding="0" cellspacing="0"></table>
					</div>
					<div class="fpxg">
						<form class="fp">
							<table>
								<tr>
									<td>账单编号</td>
									<td><input type="text" name="fpbmid" class="fpbmid"
										readonly /></td>
								</tr>
								<tr>
									<td>收件人</td>
									<td><input type="text" name="fpname" class="fpname"
										disabled /></td>
								</tr>
								<tr>
									<td>公司名称</td>
									<td><input type="text" name="fpcorporate"
										class="fpcorporate" /></td>
								</tr>
								<tr>
									<td>手机号</td>
									<td><input type="text" name="fpphone" class="fpphone" /></td>
								</tr>
								<tr>
									<td>邮寄地址</td>
									<td><input type="text" name="fpaddress" class="fpaddress"
										placeholder="邮寄店址格式:省-市-县-镇" /></td>
								</tr>
								<tr>
									<td>开票状态</td>
									<td>未开票<input type="radio" name="fpstate" class="fpstate1"
										checked value="0" />已开票<input type="radio" name="fpstate"
										class="fpstate2" value="1" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" name="fpsubmit"
										class="fpsubmit" value="保存修改" /><input type="button"
										name="fpclose" class="fpclose" value="关闭" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
				<!-- 修改密码 -->
				<div class="liftroommanagediv">
					<div class="jurisdictionDiv">
						<form class="oppassf">
							<table cellpadding="0" cellspacing="0">
								<tr>
									<td>用户名</td>
									<td><input type="text" name="oppassname"
										class="oppassname" readonly="readonly" /></td>
								</tr>
								<tr>
									<td>旧密码</td>
									<td><input type="password" name="opoldpassword"
										class="opoldpassword" /></td>
								</tr>
								<tr>
									<td>新密码</td>
									<td><input type="password" name="opnewpassword"
										class="opnewpassword" /></td>
								</tr>
								<tr>
									<td>确认密码</td>
									<td><input type="password" name="opnewpasswordx"
										class="opnewpasswordx" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" class="oppasssubmit" /><input
										type="button" class="oppasscolse" /></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<p>版权所有，仿冒必究</p>
	</div>
	<script>
		navList(5);
		var opstate = "${log.op_privilege}";
		var logopname = "${log.op_userName}";
		var logoppass = "${log.op_passWord}";
		var logopnamex = "${log.op_name}";
	<%String money = request.getParameter("trade_no");
			String moneyx = (String) session.getAttribute("money");
			if (money != "" && money != null && moneyx != "" && moneyx != null) {
				if (money == moneyx) {
					out.print("getallck();");

				}
			}%>
		if ("${log.op_privilege}" == "0") {
			$("#nav_dot li:last-child").remove();
			$("#nav_dot li:last-child").remove();
		}
		if ("${log.op_privilege}" == "1") {
			$("#nav_dot li:nth-child(2)").remove();
			$("#nav_dot li:nth-child(3)").remove();
			$("#nav_dot li .roommanage_01").remove();
		}
		$("video").trigger("play");
		//查询入住
		$(".behindset_01").click(function() {
			getckrm();
		})
		//退房
		$(".behindset_02").click(function() {
			getcktf();
		})
		//房间类型
		$(".behindset_03").click(function() {
			getckrml();
		})
		//登记查询
		$(".infofind_01").click(function() {
			getallck();
		})
		//客户信息
		$(".infofind_02").click(function() {
			getallgs();
		})
		//客房类型
		$(".roomset_01").click(function() {
			getallrml(opstate);
		})
		//客房信息
		$(".roomset_02").click(function() {
			getallrm(opstate);
		})
		//操作员管理
		$(".roommanage_01").click(function() {
			getallop(opstate);
		})
		//退款
		$(".roommanage_02").click(function() {
			getcktk();
		})
		//发票
		$(".roommanage_03").click(function() {
			getckfp();
		})
		//查询入住位置
		$(".right-nav>ul").on("click", ".behindset_01a", function() {
			getckrma();
		})
		//退款位置
		$(".right-nav>ul").on("click", ".behindset_02a", function() {
			getcktka();
		})
		//查询房间类型位置
		$(".right-nav>ul").on("click", ".behindset_03a", function() {
			getckrmla();
		})
		//登记查询位置
		$(".right-nav>ul").on("click", ".infofind_01a", function() {
			getallcka();
		})
		//客户信息位置
		$(".right-nav>ul").on("click", ".infofind_02a", function() {
			getallgsa();
		})
		//查询房间类型位置
		$(".right-nav>ul").on("click", ".roomset_01a", function() {
			getallrmla(opstate);
		})
		//查询房间信息位置
		$(".right-nav>ul").on("click", ".roomset_02a", function() {
			getallrma(opstate);
		})
		//查询操作员位置 
		$(".right-nav>ul").on("click", ".roommanage_01a", function() {
			getallopa(opstate);
		})
		//查询退款位置
		$(".right-nav>ul").on("click", ".roommanage_02a", function() {
			getcktfa();
		})
		//查询发票位置
		$(".right-nav>ul").on("click", ".roommanage_03a", function() {
			getckfpa();
		})
		//停用/启用客房类型
		$(".tablerml").on("click", ".delrml", function() {
			var rmlid = $(this).parent().siblings("td:first").text();
			var txt = $(this).val();
			if (txt == "停止入住") {
				stoprml(rmlid, opstate);
			} else {
				startrml(rmlid, opstate);
			}

		})
		//停用/启用客房信息
		$(".tablerm").on("click", ".delrm", function() {
			var rmid = $(this).parent().siblings("td:first").text();
			var txt = $(this).val();
			if (txt == "停止入住") {
				stoprm(rmid, opstate);
			} else {
				startrm(rmid, opstate);
			}

		})
		//停用/启用操作员
		$(".tables").on("click", ".delop", function() {
			var updname = $(this).parent().siblings("td:first").text();
			var txt = $(this).val();
			if (txt == "停止") {
				stopop(updname, opstate);
			} else {
				startop(updname, opstate);
			}

		})

		//操作员修改个人密码
		$(".updoppass").click(function() {
			$(".jurisdictionDiv input").val("");
			$(".jurisdictionDiv .oppasssubmit").val("保存更改");
			$(".jurisdictionDiv .oppasscolse").val("关闭");
			$(".jurisdictionDiv .oppassname").val(logopname);
			$(".jurisdictionDiv").show();
			$(".liftroommanagediv").show();

		})
		$(".oppasssubmit").click(function() {
			var name = $(".jurisdictionDiv .oppassname").val();
			var pass = $(".jurisdictionDiv .opoldpassword").val();
			var newpass = $(".jurisdictionDiv .opnewpassword").val();
			var newpassx = $(".jurisdictionDiv .opnewpasswordx").val();
			if (logopname == name) {
				if (logoppass == pass) {
					if (newpass == newpassx) {
						var oppass = $(".oppassf").serialize();
						oppassupdpass(oppass, opstate);
					} else {
						alert("两次输入密码相同");
					}
				} else {
					alert("旧密码输入错误!");
				}
			} else {
				alert("不要皮!用户名不能被修改！");
			}
			$(".jurisdictionDiv").hide();
			$(".liftroommanagediv").hide();
		})
		$(".oppasscolse").click(function() {
			$(".jurisdictionDiv").hide();
			$(".liftroommanagediv").hide();
		})
		//首页位置
		$(".right-nav>ul").on("click", ".home", function() {
			$("video").trigger("play");
			$("#nav_dot li").find(".list-item").slideUp(600);
			$("#nav_dot li").removeClass("selected");
			$("#nav_dot li").removeClass("selected");
			$("video").show();
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
			//新增位置
			var fuhao = document.createElement("li");
			var weizhili = document.createElement("li");
			var weizhia = document.createElement("a");
			weizhia.className = "home";
			weizhia.append("首页");
			fuhao.append(">");
			weizhili.append(weizhia);
			$(".right-nav>ul").append(fuhao);
			$(".right-nav>ul").append(weizhili);
			if ($(".right-nav>ul>li").length == 25) {
				$(".right-nav>ul>li:eq(4)").next().remove();
				$(".right-nav>ul>li:eq(4)").next().remove();
			}
		})
		//退出
		$(".exit")
				.click(
						function() {
							window.location = "http://locahost:8080/hotel/home/log.do?c=returnHome";
						});
		//客房图片
		$("table").on("click", ".getimg", function() {
			var srcimg = $(this).next().val();
			$(".roomimg").attr("src", srcimg)
			$("#roomimg").fadeIn();
			$("#roomimgtop").show();
			$("#roomimgbotton").show();
			$("#roomimgleft").show();
			$("#roomimgright").show();
		})
		$(".roomover").click(function() {
			hidermimg();
		})
		$("#roomimgtop").click(function() {
			hidermimg();
		})
		$("#roomimgbotton").click(function() {
			hidermimg();
		})
		$("#roomimgleft").click(function() {
			hidermimg();
		})
		$("#roomimgright").click(function() {
			hidermimg();
		})
		//table样式
		$("div>table:nth-of-type(1)").on("mouseover", "tr", function() {
			$(this).addClass("over");
		})
		$("div>table:nth-of-type(1)").on("mouseout", "tr", function() {
			$(this).removeClass("over");
		})
		//修改发票
		var fpid = "";
		$(".tablerp").on("click", ".updrp", function() {
			fpid = $(this).parent().siblings().eq(0).text();
			var name = $(this).parent().siblings().eq(8).text();
			var com = $(this).parent().siblings().eq(9).text();
			var phone = $(this).parent().siblings().eq(10).text();
			var address = $(this).parent().siblings().eq(11).text();
			var fpstate = $(this).parent().siblings().eq(12).text();
			$(".fpbmid").val(fpid);
			$(".fpname").val(name);
			$(".fpcorporate").val(com);
			$(".fpphone").val(phone);
			$(".fpaddress").val(address);
			if (fpstate != "未开") {
				$(".fpstate1").removeAttr("checked");
				$(".fpstate2").attr("checked", "checked");
			}
			$(".fpbmid").attr("readonly", "readonly");
			$(".fpname").attr("disabled", "disabled");
			$(".fpxg").show();
		})
		$(".fpsubmit").click(function() {
			var bmid = $(".fpbmid").val();
			if (fpid == bmid) {
				var bmfp = $(".fp").serialize();
				updbmrp(bmfp, opstate);
				$(".fpxg").hide();
			} else {
				alert("不要皮！账单编号不可被修改!");
				$(".fpxg").hide();
			}
		})

		$(".fpxg .fp .fpclose").click(function() {
			$(".fpxg").hide();
		})

		//修改退款
		var tkid = "";
		var cardnumber = "";
		$(".tablers").on("click", ".updrs", function() {
			tkid = $(this).parent().siblings().eq(0).text();
			var money = $(this).parent().siblings().eq(8).text();
			var tkstate = $(this).parent().siblings().eq(9).text();
			var name = $(this).parent().siblings().eq(10).text();
			cardnumber = $(this).parent().siblings().eq(11).text();
			var cardid = $(this).parent().siblings().eq(12).text();
			var cardphone = $(this).parent().siblings().eq(13).text();
			$(".tkbmid").val(tkid);
			$(".tkmoney").val(money);
			$(".tkcardname").val(name);
			$(".tkcardnumber").val(cardnumber);
			$(".tkcardid").val(cardid);
			$(".tkphone").val(cardphone);
			if (tkstate != "未退款") {
				$(".tkstate1").removeAttr("checked");
				$(".tkstate2").attr("checked", "checked");
			}
			$(".tkbmid").attr("readonly", "readonly");
			$(".tkcardnumber").attr("disabled", "disabled");
			$(".tkxg").show();
		})
		$(".tksubmit").click(function() {
			var bmid = $(".tkbmid").val();
			var tkcardnumber = $(".tkcardnumber").val();
			if (tkid == bmid) {
				if (cardnumber == tkcardnumber) {
					var bmfp = $(".tk").serialize();
					updbmrs(bmfp, opstate);
					$(".tkxg").hide();
				} else {
					alert("不要皮！退款卡号不可修改!");
					$(".tkxg").hide();
				}
			} else {
				alert("不要皮！账单编号不可修改!");
				$(".tkxg").hide();
			}
		})

		$(".tkxg .tk .tkclose").click(function() {
			$(".tkxg").hide();
		})
		$(".tksubmit").click(function() {
			var bmid = $(".tkbmid").val();
			var tkcardnumber = $(".tkcardnumber").val();
			if (tkid == bmid) {
				if (cardnumber == tkcardnumber) {
					var bmfp = $(".tk").serialize();
					updbmrs(bmfp, opstate);
					$(".tkxg").hide();
				} else {
					alert("不要皮！退款卡号不可修改!");
					$(".tkxg").hide();
				}
			} else {
				alert("不要皮！账单编号不可修改!");
				$(".tkxg").hide();
			}
		})

		$(".tkxg .tk .tkclose").click(function() {
			$(".tkxg").hide();
		})
		//修改操作员
		var opuser = "";
		$(".tables").on("click", ".updop", function() {
			opuser = $(this).parent().siblings().eq(0).text();
			var oppass = $(this).parent().siblings().eq(1).text();
			var opprivilege = $(this).parent().siblings().eq(2).text();
			var opaddress = $(this).parent().siblings().eq(3).text();
			var opname = $(this).parent().siblings().eq(4).text();
			var opphone = $(this).parent().siblings().eq(5).text();
			var opmobile = $(this).parent().siblings().eq(6).text();
			var opzip = $(this).parent().siblings().eq(7).text();
			$(".opuser").val(opuser);
			$(".oppass").val(oppass);
			if (opprivilege == "前台") {
				$(".oppge option:nth-child(3)").removeAttr("selected");
				$(".oppge option:nth-child(2)").removeAttr("selected");
				$(".oppge option:nth-child(1)").attr("selected", "selected");

			}
			if (opprivilege == "财务") {
				$(".oppge option:nth-child(3)").removeAttr("selected");
				$(".oppge option:nth-child(1)").removeAttr("selected");
				$(".oppge option:nth-child(2)").attr("selected", "selected");
			}
			if (opprivilege == "管理员") {
				$(".oppge option:nth-child(1)").removeAttr("selected");
				$(".oppge option:nth-child(2)").removeAttr("selected");
				$(".oppge option:nth-child(3)").attr("selected", "selected");
			}
			$(".opprivilege").val(opprivilege);
			$(".opaddress").val(opaddress);
			$(".opname").val(opname);
			$(".opphone").val(opphone);
			$(".opmobile").val(opmobile);
			$(".opzip").val(opzip);
			$(".opxg").show();
		})
		$(".opxg .op .opclose").click(function() {
			$(".opxg").hide();
		})
		$(".opsubmit").click(function() {
			var opuserx = $(".opuser").val();
			if (opuser == opuserx) {
				var op = $(".op").serialize();
				updop(op, opstate);
				$(".opxg").hide();
			} else {
				alert("不要皮！账户名不可修改!");
				$(".opxg").hide();
			}
		})
		//新增操作员
		$(".addop").click(function() {
			$(".addopf input").val("");
			$(".addopf .opaddsubmit").val("新增");
			$(".addopf .opaddclose").val("关闭");
			$(".opadd").show();
		})
		$(".opadd .addopf .opaddclose").click(function() {
			$(".opadd").hide();
		})
		$(".opaddsubmit").click(function() {
			var pass = $(".opaddpass").val();
			var passx = $(".opaddpassx").val();
			if (pass == passx) {
				var op = $(".addopf").serialize();
				addop(op, opstate);
				$(".opadd").hide();
			} else {
				alert("校验密码失败！\n密码不一样！");
			}
		})
		//修改客房信息
		$(".rmpicture").change(function() {
			if (window.FileReader) {
				var fr = new FileReader();
				fr.readAsDataURL(this.files[0]);
				fr.onloadend = function(e) {
					$(".rmimg").attr("src", e.target.result);
					$.ajax({
						url : "imgupload",
						type : "post",
						async : true,
						data : "imagedata=" + e.target.result,
						success : function(res) {
							$(".rmimgsrc").val(res);
							alert("上传成功!");
						}
					});
				}
			} else {
				alert("浏览器不支持");
			}
		})
		var rmid = "";
		$(".tablerm").on("click", ".updrm", function() {
			rmid = $(this).parent().siblings().eq(0).text();
			var rmarea = $(this).parent().siblings().eq(1).text();
			var rmfloor = $(this).parent().siblings().eq(2).text();
			var rmprctprice = $(this).parent().siblings().eq(3).text();
			var rmphone = $(this).parent().siblings().eq(4).text();
			var rmstate = $(this).parent().siblings().eq(5).text();
			var rmavailable = $(this).parent().siblings().eq(6).text();
			var rmcatalog = $(this).parent().siblings().eq(7).text();
			var rmprctdiscount = $(this).parent().siblings().eq(8).text();
			var rmpicture = $(this).prev().val();
			$(".rmid").val(rmid);
			$(".rmarea").val(rmarea);
			$(".rmfloor").val(rmfloor);
			$(".rmprctprice").val(rmprctprice);
			$(".rmphone").val(rmphone);
			if (rmstate == "空闲") {
				$(".rmstate option:nth-child(2)").removeAttr("selected");
				$(".rmstate option:nth-child(3)").removeAttr("selected");
				$(".rmstate option:nth-child(4)").removeAttr("selected");
				$(".rmstate option:nth-child(1)").attr("selected", "selected");
			}
			if (rmstate == "已预订") {
				$(".rmstate option:nth-child(3)").removeAttr("selected");
				$(".rmstate option:nth-child(4)").removeAttr("selected");
				$(".rmstate option:nth-child(1)").removeAttr("selected");
				$(".rmstate option:nth-child(2)").attr("selected", "selected");
			}
			if (rmstate == "已入住") {
				$(".rmstate option:nth-child(4)").removeAttr("selected");
				$(".rmstate option:nth-child(1)").removeAttr("selected");
				$(".rmstate option:nth-child(2)").removeAttr("selected");
				$(".rmstate option:nth-child(3)").attr("selected", "selected");
			}
			if (rmstate == "维修中") {
				$(".rmstate option:nth-child(1)").removeAttr("selected");
				$(".rmstate option:nth-child(2)").removeAttr("selected");
				$(".rmstate option:nth-child(3)").removeAttr("selected");
				$(".rmstate option:nth-child(4)").attr("selected", "selected");
			}
			$(".rmprctdiscount").val(rmprctdiscount);
			$(".rmimg").attr("src", rmpicture)
			$.ajax({
				"url" : "tb_roomcatalog.do?c=getAllTb_roomcatalog",
				"type" : "post",
				"success" : function(res) {
					var array = jQuery.parseJSON(res);
					for (var i = 0; i < array.length; i++) {
						var option = document.createElement("option");
						option.value = array[i].rc_id;
						option.append(array[i].rc_name);
						if (array[i].rc_name == rmcatalog) {
							$(option).attr("selected", "selected");
						}
						$(".rmcatalog").append(option);
					}
				}
			})
			$(".rmxg").show();
		})
		$(".rmxg .rm .rmclose").click(function() {
			$(".rmxg").hide();
		})
		$(".rmsubmit").click(function() {
			var rmidx = $(".rmid").val();
			if (rmid == rmidx) {
				var rm = $(".rm").serialize();
				updrm(rm, opstate);
				$(".rmxg").hide();
			} else {
				alert("不要皮！客房编号不可修改!");
				$(".rmxg").hide();
			}
		})
		//新增客房信息
		$(".rmaddpicture").change(function() {
			if (window.FileReader) {
				var fr = new FileReader();
				fr.readAsDataURL(this.files[0]);
				fr.onloadend = function(e) {
					$(".rmaddimg").attr("src", e.target.result);
					$.ajax({
						url : "imgupload",
						type : "post",
						async : true,
						data : "imagedata=" + e.target.result,
						success : function(res) {
							$(".rmaddimgsrc").val(res);
							alert("上传成功!");
						}
					});
				}
			} else {
				alert("浏览器不支持");
			}
		})
		$(".addroom").click(function() {
			$(".addrmf input").val("");
			$(".addrmf .rmaddsubmit").val("新增");
			$(".addrmf .rmaddclose").val("关闭");
			$(".addrmf .rmaddcatalog").html("");
			$.ajax({
				"url" : "tb_roomcatalog.do?c=getAllTb_roomcatalog",
				"type" : "post",
				"success" : function(res) {
					var array = jQuery.parseJSON(res);
					for (var i = 0; i < array.length; i++) {
						var option = document.createElement("option");
						option.value = array[i].rc_id;
						option.append(array[i].rc_name);
						$(".rmaddcatalog").append(option);
					}
				}
			})
			$(".rmadd").show();
		})
		$(".rmadd .addrmf .rmaddclose").click(function() {
			$(".rmadd").hide();
		})
		$(".rmaddsubmit").click(function() {
			var rm = $(".addrmf").serialize();
			addrm(rm, opstate);
			$(".rmadd").hide();
		})
		//修改房间类型
		var rcid = "";
		$(".tablerml").on("click", ".updrml", function() {
			rcid = $(this).parent().siblings().eq(0).text();
			var rcname = $(this).parent().siblings().eq(1).text();
			var rcbednumber = $(this).parent().siblings().eq(2).text();
			var rcpreprice = $(this).parent().siblings().eq(3).text();
			var rcprediscount = $(this).parent().siblings().eq(4).text();
			var rchourbaseprice = $(this).parent().siblings().eq(5).text();
			var rcperhourprice = $(this).parent().siblings().eq(6).text();
			$(".rcid").val(rcid);
			$(".rcbednumber").val(rcbednumber);
			$(".rcpreprice").val(rcpreprice);
			$(".rcprediscount").val(rcprediscount);
			$(".rchourbaseprice").val(rchourbaseprice);
			$(".rcperhourprice").val(rcperhourprice);
			$.ajax({
				"url" : "tb_roomcatalog.do?c=getAllTb_roomcatalog",
				"type" : "post",
				"success" : function(res) {
					var array = jQuery.parseJSON(res);
					for (var i = 0; i < array.length; i++) {
						var option = document.createElement("option");
						option.append(array[i].rc_name);
						if (array[i].rc_name == rcname) {
							$(option).attr("selected", "selected");
						}
						$(".rcname").append(option);
					}
				}
			})
			$(".rmlxg").show();
		})
		$(".rmlxg .rml .rcclose").click(function() {
			$(".rmlxg").hide();
		})
		$(".rcsubmit").click(function() {
			var rcidx = $(".rcid").val();
			if (rcid == rcidx) {
				var rml = $(".rml").serialize();
				updrml(rml, opstate);
				$(".rmlxg").hide();
			} else {
				alert("不要皮！客房编号不可修改!");
				$(".rmlxg").hide();
			}
		})
		//新增房间类型
		$(".addrml").click(function() {
			$(".addrmlf input").val("");
			$(".addrmlf .rcaddsubmit").val("新增");
			$(".addrmlf .rcaddclose").val("关闭");
			$(".rmladd").show();
		})
		$(".rmladd .addrmlf .rcaddclose").click(function() {
			$(".rmladd").hide();
		})
		$(".rcaddsubmit").click(function() {
			var rml = $(".addrmlf").serialize();
			addrml(rml, opstate);
			$(".rmladd").hide();
		})
		//模糊搜索
		$(".getckvalue").click(function() {
			var value = $(".search").val();
			mhck(value);
		})

		//锁定
		$(".lock").click(function() {
			$(".dellockname").val(logopname);
			lock();
		})
		//解锁
		$(".deblocking").click(function() {
			$(".dellock .dellockpass").val("");
			$(".dellock").show();
		})
		$(".dellocksubmit").click(function() {
			var dellockop = $(".dellockf").serialize();
			dellock(dellockop);
			$(".dellock").hide();
		})
		$(".dellockcolse").click(function() {
			$(".dellock").hide();
		})
		//登记查询查看详情
		var cardid;
		var cdid;
		$(".tableck").on("click", ".getallck", function() {
			cardid = $(this).parent().siblings().eq(9).text();
			cdid = $(this).parent().siblings().eq(1).text();
			$(".getckxq table tr td:nth-child(2)").text("");
			$(".getckxq").show();
			$(".getckxqtop").show();
			$(".getckxqbotton").show();
			$(".getckxqleft").show();
			$(".getckxqright").show();
		})
		$(".getckxqright").click(function() {
			ckcxhide();
		})
		$(".getckxqtop").click(function() {
			ckcxhide();
		})
		$(".getckxqbotton").click(function() {
			ckcxhide();
		})
		$(".getckxqleft").click(function() {
			ckcxhide();
		})
		//登记客户查询
		$(".ckxqgs").click(function() {
			$(".ckxqgsdiv table tr td:nth-child(2)").text("");
			ckcardgs(cardid);

		})
		//登记订单查询
		$(".ckxqcd").click(function() {
			$(".ckxqcddiv table tr td:nth-child(2)").text("");
			ckcdcd(cdid);

		})
		//登记账单查询
		$(".ckxqzd").click(function() {
			$(".ckxqzddiv table tr td:nth-child(2)").text("");
			ckcdbm(cdid);
		})
		//登记账单关闭
		$(".ckxqzddiv span").click(function() {
			$(".ckxqzddiv").hide();
		})
		//登记客户关闭
		$(".ckxqgsdiv span").click(function() {
			$(".ckxqgsdiv").hide();

		})
		//登记订单关闭
		$(".ckxqcddiv span").click(function() {
			$(".ckxqcddiv").hide();
		})

		//退房
		$(".tabletf").on("click", ".cktf", function() {
			var tfckid = $(this).parent().siblings().eq(0).text();
			var tfcdid = $(this).parent().siblings().eq(1).text();
			var tfrmid = $(this).parent().siblings().eq(2).text();
			$(".bmtf .tfckid").val(tfckid);
			$(".bmtf .tfcdid").val(tfcdid);
			$(".bmtf .tfrmid").val(tfrmid);
			$(".bmtf .tfbmoperator").val(logopnamex);
			gettf(tfcdid, tfrmid);
			$.ajax({
				"url" : "tb_pupaymenttype.do?c=getAllTb_pupaymenttype",
				"type" : "post",
				"datatype" : "JSON",
				"success" : function(res) {
					var array = jQuery.parseJSON(res);
					for (var i = 0; i < array.length; i++) {
						var option = document.createElement("option");
						option.value = array[i].ppt_id;
						option.append(array[i].ppt_guestTypeName);
						if (array[i].ppt_guestTypeName == "未支付") {
							$(option).attr("selected", "selected");
						}
						$(".tfpupayment").append(option);
					}
				}
			})
		})
		$(".tfaddfpxx").click(function() {
			$(".tfaddtkxxdiv").hide();
			$(".tfaddfpxxdiv").show();

		})
		$(".tffpsubmit").click(function() {
			$(".tfaddfpxxdiv").hide();

		})
		$(".tfaddtkxx").click(function() {
			$(".tfaddfpxxdiv").hide();
			$(".tfaddtkxxdiv").show();

		})
		$(".tftksubmit").click(function() {
			$(".tfaddtkxxdiv").hide();
		})
		$(".tfclose").click(function() {
			$(".bmtff").hide();
			$(".bmtf").hide();
			$(".tfaddtkxxdiv").hide();
			$(".tfaddfpxxdiv").hide();

		})
		$(".tfsubmit").click(function() {
			$(".tfaddtkxxdiv").hide();
			$(".tfaddfpxxdiv").hide();
			$(".bmtff").hide();
			$(".bmtf").hide();
			var tf = $(".bmtff").serialize();
			addtf(tf);
		})

		$(".roompicul").on("click", "li", function() {
			$(".addrz input").val("");
			$(".addrz .rzgssubmit").val("提交");
			$(".addrz .rzgsclose").val("关闭");
			$(".addrz .rzoperator").val(logopnamex);
			var imgsrc = $(this).find("img").attr("src");
			var a = $(this).find("a").text();
			$(".rzcdrmlid").val(a);
			//客房类型
			$(".rzcdrml").text("");
			if (imgsrc == "images/room3.jpg") {
				$.ajax({
					"url" : "tb_room.do?c=getByIdTb_room",
					"type" : "post",
					"data":"rmid="+a,
					"datatype" : "JSON",
					"success" : function(res) {
						var array = jQuery.parseJSON(res);
						$(".rzcdrml").val(array.tb_roomcatalog.rc_name);
						$(".rzcdprctrice").val(array.rm_prctPrice-array.rm_prctdiscount);
					}
				})
				//客户类别
				$(".rzgsgory").text("");
				$.ajax({
					"url" : "tb_pucategory.do?c=getAllTb_pucategory",
					"type" : "post",
					"datatype" : "JSON",
					"success" : function(res) {
						var array = jQuery.parseJSON(res);
						for (var i = 0; i < array.length; i++) {
							var option = document.createElement("option");
							option.value = array[i].pcg_cio;
							option.append(array[i].pcg_categoryName);
							if (array[i].pcg_cio == "1") {
								$(option).attr("selected", "selected");
							}
							$(".rzgsgory").append(option);
						}
					}
				})
				
				//客户类型
				$(".rzgstpye").text("");
				$.ajax({
					"url" : "tb_putype.do?c=getAllTb_putype",
					"type" : "post",
					"datatype" : "JSON",
					"success" : function(res) {
						var array = jQuery.parseJSON(res);
						for (var i = 0; i < array.length; i++) {
							var option = document.createElement("option");
							option.value = array[i].pt_id;
							option.append(array[i].pt_typeName);
							if (array[i].pt_id == "1") {
								$(option).attr("selected", "selected");
							}
							$(".rzgstpye").append(option);
						}
					}
				})
				//证件类型
				$(".rzgscardcatalog").html("");
				$.ajax({
					"url" : "tb_pucard.do?c=getAllTb_pucard",
					"type" : "post",
					"datatype" : "JSON",
					"success" : function(res) {
						var array = jQuery.parseJSON(res);
						for (var i = 0; i < array.length; i++) {
							var option = document.createElement("option");
							option.value = array[i].pc_id;
							option.append(array[i].pc_cardCatalogName);
							if (array[i].pc_id == "1") {
								$(option).attr("selected", "selected");
							}
							$(".rzgscardcatalog").append(option);
						}
					}
				})
				//国籍
				$(".rzgsgtcountry").html("");
				$.ajax({
					"url" : "tb_pucountry.do?c=getAllTb_pubcountry",
					"type" : "post",
					"datatype" : "JSON",
					"success" : function(res) {
						var array = jQuery.parseJSON(res);
						for (var i = 0; i < array.length; i++) {
							var option = document.createElement("option");
							option.value = array[i].pct_id;
							option.append(array[i].pct_countryName);
							if (array[i].pct_id == "1") {
								$(option).attr("selected", "selected");
							}
							$(".rzgsgtcountry").append(option);
						}
					}
				})
				$(".addrz").show();
			} else {
				alert("您所选的客房不是空闲！");
			}
		})
		$(".rzgsclose").click(function() {
			$(".addrz").hide();
		})
		$(".rzgssubmit").click(function() {
			var rz = $(".addrzf").serialize();
			var state = $(".rzcdstate").val();
			rzcd(rz,state);
			$(".addrz").hide();
		})
	</script>
</body>
</html>