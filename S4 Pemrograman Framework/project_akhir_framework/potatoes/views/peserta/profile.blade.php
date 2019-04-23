@extends('main')
@section('content')

<br>
<div class="container">
	<h1>{{ $peserta->nama }}</h1>
</div>
<hr>
<div class="wow fadeInLeft">
	<div class="contact-info-box address clearfix">
		<h3><i class="fa-pencil"></i>Deskripsi:</h3>
		<span>{{ $peserta->deskripsi }}</span>
	</div>
	<div class="contact-info-box address clearfix">
		<h3><i class="fa-pencil"></i>Riwayat:</h3>
		<span>{{ $peserta->riwayat }}</span>
	</div>
</div>

@endsection
