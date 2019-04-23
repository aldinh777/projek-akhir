<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelPeserta extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Peserta
		Schema::create('peserta', function (Blueprint $peserta) {
			$peserta->increments('id');
			$peserta->string('nama');
			$peserta->string('deskripsi');
			$peserta->string('riwayat');
			$peserta->integer('id_akun')->unsigned();
			$peserta->foreign('id_akun')->references('id')->on('akun')->onDelete('cascade')->onUpdate('cascade');
			$peserta->timestamps();
		} );
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Peserta
		Schema::dropIfExists('peserta');
    }
}
