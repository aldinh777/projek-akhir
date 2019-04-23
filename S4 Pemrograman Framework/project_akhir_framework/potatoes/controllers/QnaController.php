<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Proyek;
use App\AkunQna;
use App\Qna;
use Session;

class QnaController extends Controller
{
    public function komentar($id, Request $input)
    {
		$qna = new Qna();
		$qna->pertanyaan = $input->comment;
		$qna->id_proyek = $id;
		$qna->save();

		$akunqna = new AkunQna();
		$akunqna->id_akun = Session::get('id');
		$akunqna->id_qna = $qna->id;
		$akunqna->save();

		return redirect('/projek/'.$id);
    }

	public function balas($id, Request $input){
		$qna = Qna::find($id);
		$qna->jawaban = $input->comment;
		$qna->save();

		return redirect('/projek/'.$qna->id_proyek);
	}
}
