<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Qna extends Model
{
	//Model Faq
	protected $table = 'qna';
	protected $fillable = [
		'pertanyaan', 'jawaban', 'id_proyek'
	];

	public function akun(){
		return $this->belongsToMany(Akun::class);
	}
}
