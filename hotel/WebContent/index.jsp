<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table class="aa"></table>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$.ajax({
		"url":"tb_operator.do?c=getAllTb_operator",
		"type":"post",
		"data":"opusername=zz",
		"datatype":"JSON",
		"success":function(res){
			alert(res);
			alert(jQuery.parseJSON(res));
			var array = jQuery.parseJSON(res)
			for (var i = 0; i < array.length; i++) {
				var tr = document.createElement("tr");
				var td = document.createElement("td");
				td.append(array[i].op_createTime);
				tr.appendChild(td);
				$(".aa").append(tr);
			}
		}
	});
</script>
</body>
</html>