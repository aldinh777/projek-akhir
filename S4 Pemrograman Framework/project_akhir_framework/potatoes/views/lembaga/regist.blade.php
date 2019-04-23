@extends('main')
@section('content')
<br>
<div id="leave-comment" class="clearfix leave-comment"  style="margin-left:5cm; margin-right:10cm;">
	<h3><span class="title-icon ti-comment-alt"></span>Mendaftar Sebagai Lembaga</h3>
	<br>
	<div id="respond">
		<form action="{{ url('save/lembaga') }}" method="post" id="commentform" class="commentform">
			{{ csrf_field() }}
			<input class="name" name="username" placeholder="Username*" value="" required="" type="text">
			<input class="password" name="password" placeholder="Password*" value="" required="" type="password">
			<input class="name" name="nama" placeholder="Nama*" value="" required="" type="text">
			<input class="email" name="email" placeholder="Email*" value="" required="" type="email">
			<textarea class="comment" name="alamat" placeholder="Alamat*" rows="4" required=""></textarea>
			<button name="submit" class="submit-btn" type="submit" id="submit"><span class="ti-shift-right"></span>Daftar</button>
		</form><!-- /#commentform -->
	</div><!-- /#respond -->
</div>

<br>
@endsection
