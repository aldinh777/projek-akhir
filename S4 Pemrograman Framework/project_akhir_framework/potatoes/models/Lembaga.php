<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Lembaga extends Model
{
    //Model Lembaga
	protected $table = 'lembaga';
	protected $fillable = [
		'nama', 'email', 'alamat', 'id_akun'
	];

	public function proyek(){
		return $this->hasMany(Proyek::class);
	}
}
