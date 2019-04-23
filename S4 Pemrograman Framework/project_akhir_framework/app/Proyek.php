<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Proyek extends Model
{
    //Model Proyek
	protected $table = 'proyek';
	protected $fillable = [
		'nama', 'deskripsi', 'harga', 'id_kategori', 'id_lembaga', 'id_peserta'
	];

	public function lembaga(){
		return $this->belongsTo(Lembaga::class);
	}

	public function kategori(){
		return $this->belongsTo(Kategori::class);
	}

	public function peserta(){
		return $this->belongsTo(Peserta::class);
	}
}
