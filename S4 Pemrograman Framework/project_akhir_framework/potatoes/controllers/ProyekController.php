<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Proyek;
use App\Kategori;
use App\Qna;
use App\Wishlist;
use App\Peserta;
use App\Lembaga;
use Session;

class ProyekController extends Controller
{
	public function index()
	{
		$proyek = Proyek::all();
		$kategori = Kategori::all();

		return view('project.index', compact(['proyek', 'kategori']));
	}

	public function tambah(){
		$kategori = Kategori::all();
		return view('project.tambah', compact('kategori'));
	}

	public function edit($id)
	{
		$proyek = Proyek::find($id);
		$kategori = Kategori::all();
		if($proyek->id_lembaga != Session::get('id')){
			return redirect('/');
		}
		return view('project.edit', compact(['proyek', 'kategori']));
	}

	public function cari(Request $input)
	{
		$proyek = Proyek::where('nama', 'like', '%'.$input->s.'%')->orWhere('deskripsi', 'like', '%'.$input->s.'%')->get();

		return view('project.cari', compact(['proyek']));
	}

	public function edited(Request $input){
		$proyek = Proyek::find($input->id);

		$proyek->nama = $input->nama;
		$proyek->deskripsi = $input->deskripsi;
		$proyek->harga = $input->harga;
		$proyek->id_lembaga = Session::get('id');

		if($input->kategori == 'new'){
			$kategori = new Kategori();
			$kategori->nama = strtoupper($input->newCategory);
			$kategori->save();
			$proyek->id_kategori = $kategori->id;
		}
		else{
			$proyek->id_kategori = $input->kategori;
		}

		$proyek->save();

		return redirect('/projek/'.$proyek->id);
	}

	public function hapus($id){
		$proyek = Proyek::find($id);
		$proyek->delete();
		return redirect('/');
	}

	public function simpan(Request $input) {
		$lembaga = Lembaga::find(Session::get('id'));

		if ( is_null($lembaga) ) {
			return "<h1>Maaf! Profil dengan id_akun $id tidak ditemukan sehingga anda tidak bisa menambah projek...<br/><a href='/'>Back to Home</a></h1>";
		}

		$proyek = new Proyek();

		$proyek->nama = $input->nama;
		$proyek->deskripsi = $input->deskripsi;
		$proyek->harga = $input->harga;
		$proyek->id_lembaga = Session::get('id');

		if($input->kategori == 'new'){
			$kategori = new Kategori();
			$kategori->nama = strtoupper($input->newCategory);
			$kategori->save();
			$proyek->id_kategori = $kategori->id;
		}
		else{
			$proyek->id_kategori = $input->kategori;
		}

		$proyek->save();
	    return redirect('/');
	}

	public function diterima()
	{
		$proyek = Proyek::all();
		$kategori = Kategori::all();
		if(Session::get('level') == 'lembaga'){
			return view('lembaga.diterima', compact(['proyek', 'kategori']));
		}
		elseif (Session::get('level') == 'peserta') {
			return view('peserta.diterima', compact(['proyek', 'kategori']));
		}
	}

	public function ambil($id){
		$wishlist = new Wishlist();

		$wishlist->id_proyek = $id;
		$wishlist->id_peserta = (Peserta::where(['id_akun'=>Session::get('id')])->first())->id;

		$wishlist->save();

		return redirect('/projek/'.$id);
	}

	public function seleksi($id)
	{
		$proyek = Proyek::find($id);
		$kategori = Kategori::all();
		$wishlist = Wishlist::where(['id_proyek'=>$id])->get();

		if(is_null($proyek)){
			return redirect('/');
		}
		return view('project.seleksi', compact(['proyek', 'kategori', 'wishlist']));
	}

	public function terima(Request $input, $id)
	{
		$proyek = Proyek::find($id);
		$proyek->id_peserta = $input->peserta;
		$proyek->save();

		return redirect('/');
	}

	public function blog($id)
	{
		$proyek = Proyek::find($id);
		$kategori = Kategori::all();
		$qna = Qna::where(['id_proyek'=>$id])->get();

		if(is_null($proyek)){
			return redirect('/');
		}
		return view('project.blog', compact(['proyek', 'kategori', 'qna']));
	}

	public function kategori($id){
		$proyek = Proyek::where(['id_kategori'=>$id])->get();
		$kategori = Kategori::all();

		return view('project.index', compact(['proyek', 'kategori']));
	}
}
