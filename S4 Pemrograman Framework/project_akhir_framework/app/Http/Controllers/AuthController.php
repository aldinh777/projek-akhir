<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Session;
use App\Akun;
use App\Proyek;
use App\Kategori;
use App\Peserta;

class AuthController extends Controller
{
	public function index()
	{
		$proyek = Proyek::all();
		$kategori = Kategori::all();
		if(Session::has('level')) {
			if(Session::get('level') == 'lembaga'){
				return view('lembaga.dashboard', compact(['proyek', 'kategori']));
			}
			elseif (Session::get('level') == 'peserta') {
				return view('peserta.dashboard', compact(['proyek', 'kategori']));
			}
		}
		else {
			return view('index', compact('proyek'));
		}
	}

	public function login()
	{
		if(Session::has('level')) {
			return redirect('/');
		}
		return view('login');
	}

	public function proses(Request $request)
	{
		$akun = Akun::where($request->only('username','password'))->first();
		if (!is_null($akun)) {
			Session::put('id', $akun->id);
			Session::put('level', $akun->level);
			return redirect('/');
		}
		return redirect()->back()->withErrors(['Username Atau Password Salah']);
	}

	public function logout()
	{
		if(Session::has('id')){
			Session::forget('id');
			Session::forget('level');
			return redirect('/');
		}else{
			return redirect('/login')->withErrors(['Silahkan Login Terlebih Dahul']);
		}
	}
}
