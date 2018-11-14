<?php include("stdio.php"); 
session_start();
	if(!isset($_SESSION['level'])){
		header('location:login.php');
	}
	elseif($_SESSION['level']=='user'){
		header('location:login.php');
	}
	if(isset($_POST['hapus'])){
		sqlquery('delete from genre where id_genre='.$_POST['hapus']);
	}
	if(isset($_POST['tombol']) and $_POST['tambah']!=''){
		sqlquery('insert into genre (jenis) values ("'.$_POST['tambah'].'")');
	}
	$data = sqldata('select * from genre');
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
					if(count($data)>0){
						foreach($data as $genre){
							echo '<tr>';
							echo '<td>'.$genre['jenis'].'</td>';
							echo '<td><button type="submit" name="hapus" value="'.$genre['id_genre'].'">Hapus</button></td>';
							echo '</tr>';
						}
					}
					echo '<tr><td>';
					echo '<input type="text" name="tambah"></td><td><input type="submit" name="tombol" value="tambah"></td></tr>';
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