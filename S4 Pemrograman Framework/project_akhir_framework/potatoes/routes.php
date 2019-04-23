<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

//umum
Route::get('/', 'AuthController@index');
Route::get('/login', 'AuthController@login');
Route::post('/login', 'AuthController@proses');

Route::get('/logout', 'AuthController@logout');

Route::view('/about', 'about-us');
Route::view('/reg', 'regist');
Route::view('/reg/lembaga', 'lembaga.regist');
Route::view('/reg/peserta', 'peserta.regist');
Route::post('/save/lembaga', 'LembagaController@simpan');
Route::post('/save/peserta', 'PesertaController@simpan');

Route::group(['middleware'=> ['web']], function() {
	Route::group(['middleware' => ['lembaga']], function() {
		Route::get('/projek/edit/{id}', 'ProyekController@edit');
		Route::get('/projek/hapus/{id}', 'ProyekController@hapus');
		Route::get('/projek/seleksi/{id}', 'ProyekController@seleksi');
		Route::get('/tambah/proyek', 'ProyekController@tambah');
		Route::post('/projek/edited', 'ProyekController@edited');
		Route::post('/projek/terima/{id}', 'ProyekController@terima');
		Route::post('/save/proyek', 'ProyekController@simpan');

		Route::get('/dashboard/lembaga/{id}', 'LembagaController@dashboard');
		Route::post('/reply/{id}', 'QnaController@balas');
	});
	Route::group(['middleware' => ['peserta']], function() {
		Route::get('/dashboard/peserta/{id}', 'PesertaController@dashboard');
		Route::get('/ambil/{id}', 'ProyekController@ambil');
		Route::post('/comment/{id}', 'QnaController@komentar');
	});
	Route::group(['middleware' => ['keduanya']], function() {
		Route::get('/profil/lembaga/{id}', 'LembagaController@profil');
		Route::get('/profil/peserta/{id}', 'PesertaController@profil');
		Route::get('/accepted', 'ProyekController@diterima');

		Route::get('/projek', 'ProyekController@index');
		Route::get('/projek/{id}', 'ProyekController@blog');
		Route::get('/projek/kategori/{id}', 'ProyekController@kategori');
		Route::get('/search', 'ProyekController@cari');
	});
});
