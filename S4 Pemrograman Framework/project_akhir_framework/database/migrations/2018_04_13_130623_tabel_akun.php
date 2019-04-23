<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelAkun extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Akun
		Schema::create('akun', function (Blueprint $akun) {
			$akun->increments('id');
			$akun->string('username');
			$akun->string('password');
			$akun->string('level');
			$akun->timestamps();
		} );
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Akun
		Schema::dropIfExists('akun');
    }
}
