<?php include("stdio.php");  
session_start();
	if(!isset($_SESSION['level'])){
		header('location:login.php');
	}
	elseif($_SESSION['level']=='user'){
		header('location:login.php');
	}
	if(isset($_POST['hapus'])){
		sqlquery('delete from jadwal where id_jadwal='.$_POST['hapus']);
	}
	$data = sqldata('select * from jadwal join film on jadwal.id_film=film.id_film order by waktu');
?>
<html>
<head>
	<title>BIOSKOP</title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>
<body>
	<div class="wrap">
		<?php include('headadmin.php'); ?>
		<div>
			<form method="post">
				<?php 
					echo '<table border="1" align="center">';
					foreach($data as $jadwal){
						echo '<tr>';
						echo '<td>'.$jadwal['nama'].'</td>';
						echo '<td>'.$jadwal['waktu'].'</td>';
						echo '<td><button type="submit" name="hapus" value="'.$jadwal['id_jadwal'].'">Hapus</td>';
						echo '</tr>';
					}
					echo '<tr><td colspan=3 align="center">';
					echo '<a href="filmadmin.php">Tambah</a>';
					echo '</td></tr>';
					echo '</table>';
					
				 ?>	
				 </form>
		</div>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><font color="black" size="3">CopyRight&copy;Arief Ardi Pratama</font></center></pre>
		</div>
	</div>
</body>
</html>