@extends('main')
@section('content')

<div class="post-area" style="margin-left:3cm; margin-right:3cm;">
	<div class="post-area-top text-center">
		<h2 class="post-area-title">Pendaftaran</h2>
		<p class="title-description">Silahkan Pilih jenis Akun yang akan dibuat</p>
	</div><!-- /.post-area-top -->

	<div class="row">
		<div class="latest-posts">
			<div class="col-sm-6">
				<div class="item">
					<article class="post type-post">
						<div class="post-top">
							<div class="post-thumbnail">
								<a href="{{ url('reg/lembaga') }}">
									<img src="{{ url('images/blog/1.jpg') }}" alt="post Image" style="width:500px;height:300px;">
								</a>
							</div><!-- /.post-thumbnail -->
						</div><!-- /.post-top -->
						<div class="post-content">
							<h2 class="entry-title"><a href="blog-single.html">Lembaga</a></h2>
							<p class="entry-text">
								Ikut dengan kami sebagai lembaga agar orang lain bisa memilih projek yang anda buat
							</p>
							<a class="btn" href="{{ url('reg/lembaga') }}">
								<span class="btn-icon"><i class="fa fa-arrow-circle-right"></i></span>
								Daftar Sebagai Lembaga
							</a>
						</div><!-- /.post-content -->
					</article>
				</div><!-- /.item -->
			</div>
			<div class="col-sm-6">
				<div class="item">
					<article class="post type-post">
						<div class="post-top">
							<div class="post-thumbnail">
								<a href="{{ url('reg/peserta') }}">
									<img src="{{ url('images/blog/2.jpg') }}" alt="post Image" style="width:500px;height:300px;">
								</a>
							</div><!-- /.post-thumbnail -->
						</div><!-- /.post-top -->
						<div class="post-content">
							<h2 class="entry-title"><a href="blog-single.html">Peserta</a></h2>
							<p class="entry-text">
								Ikut dengan kami sebagai Peserta agar anda bisa mencoba untuk mengikuti projek yang telah dibuat oleh suatu lembaga atau instansi tertentu
							</p>
							<a class="btn" href="{{ url('reg/peserta') }}">
								<span class="btn-icon"><i class="fa fa-arrow-circle-right"></i></span>
								Daftar Sebagai Peserta
							</a>
						</div><!-- /.post-content -->
					</article>
				</div><!-- /.item -->
			</div>
		</div><!-- /.latest-posts -->
	</div><!-- /.row -->
</div>

@endsection
