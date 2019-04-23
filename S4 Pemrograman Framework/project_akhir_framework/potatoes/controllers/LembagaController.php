<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Akun;
use App\Proyek;
use App\Kategori;
use App\Lembaga;
use Session;

class LembagaController extends Controller
{
    public function simpan(Request $input) {
		$akun = new Akun();
		$lembaga = new Lembaga();

		$akun->username = $input->username;
		$akun->password = $input->password;
		$akun->level = 'lembaga';
		$akun->save();

		$lembaga->nama = $input->nama;
		$lembaga->email = $input->email;
		$lembaga->alamat = $input->alamat;
		$lembaga->id_akun = $akun->id;

		$lembaga->save();

		Session::put('id', $akun->id);
		Session::put('level', $akun->level);

		return redirect('/profil/lembaga/'.$lembaga->id);
	}

	public function profil($id) {
		$lembaga = Lembaga::where(['id_akun'=>$id])->first();

		if ( is_null($lembaga) ) {
			return "<h1>Maaf! Lembaga dengan id_akun $id tidak ditemukan... <a href='/'>Back to Home</a></h1>";
		}

		return view('lembaga.profile', compact('lembaga'));
	}

	public function dashboard($id) {
		$proyek = Proyek::where(['id_kategori'=>$id])->first();
		$kategori = Kategori::all();

		return view('lembaga.dashboard', compact(['proyek', 'kategori']));
	}
}
