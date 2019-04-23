@extends('main')

@section('content')

<section class="main-section paddind" id="Portfolio">
	<!--main-section-start-->
	<div class="container">
		<h2>Daftar Projek</h2>
		<h6>Silahkan Pilih Projek yang Anda Inginkan</h6>
		<div class="portfolioFilter">
			<ul class="Portfolio-nav wow fadeIn delay-02s animated" style="visibility: visible; animation-name: fadeIn;">
				<li><a href="{{ url('projek') }}">Semua</a></li>
				@foreach($kategori as $kat)
				<li><a href="{{ url('projek/kategori/'.$kat->id) }}">{{ $kat->nama }}</a></li>
				@endforeach
			</ul>
		</div>
	</div>
	<?php
	$xloc = [15, 390, 765];
	$yloc = 0;
	$xtrigger = 0;
	$ytrigger = 0;
	$total = 0;
	foreach ($proyek as $key) {
		$total += 1;
	}
	?>
	<div class="portfolioContainer wow fadeInUp delay-04s isotope animated" style="visibility: visible; animation-name: fadeInUp; position: relative; overflow: hidden; height: {{ (($total/3)+1)*380 }}px; width: 1140px;">
		@foreach($proyek as $pr)
		@if($pr->id_peserta == NULL)
		<div class="Portfolio-box isotope-item" style="position: absolute; left: 0px; top: 0px; transform: translate3d({{ $xloc[$xtrigger] }}px, {{ $yloc }}px, 0px);">
			<a href="{{ url('projek/'.$pr->id) }}"><img src="{{ url('img/Portfolio-pic1.jpg') }}" alt=""></a>
			<h3>{{ $pr->nama }}</h3>
			<p>{{ \App\Kategori::find($pr->id_kategori)->nama }}</p>
		</div>
		<?php
		$xtrigger += 1;
		$ytrigger += 1;
		if ($ytrigger >= 3) {
			$xtrigger = 0;
			$ytrigger = 0;
			$yloc += 380;
		}
		 ?>
		@endif
		@endforeach
	</div>
</section>

@endsection
