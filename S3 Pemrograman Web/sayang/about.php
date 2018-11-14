<?php
	session_start(); 
	if(!isset($_SESSION['level'])){
		header('location:login.php');
	}elseif($_SESSION['level']=='admin'){
		header('location:login.php');
	}
 ?>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>
<body>
	<div class="wrap">
		<?php include('head.php'); ?>
		<div class="content">
			<ul>
				<p> Kelompok 3 </p>
				<li> Septi Rahma</li>
				<li> Arief Ardi Pratama</li>
				<li> Aldi Nur Hendra</li>
				<li> Maulidina Awaliyah Rahman</li>
			</ul>
		</div>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><font color="black" size="3">CopyRight&copy;BioskopSamarinda</font></center></pre>
		</div>
	</div>
</body>
</html>