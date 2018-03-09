// JavaScript Document
//入住订单
function getckrm() {
	$("video").trigger("pause");
	$(".behindset_01div .roompicul").text("");
	$.ajax({
		"url" : "tb_checkinitem.do?c=getAllTb_room",
		"type" : "post",
		"success" : function(res) {
			var array = jQuery.parseJSON(res);
			for (var i = 0; i < array.length; i++) {
				var li = document.createElement("li");
				var div = document.createElement("div");
				var img = document.createElement("img");
				var a = document.createElement("a");
				if (array[i].rm_state == 0) {
					img.src = "images/room3.jpg";
					a.append(array[i].rm_id);
				}
				if (array[i].rm_state == 1) {
					img.src = "images/room1.jpg";
					a.append(array[i].rm_id);
				}
				if (array[i].rm_state == 2) {
					img.src = "images/room4.jpg";
					a.append(array[i].rm_id);
				}
				if (array[i].rm_state == 3) {
					img.src = "images/room2.jpg";
					a.append(array[i].rm_id);
				}
				div.appendChild(img);
				div.appendChild(a);
				li.appendChild(div);
				$(".behindset_01div .roompicul").append(li);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "behindset_01a";
	weizhia.append("查询房间");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 位置入住申请
function getckrma() {
	$("video").trigger("pause");
	if ($(".M2").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M2").parent().addClass("selected");
		$(".M2").siblings(".list-item").slideDown(600);
	}
	$(".behindset_01div .roompicul").text("");
	$.ajax({
		"url" : "tb_checkinitem.do?c=getAllTb_room",
		"type" : "post",
		"success" : function(res) {
			var array = jQuery.parseJSON(res);
			for (var i = 0; i < array.length; i++) {
				var li = document.createElement("li");
				var div = document.createElement("div");
				var img = document.createElement("img");
				var a = document.createElement("a");
				if (array[i].rm_state == 0) {
					img.src = "images/room3.jpg";
					a.append(array[i].rm_id);
				}
				if (array[i].rm_state == 1) {
					img.src = "images/room1.jpg";
					a.append(array[i].rm_id);
				}
				if (array[i].rm_state == 2) {
					img.src = "images/room4.jpg";
					a.append(array[i].rm_id);
				}
				if (array[i].rm_state == 3) {
					img.src = "images/room2.jpg";
					a.append(array[i].rm_id);
				}
				div.appendChild(img);
				div.appendChild(a);
				li.appendChild(div);
				$(".behindset_01div .roompicul").append(li);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "behindset_01a";
	weizhia.append("查询房间");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 退房
function getcktf() {
	$("video").trigger("pause");
	$(".behindset_02div .tabletf").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	td.append("登记编号");
	td1.append("订单编号");
	td2.append("客房编号");
	td3.append("每日实际价格(元)");
	td4.append("每日折扣(元)");
	td5.append("入住时间");
	td6.append("离开时间");
	td7.append("姓名");
	td8.append("身份证号");
	td9.append("手机号");
	td10.append("操作");
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
	tr.appendChild(td10);
	$(".behindset_02div .tabletf").append(tr);
	$.ajax({
		"url" : "tb_checkinitem.do?c=getByStateTb_checkinitem",
		"type" : "post",
		"datatype" : "JSON",
		"success" : function(res) {
			var array = JSON.parse(res);
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
				var td10 = document.createElement("td");
				var input1 = document.createElement('input');
				input1.type = 'button';
				input1.value = '退房';
				input1.className = "cktf";
				td.append(array[i].cim_id);
				td1.append(array[i].cim_chechinorderId);
				td2.append(array[i].cim_roomId);
				td3.append(array[i].cim_prctPrice);
				td4.append(array[i].cim_discount);
				td5.append(array[i].cim_inDateTime);
				if (array[i].cim_outdateTime != undefined) {
					td6.append(array[i].cim_outdateTime);
				}else{
					td6.append("未离开");
				}
				td7.append(array[i].cim_name);
				td8.append(array[i].cim_cardId);
				td9.append(array[i].cim_phone);
				td10.append(input1);
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
				tr.appendChild(td10);
				$(".behindset_02div .tabletf").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "behindset_02a";
	weizhia.append("申请退房");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 位置退房
function getcktfa() {
	$("video").trigger("pause");
	if ($(".M2").parent().hasClass("selected")) {

	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M2").parent().addClass("selected");
		$(".M2").siblings(".list-item").slideDown(600);
	}
	$(".behindset_02div .tabletf").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	td.append("登记编号");
	td1.append("订单编号");
	td2.append("客房编号");
	td3.append("每日实际价格(元)");
	td4.append("每日折扣(元)");
	td5.append("入住时间");
	td6.append("离开时间");
	td7.append("姓名");
	td8.append("身份证号");
	td9.append("手机号");
	td10.append("操作");
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
	tr.appendChild(td10);
	$(".behindset_02div .tabletf").append(tr);
	$.ajax({
		"url" : "tb_checkinitem.do?c=getByStateTb_checkinitem",
		"type" : "post",
		"datatype" : "JSON",
		"success" : function(res) {
			var array = JSON.parse(res);
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
				var td10 = document.createElement("td");
				var input1 = document.createElement('input');
				input1.type = 'button';
				input1.value = '退房';
				input1.className = "cktf";
				td.append(array[i].cim_id);
				td1.append(array[i].cim_chechinorderId);
				td2.append(array[i].cim_roomId);
				td3.append(array[i].cim_prctPrice);
				td4.append(array[i].cim_discount);
				td5.append(array[i].cim_inDateTime);
				if (array[i].cim_outdateTime != undefined) {
					td6.append(array[i].cim_outdateTime);
				}else{
					td6.append("未离开");
				}
				td7.append(array[i].cim_name);
				td8.append(array[i].cim_cardId);
				td9.append(array[i].cim_phone);
				td10.append(input1);
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
				tr.appendChild(td10);
				$(".behindset_02div .tabletf").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "behindset_02a";
	weizhia.append("申请退房");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 获取所有房间类型
function getckrml() {
	$("video").trigger("pause");
	$("video").hide();
	$(".behindset_03div .tableckrml").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	td.append("客房类型编号");
	td1.append("客房类型名称");
	td2.append("床位数");
	td3.append("预定价格(元)");
	td4.append("预定折扣(元)");
	td5.append("计时最低价(元)");
	td6.append("计时每小时价(元)");
	tr.appendChild(td);
	tr.appendChild(td1);
	tr.appendChild(td2);
	tr.appendChild(td3);
	tr.appendChild(td4);
	tr.appendChild(td5);
	tr.appendChild(td6);
	$(".behindset_03div .tableckrml").append(tr);
	$.ajax({
		"url" : "tb_roomcatalog.do?c=getStateAllTb_roomcatalog",
		"type" : "post",
		"success" : function(res) {
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
				td.append(array[i].rc_id);
				td1.append(array[i].rc_name);
				td2.append(array[i].rc_bedNumber);
				td3.append(array[i].rc_prePrice);
				td4.append(array[i].rc_prediscount);
				td5.append(array[i].rc_hourbasePrice);
				td6.append(array[i].rc_perhourPrice);
				tr.appendChild(td);
				tr.appendChild(td1);
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				tr.appendChild(td5);
				tr.appendChild(td6);
				$(".behindset_03div .tableckrml").append(tr);
			}
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "behindset_03a";
	weizhia.append("客房类型");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 位置获取所有房间类型
function getckrmla() {
	$("video").trigger("pause");
	if ($(".M2").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M2").parent().addClass("selected");
		$(".M2").siblings(".list-item").slideDown(600);
	}
	$(".behindset_03div .tableckrml").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	td.append("客房类型编号");
	td1.append("客房类型名称");
	td2.append("床位数");
	td3.append("预定价格(元)");
	td4.append("预定折扣(元)");
	td5.append("计时最低价(元)");
	td6.append("计时每小时价(元)");
	tr.appendChild(td);
	tr.appendChild(td1);
	tr.appendChild(td2);
	tr.appendChild(td3);
	tr.appendChild(td4);
	tr.appendChild(td5);
	tr.appendChild(td6);
	$(".behindset_03div .tableckrml").append(tr);
	$.ajax({
		"url" : "tb_roomcatalog.do?c=getStateAllTb_roomcatalog",
		"type" : "post",
		"success" : function(res) {
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
				td.append(array[i].rc_id);
				td1.append(array[i].rc_name);
				td2.append(array[i].rc_bedNumber);
				td3.append(array[i].rc_prePrice);
				td4.append(array[i].rc_prediscount);
				td5.append(array[i].rc_hourbasePrice);
				td6.append(array[i].rc_perhourPrice);
				tr.appendChild(td);
				tr.appendChild(td1);
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				tr.appendChild(td5);
				tr.appendChild(td6);
				$(".behindset_03div .tableckrml").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "behindset_03a";
	weizhia.append("客房类型");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}

// 登记查询
function getallck() {
	$("video").trigger("pause");
	$(".infofind_01div .tableck").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	td.append("登记编号");
	td1.append("订单编号");
	td2.append("客房编号");
	td3.append("每日实际价格(元)");
	td4.append("每日折扣(元)");
	td5.append("入住时间");
	td6.append("离开时间");
	td7.append("登记状态");
	td8.append("姓名");
	td9.append("身份证号");
	td10.append("手机号");
	td11.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	$(".infofind_01div .tableck").append(tr);
	$
			.ajax({
				"url" : "tb_checkinitem.do?c=getAllTb_checkinitemAndTb_checkinorderAndTb_balancement",
				"type" : "post",
				"datatype" : "JSON",
				"success" : function(res) {
					var array = JSON.parse(res);
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
						var td10 = document.createElement("td");
						var td11 = document.createElement("td");
						var input = document.createElement('input');
						input.type = 'button';
						input.value = '查看详情';
						input.className = "getallck";
						td.append(array[i].cim_id);
						td1.append(array[i].cim_chechinorderId);
						td2.append(array[i].cim_roomId);
						td3.append(array[i].cim_prctPrice);
						td4.append(array[i].cim_discount);
						td5.append(array[i].cim_inDateTime);
						td6.append(array[i].cim_outdateTime);
						if (array[i].cim_state == 0) {
							td7.append("在住");
						}
						if (array[i].cim_state == 1) {
							td7.append("预定");
						}
						if (array[i].cim_state == 2) {
							td7.append("退房");
						}
						td8.append(array[i].cim_name);
						td9.append(array[i].cim_cardId);
						td10.append(array[i].cim_phone);
						td11.append(input);
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
						tr.appendChild(td10);
						tr.appendChild(td11);
						$(".infofind_01div .tableck").append(tr);
					}
				}
			});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "infofind_01a";
	weizhia.append("登记查询");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 登记查询位置
function getallcka() {
	$("video").trigger("pause");
	if ($(".M3").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M3").parent().addClass("selected");
		$(".M3").siblings(".list-item").slideDown(600);
	}
	$(".infofind_01div .tableck").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	td.append("登记编号");
	td1.append("订单编号");
	td2.append("客房编号");
	td3.append("每日实际价格(元)");
	td4.append("每日折扣(元)");
	td5.append("入住时间");
	td6.append("离开时间");
	td7.append("登记状态");
	td8.append("姓名");
	td9.append("身份证号");
	td10.append("手机号");
	td11.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	$(".infofind_01div .tableck").append(tr);
	$
			.ajax({
				"url" : "tb_checkinitem.do?c=getAllTb_checkinitemAndTb_checkinorderAndTb_balancement",
				"type" : "post",
				"datatype" : "JSON",
				"success" : function(res) {
					var array = JSON.parse(res);
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
						var td10 = document.createElement("td");
						var td11 = document.createElement("td");
						var input = document.createElement('input');
						input.type = 'button';
						input.value = '查看详情';
						input.className = "getallck";
						td.append(array[i].cim_id);
						td1.append(array[i].cim_chechinorderId);
						td2.append(array[i].cim_roomId);
						td3.append(array[i].cim_prctPrice);
						td4.append(array[i].cim_discount);
						td5.append(array[i].cim_inDateTime);
						td6.append(array[i].cim_outdateTime);
						if (array[i].cim_state == 0) {
							td7.append("在住");
						}
						if (array[i].cim_state == 1) {
							td7.append("预定");
						}
						if (array[i].cim_state == 2) {
							td7.append("退房");
						}
						td8.append(array[i].cim_name);
						td9.append(array[i].cim_cardId);
						td10.append(array[i].cim_phone);
						td11.append(input);
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
						tr.appendChild(td10);
						tr.appendChild(td11);
						$(".infofind_01div .tableck").append(tr);
					}
				}
			});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "infofind_01a";
	weizhia.append("登记查询");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 查看会员
function getallgs() {
	$("video").trigger("pause");
	$(".infofind_02div .tablegs").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	var td12 = document.createElement("th");
	td.append("姓名");
	td1.append("性别");
	td2.append("类型");
	td3.append("证件类型");
	td4.append("证件号码");
	td5.append("国籍");
	td6.append("地址");
	td7.append("工作单位");
	td8.append("手机号");
	td9.append("资料创建时间");
	td10.append("消费次数");
	td11.append("消费总额");
	td12.append("会员等级");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	tr.appendChild(td12);
	$(".infofind_02div .tablegs").append(tr);
	$.ajax({
		"url" : "tb_guest.do?c=getAllTb_guest",
		"type" : "post",
		"success" : function(res) {
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var td12 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'hidden';
				input.value = array[i].gt_id;
				input.className = "guid";
				td.append(array[i].gt_name);
				td1.append(array[i].gt_gender);
				td2.append(array[i].tb_putype.pt_typeName);
				td3.append(array[i].tb_pucard.pc_cardCatalogName);
				td4.append(array[i].gt_cardId);
				td5.append(array[i].tb_pucountry.pct_countryName);
				td6.append(array[i].gt_address);
				td7.append(array[i].gt_company);
				td8.append(array[i].gt_mobile);
				td9.append(array[i].gt_createtime);
				td10.append(array[i].gt_nuber);
				td11.append(array[i].gt_expenditure);
				td12.append(array[i].tb_pucategory.pcg_categoryName);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				tr.appendChild(td12);
				tr.appendChild(input);
				$(".infofind_02div .tablegs").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "infofind_02a";
	weizhia.append("会员查询");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 查看会员位置
function getallgsa() {
	$("video").trigger("pause");
	if ($(".M3").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M3").parent().addClass("selected");
		$(".M3").siblings(".list-item").slideDown(600);
	}
	$(".infofind_02div .tablegs").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	var td12 = document.createElement("th");
	td.append("姓名");
	td1.append("性别");
	td2.append("类型");
	td3.append("证件类型");
	td4.append("证件号码");
	td5.append("国籍");
	td6.append("地址");
	td7.append("工作单位");
	td8.append("手机号");
	td9.append("资料创建时间");
	td10.append("消费次数");
	td11.append("消费总额");
	td12.append("会员等级");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	tr.appendChild(td12);
	$(".infofind_02div .tablegs").append(tr);
	$.ajax({
		"url" : "tb_guest.do?c=getAllTb_guest",
		"type" : "post",
		"success" : function(res) {
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var td12 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'hidden';
				input.value = array[i].gt_id;
				input.className = "guid";
				td.append(array[i].gt_name);
				td1.append(array[i].gt_gender);
				td2.append(array[i].tb_putype.pt_typeName);
				td3.append(array[i].tb_pucard.pc_cardCatalogName);
				td4.append(array[i].gt_cardId);
				td5.append(array[i].tb_pucountry.pct_countryName);
				td6.append(array[i].gt_address);
				td7.append(array[i].gt_company);
				td8.append(array[i].gt_mobile);
				td9.append(array[i].gt_createtime);
				td10.append(array[i].gt_nuber);
				td11.append(array[i].gt_expenditure);
				td12.append(array[i].tb_pucategory.pcg_categoryName);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				tr.appendChild(td12);
				tr.appendChild(input);
				$(".infofind_02div .tablegs").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "infofind_02a";
	weizhia.append("会员查询");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}

// 获取所有房间类型
function getallrml(opstate) {
	$("video").trigger("pause");
	$(".roomset_01div .tablerml").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	td.append("客房类型编号");
	td1.append("客房类型名称");
	td2.append("床位数");
	td3.append("预定价格(元)");
	td4.append("预定折扣(元)");
	td5.append("计时最低价(元)");
	td6.append("计时每小时价(元)");
	td7.append("操作");
	tr.appendChild(td);
	tr.appendChild(td1);
	tr.appendChild(td2);
	tr.appendChild(td3);
	tr.appendChild(td4);
	tr.appendChild(td5);
	tr.appendChild(td6);
	tr.appendChild(td7);
	$(".roomset_01div .tablerml").append(tr);
	$.ajax({
		"url" : "tb_roomcatalog.do?c=getAllTb_roomcatalog",
		"type" : "post",
		"success" : function(res) {
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
				var input = document.createElement('input');
				var input1 = document.createElement('input');
				input.type = 'button';
				input.value = "修改";
				input.className = "updrml";
				input1.type = 'button';
				if (array[i].rc_state == 0) {
					input1.value = "开启入住";
				} else {
					input1.value = "停止入住";
				}
				input1.className = "delrml";
				td.append(array[i].rc_id);
				td1.append(array[i].rc_name);
				td2.append(array[i].rc_bedNumber);
				td3.append(array[i].rc_prePrice);
				td4.append(array[i].rc_prediscount);
				td5.append(array[i].rc_hourbasePrice);
				td6.append(array[i].rc_perhourPrice);
				td7.append(input);
				if (opstate == "2") {
					td7.append(input1);
				}
				tr.appendChild(td);
				tr.appendChild(td1);
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				tr.appendChild(td5);
				tr.appendChild(td6);
				tr.appendChild(td7);
				$(".roomset_01div .tablerml").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roomset_01a";
	weizhia.append("客房类型");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 获取所有房间类型位置
function getallrmla(opstate) {
	$("video").trigger("pause");
	if ($(".M4").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M4").parent().addClass("selected");
		$(".M4").siblings(".list-item").slideDown(600);
	}
	$(".roomset_01div .tablerml").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	td.append("客房类型编号");
	td1.append("客房类型名称");
	td2.append("床位数");
	td3.append("预定价格(元)");
	td4.append("预定折扣(元)");
	td5.append("计时最低价(元)");
	td6.append("计时每小时价(元)");
	td7.append("操作");
	tr.appendChild(td);
	tr.appendChild(td1);
	tr.appendChild(td2);
	tr.appendChild(td3);
	tr.appendChild(td4);
	tr.appendChild(td5);
	tr.appendChild(td6);
	tr.appendChild(td7);
	$(".roomset_01div .tablerml").append(tr);
	$.ajax({
		"url" : "tb_roomcatalog.do?c=getAllTb_roomcatalog",
		"type" : "post",
		"success" : function(res) {
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
				var input = document.createElement('input');
				var input1 = document.createElement('input');
				input.type = 'button';
				input.value = "修改";
				input.className = "updrml";
				input1.type = 'button';
				if (array[i].rc_state == 0) {
					input1.value = "开启入住";
				} else {
					input1.value = "停止入住";
				}
				input1.className = "delrml";
				td.append(array[i].rc_id);
				td1.append(array[i].rc_name);
				td2.append(array[i].rc_bedNumber);
				td3.append(array[i].rc_prePrice);
				td4.append(array[i].rc_prediscount);
				td5.append(array[i].rc_hourbasePrice);
				td6.append(array[i].rc_perhourPrice);
				td7.append(input);
				if (opstate == "2") {
					td7.append(input1);
				}
				tr.appendChild(td);
				tr.appendChild(td1);
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				tr.appendChild(td5);
				tr.appendChild(td6);
				tr.appendChild(td7);
				$(".roomset_01div .tablerml").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roomset_01a";
	weizhia.append("客房类型");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}

// 获取所有房间信息
function getallrm(opstate) {
	$("video").trigger("pause");
	$(".roomset_02div .tablerm").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	td.append("客房编号");
	td1.append("所属区域");
	td2.append("所属楼层");
	td3.append("实际价格(元)");
	td4.append("分机号码");
	td5.append("客房状态");
	td6.append("是否可用");
	td7.append("房间类型");
	td8.append("实际折扣(元)");
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
	$(".roomset_02div .tablerm").append(tr);
	$.ajax({
		"url" : "tb_room.do?c=getAllTb_room",
		"type" : "post",
		"success" : function(res) {
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
				var getimg = document.createElement("input");
				var imgsrc = document.createElement("input");
				var td9 = document.createElement("td");
				var input = document.createElement('input');
				var input1 = document.createElement('input');
				getimg.type = 'button';
				getimg.value = "查看图片";
				getimg.className = "getimg";
				imgsrc.type = 'hidden';
				imgsrc.value = array[i].rm_picture;
				imgsrc.className = "imgsrc";
				input.type = 'button';
				input.value = "修改";
				input.className = "updrm";
				input1.type = 'button';
				if (array[i].rm_statex == 0) {
					input1.value = "开启入住";
				} else {
					input1.value = "停止入住";
				}
				input1.className = "delrm";
				td.append(array[i].rm_id);
				td1.append(array[i].rm_area);
				td2.append(array[i].rm_floor);
				td3.append(array[i].rm_prctPrice);
				td4.append(array[i].rm_telphone);
				if (array[i].rm_state == 0) {
					td5.append("空闲");
				}
				if (array[i].rm_state == 1) {
					td5.append("已预订");
				}
				if (array[i].rm_state == 2) {
					td5.append("已入住");
				}
				if (array[i].rm_state == 3) {
					td5.append("维修中");
				}
				if (array[i].rm_available > 0) {
					td6.append("可用");
				} else {
					td6.append("不可用");
				}
				td7.append(array[i].tb_roomcatalog.rc_name);
				td8.append(array[i].rm_prctdiscount);
				td9.append(getimg);
				td9.append(imgsrc);
				td9.append(input);
				if (opstate == "2") {
					td9.append(input1);
				}
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
				$(".roomset_02div .tablerm").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roomset_02a";
	weizhia.append("客房信息");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 获取所有房间信息位置
function getallrma(opstate) {
	$("video").trigger("pause");
	if ($(".M4").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M4").parent().addClass("selected");
		$(".M4").siblings(".list-item").slideDown(600);
	}
	$(".roomset_02div .tablerm").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	td.append("客房编号");
	td1.append("所属区域");
	td2.append("所属楼层");
	td3.append("实际价格(元)");
	td4.append("分机号码");
	td5.append("客房状态");
	td6.append("是否可用");
	td7.append("房间类型");
	td8.append("实际折扣(元)");
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
	$(".roomset_02div .tablerm").append(tr);
	$.ajax({
		"url" : "tb_room.do?c=getAllTb_room",
		"type" : "post",
		"success" : function(res) {
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
				var getimg = document.createElement("input");
				var imgsrc = document.createElement("input");
				var td9 = document.createElement("td");
				var input = document.createElement('input');
				var input1 = document.createElement('input');
				getimg.type = 'button';
				getimg.value = "查看图片";
				getimg.className = "getimg";
				imgsrc.type = 'hidden';
				imgsrc.value = array[i].rm_picture;
				imgsrc.className = "imgsrc";
				input.type = 'button';
				input.value = "修改";
				input.className = "updrm";
				input1.type = 'button';
				if (array[i].rm_statex == 0) {
					input1.value = "开启入住";
				} else {
					input1.value = "关闭入住";
				}
				input1.className = "delrm";
				td.append(array[i].rm_id);
				td1.append(array[i].rm_area);
				td2.append(array[i].rm_floor);
				td3.append(array[i].rm_prctPrice);
				td4.append(array[i].rm_telphone);
				if (array[i].rm_state == 0) {
					td5.append("空闲");
				}
				if (array[i].rm_state == 1) {
					td5.append("已预订");
				}
				if (array[i].rm_state == 2) {
					td5.append("已入住");
				}
				if (array[i].rm_state == 3) {
					td5.append("维修中");
				}
				if (array[i].rm_available > 0) {
					td6.append("可用");
				} else {
					td6.append("不可用");
				}
				td7.append(array[i].tb_roomcatalog.rc_name);
				td8.append(array[i].rm_prctdiscount);
				td9.append(getimg);
				td9.append(imgsrc);
				td9.append(input);
				if (opstate == "2") {
					td9.append(input1);
				}
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
				$(".roomset_02div .tablerm").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roomset_02a";
	weizhia.append("客房信息");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 操作员管理
function getallop(opstate) {
	$("video").trigger("pause");
	$(".roommanage_01div .tables").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
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
		"url" : "tb_operator.do?c=getAllTb_operator",
		"type" : "post",
		"success" : function(res) {
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
				input.className = "updop";
				input1.type = 'button';
				if (array[i].op_state == 0) {
					input1.value = '开启';
				} else {
					input1.value = '停止';
				}
				input1.className = "delop";
				td.append(array[i].op_userName);
				td1.append(array[i].op_passWord);
				if (array[i].op_privilege == 0) {
					td2.append("前台");
				}
				if (array[i].op_privilege == 1) {
					td2.append("财务");
				}
				if (array[i].op_privilege == 2) {
					td2.append("管理员");
				}
				td3.append(array[i].op_address);
				td4.append(array[i].op_name);
				td5.append(array[i].op_telephone);
				if (array[i].op_mobile != undefined) {
					td6.append(array[i].op_mobile);
				} else {
					td6.append();
				}
				td7.append(array[i].op_zip);
				td8.append(array[i].op_createTime);
				td9.append(input);
				if (opstate == "2") {
					td9.append(input1);
				}
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
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roommanage_01a";
	weizhia.append("操作员管理");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}

// 操作员管理位置
function getallopa(opstate) {
	$("video").trigger("pause");
	if ($(".M5").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M5").parent().addClass("selected");
		$(".M5").siblings(".list-item").slideDown(600);
	}
	$(".roommanage_01div .tables").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
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
		"url" : "tb_operator.do?c=getAllTb_operator",
		"type" : "post",
		"success" : function(res) {
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
				input.className = "updop";
				input1.type = 'button';
				if (array[i].op_state == 0) {
					input1.value = '开启';
				} else {
					input1.value = '停止';
				}
				input1.className = "delop";
				td.append(array[i].op_userName);
				td1.append(array[i].op_passWord);
				if (array[i].op_privilege == 0) {
					td2.append("前台");
				}
				if (array[i].op_privilege == 1) {
					td2.append("财务");
				}
				if (array[i].op_privilege == 2) {
					td2.append("管理员");
				}
				td3.append(array[i].op_address);
				td4.append(array[i].op_name);
				td5.append(array[i].op_telephone);
				if (array[i].op_mobile != undefined) {
					td6.append(array[i].op_mobile);
				} else {
					td6.append();
				}
				td7.append(array[i].op_zip);
				td8.append(array[i].op_createTime);
				td9.append(input);
				if (opstate == "2") {
					td9.append(input1);
				}
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
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roommanage_01a";
	weizhia.append("操作员管理");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 退款审核
function getcktk() {
	$("video").trigger("pause");
	$(".roommanage_02div .tablers").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	var td12 = document.createElement("th");
	var td13 = document.createElement("th");
	var td14 = document.createElement("th");
	var td15 = document.createElement("th");
	var td16 = document.createElement("th");
	td.append("账单编号");
	td1.append("登记表编号");
	td2.append("姓名");
	td3.append("手机电话");
	td4.append("客房编号");
	td5.append("结账类型");
	td6.append("总计费用(元)");
	td7.append("操作员");
	td8.append("退款金额(元)");
	td9.append("退款状态");
	td10.append("持卡人姓名");
	td11.append("卡号");
	td12.append("持卡人身份证号");
	td13.append("持卡人手机号");
	td14.append("结账说明");
	td15.append("创建时间");
	td16.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	tr.appendChild(td12);
	tr.appendChild(td13);
	tr.appendChild(td14);
	tr.appendChild(td15);
	tr.appendChild(td16);
	$(".roommanage_02div .tablers").append(tr);
	$.ajax({
		"url" : "tb_balancement.do?c=getAllRefundState",
		"type" : "post",
		"success" : function(res) {
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var td12 = document.createElement("td");
				var td13 = document.createElement("td");
				var td14 = document.createElement("td");
				var td15 = document.createElement("td");
				var td16 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'button';
				input.value = '修改';
				input.className = "updrs";
				td.append(array[i].bm_id);
				td1.append(array[i].bm_checkinorderId);
				td2.append(array[i].tb_guest.gt_name);
				td3.append(array[i].tb_guest.gt_telPhone);
				td4.append(array[i].bm_roomId);
				td5.append(array[i].tb_pupaymenttype.ppt_guestTypeName);
				td6.append(array[i].bm_totalRate);
				td7.append(array[i].bm_operator);
				td8.append(array[i].bm_refund);
				if (array[i].bm_refundState == 0) {
					td9.append("未退款");
				} else {
					td9.append("已退款");
				}
				if (array[i].bm_cardName != undefined) {
					td10.append(array[i].bm_cardName);
				}
				if (array[i].bm_cardNumber != undefined) {
					td11.append(array[i].bm_cardNumber);
				}
				if (array[i].bm_cardId != undefined) {
					td12.append(array[i].bm_cardId);
				}
				if (array[i].bm_cardPhone != undefined) {
					td13.append(array[i].bm_cardPhone);
				}
				if (array[i].bm_remark != undefined) {
					td14.append(array[i].bm_remark);
				} else {
					td14.append();
				}
				td15.append(array[i].bm_createTime);
				td16.append(input);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				tr.appendChild(td12);
				tr.appendChild(td13);
				tr.appendChild(td14);
				tr.appendChild(td15);
				tr.appendChild(td16);
				$(".roommanage_02div .tablers").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roommanage_02a";
	weizhia.append("退款审核");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 退款审核
function getcktka() {
	$("video").trigger("pause");
	if ($(".M5").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M5").parent().addClass("selected");
		$(".M5").siblings(".list-item").slideDown(600);
	}
	$(".roommanage_02div .tablers").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	var td12 = document.createElement("th");
	var td13 = document.createElement("th");
	var td14 = document.createElement("th");
	var td15 = document.createElement("th");
	var td16 = document.createElement("th");
	td.append("账单编号");
	td1.append("登记表编号");
	td2.append("姓名");
	td3.append("手机电话");
	td4.append("客房编号");
	td5.append("结账类型");
	td6.append("总计费用(元)");
	td7.append("操作员");
	td8.append("退款金额(元)");
	td9.append("退款状态");
	td10.append("持卡人姓名");
	td11.append("卡号");
	td12.append("持卡人身份证号");
	td13.append("持卡人手机号");
	td14.append("结账说明");
	td15.append("创建时间");
	td16.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	tr.appendChild(td12);
	tr.appendChild(td13);
	tr.appendChild(td14);
	tr.appendChild(td15);
	tr.appendChild(td16);
	$(".roommanage_02div .tablers").append(tr);
	$.ajax({
		"url" : "tb_balancement.do?c=getAllRefundState",
		"type" : "post",
		"success" : function(res) {
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var td12 = document.createElement("td");
				var td13 = document.createElement("td");
				var td14 = document.createElement("td");
				var td15 = document.createElement("td");
				var td16 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'button';
				input.value = '修改';
				input.className = "updrs";
				td.append(array[i].bm_id);
				td1.append(array[i].bm_checkinorderId);
				td2.append(array[i].tb_guest.gt_name);
				td3.append(array[i].tb_guest.gt_telPhone);
				td4.append(array[i].bm_roomId);
				td5.append(array[i].tb_pupaymenttype.ppt_guestTypeName);
				td6.append(array[i].bm_totalRate);
				td7.append(array[i].bm_operator);
				td8.append(array[i].bm_refund);
				if (array[i].bm_refundState == 0) {
					td9.append("未退款");
				} else {
					td9.append("已退款");
				}
				if (array[i].bm_cardName != undefined) {
					td10.append(array[i].bm_cardName);
				}
				if (array[i].bm_cardNumber != undefined) {
					td11.append(array[i].bm_cardNumber);
				}
				if (array[i].bm_cardId != undefined) {
					td12.append(array[i].bm_cardId);
				}
				if (array[i].bm_cardPhone != undefined) {
					td13.append(array[i].bm_cardPhone);
				}
				if (array[i].bm_remark != undefined) {
					td14.append(array[i].bm_remark);
				} else {
					td14.append();
				}
				td15.append(array[i].bm_createTime);
				td16.append(input);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				tr.appendChild(td12);
				tr.appendChild(td13);
				tr.appendChild(td14);
				tr.appendChild(td15);
				tr.appendChild(td16);
				$(".roommanage_02div .tablers").append(tr);
			}
		}
	});
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roommanage_02a";
	weizhia.append("退款审核");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 发票审核
function getckfp() {
	$("video").trigger("pause");
	// ajax提交并新建表格
	$(".roommanage_03div .tablerp").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	var td12 = document.createElement("th");
	var td13 = document.createElement("th");
	var td14 = document.createElement("th");
	var td15 = document.createElement("th");
	var td16 = document.createElement("th");
	td.append("账单编号");
	td1.append("登记表编号");
	td2.append("姓名");
	td3.append("手机电话");
	td4.append("客房编号");
	td5.append("结账类型");
	td6.append("总计费用(元)");
	td7.append("操作员");
	td8.append("收件人姓名");
	td9.append("公司名称");
	td10.append("手机号");
	td11.append("邮寄地址");
	td12.append("开票状态");
	td13.append("结账说明");
	td14.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	tr.appendChild(td12);
	tr.appendChild(td13);
	tr.appendChild(td14);
	$(".roommanage_03div .tablerp").append(tr);
	$.ajax({
		"url" : "tb_balancement.do?c=getAllReceipt",
		"type" : "post",
		"success" : function(res) {
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var td12 = document.createElement("td");
				var td13 = document.createElement("td");
				var td14 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'button';
				input.value = '修改';
				input.className = "updrp";
				td.append(array[i].bm_id);
				td1.append(array[i].bm_checkinorderId);
				td2.append(array[i].tb_guest.gt_name);
				td3.append(array[i].tb_guest.gt_telPhone);
				td4.append(array[i].bm_roomId);
				td5.append(array[i].tb_pupaymenttype.ppt_guestTypeName);
				td6.append(array[i].bm_totalRate);
				td7.append(array[i].bm_operator);
				td8.append(array[i].tb_guest.gt_name);
				if (array[i].bm_company != undefined) {
					td9.append(array[i].bm_company);
				}
				if (array[i].bm_phone != undefined) {
					td10.append(array[i].bm_phone);
				}
				if (array[i].bm_address != undefined) {
					td11.append(array[i].bm_address);
				}
				if (array[i].bm_receiptStatus != 0) {
					td12.append("已开");
				} else {
					td12.append("未开");
				}
				if (array[i].bm_remark != undefined) {
					td13.append(array[i].bm_remark);
				}
				td14.append(input);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				tr.appendChild(td12);
				tr.appendChild(td13);
				tr.appendChild(td14);
				$(".roommanage_03div .tablerp").append(tr);
			}
		}
	});
	// 显示div
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roommanage_03a";
	weizhia.append("发票审核");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}
// 发票查询位置
function getckfpa() {
	$("video").trigger("pause");
	if ($(".M5").parent().hasClass("selected")) {
	} else {
		$("#nav_dot li").find(".list-item").slideUp(600);
		$("#nav_dot li").removeClass("selected");
		$(".M5").parent().addClass("selected");
		$(".M5").siblings(".list-item").slideDown(600);
	}
	// ajax提交并新建表格
	$(".roommanage_03div .tablerp").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	var td12 = document.createElement("th");
	var td13 = document.createElement("th");
	var td14 = document.createElement("th");
	var td15 = document.createElement("th");
	var td16 = document.createElement("th");
	td.append("账单编号");
	td1.append("登记表编号");
	td2.append("姓名");
	td3.append("手机电话");
	td4.append("客房编号");
	td5.append("结账类型");
	td6.append("总计费用(元)");
	td7.append("操作员");
	td8.append("收件人姓名");
	td9.append("公司名称");
	td10.append("手机号");
	td11.append("邮寄地址");
	td12.append("开票状态");
	td13.append("结账说明");
	td14.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	tr.appendChild(td12);
	tr.appendChild(td13);
	tr.appendChild(td14);
	$(".roommanage_03div .tablerp").append(tr);
	$.ajax({
		"url" : "tb_balancement.do?c=getAllReceipt",
		"type" : "post",
		"success" : function(res) {
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var td12 = document.createElement("td");
				var td13 = document.createElement("td");
				var td14 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'button';
				input.value = '修改';
				input.className = "updrp";
				td.append(array[i].bm_id);
				td1.append(array[i].bm_checkinorderId);
				td2.append(array[i].tb_guest.gt_name);
				td3.append(array[i].tb_guest.gt_telPhone);
				td4.append(array[i].bm_roomId);
				td5.append(array[i].tb_pupaymenttype.ppt_guestTypeName);
				td6.append(array[i].bm_totalRate);
				td7.append(array[i].bm_operator);
				td8.append(array[i].tb_guest.gt_name);
				if (array[i].bm_company != undefined) {
					td9.append(array[i].bm_company);
				}
				if (array[i].bm_cardPhone != undefined) {
					td10.append(array[i].bm_Phone);
				}
				if (array[i].bm_address != undefined) {
					td11.append(array[i].bm_address);
				}
				if (array[i].bm_receiptStatus != 0) {
					td12.append("已开");
				} else {
					td12.append("未开");
				}
				if (array[i].bm_remark != undefined) {
					td13.append(array[i].bm_remark);
				}
				td14.append(input);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				tr.appendChild(td12);
				tr.appendChild(td13);
				tr.appendChild(td14);
				$(".roommanage_03div .tablerp").append(tr);
			}
		}
	});
	// 显示div
	$("video").hide();
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
	// 新增位置
	var fuhao = document.createElement("li");
	var weizhili = document.createElement("li");
	var weizhia = document.createElement("a");
	weizhia.className = "roommanage_03a";
	weizhia.append("发票审核");
	fuhao.append(">");
	weizhili.append(weizhia);
	$(".right-nav>ul").append(fuhao);
	$(".right-nav>ul").append(weizhili);
	if ($(".right-nav>ul>li").length > 19) {
		$(".right-nav>ul>li:eq(3)").next().remove();
		$(".right-nav>ul>li:eq(3)").next().remove();
	}
}

// 停止入住客房类型
function stoprml(rmlid, opstate) {
	if (confirm("确定停止入住该客房类型下的房间以及客房类型吗？")) {
		$.ajax({
			"url" : "tb_roomcatalog.do?c=pauseTb_roomcatalog",
			"type" : "post",
			"data" : "rc_id=" + rmlid,
			"datatype" : "JSON",
			"success" : function(res) {
				if (res) {
					getallrml(opstate);
				} else {
					alert("停止入住客房失败！");
				}
			}
		})
	}
}
// 开放入住客房类型
function startrml(rmlid, opstate) {
	if (confirm("确定开放入住该客房类型吗？")) {
		if (confirm("是否同时开放该客房类型下的房间吗？")) {
			$.ajax({
				"url" : "tb_roomcatalog.do?c=startTb_roomcatalog",
				"type" : "post",
				"data" : "rc_id=" + rmlid,
				"datatype" : "JSON",
				"success" : function(res) {
					if (res) {
						getallrml(opstate);
					} else {
						alert("开启入住类型失败!该客房类型已经停止不能开启！");
					}
				}
			})
		} else {
			$.ajax({
				"url" : "tb_roomcatalog.do?c=startTb_roomcatalogx",
				"type" : "post",
				"data" : "rc_id=" + rmlid,
				"datatype" : "JSON",
				"success" : function(res) {
					if (res) {
						getallrml(opstate);
					} else {
						alert("开启入住类型失败!该客房类型已经停止不能开启！");
					}
				}
			})

		}
	}
}
// 开放入住客房信息
function startrm(rmid, opstate) {
	if (confirm("确定开启入住该客房信息？")) {
		$.ajax({
			"url" : "tb_room.do?c=startTb_room",
			"type" : "post",
			"data" : "rm_id=" + rmid,
			"datatype" : "JSON",
			"success" : function(res) {
				if (res) {
					getallrm(opstate);
				} else {
					alert("开启入住失败!\n该客房类型已停止入住！");
				}
			}
		})
	}
}

// 停止入住客房信息
function stoprm(rmid, opstate) {
	if (confirm("确定停止入住该客房信息？")) {
		$.ajax({
			"url" : "tb_room.do?c=pauseTb_room",
			"type" : "post",
			"data" : "rm_id=" + rmid,
			"datatype" : "JSON",
			"success" : function(res) {
				if (res) {
					getallrm(opstate);
				} else {
					alert("停止入住失败!");
				}
			}
		})
	}
}
// 停止操作员
function stopop(updname, opstate) {
	if (confirm("确定停止该操作员？")) {
		$.ajax({
			"url" : "tb_operator.do?c=pauseTb_operator",
			"type" : "post",
			"data" : "opusername=" + updname,
			"datatype" : "JSON",
			"success" : function(res) {
				if (res) {
					getallop(opstate);
				} else {
					alert("停止失败!");
				}
			}
		})
	}
}

// 开启操作员
function startop(updname, opstate) {
	if (confirm("确定开启该操作员？")) {
		$.ajax({
			"url" : "tb_operator.do?c=startTb_operator",
			"type" : "post",
			"data" : "opusername=" + updname,
			"datatype" : "JSON",
			"success" : function(res) {
				if (res) {
					getallop(opstate);
				} else {
					alert("开启失败!");
				}
			}
		})
	}
}

// 隐藏客房图片
function hidermimg() {
	$("#roomimg").hide();
	$("#roomimgtop").hide();
	$("#roomimgbotton").hide();
	$("#roomimgleft").hide();
	$("#roomimgright").hide();
}

// 保存更改发票信息
function updbmrp(bmrp, opstate) {
	$.ajax({
		"url" : "tb_balancement.do?c=updrpTb_balancement",
		"type" : "post",
		"data" : bmrp,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getckfp(opstate);
			} else {
				alert("更改失败!");
			}
		}
	})
}
// 修改退款信息
function updbmrs(bmrs, opstate) {
	$.ajax({
		"url" : "tb_balancement.do?c=updrsTb_balancement",
		"type" : "post",
		"data" : bmrs,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getcktk(opstate);
			} else {
				alert("更改失败!");
			}
		}
	})
}
// 修改密码
function updop(op, opstate) {
	$.ajax({
		"url" : "tb_operator.do?c=getByNameTb_operator",
		"type" : "post",
		"data" : op,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallop(opstate);
			} else {
				alert("更改失败!");
			}
		}
	})
}
// 修改密码
function oppassupdpass(oppass) {
	$
			.ajax({
				"url" : "tb_operator.do?c=updPassTb_operator",
				"type" : "post",
				"data" : oppass,
				"datatype" : "JSON",
				"success" : function(res) {
					if (res) {
						window.location = "http://192.168.10.123:8080/hotel/home/register.jsp";
					} else {
						alert("更改失败!");
					}
				}
			})
}
// 修改操作员信息
function updop(op, opstate) {
	$.ajax({
		"url" : "tb_operator.do?c=updTb_operator",
		"type" : "post",
		"data" : op,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallop(opstate);
			} else {
				alert("更改失败!");
			}
		}
	})
}
// 新增操作员信息
function addop(op, opstate) {
	$.ajax({
		"url" : "tb_operator.do?c=addTb_operator",
		"type" : "post",
		"data" : op,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallop(opstate);
			} else {
				alert("新增失败!");
			}
		}
	})
}
// 客房更改
function updrm(rm, opstate) {
	$.ajax({
		"url" : "tb_room.do?c=updTb_room",
		"type" : "post",
		"data" : rm,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallrm(opstate);
			} else {
				alert("更改失败!");
			}
		}
	})
}
// 新增客房
function addrm(rm, opstate) {
	$.ajax({
		"url" : "tb_room.do?c=addTb_room",
		"type" : "post",
		"data" : rm,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallrm(opstate);
			} else {
				alert("新增失败!");
			}
		}
	})
}
// 客房类型更改
function updrml(rml, opstate) {
	$.ajax({
		"url" : "tb_roomcatalog.do?c=updTb_roomcatalog",
		"type" : "post",
		"data" : rml,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallrml(opstate);
			} else {
				alert("更改失败!");
			}
		}
	})
}
// 新增客房类型
function addrml(rml, opstate) {
	$.ajax({
		"url" : "tb_roomcatalog.do?c=addTb_roomcatalog",
		"type" : "post",
		"data" : rml,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				getallrml(opstate);
			} else {
				alert("新增失败!");
			}
		}
	})
}

// 模糊搜索
function mhck(value) {
	$(".infofind_01div .tableck").text("");
	var tr = document.createElement("tr");
	var td = document.createElement("th");
	var td1 = document.createElement("th");
	var td2 = document.createElement("th");
	var td3 = document.createElement("th");
	var td4 = document.createElement("th");
	var td5 = document.createElement("th");
	var td6 = document.createElement("th");
	var td7 = document.createElement("th");
	var td8 = document.createElement("th");
	var td9 = document.createElement("th");
	var td10 = document.createElement("th");
	var td11 = document.createElement("th");
	td.append("登记编号");
	td1.append("订单编号");
	td2.append("客房编号");
	td3.append("每日实际价格(元)");
	td4.append("每日折扣(元)");
	td5.append("入住时间");
	td6.append("离开时间");
	td7.append("登记状态");
	td8.append("姓名");
	td9.append("身份证号");
	td10.append("手机号");
	td11.append("操作");
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
	tr.appendChild(td10);
	tr.appendChild(td11);
	$(".infofind_01div .tableck").append(tr);
	$.ajax({
		"url" : "tb_checkinitem.do?c=getAllTb_checkinitem",
		"type" : "post",
		"data" : "value=" + value,
		"datatype" : "JSON",
		"success" : function(res) {
			var array = JSON.parse(res);
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
				var td10 = document.createElement("td");
				var td11 = document.createElement("td");
				var input = document.createElement('input');
				input.type = 'button';
				input.value = '查看详情';
				input.className = "getallck";
				td.append(array[i].cim_id);
				td1.append(array[i].cim_chechinorderId);
				td2.append(array[i].cim_roomId);
				td3.append(array[i].cim_prctPrice);
				td4.append(array[i].cim_discount);
				td5.append(array[i].cim_inDateTime);
				td6.append(array[i].cim_outdateTime);
				if (array[i].cim_state == 0) {
					td7.append("在住");
				}
				if (array[i].cim_state == 1) {
					td7.append("预定");
				}
				if (array[i].cim_state == 2) {
					td7.append("退房");
				}
				td8.append(array[i].cim_name);
				td9.append(array[i].cim_cardId);
				td10.append(array[i].cim_phone);
				td11.append(input);
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
				tr.appendChild(td10);
				tr.appendChild(td11);
				$(".infofind_01div .tableck").append(tr);
			}
		}
	});
}

// 锁定
function lock() {
	$.ajax({
		"url" : "tb_operator.do?c=lock",
		"type" : "post",
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				$(".lockdiv").show();
			} else {
				alert("锁定失败!");
				$(".lockdiv").show();
			}
		}
	})
}
// 解锁
function dellock(dellockop) {
	$.ajax({
		"url" : "http://192.168.10.123:8080/hotel/home/log.do?c=delLock",
		"type" : "post",
		"data" : dellockop,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				$(".lockdiv").hide();
			} else {
				alert("解锁失败!");
			}
		}
	})
}
function ckcxhide() {
	$(".getckxq").hide();
	$(".getckxqtop").hide();
	$(".getckxqbotton").hide();
	$(".getckxqleft").hide();
	$(".getckxqright").hide();
	$(".ckxqgsdiv").hide();
	$(".ckxqcddiv").hide();
	$(".ckxqzddiv").hide();
}
// 登记客户查询
function ckcardgs(cardid) {
	$.ajax({
		"url" : "tb_guest.do?c=getByCardidTb_guest",
		"type" : "post",
		"data" : "cardid=" + cardid,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				var gs = jQuery.parseJSON(res);
				$(".ckxqgsdiv table tr:nth-child(1) td:nth-child(2)").text(
						gs.gt_name);
				if (gs.gt_gender == "0") {
					$(".ckxqgsdiv table tr:nth-child(2) td:nth-child(2)").text(
							"女");
				} else {
					$(".ckxqgsdiv table tr:nth-child(2) td:nth-child(2)").text(
							"男");
				}
				$(".ckxqgsdiv table tr:nth-child(3) td:nth-child(2)").text(
						gs.gt_cardId);
				$(".ckxqgsdiv table tr:nth-child(4) td:nth-child(2)").text(
						gs.gt_telPhone);
				$(".ckxqgsdiv table tr:nth-child(5) td:nth-child(2)").text(
						gs.gt_mobile);
				$(".ckxqgsdiv table tr:nth-child(6) td:nth-child(2)").text(
						gs.tb_putype.pt_typeName);
				$(".ckxqgsdiv table tr:nth-child(7) td:nth-child(2)").text(
						gs.tb_pucategory.pcg_categoryName);
				$(".ckxqgsdiv table tr:nth-child(8) td:nth-child(2)").text(
						gs.gt_address);
				$(".ckxqgsdiv table tr:nth-child(9) td:nth-child(2)").text(
						gs.gt_zip);
				$(".ckxqgsdiv table tr:nth-child(10) td:nth-child(2)").text(
						gs.gt_company);
				$(".ckxqgsdiv table tr:nth-child(11) td:nth-child(2)").text(
						gs.gt_email);
				$(".ckxqgsdiv table tr:nth-child(12) td:nth-child(2)").text(
						gs.gt_createtime);
				$(".ckxqzddiv").hide();
				$(".ckxqcddiv").hide();
				$(".ckxqgsdiv").show();
			} else {
				alert("客户查询失败!");
			}
		}
	})
}
// 登记订单查询
function ckcdcd(cdid) {
	$.ajax({
		"url" : "tb_checkinorder.do?c=getByCdidTb_checkinorder",
		"type" : "post",
		"data" : "cdid=" + cdid,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				var cd = jQuery.parseJSON(res);
				$(".ckxqcddiv table tr:nth-child(1) td:nth-child(2)").text(
						cd.cio_id);
				$(".ckxqcddiv table tr:nth-child(2) td:nth-child(2)").text(
						cd.tb_guest.gt_name);
				if (cd.cio_State == "0") {
					$(".ckxqcddiv table tr:nth-child(3) td:nth-child(2)").text(
							"在住");
				}
				if (cd.cio_State == "1") {
					$(".ckxqcddiv table tr:nth-child(3) td:nth-child(2)").text(
							"预定");
				}
				if (cd.cio_State == "2") {
					$(".ckxqcddiv table tr:nth-child(3) td:nth-child(2)").text(
							"退房");
				}
				$(".ckxqcddiv table tr:nth-child(4) td:nth-child(2)").text(
						cd.cio_inDateTime);
				$(".ckxqcddiv table tr:nth-child(5) td:nth-child(2)").text(
						cd.cio_outDateTime);
				$(".ckxqcddiv table tr:nth-child(6) td:nth-child(2)").text(
						cd.cio_prctOutDateTime);
				$(".ckxqcddiv table tr:nth-child(7) td:nth-child(2)").text(
						cd.tb_pupaymenttype.ppt_guestTypeName);
				$(".ckxqcddiv table tr:nth-child(8) td:nth-child(2)").text(
						cd.cio_paidMoney);
				if (cd.cio_iseservid == "0") {
					$(".ckxqcddiv table tr:nth-child(9) td:nth-child(2)").text(
							"未预定");
				} else {
					$(".ckxqcddiv table tr:nth-child(9) td:nth-child(2)").text(
							"预定");
				}
				$(".ckxqcddiv table tr:nth-child(10) td:nth-child(2)").text(
						cd.cio_operator);
				$(".ckxqcddiv table tr:nth-child(11) td:nth-child(2)").text(
						cd.cio_totalRate);
				if (cd.cio_consumption != undefined) {
					$(".ckxqcddiv table tr:nth-child(12) td:nth-child(2)")
							.text(cd.cio_consumption);
				}
				if (cd.cio_consumptionDetails != undefined) {
					$(".ckxqcddiv table tr:nth-child(13) td:nth-child(2)")
							.text(cd.cio_consumptionDetails);
				}
				$(".ckxqzddiv").hide();
				$(".ckxqgsdiv").hide();
				$(".ckxqcddiv").show();
			} else {
				alert("订单查询失败!");
			}
		}
	})
}
// 登记账单查询
function ckcdbm(cdid) {
	$.ajax({
		"url" : "tb_balancement.do?c=getByCdidTb_balancement",
		"type" : "post",
		"data" : "cdid=" + cdid,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				var bm = jQuery.parseJSON(res);
				$(".ckxqzddiv table tr:nth-child(1) td:nth-child(2)").text(
						bm.bm_id);
				$(".ckxqzddiv table tr:nth-child(2) td:nth-child(2)").text(
						bm.tb_guest.gt_name);
				$(".ckxqzddiv table tr:nth-child(3) td:nth-child(2)").text(
						bm.tb_pupaymenttype.ppt_guestTypeName);
				$(".ckxqzddiv table tr:nth-child(4) td:nth-child(2)").text(
						bm.bm_totalRate);
				$(".ckxqzddiv table tr:nth-child(5) td:nth-child(2)").text(
						bm.bm_paidMoney);
				$(".ckxqzddiv table tr:nth-child(6) td:nth-child(2)").text(
						bm.bm_refund);
				if (bm.bm_refundState == "0") {
					$(".ckxqzddiv table tr:nth-child(7) td:nth-child(2)").text(
							"未退款");
				} else {
					$(".ckxqzddiv table tr:nth-child(7) td:nth-child(2)").text(
							"已退款");
				}
				$(".ckxqzddiv table tr:nth-child(8) td:nth-child(2)").text(
						bm.bm_cardName);
				if (bm.bm_cardNumber != undefined) {
					$(".ckxqzddiv table tr:nth-child(9) td:nth-child(2)").text(
							bm.bm_cardNumber);
				}
				if (bm.bm_cardId != undefined) {
					$(".ckxqzddiv table tr:nth-child(10) td:nth-child(2)")
							.text(bm.bm_cardId);
				}
				if (bm.bm_cardPhone != undefined) {
					$(".ckxqzddiv table tr:nth-child(11) td:nth-child(2)")
							.text(bm.bm_cardPhone);
				}
				if (bm.bm_receipt == "0") {
					$(".ckxqzddiv table tr:nth-child(12) td:nth-child(2)")
							.text("未开");
				} else {
					$(".ckxqzddiv table tr:nth-child(12) td:nth-child(2)")
							.text("已开");
				}
				if (bm.bm_phone != undefined) {
					$(".ckxqzddiv table tr:nth-child(13) td:nth-child(2)")
							.text(bm.bm_phone);
				}
				if (bm.bm_address != undefined) {
					$(".ckxqzddiv table tr:nth-child(14) td:nth-child(2)")
							.text(bm.bm_address);
				}
				if (bm.bm_receiptStatus == "0") {
					$(".ckxqzddiv table tr:nth-child(15) td:nth-child(2)")
							.text("未开");
				}
				if (bm.bm_operator != undefined) {
					$(".ckxqzddiv table tr:nth-child(16) td:nth-child(2)")
							.text(bm.bm_operator);
				}
				if (bm.bm_createTime != undefined) {
					$(".ckxqzddiv table tr:nth-child(17) td:nth-child(2)")
							.text(bm.bm_createTime);
				}
				$(".ckxqcddiv").hide();
				$(".ckxqgsdiv").hide();
				$(".ckxqzddiv").show();
			} else {
				alert("账单查询失败!");
			}
		}
	})
}
// 退房
function gettf(tfcdid, tfrmid) {
	alert(tfcdid+":"+tfrmid);
	$.ajax({
		"url" : "tb_checkinorder.do?c=getByCdidRmidTb_checkinorder",
		"type" : "post",
		"data" : "tfcdid=" + tfcdid + "&tfrmid=" + tfrmid,
		"datatype" : "JSON",
		"success" : function(res) {
			if (res) {
				var cd = jQuery.parseJSON(res);
				$(".bmtff .tfindatetime").val(cd.cio_inDateTime);
				$(".bmtff .tfprctprice").val(
						cd.tb_room.rm_prctPrice - cd.tb_room.rm_prctdiscount);
				$(".bmtff .tftotalrate").val(cd.cio_totalRate);
				$(".bmtff .tfpaidmoney").val(cd.cio_paidMoney);
				$(".bmtff .tfreceivmoney").val(
						cd.cio_totalRate - cd.cio_paidMoney);
				$(".bmtff .tfgsid").val(cd.tb_guest.gt_id);
				$(".bmtf").show();
				$(".bmtff").show();
			} else {
				alert("退房订单查找成功!");
			}
		}
	})
}
// 新增账单
function addtf(tf) {
	$
			.ajax({
				"url" : "tb_balancement.do?c=updTb_balancement",
				"type" : "post",
				"data" : tf,
				"datatype" : "JSON",
				"success" : function(res) {
					if (res) {
						window.location = "http://192.168.10.123:8080/hotel/home/admin/alipay.trade.page.pay.jsp";
					} else {
						alert("退房订单添加失败!");
					}
				}
			})
}
function rzcd(rz, state) {
	$
			.ajax({
				"url" : "tb_checkinitem.do?c=addTb_checkinitemService",
				"type" : "post",
				"data" : rz,
				"datatype" : "JSON",
				"success" : function(res) {
					if (res) {
						getckrm();
						if (state == "1") {
							window.location = "http://192.168.10.123:8080/hotel/home/admin/alipay.trade.page.pay.jsp";
						}
					} else {
						alert("入住添加订单失败!");
					}
				}
			})
}
// 正则验证
// 手机号正则验证
function valuetest(phone) {
	var ret = /^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$/;
	if (ret.test(phone)) {
		return true;
	} else {
		return false;
	}
}
// 身份证正则验证
function valuetest(phone) {
	var isIDCard2 = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
	var isIDCard1 = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/;
	if (isIDCard2.test(phone)) {
		return true;
	} else {
		if (isIDCard1.test(phone)) {
			return true;
		}
		return false;
	}
}