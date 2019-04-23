@extends('main')
@section('content')

<section id="main-content" class="main-content blog-post-singgle-page">
	<div class="container">
		<div class="row">
			<div class="col-sm-8">
				<div id="blog-post-content" class="blog-post-content">
					<article class="post type-post">
						<div class="post-top">
							<div class="post-thumbnail">
								<img class="img-responsive" src="{{ url('images/blog-single/1.jpg') }}" alt="post Image"/>
							</div>
							<div class="post-meta">
								<div class="entry-meta">
									<div class="author-avatar">
										<img src="{{ url('images/comment/2.jpg') }}" alt="Author Image"/>
									</div>
									<div class="entry-meta-content">
										<span class="author-name">
											<a href="{{ url('profil/lembaga/'.(\App\Lembaga::find($proyek->id_lembaga))->id) }}">{{ (\App\Lembaga::find($proyek->id_lembaga))->nama }}</a>
										</span>
										<span class="entry-date">
											<time datetime="2015-01-15">{{ $proyek->created_at }}</time>
										</span>
									</div><!-- /.meta-content -->
								</div><!-- /.entry-meta -->
							</div><!-- /.post-meta -->
						</div><!-- /.post-top -->
						<div class="post-content">
							<h2 class="entry-title"><a href="">{{ $proyek->nama }}</a></h2>
							@if(!is_null($proyek->id_peserta))
							<div class="alert alert-danger">Proyek ini telah diambil oleh <a href="{{ url('profil/peserta/'.$proyek->id_peserta) }}">{{ \App\Peserta::find($proyek->id_peserta)->nama }}</a></div>
							@endif
							<p class="entry-text">
								{{ $proyek->deskripsi }}
							</p>
							@if(Session::get('level') == 'peserta')
							<div id='timer'></div>
							<?php
							$peserta = \App\Peserta::where(['id_akun'=>Session::get('id')])->first();
							$hasil = \App\Wishlist::where(['id_peserta'=>$peserta->id, 'id_proyek'=>$proyek->id])->first();
							?>
							@if(is_null($hasil) and $proyek->id_peserta == NULL)
							<a class="btn" href="{{ url('ambil/'.$proyek->id) }}"><span class="btn-icon"><i class="fa"></i></span>Ambil Projek</a>
							@endif
							@elseif($proyek->id_lembaga == Session::get('id') and is_null($proyek->id_peserta))
							<a class="btn" href="{{ url('projek/edit/'.$proyek->id) }}"><span class="btn-icon"><i class="fa"></i></span>Edit</a>
							<a class="btn" href="{{ url('projek/hapus/'.$proyek->id) }}"><span class="btn-icon"><i class="fa"></i></span>Hapus</a>
							<a class="btn" href="{{ url('projek/seleksi/'.$proyek->id) }}"><span class="btn-icon"><i class="fa"></i></span>Seleksi</a>
							@endif
						</div>
						<!-- /.post-content -->
						<div id="comments" class="comments">
							<div class="comments-area">
								<h3 class="comment-title"><span class="title-icon"><i class='fa fa-comments'></i></span>Komentar</h3>
								<div class="comments-details">
									<ul class="comment-list">
										@foreach($qna as $komentar)
										<?php
										$akun = \App\Akun::find( (\App\AkunQna::where(['id_qna'=>$komentar->id])->first())->id_akun );
										$peserta = (\App\Peserta::where( ['id_akun'=>$akun->id] ))->first();
										?>
										<li class="parent">
											<article class="comment">
												<div class="comment-author">
													<img src="{{ url('images/comment/1.jpg') }}" alt="Comment Author">
												</div>
												<div class="comment-content">
													<h4 class="author-name">{{ $peserta->nama }}</h4>
													<span class="comment-date">
														<span class="entry-date">
															<time datetime="12-02-2015 09:00">{{ $komentar->created_at }}</time>
														</span>
													</span><!-- /.comment-date -->
													<p>{{ $komentar->pertanyaan }}</p>
												</div>
											</article>
											<!-- /.comment -->

											@if($komentar->jawaban != NULL)
											<ul>
												<li class="child">
													<article class="comment">
														<div class="comment-author">
															<img src="{{ url('images/comment/2.jpg') }}" alt="Comment Author">
														</div>
														<div class="comment-content">
															<h4 class="author-name">{{ (\App\Lembaga::find($proyek->id_lembaga))->nama }}</h4>
															<p>{{ $komentar->jawaban }}</p>
														</div>
													</article>
													<!-- /.comment -->
												</li>
											</ul>
											@elseif(Session::get('level') == 'lembaga' and $komentar->jawaban == NULL and $proyek->id_lembaga == Session::get('id'))
											<ul>
												<li class="child">
													<article class="comment">
														<div class="comment-content">
															<form action="{{ url('reply/'.$komentar->id) }}" method="post" id="commentform" class="commentform">
																{{ csrf_field() }}
																<textarea id="comment" class="comment" name="comment" placeholder="Balasan" rows="4" required></textarea>
																<button name="submit" class="submit-btn" type="submit" id="submit"><span class="ti-shift-right"></span>Balas</button>
															</form>
														</div>
													</article>
													<!-- /.comment -->
												</li>
											</ul>
											@endif

										</li>
										<br/>
										@endforeach
										<!-- /.comments -->
										@if(Session::get('level') == 'peserta' and is_null($proyek->id_peserta))
										<div id="leave-comment" class="clearfix leave-comment">
											<h3 class="title"><span class="title-icon ti-comment-alt"></span>Komentar</h3>
											<div id="respond">
												<form action="{{ url('comment/'.$proyek->id) }}" method="post" id="commentform" class="commentform">
													{{ csrf_field() }}
													<textarea id="comment" class="comment" name="comment" placeholder="Komentar" rows="4" required></textarea>
													<button name="submit" class="submit-btn" type="submit" id="submit"><span class="ti-shift-right"></span>Submit</button>
												</form>
												<!-- /#commentform -->
											</div>
											<!-- /#respond -->
										</div>
										<!-- /#leave-comment -->
										@endif

									</div><!-- /.comment-area -->
								</div><!-- /#comment -->

							</article>
						</div>
					</div>
					<div class="col-sm-4">
						<div id="blog-sidebar" class="blog-sidebar widget-area" role="complementary">
							<div class="sidebar-content">

								<aside class="widget widget_categories">
									<h3 class="widget-title">
										Kategori Projek
									</h3><!-- /.widget-title -->

									<ul class="category-list">
										@foreach($kategori as $kat)
										<li><a href="{{ url('projek/kategori/'.$kat->id) }}">{{ $kat->nama }}</a></li>
										@endforeach
									</ul>
								</aside><!-- /.widget -->

								<aside class="widget widget_calendar">
									<h3 class="widget-title">Kalender</h3>
									<div id="calendar_wrap" class="calendar_wrap">
										<table id="wp-calendar" class="wp-calendar">
											<caption id="calendar-title"></caption>
											<thead>
												<tr>
													<th scope="col" title="Minggu">Mg</th>
													<th scope="col" title="Senin">Sn</th>
													<th scope="col" title="Selasa">Sl</th>
													<th scope="col" title="Rabu">Rb</th>
													<th scope="col" title="Kamis">Km</th>
													<th scope="col" title="Jumat">Jm</th>
													<th scope="col" title="Sabtu">Sb</th>
												</tr>
											</thead>
											<tfoot>
												<tr>
													<td colspan="3"><a onclick="prevIsMail()">« <span id="prevMonth"></span></a></td>
													<td class="pad">&nbsp;</td>
													<td colspan="3"><a onclick="nextIsMail()"><span id="nextMonth"></span> »</a></td>
												</tr>
											</tfoot>
											<tbody id="calendar-body"></tbody>
										</table>
									</div>

								</aside>

							</div><!-- /.sidebar-content -->
						</div><!-- /#sidebar -->
					</div>
				</div>
			</div><!-- /.container -->
		</section><!-- /#main-content -->

		@endsection
