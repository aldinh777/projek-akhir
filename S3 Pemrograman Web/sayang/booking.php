<?php include('stdio.php'); session_start();
	if(!isset($_POST['boking'])){
		header('location:login.php');
	}
	elseif($_SESSION['level']=='admin'){
		header('location:login.php');
	}
	?>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="hal.css">
	<title>BOOKING</title>
</head>
<body>
	<div class='wrap'>
		<?php include('head.php'); ?>
		'<h1 align="center" style="color:gray;"> Pilih Kursi </h1>'
		
		<table align="center">
			<?php
				$tes = sqldata('select * from jadwal where waktu="'.$_POST['boking'].'"');
				if(count($tes)<=0){
					header('location:halaman_awal.php');
				}
				$_SESSION['kode_jadwal']=$tes[0]['id_jadwal'];
				print '<form action="confirm.php" method="post">';
				for ($i='A'; $i<='F' ; $i++) {
					print '<tr>';
					for ($j='1'; $j<='6'; $j++) { 
						$kursi = sqldata('select * from kursi where id_jadwal="'.$tes[0]['id_jadwal'].'" and kode="'.$i.$j.'"');
						if(count($kursi)>0){
							$warna = 'red';
							$tombol = '<button type="reset">'.$i.$j.'</button>';
						}
						else{
							$warna = 'green';
							$tombol = '<input type="submit" name="tiket" value="'.$i.$j.'">';
						}
						print '<td bgcolor="'.$warna.'">'.$tombol.'</td>';
					}
					print '</tr>';
				}
				print '</form>';
			?>
		</table>
	</div>
</body>
</html>