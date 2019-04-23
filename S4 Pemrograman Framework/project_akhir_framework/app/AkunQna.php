<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class AkunQna extends Model
{
    //Model Kategori
	protected $table = 'akun_qna';
	protected $fillable = [
		'id_akun', 'id_qna'
	];
}
