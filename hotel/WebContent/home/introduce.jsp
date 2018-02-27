<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>一奇振超贵洲际酒店</title>
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
<style>
/*			div{
				width: 100%;
				height: 800px;
				position: relative;
			}*/
img {
	width: 250px;
	padding: 5px;
	border: 1px solid white;
	background-color: white;
	box-shadow: 6px 6px aliceblue;
	border-radius: 10px;
}

img:nth-child(1) {
	position: absolute;
	top: 300px;
	left: 10px;
	transform: rotate(360deg);
}

img:nth-child(2) {
	position: absolute;
	top: 300px;
	left: 240px;
	transform: rotate(360deg);
}

img:nth-child(3) {
	position: absolute;
	top: 300px;
	left: 470px;
	transform: rotate(360deg);
}

img:nth-child(4) {
	position: absolute;
	top: 300px;
	left: 690px;
	transform: rotate(360deg);
}

img:nth-child(5) {
	position: absolute;
	top: 300px;
	left: 920px;
	transform: rotate(360deg);
}

img:nth-child(6) {
	position: absolute;
	top: 300px;
	left: 1150px;
	transform: rotate(360deg);
}

img:nth-child(7) {
	position: absolute;
	top: 440px;
	left: 800px;
	transform: rotate(360deg);
}

img:nth-child(8) {
	position: absolute;
	top: 440px;
	left: 300px;
	transform: rotate(360deg);
}

/*			img:nth-child(9){
				position: absolute;
				top: 300px;
				left: 700px;
				transform: rotate(360deg);
			}
			img:nth-child(10){
				position: absolute;
				top: 300px;
				left: 900px;
				transform: rotate(360deg);
			}*/
img:hover {
	transform: rotate(0deg);
	transform: scale(2);
	z-index: 100;
	transition: all 2s linear 1s;
}
</style>
<body>
	<!-- banner -->
	<div class="banner-1">
		<div class="header-bottom">
			<!-- header -->
			<div class="header">
				<div class="container">
					<div class="w3_agile_logo">
						<h1>
							<a href="index.html"><span>洲际</span>酒店</a>
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
								<li><a href="index.html"><span>回家的诱惑</span></a></li>
								<li><a href="gallery.html"><span>内部效果</span></a></li>
								<li class="active"><a href="about.html"><span>关于我们</span></a></li>
								<li><a href="contact.html"><span>联系方式</span></a></li>
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
	<!-- about -->
	<!-- courses -->
	<div class="courses">
		<img src="images/10.jpg" /> <img src="images/13.jpg" /> <img
			src="images/4.jpg" /> <img src="images/5.jpg" /> <img
			src="images/8.jpg" /> <img src="images/9.jpg" /> <img
			src="images/6.jpg" /> <img src="images/7.jpg" />
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
	<!-- stats -->
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.countup.js"></script>
	<script>
		$('.counter').countUp();
	</script>
	<!-- //stats -->
</body>
</html>
