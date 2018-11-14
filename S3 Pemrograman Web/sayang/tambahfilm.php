<?php include("stdio.php"); 
session_start();
	if(!isset($_SESSION['level'])){
		header('location:login.php');
	}
	elseif($_SESSION['level']=='user'){
		header('location:login.php');
	}
?>
<html>
<head>
	<title>BIOSKOP</title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>
<body>
	<div class="wrap">
		<?php include('headadmin.php'); ?>
		<form method="post">
			<table>
				<tr>
					<td>Nama</td><td>:</td><td><?php input('nama'); ?></td>
				</tr><tr>
					<td>Harga</td><td>:</td><td><?php input('harga'); ?></td>
				</tr><tr>
					<td>Durasi</td><td>:</td><td><?php input('durasi'); ?>menit</td>
				</tr><tr>
					<td>Sutradara</td><td>:</td><td><?php input('sutradara'); ?></td>
				</tr><tr>
					<td>Alamat Gambar</td><td>:</td><td><?php input('gambar'); ?></td>
				</tr><tr>
					<td>Tanggal Rilis</td><td>:</td><td><?php input('tgl'); ?>format(tttt-bb-hh)</td>
				</tr><tr>
					<td>Sinopsis</td><td>:</td><td><textarea name='sinopsis'>Pada Suatu Hari</textarea></td>
				</tr>
				<tr><td><input type="submit" name='tombol'></td></tr>
			</table>
		</form>
	<?php	
		if(isset($_POST['tombol'])){
		print '<p align="center" style="color:red;">';
		if($_POST['nama']==''){
			print 'Harap Isi Nama';
		}elseif ($_POST['harga']=='') {
			print 'Harap Isi Harga';
		}elseif ($_POST['durasi']=='') {
			print 'Harap Isi Durasi';
		}elseif ($_POST['sutradara']=='') {
			print 'Harap Isi Sutradara';
		}elseif ($_POST['gambar']=='') {
			print 'Harap Isi Alamat Gambar';
		}elseif ($_POST['tgl']=='') {
			print 'Harap Isi Tanggal Rilis';
		}elseif ($_POST['sinopsis']=='') {
			print 'Harap Isi Sinopsis';
		}else{
			sqlquery('insert into film (nama, harga, durasi, sutradara, sinopsis, gambar, tanggal_rilis) values("'.$_POST['nama'].'", '.$_POST['harga'].',"'.$_POST['durasi'].'","'.$_POST['sutradara'].'","'.$_POST['sinopsis'].'","'.$_POST['gambar'].'","'.$_POST['tgl'].'")');
			print "Selesai<br>";
		}
		print '</p>';
	}?>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><font color="black" size="3">CopyRight&copy;Arief Ardi Pratama</font></center></pre>
		</div>
	</div>
</body>
</html>