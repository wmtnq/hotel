<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<td>同户名</td>
				<td><input type="text" /></td>
			</tr>
			<tr>
				<td><img id="img" width="100px" /></td>
				<td><input type="hidden" id="imgpath" /></td>
			</tr>
			
			<tr>
				<td>头像</td>
				<td><input type="file" id="gg" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
			<img class="aaa" src="" width="500px" />




	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		$("#gg").change(function() {
			if (window.FileReader) {
				var fr = new FileReader();
				fr.readAsDataURL(this.files[0]);
				fr.onloadend = function(e) {
					$("#img").attr("src", e.target.result);
					$.ajax({
						url : "imgupload",
						type : "post",
						async : true,
						data : "imagedata=" + e.target.result,
						success : function(res) {
							$("#imgpath").val(res);
							alert($("#imgpath").val());
							$(".aaa").attr("src", res);
						}

					});
				}
			} else {
				alert("浏览器不支持");
			}
		})
	</script>
</body>
</html>