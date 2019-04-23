<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelKategori extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Kategori
		Schema::create('kategori', function (Blueprint $kategori) {
			$kategori->increments('id');
			$kategori->string('nama');
			$kategori->timestamps();
		} );
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Kategori
		Schema::dropIfExists('kategori');
    }
}
