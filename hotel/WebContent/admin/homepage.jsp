<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<style>
.roommanage_01div {
	width: 100%;
	height: 100%;
	display: none;
}

.roommanage_02div {
	width: 100%;
	height: 100%;
	display: none;
}

.roommanage_03div {
	width: 100%;
	height: 100%;
	display: none;
}

.infofind_01div {
	width: 100%;
	height: 100%;
	display: none;
}

.infofind_02div {
	width: 100%;
	height: 100%;
	display: none;
}

.roomset_01div {
	width: 100%;
	height: 100%;
	display: none;
}

.roomset_02div {
	width: 100%;
	height: 100%;
	display: none;
}

.behindset_01div {
	width: 100%;
	height: 100%;
	display: none;
}

.behindset_02div {
	width: 100%;
	height: 100%;
	display: none;
}

.behindset_03div {
	width: 100%;
	height: 100%;
	display: none;
}

.liftroommanagediv {
	width: 100%;
	height: 100%;
	display: none;
}

.whiteDiv {
	width: 100%;
	height: 50px;
}

.formdiv {
	width: 500px;
	height: 400px;
	border: 1px solid yellow;
	background-image: url(img/登记入住.jpg);
	padding: 30px;
	position: absolute;
	left: 500px;
	top: 100px;
	display: none;
}

.surebutton {
	position: absolute;
	top: 320px;
	left: 550px;
	font-weight: 900;
	font-size: 125%;
	border-radius: 10px;
	text-align: center;
	vertical-align: middle;
}

.listTitle {
	position: relative;
	left: 410px;
	top: 1px;
	font-size: 33px;
	font-family: "宋体", "microsoft yahei";
}

.roompicul {
	list-style: none;
	margin: 0px;
	padding: 0px;
}
/**/
.modification {
	position: absolute;
	width: 500px;
	height: 400px;
	border: 1px;
	display: none;
}

.modificationDiv {
	position: relative;
	top: 40px;
	left: 250px;
	text-align: center;
}

.refund {
	position: absolute;
}

.refundDiv {
	position: relative;
	top: 40px;
	text-align: center;
}

.refund_status {
	position: absolute;
	display: none;
}

.refund_statusDiv {
	position: relative;
	top: 40px;
	left: 250px;
	text-align: center;
}

.invoice {
	/*display: none;*/
	
}

.invoiceDiv {
	position: relative;
	top: 40px;
}
/*增加用户信息*/
.increase {
	position: absolute;
	display: none;
}

.increaseDiv {
	position: relative;
	top: 40px;
	left: 250px;
	text-align: center;
}

.invoicess {
	position: absolute;
	display: none;
}

.invoicesdiv {
	position: relative;
	top: 40px;
	left: 250px;
	text-align: center;
}

.invoicesdiv h2 {
	position: relative;
	right: 120px;
}

.jurisdiction {
	position: absolute;
}

.jurisdictionDiv {
	position: relative;
	top: 40px;
	left: 250px;
	text-align: center;
	display: none;
}

.jurisdictions {
	position: absolute;
}

.roomtypeadd {
	position: absolute;
	left: 650px;
	width: 400px;
	height: 400px;
	display: none;
}

.roomtypechange {
	position: absolute;
	left: 650px;
	width: 400px;
	height: 400px;
	display: none;
}

.roomadd {
	position: absolute;
	left: 650px;
	width: 400px;
	height: 400px;
	display: none;
}

.roomchange {
	position: absolute;
	left: 650px;
	width: 400px;
	height: 400px;
	display: none;
}

.jurisdiction {
	position: absolute;
	left: 450px;
}

.jurisdictionsdiv {
	position: relative;
	left: 200px;
	top: 10px;
	text-align: center;
}
</style>
</head>

<body>
	<div class="top"></div>
	<div id="header">
		<div class="logo">洲际酒店后台管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">admin</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="">锁定</a></li>
				<li><a href="">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>酒店首页
					</h4>
					<div class="list-item none">
						<a href="index.html">酒店首页</a> <a href="introduce .html">酒店简介</a>
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
				<li>
					<h4 class="M6">
						<span></span>公共操作
					</h4>
					<div class="list-item none">
						<a class="liftroommanage">用户修改</a>
					</div>
				</li>
				<li>
					<h4 class="M7">
						<span></span>奖励管理
					</h4>
					<div class="list-item none">
						<!--            <a href=''>奖励管理1</a>
            <a href=''>奖励管理2</a>
            <a href=''>奖励管理3</a>-->
					</div>
				</li>
				<li>
					<h4 class="M8">
						<span></span>维护管理
					</h4>
					<div class="list-item none">
						<!--            <a href=''>字典维护1</a>
            <a href=''>字典维护2</a>
            <a href=''>字典维护3</a>
						<a href=''>字典维护4</a>
            <a href=''>字典维护5</a>
            <a href=''>字典维护6</a>
						<a href=''>字典维护7</a>
            <a href=''>字典维护8</a>
            <a href=''>字典维护9</a>
						<a href=''>字典维护4</a>
            <a href=''>字典维护5</a>
            <a href=''>字典维护6</a>
						<a href=''>字典维护7</a>
            <a href=''>字典维护8</a>
            <a href=''>字典维护9</a>-->
					</div>
				</li>
				<li>
					<h4 class="M9">
						<span></span>内容管理
					</h4>
					<div class="list-item none">
						<!--            <a href=''>内容管理1</a>
            <a href=''>内容管理2</a>
            <a href=''>内容管理3</a>-->
					</div>
				</li>
				<li>
					<h4 class="M10">
						<span></span>系统管理
					</h4>
					<div class="list-item none">
						<!--            <a href=''>系统管理1</a>
            <a href=''>系统管理2</a>
            <a href=''>系统管理3</a>-->
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
				<ul>
					<li><img src="images/home.png"></li>
					<li style="margin-left: 25px;">您当前的位置：</li>
					<li><a href="#">系统公告</a></li>
					<li>></li>
					<li><a href="#">最新公告</a></li>
				</ul>
			</div>

			<div class="main">

				<div class="roommanage_01div">
					<!--
							点击修改跳转至修改页面
						-->
					<div class="modification">
						<div class="modificationDiv">
							<table>
								<tr>
									<td><h2>权限修改</h2></td>
								</tr>
								<tr>
									<td>操作员用户名</td>
									<td><input type="text" value="" /></td>
									<td>操作员密码</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>操作员权限</td>
									<td><input type="text" value="" /></td>
									<td>地址</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>姓名</td>
									<td><input type="text" value="" /></td>
									<td>手机号码</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>分机号码</td>
									<td><input type="text" value="" /></td>
									<td>邮编</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>创建时间</td>
									<td><input type="text" value="" /></td>
									<td>操作</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td><button class="tijiao">提交</button></td>
									<td></td>
									<td></td>
									<td><button>取消</button></td>
								</tr>
							</table>

						</div>
					</div>

					<!--
					后台操作员操作添加新的操作员信息
				     -->
					<div class="formsdiv">
						<div class="operatorDiv">
							<table class="tables" border="1px" cellspacing="0" align="center">
								<tr>
									<td><a class="listTitle">操作员管理</a></td>
								</tr>
								<tr>
									<td>操作员用户名</td>
									<td>操作员密码</td>
									<td>操作员权限</td>
									<td>地址</td>
									<td>姓名</td>
									<td>手机号码</td>
									<td>分机号码</td>
									<td>邮编</td>
									<td>创建时间</td>
									<td>操作</td>
								</tr>
								<tr>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>${xingxi}</td>
									<td>
										<button>修改</button>
										<button>增加</button>
										<button>删除</button>
									</td>
								</tr>
							</table>
						</div>
					</div>
					<!--
							后台增加操作员信息
						-->
					<div class="increase">
						<div class="increaseDiv">
							<table>
								<tr>
									<td><h2>增加用户</h2></td>
								</tr>
								<tr>
									<td>操作员用户名</td>
									<td><input type="text" value="" /></td>
									<td>操作员密码</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>操作员权限</td>
									<td><input type="text" value="" /></td>
									<td>地址</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>姓名</td>
									<td><input type="text" value="" /></td>
									<td>手机号码</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>分机号码</td>
									<td><input type="text" value="" /></td>
									<td>邮编</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>创建时间</td>
									<td><input type="text" value="" /></td>
									<td>操作</td>
									<td><input type="text" value="" /></td>
								</tr>
							</table>
							<button class="tijiao">提交</button>
						</div>
					</div>
				</div>

				<!--
							退款审核
						-->
				<div class="roommanage_02div">
					<div class="refund">
						<div class="refundDiv">
							<h2>退款审核</h2>
							<table>
								<tr>
									<td>账单编号</td>
									<td>登记订单编号</td>
									<td>客户姓名</td>
									<td>客房编号</td>
									<td>结账类型</td>
									<td>总计费用</td>
									<td>操作员</td>
									<td>退款金额</td>
									<td>退款状态</td>
									<td>退款方式</td>
									<td>持卡人姓名</td>
									<td>卡号</td>
									<td>持卡人身份证号</td>
									<td>结账说明</td>
									<td>创建时间</td>
									<td>操作</td>
								</tr>
								<tr>

									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>${chaxun}</td>
									<td>
										<button>修改</button>
									</td>
								</tr>
							</table>
						</div>
					</div>
					<!--
							修改退款处理状态
						-->
					<div class="refund_status">
						<div class="refund_statusDiv">
							<h2>退款审核修改</h2>
							<table border="1px">
								<tr>
									<td>账单编号</td>
									<td><input type="text" value="" />
									<td>登记订单编号</td>
									<td><input type="text" value="" />
									<td>客户姓名</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>客房编号</td>
									<td><input type="text" value="" />
									<td>结账类型</td>
									<td><input type="text" value="" />
									<td>总计费用</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>操作员</td>
									<td><input type="text" value="" />
									<td>支付类型</td>
									<td><input type="text" value="" />
									<td>退款金额</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>退款状态</td>
									<td><select>
											<option value="volvo">Volvo</option>
											<option value="saab">Saab</option>
											<option value="opel">Opel</option>
											<option value="audi">Audi</option>
									</select></td>
									<td>退款方式</td>
									<td><input type="text" value="" />
									<td>持卡人姓名</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>卡号</td>
									<td><input type="text" value="" />
									<td>持卡人身份证号</td>
									<td><input type="text" value="" />
									<td>持卡人手机号</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>结账说明</td>
									<td><textarea rows="" cols=""></textarea></td>
									<td>创建时间</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>确认审核</td>
									<td></td>
									<td>取消</td>
									<td></td>
								</tr>
							</table>

						</div>
					</div>

				</div>
				<!--
						发票查询
					-->
				<div class="roommanage_03div">
					<div class="invoice">
						<div class="invoiceDiv">
							<h2 style="text-align: center;">发票查询</h2>
							<table border="1px">
								<tr>
									<td>账单编号</td>
									<td>登记订单编号</td>
									<td>客户姓名</td>
									<td>客房编号</td>
									<td>结账类型</td>
									<td>总计费用</td>
									<td>操作员</td>
									<td>支付类型</td>
									<td>是否开票</td>
									<td>收件人姓名</td>
									<td>公司名称</td>
									<td>手机号</td>
									<td>邮寄地址</td>
									<td>开票状态</td>
									<td>结账说明</td>
									<td>创建时间</td>
									<td>操作</td>
								</tr>
								<tr>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td>${fapiao}</td>
									<td><button>修改</button></td>
								</tr>
							</table>
						</div>
					</div>
					<!--
							修改账单
						-->
					<div class="invoicess">
						<div class="invoicesdiv">
							<h2>账单修改</h2>
							<table>
								<tr>
									<td>账单编号</td>
									<td><input type="text" value="" />
									<td>登记订单编号</td>
									<td><input type="text" value="" />
									<td>客户姓名</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>客房编号</td>
									<td><input type="text" value="" />
									<td>结账类型</td>
									<td><input type="text" value="" />
									<td>总计费用</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>是否开票</td>
									<td><input type="radio" name="sex" value="male" />是 <input
										type="radio" name="sex" value="female" />否</td>
									<td>收件人姓名</td>
									<td><input type="text" value="" />
									<td>公司名称</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td>手机号</td>
									<td><input type="text" value="" />
									<td>邮寄地址</td>
									<td><input type="text" value="" />
									<td>开票状态</td>
									<td><select>
											<option>1</option>
											<option>2</option>
											<option>3</option>
									</select></td>
								</tr>
								<tr>
									<td>结账说明</td>
									<td><textarea rows="" cols=""></textarea></td>
									<td>创建时间</td>
									<td><input type="text" value="" />
								</tr>
								<tr>
									<td><button>确认提交</button></td>
									<td></td>
									<td><button>取消</button></td>
									<td></td>
								</tr>
							</table>

						</div>
					</div>
				</div>

				<div class="infofind_01div">
					<div class="dengjifind">
						<ul style="position: relative; left: 10%;">
							<li>订单号<input type="text" /> <!--通过订单号进入AJAX模糊查询--> 客户身份证号<input
								type="text" class="" /> <!--通过身份证进入AJAX查询-->
								<button>查询</button>
							</li>
						</ul>
						<table border="" cellspacing="" cellpadding="">
							<tr>
								<td>登记编号</td>
								<td>登记订单编号</td>
								<td>房间编号</td>
								<td>每日实际价格</td>
								<td>每日折扣</td>
								<td>入住时间</td>
								<td>离开时间</td>
								<td>登记状态</td>
								<td>姓名</td>
								<td>身份证号</td>
								<td>手机号</td>
								<td>操作</td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td>
									<button>查看详情</button>

								</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="infofind_02div">
					<div class="dengjifind">
						<ul style="position: relative; left: 10%;">
							<li>客户身份证号<input type="text" class="" /> <!--通过身份证进入AJAX查询-->
								<button>查询</button>
							</li>
						</ul>
						<table border="" cellspacing="" cellpadding="">
							<tr>
								<td style="display: none;">客户编号</td>
								<td>客户姓名</td>
								<td>客户类型</td>
								<td>客户证件类型</td>
								<td>客人证件号码</td>
								<td>国籍</td>
								<td>地址</td>
								<td>工作单位</td>
								<td>手机号</td>
								<td>性别</td>
								<td>资料创建时间</td>
								<td>消费次数</td>
								<td>消费总额</td>
								<td>会员等级</td>
							</tr>
							<tr>
								<td style="display: none;"></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="roomset_01div">
					<div>
						<button style="width: 200px; height: 50px; border-radius: 12px;">新增房间类型</button>
					</div>
					<table>
						<tr>
							<td>客房类型编号</td>
							<td>客房类型名称</td>
							<td>床位数</td>
							<td>预定价格</td>
							<td>预订折扣</td>
							<td>计时最低价</td>
							<td>计时每小时价</td>
							<td>操作(</td>

						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<button>修改</button>
								<button>删除</button>
							</td>

						</tr>
					</table>
					<!--增加客房类型DIV,已隐藏-->
					<div class="roomtypeadd">
						<table>
							<tr>
								<td>客房类型</td>
								<td><input type="text" name="roomtype" /></td>
								<td>床位数</td>
								<td><input type="text" name="bednumber" /></td>
							</tr>
							<tr>
								<td>预订价格</td>
								<td><input type="text" name="orderprice" /></td>
								<td>预定折扣</td>
								<td><input type="text" name="orderdiscount" /></td>
							</tr>
							<tr>
								<td>计时最低价</td>
								<td><input type="text" name="smallmoney" /></td>
								<td>计时每小时价</td>
								<td><input type="text" name="dpprice" /></td>
							</tr>
							<tr>
								<td>
									<button>确认添加</button>
								</td>
								<td></td>
								<td>
									<button>取消</button>
								</td>
								<td></td>
							</tr>
						</table>
					</div>
					<!--修改客房类型DIV,已隐藏-->
					<div class="roomtypechange">
						<table>
							<tr style="display: none;">
								<td>客房编号</td>
								<td></td>
							</tr>
							<tr>
								<td>客房类型</td>
								<td><input type="text" /></td>
								<td>床位数</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>预订价格</td>
								<td><input type="text" /></td>
								<td>预定折扣</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>计时最低价</td>
								<td><input type="text" /></td>
								<td>计时每小时价</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>
									<button>确认修改</button>
								</td>
								<td></td>
								<td>
									<button>取消</button>
								</td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="roomset_02div">
					<div>
						<button style="width: 200px; height: 50px; border-radius: 12px;">新增房间类型</button>
					</div>
					<table>
						<tr>
							<td>客房编号</td>
							<td>所属区域</td>
							<td>所属楼层</td>
							<td>实际价格</td>
							<td>分机电话</td>
							<td>客房状态</td>
							<td>是否可用</td>
							<td>房间类型</td>
							<td width="400px" style="text-align: center">房间图片</td>
							<td>实际折扣</td>
							<td>操作</td>

						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td>
								<button>修改</button>
								<button>删除</button>
							</td>

						</tr>
					</table>
					<!--增加客房DIV,已隐藏-->
					<div class="roomadd">
						<table>
							<tr>
								<td>所属区域</td>
								<td><input type="text" /></td>
								<td>楼层</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>实际价格</td>
								<td><input type="text" /></td>
								<td>分机电话</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>客房状态</td>
								<td><input type="text" /></td>
								<td>是否可用</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>房间类型</td>
								<td><input type="text" /></td>
								<td>实际折扣</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>
									<button>确认添加</button>
								</td>
								<td></td>
								<td>
									<button>取消</button>
								</td>
								<td></td>
							</tr>
						</table>
					</div>
					<!--修改客房DIV,已隐藏-->
					<div class="roomchange">
						<table>
							<tr>
								<td>客房编号</td>
								<td></td>
							</tr>
							<tr>
								<td>所属区域</td>
								<td><input type="text" /></td>
								<td>楼层</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>实际价格</td>
								<td><input type="text" /></td>
								<td>分机电话</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>客房状态</td>
								<td><input type="text" /></td>
								<td>是否可用</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>房间类型</td>
								<td><input type="text" /></td>
								<td>实际折扣</td>
								<td><input type="text" /></td>
							</tr>
							<tr>
								<td>
									<button>确认修改</button>
								</td>
								<td></td>
								<td>
									<button>取消</button>
								</td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="behindset_01div">
					<ul>
						<li><img src="images/type.jpg" /></li>
					</ul>
					房间状态 <select>
						<option></option>
						<option></option>
						<option></option>
						<option></option>
					</select>
					<button>查询</button>
					<div class="roomdiv">
						<!--[if IE]>
				此处添加for each 遍历房间 同时根据状态改变图片
			<![endif]-->
						<button>
							<ul class="roompicul">
								<li><img src="images/room1.jpg" /></li>
								<li>${fangjianhao}</li>
							</ul>
						</button>
						<button>
							<ul class="roompicul">
								<li><img src="images/room2.jpg" /></li>
								<li>${fangjianhao}</li>
							</ul>
						</button>
						<button>
							<ul class="roompicul">
								<li><img src="images/room3.jpg" /></li>
								<li>${fangjianhao}</li>
							</ul>
						</button>
						<button>
							<ul class="roompicul">
								<li><img src="images/room4.jpg" /></li>
								<li>${fangjianhao}</li>
							</ul>
						</button>
					</div>
					<div class="formdiv">
						<div class="whiteDiv"></div>

						<table>
							<tr>
								<td>房间号</td>
								<td><input type="text" disabled="disabled" value="" /></td>
								<td>房间类型</td>
								<td><input type="text" disabled="disabled" value="" /></td>
							</tr>
							<tr>
								<td>床位数</td>
								<td><input type="text" disabled="disabled" value="" /></td>
								<td>价格（每日）</td>
								<td><input type="text" disabled="disabled" value="" /></td>
							</tr>
							<tr>
								<td>姓名：</td>
								<td><input type="text" name="" /></td>
								<td>证件类型：</td>
								<td><select id="">
										<!--
                            	作者：offline
                            	时间：2018-01-29
                            	描述：从数据库中获得类型
                            -->
										<option>what</option>
										<option>the</option>
										<option>hell</option>
								</select></td>
							</tr>
							<tr>
								<td>证件号：</td>
								<td><input type="text" name="" /></td>
								<td>押金</td>
								<td><input type="text" name="" /></td>
							</tr>
							<tr>
								<td>入住日期</td>
								<td><input type="text" name="" /></td>
								<td>入住天数</td>
								<td><input type="text" name="" /></td>
							</tr>
							<tr>
								<td>
									<button>确认入住</button>
								</td>
								<td></td>
								<td></td>
								<td>
									<button>取消</button>
								</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="behindset_02div">
					<div class="tuifang">
						<ul style="position: relative; left: 10%;">
							<li>客户名<input type="text" /> 客户身份证号 <input type="text"
								class="" /> <!--通过身份证进入AJAX查询-->
								<button>查询</button>
							</li>
						</ul>
						<table border="" cellspacing="" cellpadding="">
							<tr>
								<td>登记编号</td>
								<td>登记订单编号</td>
								<td>房间编号</td>
								<td>每日实际价格</td>
								<td>每日折扣</td>
								<td>入住时间</td>
								<td>登记状态</td>
								<td>姓名</td>
								<td>身份证号</td>
								<td>手机号</td>
								<td>操作</td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td>
									<button>查看详情</button>
									<button>退房</button>
								</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="behindset_03div">

					<table>
						<tr>
							<td>客房编号</td>
							<td>所属区域</td>
							<td>所属楼层</td>
							<td>实际价格</td>
							<td>分机电话</td>
							<td>客房状态</td>
							<td>是否可用</td>
							<td>房间类型</td>
							<td width="400px" style="text-align: center">房间图片</td>
							<td>实际折扣</td>
						</tr>
					</table>
				</div>
				<!--
							后台密码修改
						-->
				<div class="liftroommanagediv">
					<div class="jurisdiction">
						<div class="jurisdictionDiv">
							<table>
								<tr>
									<td>旧密码</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>新密码</td>
									<td><input type="text" value="" /></td>
								</tr>
								<tr>
									<td>确认密码</td>
									<td><input type="text" value="" /></td>
								</tr>
							</table>
							<button>提交</button>
						</div>
					</div>

					<!--
								后台修改
							-->
					<div class="jurisdictions">
						<div class="jurisdictionsdiv">
							<h2>用户修改</h2>
							<table>
								<tr>
									<td>操作员用户名</td>
									<td><input type="text" disabled="disabled" value="" /></td>
									<td>操作员密码</td>
									<td><input type="text" disabled="disabled" value="" /></td>
									<td>操作员权限</td>
									<td><input type="text" disabled="disabled" value="" /></td>
								</tr>
								<tr>
									<td>地址</td>
									<td><input type="text" disabled="disabled" value="" /></td>
									<td>姓名</td>
									<td><input type="text" disabled="disabled" value="" /></td>
									<td>手机电话</td>
									<td><input type="text" disabled="disabled" value="" /></td>
								</tr>
								<tr>
									<td>分机号码</td>
									<td><input type="text" disabled="disabled" value="" /></td>
									<td>邮编</td>
									<td><input type="text" disabled="disabled" value="" /></td>
									<td>创建时间</td>
									<td><input type="text" disabled="disabled" value="" /></td>
								</tr>
							</table>
							<button>提交</button>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<div class="bottom"></div>
	<div id="footer">
		<p>版权所有，仿冒必究</p>
	</div>
	<script>
		navList(12);
		$(".roommanage_01").click(function() {
			$(".roommanage_01div").show();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();

		})
		$(".roommanage_02").click(function() {
			$(".roommanage_01div").hide();
			$(".roommanage_02div").show();
			$(".roommanage_03div").hide();
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})
		$(".roommanage_03").click(function() {
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").show();
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})

		$(".infofind_01").click(function() {
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".infofind_01div").show();
			$(".infofind_02div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();

		})
		$(".infofind_02").click(function() {
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".infofind_01div").hide();
			$(".infofind_02div").show();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})
		$(".roomset_01").click(function() {
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".roomset_01div").show();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})
		$(".roomset_02").click(function() {
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").show();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})
		$(".behindset_01").click(function() {
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").show();
			$(".behindset_02div").hide();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})
		$(".behindset_02").click(function() {
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").show();
			$(".behindset_03div").hide();
			$(".liftroommanagediv").hide();
		})
		$(".behindset_03").click(function() {
			$(".infofind_01div").hide();
			$(".infofind_02div").hide();
			$(".roommanage_01div").hide();
			$(".roommanage_02div").hide();
			$(".roommanage_03div").hide();
			$(".roomset_01div").hide();
			$(".roomset_02div").hide();
			$(".behindset_01div").hide();
			$(".behindset_02div").hide();
			$(".behindset_03div").show();
			$(".liftroommanagediv").hide();
		})
		$(".liftroommanage").click(function() {
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
			$(".liftroommanagediv").show();
		})
	</script>
</body>

</html>