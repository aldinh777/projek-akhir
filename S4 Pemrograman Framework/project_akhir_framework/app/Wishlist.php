<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Wishlist extends Model
{
	protected $table = 'wishlist';
	protected $fillable = [
		'id_peserta', 'id_proyek'
	];
}
