@extends('main')

@section('content')

<section class="main-section paddind" id="Portfolio">
	<!--main-section-start-->
	<div class="container">
		<h2>Hasil Pencarian</h2>
		<h6>Berikut adalah hasil pencarian</h6>
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
		@endforeach
	</div>
</section>

@endsection
