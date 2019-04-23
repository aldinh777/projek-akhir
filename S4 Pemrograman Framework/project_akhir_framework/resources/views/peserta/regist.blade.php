@extends('main')
@section('content')
<br>
<div id="leave-comment" class="clearfix leave-comment"  style="margin-left:5cm; margin-right:10cm;">
	<h3><span class="title-icon ti-comment-alt"></span>Mendaftar Sebagai Peserta</h3>
	<br>
	<div id="respond">
		<form action="{{ url('save/peserta') }}" method="post" id="commentform" class="commentform">
			{{ csrf_field() }}
			<input class="name" name="username" placeholder="Username*" value="" required="" type="text">
			<input class="password" name="password" placeholder="Password*" value="" required="" type="password">
			<input class="name" name="nama" placeholder="Nama*" value="" required="" type="text">
			<textarea class="comment" name="deskripsi" placeholder="Deskripsi*" rows="4" required=""></textarea>
			<textarea class="comment" name="riwayat" placeholder="Riwayat*" rows="4" required=""></textarea>
			<button name="submit" class="submit-btn" type="submit" id="submit"><span class="ti-shift-right"></span>Daftar</button>
		</form><!-- /#commentform -->
	</div><!-- /#respond -->
</div>

<br>
@endsection
