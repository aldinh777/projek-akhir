<?php include("stdio.php"); session_start();
	if(!isset($_SESSION['level'])){
		header('location:login.php');
	}
	elseif($_SESSION['level']=='user'){
		header('location:login.php');
	}
	if(isset($_POST['hapus'])){
		sqlquery('delete from film where id_film='.$_POST['hapus']);
	}
	$data = sqldata('select * from film'); 
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
					echo '<table border=1 align="center">';	
					foreach($data as $film){
						echo '<tr>';
						echo '<td><a href="movie.php?id='.$film['id_film'].'">'.$film['nama'].'</a></td>';
						echo '<td><button type="submit" name="hapus" value="'.$film['id_film'].'">Hapus</button></td>';
						echo '</tr>';
					}
					echo '<tr><td colspan=2 align="center">';
					echo '<a href="tambahfilm.php">Tambah</a>';
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