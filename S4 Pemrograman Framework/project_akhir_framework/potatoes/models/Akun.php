<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Contracts\Auth\Authenticatable;
use Illuminate\Auth\Authenticatable as AuthenticableTrait;

class Akun extends Model implements Authenticatable
{
	use AuthenticableTrait;

	//Model Akun
	protected $table = 'akun';
	protected $fillable = [
		'username', 'password', 'level'
	];
	protected $hidden = [
		'password'
	];

	public function peserta(){
		return $this->hasOne(Peserta::class);
	}

	public function faq(){
		return $this->hasMany(Faq::class);
	}

	public function qna(){
		return $this->hasMany(Qna::class);
	}
}
