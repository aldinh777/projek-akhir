<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Akun;
use App\Proyek;
use App\Kategori;
use App\Peserta;
use Session;

class PesertaController extends Controller
{
	public function simpan(Request $input) {
		$akun = new Akun();
		$peserta = new Peserta();

		$akun->username = $input->username;
		$akun->password = $input->password;
		$akun->level = 'peserta';
		$akun->save();

		$peserta->nama = $input->nama;
		$peserta->deskripsi = $input->deskripsi;
		$peserta->riwayat = $input->riwayat;
		$peserta->id_akun = $akun->id;

		$peserta->save();

		Session::put('id', $akun->id);
		Session::put('level', $akun->level);

	    return redirect('/profil/peserta/'.$peserta->id);
	}

	public function profil($id) {
		$peserta = Peserta::where(['id_akun'=>$id])->first();
		return view('peserta.profile', compact('peserta'));
	}

	public function dashboard($id) {
		$proyek = Proyek::where(['id_kategori'=>$id])->get();
		$kategori = Kategori::all();

		return view('peserta.dashboard', compact(['proyek', 'kategori']));
	}
}
