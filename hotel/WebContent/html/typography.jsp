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


		<div class="container" style="text-align:center;">
			<div class="w3ls-heading">
				<div>
					<h2>预定</h2>
				</div>
				<div>
					<h2>查询</h2>
				</div>
			</div>
			<div class="ydmain" style="display:;">
				<div class="grid_3 grid_4 w3layouts">
					<h3 class="hdg">预定信息</h3>
					<div class="bs-example"></div>
				</div>
				<div  class="input-group w3_w3layouts" style="width: 360px;margin: 0 auto;">
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

				<div class="input-group w3_w3layouts" style="width: 360px;margin: 0 auto;">
					<form class="f2" action="post" style="width: 360px; display: none">
						<span class="input-group-addon" id="basic-addon1">姓名</span> <input
							type="text" class="form-control" placeholder="姓氏"
							aria-describedby="basic-addon1"> <span
							class="input-group-addon" id="">电话</span> <input type="text"
							class="form-control" placeholder="手机号码"
							aria-describedby="basic-addon1"> <span
							class="input-group-addon" id="basic-addon1">证件类型 </span> <select>
							<option value="0">证件类型</option>
							<option value="0">**********</option>
							<option value="1">身份证</option>
							<option value="2">护照证</option>
							<option value="3">社保卡</option>
							<option value="4">驾照</option>
							<option value="5">户口本</option>
						</select> <span class="input-group-addon" id="basic-addon1">证件号码 </span><input
							type="text" class="form-control" placeholder="证件号码"
							aria-describedby="basic-addon1"> <span
							class="input-group-addon" id="basic-addon1">国籍</span> <select>
							<option value="0"></option>
						</select>
						<div class="next2">
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
				<div class="input-group w3_w3layouts" style="width: 360px;margin: 0 auto;">
					<div class="roomfind">
						<form class="f3" action="post">
							<span class="input-group-addon" id="basic-addon1">预留号码 </span> <input
								type="text" class="form-control" id="findphone" />
							<div class="next1">
								<span class="input-group-addon" id="basic-addon1"
									style="background-color: orange; color: white;">查找</span>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="input-group w3_w3layouts">
		<!-- 	<span class="input-group-addon">￥</span> <input type="text"
			class="form-control" aria-label="Amount (to the nearest dollar)">
		<span class="input-group-addon">.00</span>
	</div>
	<div class="input-group input-group-lg w3_w3layouts">
		<span class="input-group-addon" id="sizing-addon1">@</span> <input
			type="text" class="form-control" placeholder="Username"
			aria-describedby="sizing-addon1">
	</div>
	<div class="input-group w3_w3layouts">
		<span class="input-group-addon" id="sizing-addon2">@</span> <input
			type="text" class="form-control" placeholder="Username"
			aria-describedby="sizing-addon2">
	</div>
	<div class="input-group input-group-sm w3_w3layouts">
		<span class="input-group-addon" id="sizing-addon3">@</span> <input
			type="text" class="form-control" placeholder="Username"
			aria-describedby="sizing-addon3">
	</div>-->
		<!--	<div class="row">
		<div class="col-lg-6 in-gp-tl">
		 	<div class="input-group">
				<span class="input-group-addon"> <input type="checkbox"
					aria-label="...">
				</span> <input type="text" class="form-control" aria-label="...">
			</div>
			/input-group
		</div>
		/.col-lg-6
		<div class="col-lg-6 in-gp-tb">
			<div class="input-group">
				<span class="input-group-addon"> <input type="radio"
					aria-label="...">
				</span> <input type="text" class="form-control" aria-label="...">
			</div>
			/input-group
		</div>
		/.col-lg-6
	</div>
	/.row
	<div class="row">
		<div class="col-lg-6 in-gp-tl">
			<div class="input-group">
				<span class="input-group-btn">
					<button class="btn btn-default" type="button">Go!</button>
				</span> <input type="text" class="form-control" placeholder="Search for...">
			</div>
			/input-group
		</div>
		/.col-lg-6
		<div class="col-lg-6 in-gp-tb">
			<div class="input-group">
				<input type="text" class="form-control" placeholder="Search for...">
				<span class="input-group-btn">
					<button class="btn btn-default" type="button">Go!</button>
				</span>
			</div>
			/input-group
		</div>
		/.col-lg-6
	</div>
	/.row
	<div class="row">
		<div class="col-lg-6 in-gp-tl">
			<div class="input-group">
				<div class="input-group-btn">
					<button type="button" class="btn btn-default dropdown-toggle"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						Action <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
				/btn-group
				<input type="text" class="form-control" aria-label="...">
			</div>
			/input-group
		</div>
		/.col-lg-6
		<div class="col-lg-6 in-gp-tb">
			<div class="input-group">
				<input type="text" class="form-control" aria-label="...">
				<div class="input-group-btn">
					<button type="button" class="btn btn-default dropdown-toggle"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						Action <span class="caret"></span>
					</button>
					<ul class="dropdown-menu dropdown-menu-right">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
				/btn-group
			</div>
			/input-group
		</div>
		/.col-lg-6
	</div> -->
		<!-- /.row -->
		<!-- 	<div class="page-header">
		<h3 class="bars">Tables</h3>
	</div>
	<h2 class="typoh2">Default styles</h2>
	<p>
		For basic stylinglight padding and only horizontal add the base class
		<code>.table</code>
		to any
		<code>&lt;table&gt;</code>
		.
	</p>
	<div class="bs-docs-example">
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Username</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Larry</td>
					<td>the Bird</td>
					<td>@twitter</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr class="bs-docs-separator">
	<p>
		Add any of the following classes to the
		<code>.table</code>
		base class.
	</p>
	<p>
		Adds zebra-striping to any table row within the
		<code>&lt;tbody&gt;</code>
		via the
		<code>:nth-child</code>
		CSS selector (not available in IE7-8).
	</p>
	<div class="bs-docs-example">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Username</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Larry</td>
					<td>the Bird</td>
					<td>@twitter</td>
				</tr>
			</tbody>
		</table>
	</div>
	<p>Add borders and rounded corners to the table.</p>
	<div class="bs-docs-example">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Username</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td rowspan="2">1</td>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<tr>
					<td>Mark</td>
					<td>Otto</td>
					<td>@getbootstrap</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
				</tr>
				<tr>
					<td>3</td>
					<td colspan="2">Larry the Bird</td>
					<td>@twitter</td>
				</tr>
			</tbody>
		</table>
	</div>
	<p>
		Enable a hover state on table rows within a
		<code>&lt;tbody&gt;</code>
		.
	</p>
	<div class="bs-docs-example">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Username</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
				</tr>
				<tr>
					<td>3</td>
					<td colspan="2">Larry the Bird</td>
					<td>@twitter</td>
				</tr>
			</tbody>
		</table>
	</div>
	</div>
	
	//typography
	footer
	<div class="w3-agile-footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Address</h4>
					</div>
					<div class="footer-grid-info">
						<p>
							Eiusmod Tempor inc <span>St Dolore Place,Kingsport 56777.</span>
						</p>
						<p class="phone">
							Phone : +1 123 456 789 <span>Email : <a
								href="mailto:example@email.com">mail@example.com</a></span>
						</p>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Navigation</h4>
					</div>
					<div class="footer-grid-info">
						<ul>
							<li><a href="about.jsp">About</a></li>
							<li><a href="gallery.jsp">Gallery</a></li>
							<li><a href="icons.html">Icons</a></li>
							<li><a href="typography.jsp">Typography</a></li>
							<li><a href="contact.jsp">Contact</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Latest Posts</h4>
					</div>
					<div class="w3agile_footer_grid_list">
						<ul>
							<li><i class="fa fa-angle-right" aria-hidden="true"></i>
								Vestibulum ante ipsum</li>
							<li><i class="fa fa-angle-right" aria-hidden="true"></i>
								Phasellus at eros</li>
							<li><i class="fa fa-angle-right" aria-hidden="true"></i>
								Mauris eleifend aliquet</li>
							<li><i class="fa fa-angle-right" aria-hidden="true"></i>
								Aliquam vitae tristique</li>
							<li><i class="fa fa-angle-right" aria-hidden="true"></i>
								Pellentesque lobortis</li>
							<li><i class="fa fa-angle-right" aria-hidden="true"></i>
								Class aptent taciti</li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Twitter Posts</h4>
					</div>
					<div class="w3agile_footer_grid_list w3agile-post">
						<ul>
							<li>Ut aut reiciendis voluptatibus <a href="#">http://example.com</a>
								alias, ut aut. <span><i class="fa fa-twitter"
									aria-hidden="true"></i> 02 days ago</span></li>
							<li>Itaque earum rerum hic tenetur a sapiente <a href="#">http://example.com</a>
								ut aut. <span><i class="fa fa-twitter" aria-hidden="true"></i>
									03 days ago</span></li>
						</ul>
					</div>
				</div> -->
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
	</script>
	<!--//tabs-->
</body>
</html>