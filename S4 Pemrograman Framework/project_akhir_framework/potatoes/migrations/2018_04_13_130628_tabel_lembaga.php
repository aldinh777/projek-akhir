<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelLembaga extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Lembaga
		Schema::create("lembaga", function (Blueprint $lembaga) {
			$lembaga->increments('id');
			$lembaga->string('nama');
			$lembaga->string('email');
			$lembaga->string('alamat');
			$lembaga->integer('id_akun')->unsigned();
			$lembaga->foreign('id_akun')->references('id')->on('akun')->onDelete('cascade')->onUpdate('cascade');
			$lembaga->timestamps();
		});
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Lembaga
		Schema::dropIfExists('lembaga');
    }
}
