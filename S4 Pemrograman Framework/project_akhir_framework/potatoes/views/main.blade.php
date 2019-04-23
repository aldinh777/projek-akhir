<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Projek Akhir Framework</title>
	<meta name="description" content="Projek Akhir Framework" >
	<meta name="author" content="Aldi Nur Hendra">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
	<link href="{{ url('assets/css/bootstrap.min.css') }}" rel="stylesheet">
	<link href="{{ url('assets/css/font-awesome.min.css') }}" rel="stylesheet">
	<link href="{{ url('assets/css/magnific-popup.css') }}" rel="stylesheet">
	<link href="{{ url('assets/css/style.css') }}" rel="stylesheet">
	<link href="{{ url('assets/css/animate.min.css') }}" rel="stylesheet">
	<link href="{{ url('assets/css/owl.carousel.css') }}" rel="stylesheet">
	<link href="{{ url('assets/css/responsive.css') }}" rel="stylesheet">
	<link href="{{ url('css/style.css') }}" rel="stylesheet" type="text/css">
	<!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	<style>
	a:hover{
		cursor: pointer;
	}
	</style>

	<!-- Script Timer -->
	<script type="text/javascript">
	/** Membuat Waktu Mulai Hitung Mundur Dengan
	* var detik = 0,
	* var menit = 1,
	* var jam = 1
	*/
	var detik = 30;
	var menit = 10;
	var jam   = 180;

	/**
	* Membuat function hitung() sebagai Penghitungan Waktu
	*/
	function hitung() {
		/** setTimout(hitung, 1000) digunakan untuk
		* mengulang atau merefresh halaman selama 1000 (1 detik)
		*/
		setTimeout(hitung,1000);

		/** Jika waktu kurang dari 10 menit maka Timer akan berubah menjadi warna merah */
		if(menit < 10 && jam == 0){
			var peringatan = 'style="color:red"';
		};

		/** Menampilkan Waktu Timer pada Tag #Timer di HTML yang tersedia */
		$('#timer').html(
			'<h1 align="center"'+peringatan+'>Sisa waktu <br />' + jam + ' jam : ' + menit + ' menit : ' + detik + ' detik</h1><hr>'
		);

		/** Melakukan Hitung Mundur dengan Mengurangi variabel detik - 1 */
		detik --;

		/** Jika var detik < 0
		* var detik akan dikembalikan ke 59
		* Menit akan Berkurang 1
		*/
		if(detik < 0) {
			detik = 59;
			menit --;

			/** Jika menit < 0
			* Maka menit akan dikembali ke 59
			* Jam akan Berkurang 1
			*/
			if(menit < 0) {
				menit = 59;
				jam --;

				/** Jika var jam < 0
				* clearInterval() Memberhentikan Interval dan submit secara otomatis
				*/
				if(jam < 0) {
					clearInterval();
				}
			}
		}
	}
	</script>

</head>
<body class="header-fixed-top">
	<div id="page-top" class="page-top"></div>
	<section id="site-banner" class="site-banner text-center">
		<div class="container">
			<div class="site-logo">
				<!-- <a href="./"><img src="images/logo.png" alt="Site Logo"></a> -->
				POORJECT
			</div>
		</div>
	</section>
	<header id="main-menu" class="main-menu">
		<div class="container">
			<div class="row">
				<div class="col-sm-7">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menu">
							<i class="fa fa-bars"></i>
						</button>
						<div class="menu-logo">
							<a href="./">POORJECT</a>
						</div>
					</div>
					<nav id="menu" class="menu collapse navbar-collapse">
						<ul id="headernavigation" class="menu-list nav navbar-nav">
							<li><a href="{{ url('/') }}">Home</a></li>
							<li><a href="{{ url('about') }}">About</a></li>
							@if(!Session::has('level'))
							<li><a href="{{ url('login') }}">Login</a></li>
							@elseif(Session::has('id'))
							<li><a href="{{ url('projek') }}">Projek</a></li>
							<li><a href="{{ url('accepted') }}">Diterima</a></li>
							<li><a href="{{ url('profil/'.Session::get('level').'/'.Session::get('id')) }}">Profil</a></li>
							<li><a href="{{ url('logout') }}">Logout</a></li>
							@endif
						</ul>
					</nav>
				</div>
				@if(Session::has('id'))
				<div class="col-sm-5">
					<div class="menu-search pull-right">
						<form role="search" class="search-form" action="{{ url('search') }}" method="get">
							<input class="search-field" type="text" name="s" id="s" placeholder="Cari Projek" required>
							<button class="btn search-btn" type="submit"><i class="fa fa-search"></i></button>
						</form>
					</div>
				</div>
				@endif
			</div>
		</div>
	</header>
	@yield('content')
	<footer>
		<div id="footer-bottom" class="footer-bottom text-center">
			<div class="container">
				<div id="copyright" class="copyright">
					&copy; Projek Akhir Framework 2018 - Menggunakan Templata Heera
				</div>
			</div>
		</div>
	</footer>
	<div id="scroll-to-top" class="scroll-to-top">
		<span>
			<i class="fa fa-chevron-up"></i>
		</span>
	</div>
	<script src="{{ url('assets/js/modernizr-2.8.3.min.js') }}"></script>
	<script src="{{ url('assets/js/jquery-2.1.0.min.js') }}"></script>
	<script src="{{ url('assets/js/jquery.magnific-popup.min.js') }}"></script>
	<script src="{{ url('assets/js/gmap3.js') }}"></script>
	<script src="{{ url('assets/js/plugins.js') }}"></script>
	<script src="{{ url('assets/js/functions.js') }}"></script>
	<script src="{{ url('assets/js/wow.min.js') }}"></script>
	<script src="{{ url('assets/js/jquery.ajaxchimp.min.js') }}"></script>
	<script>
	var date = new Date();
	var bulan = date.getMonth();
	var tahun = date.getFullYear();
	function getBulan(i){
		var array = [
			'Januari',	'Februari',	'Maret',
			'April',	'Mei',		'Juni',
			'Juli',		'Agustus',	'September',
			'Oktober',	'November',	'Desember'
		];
		return array[i];
	}
	function prevIsMail() {
		bulan--;
		if (bulan == -1) {
			bulan = 11;
			tahun--;
		}
		buildCalendar();
	}
	function nextIsMail() {
		bulan++;
		if (bulan == 12) {
			bulan = 0;
			tahun++;
		}
		buildCalendar();
	}
	function buildCalendar(){
		var awal = new Date(tahun, bulan, 1);
		var akhir = (new Date(tahun, bulan+1, 0)).getDate();
		var offset = awal.getDay();
		var cal = $('#calendar-body');
		$('#calendar-title').text( getBulan(bulan)+" "+tahun );
		$('#nextMonth').text('Nex');
		$('#prevMonth').text('Pre');
		cal.empty();
		var coord = 0;
		var tanggal = 1;
		while (true) {
			var tr = $('<tr></tr>');
			for (var j = 0; j < 7; j++) {
				var td = $('<td></td>');
				if (coord < offset) {
				}
				else if(tanggal > akhir){
				}
				else if (bulan == date.getMonth() && tanggal == date.getDate() && tahun == date.getFullYear()) {
					td.append( $('<a></a>').text(tanggal).css('background-color', 'dodgerblue').css('color', 'white') );
					tanggal++;
				}
				else{
					td.text( tanggal );
					tanggal++;
				}
				tr.append( td );
				coord++;
			}
			cal.append( tr );
			if (tanggal > akhir) {
				break;
			}
		}
	}
	$(document).ready(function() {
		buildCalendar();
		/** Menjalankan Function Hitung Waktu Mundur */
		hitung();
	});
	</script>
</body>
</html>
