<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Peserta extends Model
{
    //Model Peserta
	protected $table = 'peserta';
	protected $fillable = [
		'nama', 'deskripsi', 'riwayat', 'id_akun'
	];

	public function proyek(){
		return $this->hasMany(Proyek::class);
	}

	public function akun(){
		return $this->belongsTo(Akun::class);
	}
}
