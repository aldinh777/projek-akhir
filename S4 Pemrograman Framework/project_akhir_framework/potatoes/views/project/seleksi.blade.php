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
							<!-- /.post-thumbnail -->
							<div class="post-meta">
								<div class="entry-meta">
									<div class="author-avatar">
									<img src="{{ url('images/author/1.jpg') }}" alt="Author Image"/>
								</div>
								<!-- /.author-avatar -->
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
						<p class="entry-text">
							{{ $proyek->deskripsi }}
						</p>
					</div>
					<!-- /.post-content -->
					<div id="comments" class="comments">
						<div class="comments-area">
							<h3 class="comment-title"><span class="title-icon"><i class='fa fa-title'></i></span>Daftar Peserta</h3>
							<div class="comments-details">
								<ul class="comment-list">
									@foreach($wishlist as $wish)
									<li class="parent">
										<article class="comment">
											<div class="comment-content">
												<h4 class="author-name"><a href="{{ url('profil/peserta/'.\App\Peserta::find($wish->id_peserta)->id) }}">{{ \App\Peserta::find($wish->id_peserta)->nama }}</a></h4>
												<br>
												<form action="{{ url('projek/terima/'.$proyek->id) }}" method="post" class="commentform">
													{{ csrf_field() }}
													<input type="hidden" name="peserta" value="{{ \App\Peserta::find($wish->id_peserta)->id }}">
													<button name="submit" class="submit-btn" type="submit" id="submit"><span class="ti-shift-right"></span>Terima</button>
												</form>
										</div>
										</article>
										<!-- /.comment -->
									</li>
									<br/>
									@endforeach
							<!-- /.comments -->
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
							<table id="wp-calendar" class="wp-calenda">
								<caption>Maret 2015</caption>
								<thead>
									<tr>
										<th scope="col" title="Senin">Sn</th>
										<th scope="col" title="Selasa">Sl</th>
										<th scope="col" title="Rabu">Rb</th>
										<th scope="col" title="Kamis">Km</th>
										<th scope="col" title="Jumat">Jm</th>
										<th scope="col" title="Sabtu">Sb</th>
										<th scope="col" title="Minggu">Mg</th>
									</tr>
								</thead>
								<tfoot>
									<tr>
										<td colspan="3" id="prev"><a href="#">« Feb</a></td>
										<td class="pad">&nbsp;</td>
										<td colspan="3" id="next"><a href="#">Apr »</a></td>
									</tr>
								</tfoot>
								<tbody>
									<tr>
										<td colspan="3" class="pad">&nbsp;</td><td>1</td><td>2</td><td>3</td><td>4</td>
									</tr>
									<tr>
										<td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td><td>11</td>
									</tr>
									<tr>
										<td>12</td><td>13</td><td><a href="#">14</a></td><td>15</td><td>16</td><td>17</td><td>18</td>
									</tr>
									<tr>
										<td>19</td><td>20</td><td>21</td><td>22</td><td>23</td><td>24</td><td>25</td>
									</tr>
									<tr>
										<td>26</td><td>27</td><td>28</td><td>29</td><td>30</td><td>31</td>
										<td class="pad" colspan="1">&nbsp;</td>
									</tr>
								</tbody>
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
