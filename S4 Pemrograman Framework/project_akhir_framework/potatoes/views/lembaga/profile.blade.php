@extends('main')
@section('content')

<br>
<div class="container">
	<h1>{{ $lembaga->nama }}</h1>
</div>
<hr>
<div class="wow fadeInLeft">
	<div class="contact-info-box email clearfix">
		<h3><i class="fa-mail"></i>email:</h3>
		<span>{{ $lembaga->email }}</span>
	</div>
	<div class="contact-info-box address clearfix">
		<h3><i class=" icon-map-marker"></i>Alamat:</h3>
		<span>{{ $lembaga->alamat }}</span>
	</div>
</div>

@endsection
