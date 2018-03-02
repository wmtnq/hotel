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
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<style type="text/css">
a {
	cursor: pointer
}

button {
	cursor: pointer
}

h2 {
	text-align: center;
}

.operatorDiv {
	position: relative;
	top: 40px;
}

.roomset_02div {
	position: relative;
	top: 40px;
}
</style>

</head>

<body>
	<div class="top"></div>
	<div id="header">
		<div class="logo">征启后台管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a><c:if test="${log.op_privilege==0}">普通用户</c:if><c:if test="${log.op_privilege==1}">管理员</c:if><c:if test="${log.op_privilege==2}">超级管理员</c:if> </a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="">锁定</a></li>
				<li><a  class="exit">退出</a></li>
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
						<a href="http://localhost:11170/hotel/html/index.jsp"
							target="_blank">酒店首页</a> <a
							href="http://localhost:11170/hotel/html/gallery.jsp"
							target="_blank">酒店简介</a>
							<a href="http://localhost:11170/hotel/html/about.jsp"
							target="_blank">关于我们</a> <a
							href="http://localhost:11170/hotel/html/contact.jsp"
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
					<li><img src="images/home.png" style="top: 2px"></li>
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
					<!-- <div class="modification">
						<div class="modificationDiv">
							<table cellpadding="0" cellspacing="0">
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
					</div> -->
					<!--
					后台操作员操作添加新的操作员信息
				     -->
					<div class="formsdiv">
						<div class="operatorDiv">
							<h2>操作员管理</h2>
							<a class="listTitle"></a>
							<table class="tables" border="1px" cellspacing="0"
								cellpadding="0" align="center">
							</table>
						</div>
					</div>
					<!--
							后台增加操作员信息
						-->
					<div class="increase">
						<div class="increaseDiv">
							<table cellpadding="0" cellspacing="0">
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
							<table cellpadding="0" cellspacing="0">
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
									<td>手机号</td>
									<td>结账说明</td>
									<td>创建时间</td>
									<td>操作</td>
								</tr>
								<c:forEach var="brs" items="${listrs }">
									<tr>
										<td>${brs.bm_id }</td>
										<td>${brs.bm_checkinorderId }</td>
										<td>${brs.tb_guest.gt_name }</td>
										<td>${brs.bm_roomId }</td>
										<td>${brs.bm_guestId }</td>
										<td>${brs.tb_pupaymenttype.ppt_guestTypeName }</td>
										<td>${brs.bm_totalRate }</td>
										<td>${brs.bm_operator }</td>
										<td>${brs.bm_refund }</td>
										<td>${brs.bm_refundState }</td>
										<td>${brs.bm_cardName }</td>
										<td>${brs.bm_cardNumber }</td>
										<td>${brs.bm_cardId }</td>
										<td>${brs.bm_cardPhone }</td>
										<td>${brs.bm_remark }</td>
										<td>${brs.bm_createTime }</td>
										<td>
											<button>修改</button>
										</td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
					<!--
							修改退款处理状态
						-->
					<div class="refund_status">
						<div class="refund_statusDiv">
							<h2>退款审核修改</h2>
							<table border="1px" cellpadding="0" cellspacing="0">
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
							<table border="1px" cellpadding="0" cellspacing="0">
								<tr>
									<td>账单编号</td>
									<td>登记订单编号</td>
									<td>客户姓名</td>
									<td>客房编号</td>
									<td>结账类型</td>
									<td>总计费用</td>
									<td>操作员</td>
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
								<c:forEach var="brp" items="${listrp }">
									<tr>
										<td>${brp.bm_id }</td>
										<td>${brp.bm_checkinorderId }</td>
										<td>${brp.tb_guest.gt_name }</td>
										<td>${brp.bm_roomId }</td>
										<td>${brp.tb_pupaymenttype.ppt_guestTypeName }</td>
										<td class="money"><script type="text/javascript">
										var money = ${brp.bm_totalRate }-${brp.bm_refund };
										$(".money").text(money);
										</script></td>
										<td>${brp.bm_operator }</td>
										<td><c:if test="${brp.bm_receipt==0 }">否</c:if> <c:if
												test="${brp.bm_receipt==1 }">是</c:if></td>
										<td>${brp.tb_guest.gt_name }</td>
										<td>${brp.bm_company }</td>
										<td>${brp.bm_phone }</td>
										<td>${brp.bm_address }</td>
										<td><c:if test="${brp.bm_receiptStatus==0 }">未开</c:if> <c:if
												test="${brp.bm_receiptStatus==1 }">已开</c:if></td>
										<td>${brp.bm_remark }</td>
										<td>${brp.bm_createTime }</td>
										<td>
											<button>修改</button>
										</td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>
					<!--
							修改账单
						-->
					<div class="invoicess">
						<div class="invoicesdiv">
							<h2>账单修改</h2>
							<table cellpadding="0" cellspacing="0">
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
						<table border="1px" cellspacing="0" cellpadding="0">
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
							<c:forEach var="ck" items="${listck }">
								<tr>
									<td>${ck.cim_id }</td>
									<td>${ck.cim_chechinorderId }</td>
									<td>${ck.cim_roomId }</td>
									<td>${ck.cim_prctPrice }</td>
									<td>${ck.cim_discount }</td>
									<td>${ck.cim_inDateTime }</td>
									<td>${ck.cim_outdateTime }</td>
									<td><c:if test="${ck.cim_state==0 }">在住</c:if> <c:if
											test="${ck.cim_state==1 }">预定</c:if> <c:if
											test="${ck.cim_state==2 }">退房</c:if></td>
									<td>${ck.tb_checkinorder.tb_guest.gt_name }</td>
									<td>${ck.tb_checkinorder.tb_guest.gt_cardId }</td>
									<td>${ck.tb_checkinorder.tb_guest.gt_mobile }</td>
									<td>
										<button>查看详情</button>
									</td>
								</tr>
							</c:forEach>
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
						<table cellspacing="0" cellpadding="0">
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
							<c:forEach var="gs" items="${listgs }">
								<tr>
									<td style="display: none;">${gs.gt_id }</td>
									<td>${gs.gt_name }</td>
									<td>${gs.tb_putype.pt_typeName }</td>
									<td>${gs.tb_pucard.pc_cardCatalogName }</td>
									<td>${gs.gt_cardId }</td>
									<td>${gs.tb_pucountry.pct_countryName }</td>
									<td>${gs.gt_address }</td>
									<td>${gs.gt_company }</td>
									<td>${gs.gt_mobile }</td>
									<td>${gs.gt_gender }</td>
									<td>${gs.gt_createtime }</td>
									<td>${gs.gt_nuber }</td>
									<td>${gs.gt_expenditure }</td>
									<td>${gs.tb_pucategory.pcg_categoryName}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				<div class="roomset_01div">
					<div>
						<button style="width: 200px; height: 50px; border-radius: 12px;">新增房间类型</button>
					</div>
					<table cellpadding="0" cellspacing="0">
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
						<c:forEach var="rc" items="${listrml }">
							<tr>
								<td>${rc.rc_id }</td>
								<td>${rc.rc_name }</td>
								<td>${rc.rc_bedNumber }</td>
								<td>${rc.rc_prePrice }</td>
								<td>${rc.rc_prediscount }</td>
								<td>${rc.rc_hourbasePrice }</td>
								<td>${rc.rc_perhourPrice }</td>
								<td>
									<button>修改</button>
									<button>删除</button>
								</td>
							</tr>
						</c:forEach>
					</table>
					<!--增加客房类型DIV,已隐藏-->
					<div class="roomtypeadd">
						<table cellpadding="0" cellspacing="0">
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
						<table cellpadding="0" cellspacing="0">
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
								<td>计时每小时价</td>f
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
						<button style="width: 200px; height: 50px; border-radius: 12px;">新增房间</button>
					</div>
					<table cellpadding="0" cellspacing="0">
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
						<c:forEach var="room" items="${roomlist }">
							<tr>
								<td>${room.rm_id }</td>
								<td>${room.rm_area }</td>
								<td>${room.rm_floor }</td>
								<td>${room.rm_prctPrice }</td>
								<td>${room.rm_telphone }</td>
								<td><c:if test="${room.rm_state==0}">空闲</c:if> <c:if
										test="${room.rm_state==1}">已预定</c:if> <c:if
										test="${room.rm_state==2}">已入住</c:if> <c:if
										test="${room.rm_state==3}">维修中</c:if></td>
								<td><c:if test="${room.rm_available>0 }">可用</c:if> <c:if
										test="${room.rm_available==0 }">不可用</c:if></td>
								<td>${room.tb_roomcatalog.rc_name }</td>
								<td>${room.rm_picture }</td>
								<td>${room.rm_prctdiscount }</td>
								<td>
									<button>修改</button>
									<button>删除</button>
								</td>
							</tr>
						</c:forEach>
					</table>
					<!--增加客房DIV,已隐藏-->
					<div class="roomadd">
						<table cellpadding="0" cellspacing="0">
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
						<table cellpadding="0" cellspacing="0">
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
					<div>
						<img src="images/type.jpg" />
					</div>
					<div class="roomdiv">
						<ul class="roompicul" style="width: 900px;">
							<c:forEach var="room" items="${roomlist }">
								<li style="float: left; width: 76px; padding: 5px;"><c:if
										test="${room.rm_state==0}">
										<img src="images/room3.jpg" />
									</c:if> <c:if test="${room.rm_state==1}">
										<img src="images/room1.jpg" />
									</c:if> <c:if test="${room.rm_state==2}">
										<img src="images/room4.jpg" />
									</c:if> <c:if test="${room.rm_state==3}">
										<img src="images/room2.jpg" />
									</c:if> <span
									style="display: inline-block; text-align: center; width: 76px">${room.rm_id}</span></li>
							</c:forEach>
						</ul>
					</div>
					<div class="formdiv">
						<div class="whiteDiv"></div>

						<table cellpadding="0" cellspacing="0">
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
						<table cellspacing="0" cellpadding="0">
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
							<c:forEach var="ck" items="${listck }">
								<tr>
									<td>${ck.cim_id }</td>
									<td>${ck.cim_chechinorderId }</td>
									<td>${ck.cim_roomId }</td>
									<td>${ck.cim_prctPrice }</td>
									<td>${ck.cim_discount }</td>
									<td>${ck.cim_inDateTime }</td>
									<td>${ck.cim_outdateTime }</td>
									<td><c:if test="${ck.cim_state==0 }">在住</c:if> <c:if
											test="${ck.cim_state==1 }">预定</c:if></td>
									<td>
										<button>查看详情</button>
										<button>退房</button>
									</td>
								</tr>
							</c:forEach>
							<c:forEach var="ckx" items="${listckx }">
								<tr>
									<td>${ckx.cim_id }</td>
									<td>${ckx.cim_chechinorderId }</td>
									<td>${ckx.cim_roomId }</td>
									<td>${ckx.cim_prctPrice }</td>
									<td>${ckx.cim_discount }</td>
									<td>${ckx.cim_inDateTime }</td>
									<td><c:if test="${ckx.cim_state==0 }">在住</c:if> <c:if
											test="${ckx.cim_state==1 }">预定</c:if></td>
									<td>${ckx.tb_checkinorder.tb_guest.gt_name }</td>
									<td>${ckx.tb_checkinorder.tb_guest.gt_cardId }</td>
									<td>${ckx.tb_checkinorder.tb_guest.gt_mobile }</td>
									<td>
										<button>查看详情</button>
										<button>退房</button>
									</td>
								</tr>
							</c:forEach>

						</table>
					</div>
				</div>
				<div class="behindset_03div">

					<table cellpadding="0" cellspacing="0">
						<tr>
							<td>客房类型编号</td>
							<td>客房类型名称</td>
							<td>床位数</td>
							<td>预定价格</td>
							<td>预订折扣</td>
							<td>计时最低价</td>
							<td>计时每小时价</td>
						</tr>
						<c:forEach var="rc" items="${listrml }">
							<tr>
								<td>${rc.rc_id }</td>
								<td>${rc.rc_name }</td>
								<td>${rc.rc_bedNumber }</td>
								<td>${rc.rc_prePrice }</td>
								<td>${rc.rc_prediscount }</td>
								<td>${rc.rc_hourbasePrice }</td>
								<td>${rc.rc_perhourPrice }</td>
							</tr>
						</c:forEach>
					</table>
					</table>
				</div>
				<!--
							后台密码修改
						-->
				<div class="liftroommanagediv">
					<div class="jurisdiction">
						<div class="jurisdictionDiv">
							<table cellpadding="0" cellspacing="0">
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
							<table cellpadding="0" cellspacing="0">
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
		/* if ("${state}" == "ckx"||"${state}" == "rmck") {
			$(".behindset_01div").show();
			$(".M2").parent().removeClass("selected");
			$(".M2").parent().addClass("selected");
			$(".M2").siblings(".list-item").show();
		}
		if ("${state}" == "tfck") {
			$(".behindset_02div").show();
			$(".M2").parent().removeClass("selected");
			$(".M2").parent().addClass("selected");
			$(".M2").siblings(".list-item").show();
		}
		if ("${state}" == "rmlck") {
			$(".behindset_03div").show();
			$(".M2").parent().removeClass("selected");
			$(".M2").parent().addClass("selected");
			$(".M2").siblings(".list-item").show();
		}
		if ("${state}" == "ck") {
			$(".infofind_01div").show();
			$(".M3").parent().removeClass("selected");
			$(".M3").parent().addClass("selected");
			$(".M3").siblings(".list-item").show();
		} 
		if("${state}" == "gs") {
			$(".infofind_02div").show();
			$(".M3").parent().removeClass("selected");
			$(".M3").parent().addClass("selected");
			$(".M3").siblings(".list-item").show();
		} 
		if ("${state}" == "rm") {
			$(".roomset_02div").show();
			$(".M4").parent().removeClass("selected");
			$(".M4").parent().addClass("selected");
			$(".M4").siblings(".list-item").show();
		}
		if ("${state}" == "rml") {
			$(".roomset_01div").show();
			$(".M4").parent().removeClass("selected");
			$(".M4").parent().addClass("selected");
			$(".M4").siblings(".list-item").show();
		}

		if ("${state}" == "op") {
			$(".roommanage_01div").show();
			$(".M5").parent().removeClass("selected");
			$(".M5").parent().addClass("selected");
			$(".M5").siblings(".list-item").show();
		} 
		if ("${state}" == "brs") {
			$(".roommanage_02div").show();
			$(".M5").parent().removeClass("selected");
			$(".M5").parent().addClass("selected");
			$(".M5").siblings(".list-item").show();
		}
		if ("${state}" == "brp") {
			$(".roommanage_03div").show();
			$(".M5").parent().removeClass("selected");
			$(".M5").parent().addClass("selected");
			$(".M5").siblings(".list-item").show();
		} */
		$(".roommanage_01").click(function() {
			$(".roommanage_01div table").text("");
			var tr = document.createElement("tr");
			var td = document.createElement("td");
			var td1 = document.createElement("td");
			var td2 = document.createElement("td");
			var td3 = document.createElement("td");
			var td4 = document.createElement("td");
			var td5 = document.createElement("td");
			var td6 = document.createElement("td");
			var td7 = document.createElement("td");
			var td8 = document.createElement("td");
			var td9 = document.createElement("td");
			td.append("用户名");
			td1.append("密码");
			td2.append("身份");
			td3.append("地址");
			td4.append("姓名");
			td5.append("手机号");
			td6.append("固定电话");
			td7.append("邮政编码");
			td8.append("创建时间");
			td9.append("操作");
			tr.appendChild(td);
			tr.appendChild(td1);
			tr.appendChild(td2);
			tr.appendChild(td3);
			tr.appendChild(td4);
			tr.appendChild(td5);
			tr.appendChild(td6);
			tr.appendChild(td7);
			tr.appendChild(td8);
			tr.appendChild(td9);
			$(".roommanage_01div .tables").append(tr); 
			$.ajax({
				"url":"tb_operator.do?c=getAllTb_operator",
				"type":"post",
				"success":function(res){
					var array = jQuery.parseJSON(res);
					 for (var i = 0; i < array.length; i++) {
						var tr = document.createElement("tr");
						var td = document.createElement("td");
						var td1 = document.createElement("td");
						var td2 = document.createElement("td");
						var td3 = document.createElement("td");
						var td4 = document.createElement("td");
						var td5 = document.createElement("td");
						var td6 = document.createElement("td");
						var td7 = document.createElement("td");
						var td8 = document.createElement("td");
						var td9 = document.createElement("td");
						var input = document.createElement('input');
						var input1 = document.createElement('input');
						input.type = 'button';
						input.value = '修改';
						input.className="updop";
						input1.type = 'button';
						input1.value = '删除';
						input1.className="delop";
						td.append(array[i].op_userName);
						td1.append(array[i].op_passWord);
						td2.append(array[i].op_privilege);
						td3.append(array[i].op_address);
						td4.append(array[i].op_name);
						td5.append(array[i].op_telephone);
						if(array[i].op_mobile!=undefined){
							td6.append(array[i].op_mobile);
						}else{
							td6.append();
						}
						
						td7.append(array[i].op_zip);
						td8.append(array[i].op_createTime);
						td9.append(input);
						td9.append(input1);
						tr.appendChild(td);
						tr.appendChild(td1);
						tr.appendChild(td2);
						tr.appendChild(td3);
						tr.appendChild(td4);
						tr.appendChild(td5);
						tr.appendChild(td6);
						tr.appendChild(td7);
						tr.appendChild(td8);
						tr.appendChild(td9);
						$(".roommanage_01div .tables").append(tr); 
					}
				}
			});
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
			<%-- window.location = "<%=basePath%>/tb_operator.do?c=getAllTb_operator"; --%>
			
			
		})
		$(".roommanage_02").click(function() {
			$.ajax({
				"url":"tb_balancement.do?c=getAllRefundState",
				"type":"post",
				"data":"",
				"datatype":"JSON",
				"success":function(res){
/* 					alert(res);
					alert(jQuery.parseJSON(res)); */
					var array = jQuery.parseJSON(res)
					/* for (var i = 0; i < array.length; i++) {
						var tr = document.createElement("tr");
						var td = document.createElement("td");
						td.append(array[i].op_createTime);
						tr.appendChild(td);
						$(".roommanage_01div table").append(tr); 
					}*/
				}
			});
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
			<%-- window.location = "<%=basePath%>/tb_balancement.do?c=getAllRefundState"; --%>
		})
		$(".roommanage_03").click(function() {
			$.ajax({
				"url":"tb_balancement.do?c=getAllReceipt",
				"type":"post",
				"data":"",
				"datatype":"JSON",
				"success":function(res){
/* 					alert(res);
					alert(jQuery.parseJSON(res)); */
					var array = jQuery.parseJSON(res)
					/* for (var i = 0; i < array.length; i++) {
						var tr = document.createElement("tr");
						var td = document.createElement("td");
						td.append(array[i].op_createTime);
						tr.appendChild(td);
						$(".roommanage_01div table").append(tr); 
					}*/
				}
			});
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
			<%-- window.location = "<%=basePath%>/tb_balancement.do?c=getAllReceipt"; --%>
		})

		$(".infofind_01").click(function() {
			$.ajax({
				"url":"tb_checkinitem.do?c=getAllTb_checkinitemAndTb_checkinorderAndTb_balancement",
				"type":"post",
				"data":"",
				"datatype":"JSON",
				"success":function(res){
/* 					alert(res);
					alert(jQuery.parseJSON(res)); */
					var array = jQuery.parseJSON(res)
					/* for (var i = 0; i < array.length; i++) {
						var tr = document.createElement("tr");
						var td = document.createElement("td");
						td.append(array[i].op_createTime);
						tr.appendChild(td);
						$(".roommanage_01div table").append(tr); 
					}*/
				}
			});
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
			<%-- window.location = "<%=basePath%>/tb_checkinitem.do?c=getAllTb_checkinitemAndTb_checkinorderAndTb_balancement"; --%>
		})
		$(".infofind_02").click(function() {
			$.ajax({
				"url":"tb_guest.do?c=getAllTb_guest",
				"type":"post",
				"data":"",
				"datatype":"JSON",
				"success":function(res){
/* 					alert(res);
					alert(jQuery.parseJSON(res)); */
					var array = jQuery.parseJSON(res)
					/* for (var i = 0; i < array.length; i++) {
						var tr = document.createElement("tr");
						var td = document.createElement("td");
						td.append(array[i].op_createTime);
						tr.appendChild(td);
						$(".roommanage_01div table").append(tr); 
					}*/
				}
			});
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
			<%-- window.location = "<%=basePath%>/tb_guest.do?c=getAllTb_guest"; --%>
		})
		$(".roomset_01")
				.click(
						function() {
							$.ajax({
								"url":"tb_roomcatalog.do?c=getAllTb_roomcatalog",
								"type":"post",
								"data":"",
								"datatype":"JSON",
								"success":function(res){
				/* 					alert(res);
									alert(jQuery.parseJSON(res)); */
									var array = jQuery.parseJSON(res)
									/* for (var i = 0; i < array.length; i++) {
										var tr = document.createElement("tr");
										var td = document.createElement("td");
										td.append(array[i].op_createTime);
										tr.appendChild(td);
										$(".roommanage_01div table").append(tr); 
									}*/
								}
							});
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
							<%-- window.location = "<%=basePath%>/tb_roomcatalog.do?c=getAllTb_roomcatalog"; --%>
						})
		$(".roomset_02")
				.click(
						function() {
							$.ajax({
								"url":"tb_room.do?c=getAllTb_room",
								"type":"post",
								"data":"",
								"datatype":"JSON",
								"success":function(res){
				/* 					alert(res);
									alert(jQuery.parseJSON(res)); */
									var array = jQuery.parseJSON(res)
									/* for (var i = 0; i < array.length; i++) {
										var tr = document.createElement("tr");
										var td = document.createElement("td");
										td.append(array[i].op_createTime);
										tr.appendChild(td);
										$(".roommanage_01div table").append(tr); 
									}*/
								}
							});
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
							<%-- window.location = "<%=basePath%>/tb_room.do?c=getAllTb_room"; --%>
						})
		$(".behindset_01")
				.click(
						function() {
							$.ajax({
								"url":"tb_checkinitem.do?c=getAllTb_room",
								"type":"post",
								"data":"",
								"datatype":"JSON",
								"success":function(res){
				/* 					alert(res);
									alert(jQuery.parseJSON(res)); */
									var array = jQuery.parseJSON(res)
									/* for (var i = 0; i < array.length; i++) {
										var tr = document.createElement("tr");
										var td = document.createElement("td");
										td.append(array[i].op_createTime);
										tr.appendChild(td);
										$(".roommanage_01div table").append(tr); 
									}*/
								}
							});
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
							<%-- window.location = "<%=basePath%>tb_checkinitem.do?c=getAllTb_room"; --%>
						})
		$(".behindset_02")
				.click(
						function() {
							$.ajax({
								"url":"tb_checkinitem.do?c=getByStateTb_checkinitem",
								"type":"post",
								"data":"",
								"datatype":"JSON",
								"success":function(res){
				/* 					alert(res);
									alert(jQuery.parseJSON(res)); */
									var array = jQuery.parseJSON(res)
									/* for (var i = 0; i < array.length; i++) {
										var tr = document.createElement("tr");
										var td = document.createElement("td");
										td.append(array[i].op_createTime);
										tr.appendChild(td);
										$(".roommanage_01div table").append(tr); 
									}*/
								}
							});
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
							<%-- window.location = "<%=basePath%>/tb_checkinitem.do?c=getByStateTb_checkinitem"; --%>
						})
		$(".behindset_03")
				.click(
						function() {
							$.ajax({
								"url":"tb_roomcatalog.do?c=getAllTb_roomcatalogCK",
								"type":"post",
								"data":"",
								"datatype":"JSON",
								"success":function(res){
				/* 					alert(res);
									alert(jQuery.parseJSON(res)); */
									var array = jQuery.parseJSON(res)
									/* for (var i = 0; i < array.length; i++) {
										var tr = document.createElement("tr");
										var td = document.createElement("td");
										td.append(array[i].op_createTime);
										tr.appendChild(td);
										$(".roommanage_01div table").append(tr); 
									}*/
								}
							});
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
							<%-- window.location = "<%=basePath%>/tb_roomcatalog.do?c=getAllTb_roomcatalogCK"; --%>
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
		$(".exit").click(function(){
			window.location = "http://localhost:11170/hotel/home/log.do?c=returnHome";
			
		});
	</script>
</body>

</html>