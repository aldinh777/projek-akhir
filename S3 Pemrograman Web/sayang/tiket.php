<?php session_start(); include('stdio.php'); 
if(!isset($_SESSION['level'])){header('location:login.php');}
	elseif($_SESSION['level']=='admin'){
		header('location:login.php');
	}
	?>
<html>
<head>
	<title>TIKET</title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>
<body class="wrap" align="center">
	<?php include('head.php'); ?>
	<div class="content">
		
		<?php 
			if(isset($_POST['hapus'])){
				$kursy = sqldata('select * from tiket where id_tiket='.$_POST['hapus']);
				sqlquery('delete from kursi where id_kursi='.$kursy[0]['id_kursi']);
				sqlquery('delete from tiket where id_tiket='.$_POST['hapus']);
			}
			print '<h1 align="center" style="color:gray;"> Tiket Anda </h1>';
			$tiket = sqldata('select * from tiket where id_penonton='.$_SESSION['id']);
			if(count($tiket)>0){
				print '<br>';
				print '<table border="1" align="center">';
				foreach ($tiket as $data) {
					print '<tr><td><table>';
					$film = sqldata('select * from film where id_film='.$data['id_film']);
					$kursi = sqldata('select * from kursi where id_kursi='.$data['id_kursi']);
					$jadwal = sqldata('select * from jadwal where id_jadwal='.$kursi[0]['id_jadwal']);
					print '<tr>';
					print '<td>FILM</td><td>:</td><td>'.$film[0]['nama'].'</td>';
					print '</tr><tr>';
					print '<td>JADWAL</td><td>:</td><td>'.$jadwal[0]['waktu'].'</td>';
					print '</tr><tr>';
					print '<td>FILM</td><td>:</td><td>'.$kursi[0]['kode'].'</td>';
					print '</tr><tr>';
					print '<td>Harga</td><td>:</td><td>'.$film[0]['harga'].'</td>';
					print '</table></td>';
					print '<td><form method="post">';
					print '<button type="submit" name="hapus" value='.$data['id_tiket'].'>Hapus</button>';
					print '</form></td>';
					print '</tr>';
				}
				print '</table>';
			}
			else{
				print 'Tidak Ada';
			}
		?>
		<br>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><font color="black" size="3">CopyRight&copy;Bioskop Samarinda</font></center></pre>
		</div>
	</div>
</body>
</html>