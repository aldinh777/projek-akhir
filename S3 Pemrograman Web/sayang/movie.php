<?php include('stdio.php'); if(!isset($_GET['id'])){header('location:login.php');}
	if (isset($_POST['jenis'])) {
		if($_POST['jenis']=='gantijudul' and $_POST['nama']!=''){
			sqlquery('update film set nama="'.$_POST['nama'].'" where id_film='.$_GET['id']);
		}elseif
		($_POST['jenis']=='gantiharga' and $_POST['harga']!=''){
			sqlquery('update film set harga="'.$_POST['harga'].'" where id_film='.$_GET['id']);
		}elseif
		($_POST['jenis']=='gantisutradara' and $_POST['sutradara']!=''){
			sqlquery('update film set sutradara="'.$_POST['sutradara'].'" where id_film='.$_GET['id']);
		}elseif
		($_POST['jenis']=='gantisinopsis' and $_POST['sinopsis']!=''){
			sqlquery('update film set sinopsis="'.$_POST['sinopsis'].'" where id_film='.$_GET['id']);
		}
		elseif($_POST['jenis']=='tambahjadwal'){
			sqlquery('insert into jadwal (waktu, id_film) values ("'.$_POST['tahun'].'-'.$_POST['bulan'].'-'.$_POST['tgl'].' '.$_POST['jam'].':'.$_POST['menit'].':'.'" ,'.$_GET['id'].')');
		}
		elseif($_POST['jenis']=='tambahgenre'){
			sqlquery('insert into genrefilm (id_film, id_genre) values ('.$_GET['id'].','.$_POST['genre'].')');
		}
	}
?>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="sin.css">
</head>
<body>
	<div class="wrap">
		<?php include('headadmin.php'); ?>
		<div class="content">
		<form method="post">
				<?php 
					$data = sqldata('select * from film where id_film='.$_GET['id']);
					echo '<table>';
					echo '<tr>';
					echo '<td>'.$data[0]['nama'].'</td>';
					echo '<td><input type="text" name="nama"></td>';
					echo '<td><input type="submit" name="jenis" value="gantijudul"></td>';
					echo '</tr>';
					echo '<tr>';
					echo '<td>'.$data[0]['harga'].'</td>';
					echo '<td><input type="text" name="harga"></td>';
					echo '<td><input type="submit" name="jenis" value="gantiharga"></td>';
					echo '</tr>';
					echo '<tr>';
					echo '<td>'.$data[0]['sutradara'].'</td>';
					echo '<td><input type="text" name="sutradara"></td>';
					echo '<td><input type="submit" name="jenis" value="gantisutradara"></td>';
					echo '</tr>';
					echo '<tr>';
					echo '<td>'.$data[0]['sinopsis'].'</td>';
					echo '<td><textarea name="sinopsis"></textarea></td>';
					echo '<td><input type="submit" name="jenis" value="gantisinopsis"></td>';
					echo '</tr>';
					echo '</table>';
				 ?>
				 <br>
				 tanggal : <select name='tgl'>
				 	<?php for ($i=1; $i<=30; $i++) { 
				 		print '<option value="'.$i.'">'.$i.'</option>';
				 	} ?>
				 </select>
				 bulan : <select name='bulan'>
				 	<?php for ($i=1; $i<=12; $i++) { 
				 		print '<option value="'.$i.'">'.$i.'</option>';
				 	} ?></select>
				 tahun : <select name='tahun'>
				 	<?php for ($i=1990; $i<=2020; $i++) { 
				 		print '<option value="'.$i.'">'.$i.'</option>';
				 	} ?>
				 </select>
				 jam : <select name='jam'>
				 	<?php for ($i=0; $i<24; $i++) { 
				 		print '<option value="'.$i.'">'.$i.'</option>';
				 	} ?>
				 </select>
				 menit : <select name='menit'>
				 	<?php for ($i=0; $i<60; $i++) { 
				 		print '<option value="'.$i.'">'.$i.'</option>';
				 	} ?>
				 </select>
				 <br>
				 <input type="submit" name="jenis" value='tambahjadwal'>
				 <br>
				 genre : <select name='genre'>
				 	<?php $genre = sqldata('select * from genre'); 
				 		foreach($genre as $g){
				 			print '<option value="'.$g['id_genre'].'">'.$g['jenis'].'</option>';
				 		}
				 	?>
				 </select>
				 <br>
				 <input type="submit" name="jenis" value='tambahgenre'>
			</form>
		</div>
		<div class="clear"></div>
		<div class="footer">
			<pre><center><font color="black" size="3">CopyRight&copy;Arief Ardi Pratama</font></center></pre>
		</div>
	</div>
</body>
</html>