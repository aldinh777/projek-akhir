<?php include('stdio.php'); session_start(); 
if(!isset($_POST['tiket'])){header('location:login.php');}
	elseif($_SESSION['level']=='admin'){
		header('location:login.php');
	}?>

<!DOCTYPE html>
<html>
<head>
	<title>KONFIRMASI</title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>
<body>
	<div class="wrap">
		<?php include('head.php');
			$jadwal = sqldata('select * from jadwal where id_jadwal="'.$_SESSION['kode_jadwal'].'";');
			$film = sqldata('select * from film where id_film="'.$jadwal[0]['id_film'].'";');
			if(isset($_POST['tombol'])){
				if($_POST['tombol']=='Yakin'){
					sqlquery('insert into kursi (kode, id_jadwal) values ("'.$_SESSION['kode_tiket'].'",'.$_SESSION['kode_jadwal'].');');
					$kursi = sqldata('select * from kursi where id_jadwal='.$_SESSION['kode_jadwal'].' and kode="'.$_SESSION['kode_tiket'].'"');
					sqlquery('insert into tiket (id_penonton, id_film, id_kursi) values ('.$_SESSION['id'].','.$film[0]['id_film'].','.$kursi[0]['id_kursi'].');');
				}
				header('location:halaman_awal.php');
			}
			$_SESSION['kode_tiket']=$_POST['tiket'];
			print 'FILM = '.$film[0]['nama'].'<br>';
			print 'JADWAL = '.$jadwal[0]['waktu'].'<br>';
			print 'KURSI = '.$_POST['tiket'];
		?>
		<form method='post'>
			<input type="submit" name="tombol" value='Yakin'>
			<input type="submit" name="tombol" value='GakJadi'>
		</form>
	</div>
</body>
</html>