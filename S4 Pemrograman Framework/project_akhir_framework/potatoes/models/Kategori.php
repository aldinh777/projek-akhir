<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Kategori extends Model
{
    //Model Kategori
	protected $table = 'kategori';
	protected $fillable = [
		'nama'
	];

	public function proyek(){
		return $this->hasMany(Proyek::class);
	}
}
