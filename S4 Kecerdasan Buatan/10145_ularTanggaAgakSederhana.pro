%Program Ular Tangga Sederhana
domains
	pemain = pemain(nama, posisi)
	nama = string
	posisi, id = integer
	listpemain = pemain*

predicates
	rand(integer) - procedure(o)
	puts(string) - procedure(i)
	gets(string, string) - determ(i, o)
	pilih(string) - determ(i)
	tampildata(pemain) - determ(i)
	statistik(listpemain) - determ(i)
	get_datapemain(pemain, nama, posisi) - determ(i, o, o)
	dadu(posisi, posisi) - determ(i, o)
	pemain_jalan(pemain, nama, posisi) - determ(i, o, o)
	menang(nama, posisi) - determ(i, i)
	ular(posisi, posisi) - determ(i, o)
	tangga(posisi, posisi) - determ(i, o)
	kelewatan(posisi, posisi) - determ(i, o)
	cek_ular_tangga(nama, posisi, posisi) - determ(i, i, o)
	bermain(id, pemain, pemain, pemain, pemain) - determ(i, i, i, i, i)
	persiapan - determ()
	main - determ()
	
clauses
	rand(Hasil):-
		random(X),
		Hasil=X*5+1.
			
	gets(Tampil, Data):-
		write(Tampil),
		readln(Data).
		
	puts(Tampil):-
		write(Tampil),
		nl.
	
	tampildata(pemain(Nama, Posisi)):-
		write("\t\t",Nama, " => ", Posisi), nl.

	get_datapemain(pemain(Nama, Posisi), DataNama, DataPosisi):-
		DataNama = Nama,
		DataPosisi = Posisi.	
	
	statistik([]).
	statistik([Kepala|Ekor]):-
		tampildata(Kepala),
		statistik(Ekor).
	
	dadu(Dadu, Keluar):-
		Dadu >= 1, Dadu <= 6, !,
		Keluar = Dadu.
	dadu(_, Keluar):-
		write("\t\tTekan Sembarang Huruf Untuk Lempar "),
		readchar(_),
		rand(Dadu),
		write("Your Dadu is ", Dadu), nl(),
		dadu(Dadu, Keluar).
	
	menang(Nama, 100):-
		!, puts("\n"),
		write("\t\t---==Selamat Kepada Sodara ", Nama, " !!! Anda menang==---\n").
	
	pemain_jalan(pemain(Nama, Posisi), NamaDia, PosisiSekarang):-
		write("\t\tSekarang Giliran ", Nama), nl,
		dadu(0, Dadu),
		NamaDia = Nama,
		PosisiSekarang = Posisi + Dadu.
		
	ular(20, 15).
	ular(59, 30).
	ular(72, 45).
	ular(97, 35).
	ular(96, 65).
	
	tangga(2, 11).
	tangga(14, 80).
	tangga(25, 30).

	kelewatan(101, 99).
	kelewatan(102, 98).
	kelewatan(103, 97).
	kelewatan(104, 96).
	kelewatan(105, 95).
	
	cek_ular_tangga(Nama, Posisi, Keluar):-
		ular(Posisi, Keluar), !,
		write("\t\t",Nama, " Mendapat Ular Sehingga dia Turun ke : ", Keluar), nl;
		tangga(Posisi, Keluar), !,
		write("\t\t",Nama, " Mendapat Tangga Sehingga dia Naik ke : ", Keluar), nl;
		kelewatan(Posisi, Out), !,
		write("\t\t",Nama, " Melewati 100 jadi dia balik ke", Out), nl,
		cek_ular_tangga(Nama, Out, Keluar).
	cek_ular_tangga(_, Posisi, Posisi).
	
	bermain(1 ,P1, P2, P3, P4):-
		nl, statistik([P1, P2, P3, P4]),
		pemain_jalan(P1, Nama, Posisi),	%aldi 6
		cek_ular_tangga(Nama, Posisi, Sekarang),
		not(menang(Nama, Sekarang)), !,
		bermain(2, pemain(Nama, Sekarang), P2, P3, P4).
	bermain(2 ,P1, P2, P3, P4):-
		nl, statistik([P1, P2, P3, P4]),	
		pemain_jalan(P2, Nama, Posisi),
		cek_ular_tangga(Nama, Posisi, Sekarang),
		not(menang(Nama, Sekarang)), !,
		bermain(3, P1, pemain(Nama, Sekarang), P3, P4).
	bermain(3, P1, P2, P3, P4):-
		nl, statistik([P1, P2, P3, P4]),
		pemain_jalan(P3, Nama, Posisi), 
		cek_ular_tangga(Nama, Posisi, Sekarang),
		not(menang(Nama, Sekarang)), !,
		bermain(4, P1, P2, pemain(Nama, Sekarang), P4).
	bermain(4 ,P1, P2, P3, P4):-
		nl, statistik([P1, P2, P3, P4]),
		pemain_jalan(P4, Nama, Posisi), 
		cek_ular_tangga(Nama, Posisi, Sekarang),
		not(menang(Nama, Sekarang)), !,
		bermain(1, P1, P2, P3, pemain(Nama, Sekarang)).
	bermain(_, _, _, _, _).

	persiapan:-
		gets("\t\tMasukkan Nama Pemain Ke-1 : ", P1),
		gets("\t\tMasukkan Nama Pemain Ke-2 : ", P2),
		gets("\t\tMasukkan Nama Pemain Ke-3 : ", P3),
		gets("\t\tMasukkan Nama Pemain Ke-4 : ", P4),nl,
		Play1 = pemain(P1, 1),
		Play2 = pemain(P2, 1),
		Play3 = pemain(P3, 1),
		Play4 = pemain(P4, 1),
		bermain(1, Play1, Play2, Play3, Play4).
	
	pilih("1"):-!,
		puts("\n||===============================================================================||"),
		puts("||\tSelamat Bermain\t\t\t\t\t\t\t\t||"),
		puts("||===============================================================================||"),
		persiapan.
	pilih("2"):-!,
		puts("\n||===============================================================================||"),
		puts("||    1. Masukkan nama pemain, ada 4 pemain\t\t\t\t\t\t||"),
		puts("||    2. Setiap pemain melempar dadu (dadu nyata) secara bergiliran\t\t\t\t||"),
		puts("||    3. Tekan sembarang huruf untuk melempar dadu tersebut ke program sesuai gilirannya\t||"),
		puts("||    4. Jika pada giliran anda mendapat ular, anda akan turun\t\t\t\t||"),
		puts("||    5. Jika pada giliran anda mendapat tangga, anda akan naik\t\t\t\t||"),
		puts("||    6. Pemain yang lebih dulu mendapat posisi 100, dialah yang menang\t\t\t||"),
		puts("||    7. Pemain yang melebihi posisi 100, akan balik ke posisi sebelum posisi 100\t\t||"),
		puts("||===============================================================================||").
	pilih("0"):-!,
		puts("||===============================================================================||"),
		puts("||===============================TERIMA KASIH====================================||"),
		puts("||========================TELAH BERMAIN ULAR TANGGA=============================||"),
		puts("||===============================================================================||"),
		puts("||========================ALDI NUR HENDRA 1615015030=============================||"),
		puts("||==========================IRFAN  FADLI 1615015031================================||"),
		puts("||===================MAULIDINA  AWALIAH RAHMAN 1615015044=======================||"),
		puts("||===============================================================================||").
	pilih(_):-!,
		puts("Pilihan Tidak Ada").
	
	main:-
		puts("\n||===============================================================================||"),
		puts("||===============================================================================||"),
		puts("||=================  Selamat Datang di Permainan Ular Tangga Sederhana =================||"),
		puts("||\t\t\t\t      1. Main    \t\t\t\t\t||"),
		puts("||\t\t\t\t    2. Peraturan  \t\t\t\t\t||"),
		puts("||\t\t\t\t     0. Keluar\t\t\t\t\t||"),
		puts("||===============================================================================||"),
		puts("||===============================================================================||"),
		gets("\t\t          Masukkan Pilihan : ", Pilihan), nl,
		pilih(Pilihan),
		Pilihan<>"0", !,
		main.
	main.
	
goal
	main.