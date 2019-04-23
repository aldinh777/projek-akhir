<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class TabelQna extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        //Create Qna
		Schema::create('qna', function (Blueprint $qna) {
			$qna->increments('id');
			$qna->string('pertanyaan');
			$qna->string('jawaban')->nullable();
			$qna->integer('id_proyek')->unsigned();
			$qna->foreign('id_proyek')->references('id')->on('proyek')->onDelete('cascade')->onUpdate('cascade');
			$qna->timestamps();
		} );
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //Drop Qna
		Schema::dropIfExists('qna');
    }
}
