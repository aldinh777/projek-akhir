<?php include('stdio.php');
session_start(); 
if(!isset($_GET['id'])){header('location:login.php');}
	elseif($_SESSION['level']=='admin'){
		header('location:login.php');
	}?>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>
<body >
	<div class="wrap">
		<?php include('head.php'); ?>
		<div class="content" align="center">
				<?php 
					$data = sqldata('select * from film where id_film='.$_GET['id']);
					echo '<table align="center">';
					echo '<tr>';
					echo '<td>'.$data[0]['nama'].'</td>';
					echo '</tr><tr>';
					echo '<td>'.$data[0]['sinopsis'].'</td>';
					echo '</tr>';
					echo '</table>';
				 	$jadwal = sqldata('select * from jadwal where id_film='.$data[0]['id_film']);
				 	if(count($jadwal)>0){
					 	print '<form action="booking.php" method="post" align="center">';
					 	foreach ($jadwal as $array) {
					 		print '<input type="submit" name="boking" value="'.$array['waktu'].'""><br>';
					 	}
					 	print '</form>';
					 }
				 ?>
		</div>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><font color="black" size="3">CopyRight&copy;Arief Ardi Pratama</font></center></pre>
		</div>
	</div>
</body>
</html>