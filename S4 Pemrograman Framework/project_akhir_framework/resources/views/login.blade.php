@extends('main')

@section('content')
<br>
<div class="container">
	<br>
	<div class="row">
		<div class="col-sm-12">
			<header class="template_header">
				<h1 class="text-center"> Login </h1>
			</header>
		</div>
	</div>
	<br>
	<form role="form" action="{{ url('login') }}" method="post">
		{{ csrf_field() }}
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon"><i class="fa fa-user"></i></div>
				<input name="username" class="form-control" placeholder="Username" type="text">
			</div>
		</div>
		<br>
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon"><i class="fa fa-lock"></i></div>
				<input name="password" class="form-control" placeholder="Password" type="password">
			</div>
		</div>
		<br>
		<div class="form-group row">
			<div class="col-xs-6">
				<button type="submit" class="form-control">Login</button>
			</div>
			<div class="col-xs-6">
				<p style="text-align:center"> Belum Punya Akun ? <a href="{{ url('reg') }}">Register</a> </p>
			</div>
		</div>
	</form>
</div>
<br>

<script type="text/javascript">
	@if(count($errors) > 0 )
		@foreach($errors->all() as $error)
			alert('{{ $error }}');
		@endforeach
	@endif
</script>

@endsection
