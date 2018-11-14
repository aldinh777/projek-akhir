<?php
	include('stdio.php');
	session_start();
?>
<html>
	<head>
		<title>BIOSKOP</title>
	</head>
	<body style="background:url('gambar/awal.jpg');background-size: 1300px">
		<br><br>
		<form action='' method='post'>
			<table align="center">
				<tr align="center">
					<td colspan="3">Ini Form Login</td>
				</tr>
				<tr>
					<td>Nama</td>
					<td>:</td>
					<td><?php input('name'); ?></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><?php input('pass','','password'); ?></td>
				</tr>
				<tr>
					<td><?php input('tombol','','submit','LOGIN'); ?></td>
				</tr>
				<br>
				<tr>
					<td colspan="3">Untuk Mendaftar? <a href="daftar.php">klik sini</a></td>
				</tr>
			</table>
		</form>
		<?php
		
		if(isset($_POST['name'])&&isset($_POST['pass'])){
		$admin = sqldata('select * from admin where nama="'.$_POST['name'].'" and password="'.$_POST['pass'].'"');
		$data = sqldata('select * from penonton where nama="'.$_POST['name'].'" and password="'.$_POST['pass'].'"');
		if (count($admin)>0) {
			$_SESSION['level'] = 'admin';
		}elseif(count($data)>0){
			$_SESSION['level']	=	'user';
			$_SESSION['nama']	=	$data[0]['nama'];
			$_SESSION['id']		=	$data[0]['id_penonton'];
		}
		else{
			echo '<p align="center">';
			echo 'ID atau Password Salah';
			echo '</p>';
		}
	}
	if(isset($_SESSION['level'])){
		if ($_SESSION['level']=='admin') {
			header('location:filmadmin.php');
		}elseif($_SESSION['level']=='user'){
			header('location:halaman_awal.php');
		}
		
	}?>
		<br><br><br><br><br><br>
		<h1 align="center" style="color: yellow; font-size: 100px">"Bioskop Samarinda"</h1>
	</body>
</html>