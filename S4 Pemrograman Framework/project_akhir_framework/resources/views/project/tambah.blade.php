@extends('main')
@section('content')
<br>
<div id="leave-comment" class="clearfix leave-comment"  style="margin-left:5cm; margin-right:10cm;">
	<h3><span class="title-icon ti-comment-alt"></span>Tambah Projek</h3>
	<br>
	<div id="respond">
		<form action="{{ url('save/proyek') }}" method="post" id="commentform" class="commentform" onsubmit="return validasiKategori()">
			{{ csrf_field() }}
			<input class="name" name="nama" placeholder="Nama*" value="" required="" type="text">
			<input class="number" name="harga" placeholder="Harga*" value="" required="" type="number">
			<div id="warazz">
				<select id="category" class="form-control" name="kategori" onchange="giveBirth(this)">
					<option value="0">== Pilih Kategori ==</option>
					@foreach($kategori as $kat)
					<option value="{{ $kat->id }}">{{ $kat->nama }}</option>
					@endforeach
					<option value="new">== Buat Baru ==</option>
				</select>
			</div>
			<br>
			<textarea class="comment" name="deskripsi" placeholder="Deskripsi*" rows="4" required=""></textarea>
			<button name="submit" class="submit-btn" type="submit" id="submit"><span class="ti-shift-right"></span>Tambah</button>
		</form><!-- /#commentform -->
	</div><!-- /#respond -->
</div>

<script type="text/javascript">
	function validasiKategori(){
		var x = document.getElementById('category');
		if(x.value == '0'){
			alert('Pilih Kategori');
			return false;
		}
		else{
			return true;
		}
	}

	function giveBirth(e){
		if(e.value == 'new'){
			var p = document.createElement('input');
			var br = document.createElement('br');
			br.id = 'breakline';
			p.id = 'newCategory';
			p.name = 'newCategory';
			p.class = 'name';
			p.placeholder = 'Kategori Baru*';
			p.required = 'true';
			p.type = 'name';
			var x = document.getElementById('warazz');
			x.appendChild(br);
			x.appendChild(p);
		}
		else{
			var x = document.getElementById('warazz');
			var br = document.getElementById('breakline');
			var p = document.getElementById('newCategory');
			x.removeChild(br);
			x.removeChild(p);
		}
	}
</script>

<br>
@endsection
