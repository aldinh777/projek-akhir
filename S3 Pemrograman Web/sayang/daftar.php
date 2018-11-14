<?php
	include('stdio.php');
	?>
<!DOCTYPE html>
<html>
<head>
	<title>Daftar</title>
</head>
<body  style="background:url('gambar/awal.jpg');background-size: 1300px">
	<form action='' method="post"><br>
		<table align="center">

			<tr align="center">
					<td colspan="3">Ini Form Pendaftaran</td>
				</tr>
			<tr>
				<td>Nama</td>
				<td>:</td>
				<td><?php input('name'); ?></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><?php input('pass'); ?></td>
			</tr>
			<tr>
				<td>Alamat</td>
				<td>:</td>
				<td><?php input('addr'); ?></td>
			</tr>
			<tr>
				<td>NO. KTP</td>
				<td>:</td>
				<td><?php input('ktp'); ?></td>
			</tr>
			<tr>
				<td>NO. HAPE</td>
				<td>:</td>
				<td><?php input('nope'); ?></td>
			</tr>
			<tr>
				<td><?php input('tombol','','submit','DAFTAR'); ?></td>
			</tr>
		</table>
		<br><br><br>
<?php
	if(isset($_POST['tombol'])){
		print '<p align="center" style="color:white;">';
		if($_POST['name']==''){
			print 'Harap Isi Nama';
		}elseif ($_POST['pass']=='') {
			print 'Harap Isi Password';
		}elseif ($_POST['addr']=='') {
			print 'Harap Isi Alamat';
		}elseif ($_POST['ktp']=='') {
			print 'Harap Isi No.KTP';
		}elseif ($_POST['nope']=='') {
			print 'Harap Isi No.HP';
		}else{
			sqlquery('insert into penonton (nama, password, alamat, no_ktp, no_hp) values("'.$_POST['name'].'", "'.$_POST['pass'].'","'.$_POST['addr'].'",'.$_POST['ktp'].',"'.$_POST['nope'].'")');
			print "Selesai<br>";
			print '<a href="login.php">klik sini untuk login</a>';
		}
		print '</p>';
	}
?>
	</form>
</body>
</html>