<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelProyek extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Proyek
		Schema::create("proyek", function (Blueprint $proyek) {
			$proyek->increments('id');
			$proyek->string('nama');
			$proyek->string('deskripsi');
			$proyek->integer('harga');
			$proyek->integer('id_lembaga')->unsigned();
			$proyek->integer('id_kategori')->unsigned();
			$proyek->integer('id_peserta')->unsigned()->nullable();
			$proyek->foreign('id_lembaga')->references('id')->on('lembaga')->onDelete('cascade')->onUpdate('cascade');
			$proyek->foreign('id_kategori')->references('id')->on('kategori')->onDelete('cascade')->onUpdate('cascade');
			$proyek->foreign('id_peserta')->references('id')->on('peserta')->onDelete('cascade')->onUpdate('cascade');
			$proyek->timestamps();
		});
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Proyek
		Schema::dropIfExists('proyek');
    }
}
