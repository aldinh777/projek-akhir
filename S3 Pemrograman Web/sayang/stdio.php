<?php
	function sqldata($nect){	
		$conn = mysqli_connect('localhost', 'root', '', 'Bioskop');
		$query = mysqli_query($conn, $nect);
		$rowsize = mysqli_num_rows($query);
		if($rowsize>0){
			$i = 0;
			while($buzz = mysqli_fetch_assoc($query)){
				$data[$i] = $buzz;
				$i++;
			}
			return $data;
		}
	}
	function sqlquery($nect){
		$conn = mysqli_connect('localhost', 'root', '', 'Bioskop');
		mysqli_query($conn, $nect);
	}
	function input($name, $etc='', $type='text', $value=''){
		print '<input type="'.$type.'" name="'.$name.'" value="'.$value.'" '.$etc.'>';
	}
?>