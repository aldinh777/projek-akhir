<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class Wishlist extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Wishlist
		Schema::create('wishlist', function (Blueprint $wishlist) {
			$wishlist->increments('id');
			$wishlist->integer('id_peserta')->unsigned();
			$wishlist->integer('id_proyek')->unsigned();
			$wishlist->foreign('id_peserta')->references('id')->on('peserta')->onDelete('cascade')->onUpdate('cascade');
			$wishlist->foreign('id_proyek')->references('id')->on('proyek')->onDelete('cascade')->onUpdate('cascade');
		    $wishlist->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
		//Drop Wishlist
		Schema::drop('wishlist');
    }
}
