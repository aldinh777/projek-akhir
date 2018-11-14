<?php include("stdio.php"); 
$data = sqldata('select * from film'); 
session_start();
	if(!isset($_SESSION['level'])){
		header('location:login.php');
	}
	elseif($_SESSION['level']=='admin'){
		header('location:login.php');}
?>
<html class="wrap">
<head>
	<title>BIOSKOP</title>
	<link rel="stylesheet" type="text/css" href="hal.css">
</head>

<body class="content">
<?php include('head.php'); ?>
	<div >
		<div>
				<?php 
					print '<h1 align="center" style="color:gray;"> Selamat Datang </h1>';
					print '<h3 align="center" style="color:black;"> Silahkan memilih film yang tersedia </h3>';
					
					foreach($data as $film){
						$despacito = sqldata('SELECT film.nama, genre.jenis from film join genrefilm on film.id_film=genrefilm.id_film join genre on genrefilm.id_genre=genre.id_genre where film.id_film='.$film['id_film']);
						echo '<br>';
						echo '<br>';
						echo '<table border="2" align="center">';

						echo '<tr align="center">';
						echo '<td><a href="sin.php?id='.$film['id_film'].'"><img src="'.$film['gambar'].'"></a></td>';
						echo '</tr><tr>';
						echo '<td>Durasi Film     = '.$film['durasi'].'</td>';
						echo '</tr><tr>';
						echo '<td>Harga Tiket     = '.$film['harga'].'</td>';
						echo '</tr><tr>';
						echo '<td>Tanggal Rilis   = '.$film['tanggal_rilis'].'</td>';
						echo '</tr><tr>';
						echo '<td>Sutradara       = '.$film['sutradara'].'</td>';
						echo '</tr><tr>';
						echo '<td>Genre      = ';
						if(count($despacito)<=0){
							print '-';
						}
						else{
							foreach ($despacito as $genre) {
								print $genre['jenis'].',';
							}
						}
						echo '</td>';
						echo '</tr>';
						echo '</table>';
					}
				 ?>	
		</div>
		<br>
		<br>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><size="3">CopyRight&copy;Bioskop Samarinda</font></center></pre>
		</div>
	</div>
</body>
</html>