<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelAkunQna extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Relasi Akun Qna
		Schema::create('akun_qna', function (Blueprint $akun_qna) {
			$akun_qna->increments('id');
			$akun_qna->integer('id_akun')->unsigned();
			$akun_qna->integer('id_qna')->unsigned();
			$akun_qna->foreign('id_akun')->references('id')->on('akun')->onDelete('cascade')->onUpdate('cascade');
			$akun_qna->foreign('id_qna')->references('id')->on('qna')->onDelete('cascade')->onUpdate('cascade');
			$akun_qna->timestamps();
		} );
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Relasi Akun Qna
		Schema::drop('akun_qna');
    }
}
