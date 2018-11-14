#include "stdio.h"
#include "conio.h"
#include "windows.h"
#include "string.h"

	char
   namaguru[12][60]=			{"Sugiarto",
   								"Ahmad Suriyansyah",
                           "Noviyanti",
                           "Wahyu Dirgantoro",
                           "Susilowati",
                           "Ninik Cahyani",
                           "Vivi Alvianita",
                           "Rudiansyah",
                           "Rahmatullah",
                           "Rudianto"},
   idguru[12][60]=			{"1112110",
   								"1112111",
                           "1112112",
                           "1112113",
                           "1112114",
                           "1112115",
                           "1112116",
                           "1112117",
                           "1112118",
                           "1112119",
   								"1112120",
                           "1112121"},
	pinguru[12][60]=			{"0000",
   								"1111",
                           "2222",
                           "3333",
                           "4444",
                           "5555",
                           "6666",
                           "7777",
                           "8888",
                           "9999"},
	ttlguru[12][60]=			{"Samarinda, 20-10-87",
   								"Tenggarong, 30-11-80",
                           "Surabaya, 10-05-93",
                           "Surabaya, 20-03-89",
                           "Jogjakarta, 11-05-91",
                           "Bandung, 21-01-92",
                           "Kutai Barat, 19-02-80",
                           "Jakarta, 02-12-92",
                           "palangkaraya, 21-20-91",
                           "Surabaya, 11-01-92"},
   alamatguru[12][60]=		{"Jl.sungai, Gg.Biawak,RT.20 Samrinda",
   								"Jl.sungai, Gg.Buaya, RT.10 Samrinda",
                           "Jl.sungai, Gg.Lele, RT.05 Samarinda",
                           "Jl.sungai, Gg.Nila, RT.01 Samarinda",
                           "Jl.sungai, Gg.Biawan, RT.03 Samarinda",
                           "Jl.sungai, Gg.Hiawan, RT.04 Samarinda",
                           "Jl.sungai, Gg.Haruan, RT.02 Samarinda",
                           "Jl.sungai, Gg.Biawak, RT.03 Samarinda",
                           "Jl.sungai, Gg.Kepiting, RT.03 Samarinda",
                           "Jl.sungai, Gg.Kura-kura, RT.03 Samarinda"},
	mapel[12][60]=				{"PKN",
									"BIOLOGI",
									"SEJARAH",
									"FISIKA",
									"EKONOMI",
									"KIMIA",
									"B.INDO",
									"PENJASKES",
									"AGAMA",
									"MTK"},
	jadwalngajar[12][60]=	{"Rabu <- 09.00, Sabtu <- 09.00",
									"Selasa <- 07.30, Kamis <- 11.00",
									"Rabu <- 07.30",
									"Kamis <- 07.30",
									"Sabtu <- 07.30",
									"Senin <- 09.00, Kamis <- 09.00",
									"Senin <- 07.30",
									"Selasa <- 09.00",
									"Jumat <- 09.00",
									"Senin <- 11.00, Kamis <- 12.30",
                           "(kosong)",
                           "(kosong)"},
   namasiswa[22][60]=		{"Abdul Haris",
   								"Aldi Nurhendra",
                           "Rofi Indrawan",
                           "Joshua Dirgantara",
                           "Ricky Dian Purnama",
                           "Muhammad Rizal",
                           "Rendiansyah",
                           "Rismawati",
                           "Muhammad Hendra Arba",
   								"Gadis Erliza Nurani",
                           "Muhammad Firaasy Akbar",
                           "Rifki Ramadhani",
                           "Dandi",
                           "Raihan",
                           "Oyot",
                           "Sundari",
                           "Maulidina Awaliah",
                           "Nur Aini",
                           "Kanseh",
                           "Israwadi"},
	idsiswa[22][60]=			{"1615015029",
   								"1615015030",
                           "1615015032",
                           "1615015033",
                           "1615015034",
                           "1615015035",
                           "1615015036",
                           "1615015037",
                           "1615015038",
                           "1615015039",
                           "1615015040",
                           "1615015041",
                           "1615015042",
                           "1615015043",
                           "1615015044",
                           "1615015045",
                           "1615015046",
                           "1615015047",
                           "1615015048",
                           "1615015049",
                           "1615015050",
                           "1615015051",
                           },
   pinsiswa[22][60]=			{"0001",
   								"0002",
                           "0003",
                           "0004",
                           "0005",
                           "0006",
                           "0007",
                           "0008",
                           "0009",
                           "0010",
                           "0011",
                           "0012",
                           "0013",
                           "0014",
                           "0015",
                           "0016",
                           "0017",
                           "0018",
                           "0019",
                           "0020"},
   ttlsiswa[22][60]=			{"Samarinda,20-01-97",
   								"Handil,10-02-97",
                           "Samarinda,21-02-97",
                           "Balikpapan,23-01-97",
                           "Samarinda,30-03-97",
                           "Samarinda,05-01-97",
                           "Samarinda,21-11-97",
                           "Samarinda,30-12-97",
                           "Muara Kaman,22-01-97",
                           "Samarinda,01-01-97",
                           "New York City,21-02-96",
                           "Samarinda,03-12-97",
                           "Samarinda,09-11-97",
                           "Samarinda,11-01-97",
                           "Mekkah,14-08-98",
                           "Samarinda,12-05-97",
                           "Samarinda,22-02-97",
                           "Tenggarong,07-07-97",
                           "Samarinda,20-02-97",
                           "Samarinda,02-03-97"},
   asalsiswa[22][60]=		{"SMPN 1 Samarinda",
   								"SMPN 2 Samarinda",
                           "SMPN 3 Samarinda",
                           "SMPN 4 Samarinda",
                           "SMPN 5 Samarinda",
                           "SMPN 6 Samarinda",
                           "SMPN 5 Samarinda",
                           "SMPN 1 Balikpapan",
                           "SMP Nurul Hidayah",
                           "SMPN 7 Samarinda",
                           "SMPN 6 Surabaya",
                           "SMP Cordova Samarinda",
                           "SMPN Katolik Samarinda",
                           "SMPN 6 Samarinda",
                           "SMPN 6 Samarinda",
                           "MTsN 1 Samarinda",
                           "MTsN 2 Samarinda",
                           "SMPN 10 Samarinda",
                           "SMPN 7 Samarinda",
                           "SMP widjaya Samarinda"},
   alamatsiswa[22][60]=		{"Jl.laut, Gg.Duyung, RT.03 Samarinda",
   								"Jl.sungai, Gg.Putihan, RT.05 Samarinda",
                           "Jl.Hutan, Gg.Rusa, RT.03 Samarinda",
                           "Jl.Gn.Lingai, Gg.Berkah, RT.03 Samarinda",
                           "Jl.Jend.Soedirman, Gg.Tahu, RT.05 Samarinda",
                           "Jl.Jakarta, Perum. Monas, blok 3, RT.03 Samarinda",
                           "Jl.sungai, Gg.Kepiting, RT.03 Samarinda",
                           "Jl.laut, Gg.Kepiting, RT.05 Samarinda",
                           "Jl.Bengkuring, Gg.Hj.Raudah, RT.03 Samarinda",
                           "Jl.Batu Besaung, Perum. Solong Durian, blok 5 Samarinda",
                           "Jl.Ahmad Yani, Gg.Hikmah, RT.03 Samarinda",
                           "Jl.Jend. Soedirman, Gg.Kepiting, RT.03 Samarinda",
                           "Jl.sungai, Gg.Kepiting, RT.03 Samarinda",
                           "Jl.Ir soetami, Gg. Mukmin, RT.03 Samarinda",
                           "Jl.Jl. Ir Juanda, Gg.Belimbing, RT.04 Samarinda",
                           "Jl.Langasat, Gg.02, RT.03 Samarinda",
                           "Jl.Dr. Soetomo, Gg.01, RT.01 Samarinda",
                           "Jl.Swandi, Gg.05, RT.03 Samarinda",
                           "Jl.Batu Besaung, Perum. Kasablanca, Block E1 Samarinda",
                           "Jl.sungai, Gg.Mas, RT.03 Samarinda"};

   float
	nilai[12][22]=				{{9,4,6,8,9,7,8,9,7,8,7,6,7,8,9,8,9,9,7,8,0,0},
   								{8,9,8,8,8,9,8,7,6,7,8,6,7,8,6,8,8,8,8,8,0,0},
                           {8,9,7,8,9,6,7,8,9,6,7,8,6,7,8,9,7,8,8,9,0,0},
                           {6,7,8,9,7,8,9,8,9,8,9,8,9,7,8,9,7,8,9,7,0,0},
                           {7,8,9,7,8,9,7,8,9,6,7,8,9,6,7,8,9,7,8,8,0,0},
                           {7,7,7,7,8,8,9,8,9,8,9,8,9,8,9,8,9,8,9,8,0,0},
                           {8,9,8,9,8,7,9,8,9,7,8,9,8,7,8,8,9,6,7,8,0,0},
                           {9,7,8,9,8,6,6,7,7,9,9,9,8,8,8,9,9,7,7,5,0,0},
								   {9,6,6,6,7,7,9,9,7,9,9,8,8,9,7,9,9,8,6,5,0,0},
                           {7,8,9,5,7,9,7,8,9,6,5,8,9,6,7,8,6,7,8,8,0,0},
                           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                           {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

	int
	sismax=20, sistar=20, gumax=10, lowongan=0, kuota=0,
	jenisguru[12]=				{1,1,0,1,0,0,0,1,1,1},
	jenissiswa[22]=			{1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,0,0,1,1},
	akses[22]=				  	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

void hancurkan()                                                                //fungsi hancurkan
{
	int x,y;

	for(x=53,y=55; x>=13; x--,y++)                                                		//melebar
   {
   	gotoxy(x,22);	printf("_");	Sleep(1);
      gotoxy(y,22); 	printf("_");   Sleep(1);
   }
   Sleep(100);

   for(y=22; y>6; y--)                                                         		//naik
   {
   	for(x=13; x<=95; x++)
   	{
   		gotoxy(x,y);	printf(" ");
         gotoxy(x,y-1);	printf("_");
   	}
      gotoxy(54,y+1);	printf(" ");
      gotoxy(54,y);		printf("|");

      gotoxy(1,1);
      Sleep(10);
   }
   Sleep(100);

   for(y=6; y<=22; y++)                                                             //turun
   {
   	for(x=13; x<=95; x++)
      {
      	gotoxy(x,y);	printf("_");
         gotoxy(x,y-1);	printf(" ");
      }
		gotoxy(54,y+1);	printf("|");	gotoxy(1,1);
      Sleep(10);
   }
   Sleep(100);

   for(x=13,y=95; x<54; x++,y--)                                                 		//tutup
   {
   	gotoxy(x,22);	printf(" ");	Sleep(1);
      gotoxy(y,22); 	printf(" ");   Sleep(1);
   }
   Sleep(100);
   gotoxy(1,1);
}

void hancurkan2()                                                               //fungsi hancurkan2
{
	int x, y, z;

   gotoxy(54,23);
   printf(" ");                                                   //naik

   for(y=22; y>6; y--)
   {
   	gotoxy(54,y);		printf("|");	Sleep(5);
      gotoxy(54,y-1);   printf("_");   Sleep(5);
   }
   Sleep(100);

   for(x=53,y=55; x>=13; x--, y++)                                              		//menyebar
   {
   	for(z=7; z<=22; z++)
      {
      	gotoxy(x+1,z);	printf(" ");
      	gotoxy(y-1,z);	printf(" ");
      	gotoxy(x,z);	printf("|");
         gotoxy(y,z);	printf("|");
      }
      gotoxy(x,6);		printf("_");
      gotoxy(y-1,6);		printf("_");
      Sleep(1);
   }
   Sleep(100);

   for(y=6; y<=22; y++)                                                             //turun
   {
   	for(x=13; x<=95; x++)
      {
      	gotoxy(x,y-1);	printf(" ");
      	gotoxy(x,y);	printf("_");
      }
      Sleep(5);
   }
   Sleep(100);

   for(x=53,y=55; x>=13; x--, y++)                                               		//pisah
   {
   	for(z=22; z<=23; z++)
      {
      gotoxy(x,z);		printf(" ");
      gotoxy(y,z);		printf(" ");
      }
      Sleep(1);
   }
   gotoxy(1,1);

   Sleep(100);
}

garis(int azz)                                                                  //fungsi garis
{
	int x;
   for(x=1; x<=azz; x++)
   {
   printf("%c",205);
   }
   return(0);
}

void garis2(int batas ,char a ,char b ,char c)
{
	printf("%c",a);
	for(int x=0; x<=batas; x++)
   	printf("%c",b);
   printf("%c",c);
}

haris(int id)
{
	char search[60];
	int guru, administrasi, reg, con, jumlah, no, x, gajih, data, mp, Gmengajar, Jgaji, Jmengajar, hasil;
   float sum, rata;
   guru:
   clrscr();
	gotoxy(40,9);	printf("------------------------------------------");
   gotoxy(40,10);	printf("|| -->        SELAMAT DATANG        <-- ||");
	gotoxy(40,11);	printf("------------------------------------------");

	gotoxy(40,13);	puts("<1> Administrsi Pendaftaran");
	gotoxy(40,14);	puts("<2> Bank Data Siswa");
	gotoxy(40,15);	puts("<3> Gajih Guru");
	gotoxy(40,16);	puts("<4> Informasi Pribadi\n");
   gotoxy(40,17);	puts("<0> Keluar");
	gotoxy(40,19);	printf("Pilih Salah Satu Menu Yang Tertera Di Atas : ");

   while(!kbhit())
   {
   	for(int x=0, y=33; x<7; x++, y--)
      {
      	if(kbhit())
         	break;
   		gotoxy(x+43,10);	printf("-->");
         gotoxy(y+43,10);	printf("<--");
         Sleep(100);
         gotoxy(x+43,10);	printf("   ");
         gotoxy(y+43,10);	printf("   ");
      }
   }
   gotoxy(85,19);
   guru=-1;
   fflush(stdin);
	scanf("%d",&guru);

   if(guru==0);

   else if(guru==1)
	{
   	daftar:
   	clrscr();

   	gotoxy(40,9);	printf("------------------------------------------");
   	gotoxy(40,10);	printf("|||||||| ADMINISTRASI PENDAFTARAN ||||||||");
		gotoxy(40,11);	printf("------------------------------------------");

	   gotoxy(40,13);	printf("1 --> Siswa Baru");
      gotoxy(40,14);	printf("2 --> Daftar Ulang");
      gotoxy(40,16);	printf("0 --> Kembali");
      gotoxy(40,18);	printf("Pilih Jenis Siswa : ");

      administrasi=-1;
      fflush(stdin);
      scanf("%d",&administrasi);

      if(administrasi==0)
      	goto guru;

      else if(administrasi==1 || administrasi==2)
	   {
         admin:
         clrscr();
         gotoxy(40,8);
      	if(administrasi==1)
         	printf("Administrasi Pendaftaran Siswa Baru");
         else
         	printf("Administrasi Pendaftaran Ulang Siswa");

	      jumlah=0;

         if(administrasi==1)
         	reg=9;
         else
         	reg=2;

	   	for(x=0; x<sistar; x++)
   	   {
      		if(akses[x]==reg)
	      		jumlah++;
      	}

	      if(jumlah>0)
			{
         	int y=10;
				for(x=0; x<sistar; x++)
				{
					if(akses[x]==reg)
               {
                  gotoxy(40,y);	printf("%2d. %s",x+1 ,namasiswa[x]);
                  y++;
               }
				}

            gotoxy(40,y+1);	printf("0. Kembali");
				gotoxy(40,y+3);	printf("Pilih Nomor Siswa Untuk Diterima : ");

            no=-1;
      		fflush(stdin);
            scanf("%d",&no);
            if(no==0)
            	goto daftar;
				else if(no<1 || no>sistar || akses[no-1]!=reg)
            {
					gotoxy(40,y+5);	printf("Harap Masukkan Nomor Dengan Benar");
               getch();
					goto admin;
            }
				else
            {  
            	con=0;
               while(con==0)
               {
	            	clrscr();
	 	            gotoxy(20,5);		printf("%c Nama\t\t: %s",186, namasiswa[no-1]);
	   	   		gotoxy(20,6);		printf("%c ID\t\t\t: %s",186, idsiswa[no-1]);
				  		gotoxy(20,7);		printf("%c Tempat/Tgl Lahir\t: %s"	,186, ttlsiswa[no-1]);
						gotoxy(20,8);		printf("%c Jenis Kelamin\t: ",186);
						if(jenissiswa[no-1] == 1)
	   	         	printf("laki-laki\n");
						else
							printf("Perempuan\n");
						gotoxy(20,9);		printf("%c Asal Sekolah\t: %s\n"	,186, asalsiswa[no-1]);
						gotoxy(20,10);		printf("%c Alamat\t\t: %s\n\n"	,186, alamatsiswa[no-1]);
               	gotoxy(20,12); 	printf("Terima??? y/n : ");	con=(char)getchar();
                  if(con=='y' || con=='Y')
                  {
					  		if(administrasi==1)
				  	 		{
	   	   	        	gotoxy(40,15); 	printf("Proses Registrasi Selesai\n");
				  				gotoxy(40,16);		printf("Siswa Dengan Nomor %d Sudah Memiliki Akses Login", no);
				 				akses[no-1]=1;
      	   	         sismax++;

		                    getch();
                     }
   	      	      else
	     	            {
	       	         	gotoxy(40,15);	printf("Proses Daftar Ulang Selesai");
   	      	         akses[no-1]=3;
     		      	      getch();
        		      	}
                     break;
                  }
                  else if(con=='n' || con=='N')
                  {
            	     	gotoxy(40,15);			printf("Proses Registrasi Selesai");
                 		gotoxy(40,16);       printf("Siswa Ditolak");
                     akses[no-1]=8;
                     if(administrasi==1)
                     	sismax++;
                     getch();
                     break;
                  }
                  else
                  {
                    	gotoxy(40,16);		printf("Pilihan Tidak Ada");
                     clrscr();
                     con=0;
                  }
               }
            }
            goto admin;
         }


         else
         {
         	gotoxy(40,10);	printf("(Kosong)");
         	getch();
         	goto daftar;
			}
   	}
      else
      {
      	gotoxy(40,20);	printf("Masukkan Pilihan Yang Benar");
         getch();
         goto daftar;
      }
   }

   else if (guru==2)
   {
      bank:
   	clrscr();

      gotoxy(40,9);	printf("------------------------------------------");
   	gotoxy(40,10);	printf("||||||||     BANK DATA SISWA      ||||||||");
		gotoxy(40,11);	printf("------------------------------------------");

      gotoxy(40,13);	printf("1 - Lihat Data");
      gotoxy(40,14);	printf("2 - Edit Nilai");
      gotoxy(40,15);	printf("3 - Cari Dengan Nama/ID");
      gotoxy(40,17);	printf("0 - Kembali");
      gotoxy(40,19);	printf("Silahkan Dipilih : ");

      data=-1;
      fflush(stdin);
      scanf("%d", &data);
      if(data==0)
      	goto guru;
      else if(data==1)
      {
      	data:
         clrscr();
	   	for(x=0; x<sismax; x++)
   	   {
         	gotoxy(40,x+3);	printf("%d. %s",x+1 ,namasiswa[x]);
      	}

	      gotoxy(40,x+4);	printf("0. Kembali");
   	   gotoxy(40,x+6);	printf("Pilih Nomor Siswa : ");

         no=-1;
      	fflush(stdin);
         scanf("%d",&no);
      	if(no==0)
	      	goto bank;

	      else if(no<1 || no>sismax)
   	   {
      		gotoxy(40,x+7);	printf("Harap Masukkan Nomor Dengan Benar");
	      	getch();
   	      goto data;
      	}

	      else
         {
         	clrscr();
   			for(int y=4; y<=12; y++)
      		{
      			gotoxy(100,y);	putchar(186);
      		}
      		sum=0;
   			gotoxy(20,4);		garis2(78,201,205,187);
				gotoxy(20,5);		printf("%c Nama\t\t: %s",186, namasiswa[no-1]);
      		gotoxy(20,6);		printf("%c ID\t\t\t: %s",186, idsiswa[no-1]);
				gotoxy(20,7);		printf("%c Tempat/Tgl Lahir\t: %s"	,186, ttlsiswa[no-1]);
				gotoxy(20,8);		printf("%c Jenis Kelamin\t: ",186);
				if(jenissiswa[no-1] == 1)
            	printf("laki-laki\n");
				else
					printf("Perempuan\n");
				gotoxy(20,9);		printf("%c Asal Sekolah\t: %s\n"	,186, asalsiswa[no-1]);
				gotoxy(20,10);		printf("%c Alamat\t\t: %s\n\n"	,186, alamatsiswa[no-1]);
      		gotoxy(20,11);		garis2(78,204,205,185);
				gotoxy(20,12);		printf("%c Nilai : \n",186);
      		for(x=0; x<gumax; x++)
      		{
            	gotoxy(20,x+13);	printf("%c %s",186,mapel[x]);
         		gotoxy(41,x+13);	printf(": %.2f\n",nilai[x][no-1]);
         		gotoxy(100,x+13);	putchar(186);
         		sum+=nilai[x][no-1];
      		}
      		rata=sum/gumax;
      		gotoxy(20,x+13);	garis2(78,204,205,185);
      		gotoxy(20,x+14);	printf("%c Jumlah\t\t: %.2f", 186, sum);
      		gotoxy(20,x+15);	printf("%c Rata-Rata\t\t: %.2f", 186, rata);
      		gotoxy(20,x+16);	garis2(78,200,205,188);
      		gotoxy(100,x+14);	putchar(186);
      		gotoxy(100,x+15);	putchar(186);

            if(akses[no-1]==8)
            {
            	gotoxy(20,x+17);	printf("SISWA DITOLAK");
            }

				getch();
            goto data;
         }
      }
      else if(data==2)
      {
      	edit:
         clrscr();
	   	for(x=0; x<sismax; x++)
   	   {
         	gotoxy(40,x+3);	printf("%d. %s\n",x+1 ,namasiswa[x]);
      	}

	      gotoxy(40,x+4);	printf("0. Kembali");
   	   gotoxy(40,x+6);	printf("Pilih Nomor Siswa : ");

         no=-1;
      	fflush(stdin);
         scanf("%d",&no);
      	if(no==0)
	      	goto bank;

	      else if(no<1 || no>sismax)
   	   {
      		gotoxy(40,x+7);	printf("Harap Masukkan Nomor Dengan Benar");
	      	getch();
   	      goto edit;
      	}

         else
         {
         	mapel:
         	clrscr();
            gotoxy(40,3);	printf("Nama : %s\n\n",		namasiswa[no-1]);
	   		for(x=0; x<gumax; x++)
   	   	{
         		gotoxy(40,x+5);	printf("%d. %s",x+1 ,mapel[x]);
      		}

	      	gotoxy(40,x+6);	printf("0. Kembali");
   	   	gotoxy(40,x+8);	printf("Pilih Mata Pelajaran : ");

            mp=-1;
      		fflush(stdin);
            scanf("%d",&mp);
      		if(mp==0)
	      		goto edit;

	      	else if(mp<1 || mp>gumax)
   	   	{
      			gotoxy(40,x+9);	printf("Harap Masukkan Nomor Dengan Benar");
		      	getch();
   		      goto mapel;
      		}
            else
            {
            	nilai:
            	clrscr();
            	gotoxy(40,8);	printf("Nama\t\t: %s",	namasiswa[no-1]);
               gotoxy(40,9);  printf("Mata Pelajaran\t: %s",	mapel[mp-1]);
               gotoxy(40,11);	printf("Masukkan Nilai\t: ");

               nilai[mp-1][no-1]=0;
               fflush(stdin);
               scanf("%f",&nilai[mp-1][no-1]);
               if(nilai[mp-1][no-1]<0 || nilai[mp-1][no-1]>10)
               {
               	gotoxy(40,13);	printf("Nilai Tidak Benar");
                  getch();
                  goto nilai;
               }
               else
               {
               	gotoxy(40,13);	printf("Nilai Berganti");
               	getch();
               	goto mapel;
               }
            }
         }
      }

      else if(data==3)
      {
      	clrscr();
         for(x=0; x<60; x++)
         {
         	search[x]=0;
         }

         gotoxy(35,14);		garis2(50,201,205,187);
         gotoxy(35,16);		garis2(50,200,205,188);
         gotoxy(87,15);		putchar(186);
         while(search[0]==0)
         {
         	gotoxy(35,15);
      		printf("%c Masukkan Nama/ID Siswa : ",186);
         	fflush(stdin);
         	gets(search);
         }
         for(x=0; x<sismax; x++)
         {
         	if(strcmp(search,idsiswa[x])==0)
            {
               hasil=x;
            	break;
            }
            else if(strcmpi(search,namasiswa[x])==0)
            {
               hasil=x;
            	break;
            }
         }

         if(x==sismax)
         {
         	gotoxy(40,17);	printf("Nama/ID Tidak Ditemukan");
            getch();
            goto bank;
         }

         else
         {
         	clrscr();
   			for(int y=4; y<=12; y++)
      		{
      			gotoxy(100,y);	putchar(186);
      		}
      		sum=0;
   			gotoxy(20,4);		garis2(78,201,205,187);
				gotoxy(20,5);		printf("%c Nama\t\t: %s",186, namasiswa[hasil]);
      		gotoxy(20,6);		printf("%c ID\t\t\t: %s",186, idsiswa[hasil]);
				gotoxy(20,7);		printf("%c Tempat/Tgl Lahir\t: %s"	,186, ttlsiswa[hasil]);
				gotoxy(20,8);		printf("%c Jenis Kelamin\t: ",186);
				if(jenissiswa[hasil] == 1)
            	printf("laki-laki\n");
				else
					printf("Perempuan\n");
				gotoxy(20,9);		printf("%c Asal Sekolah\t: %s\n"	,186, asalsiswa[hasil]);
				gotoxy(20,10);		printf("%c Alamat\t\t: %s\n\n"	,186, alamatsiswa[hasil]);
      		gotoxy(20,11);		garis2(78,204,205,185);
				gotoxy(20,12);		printf("%c Nilai : \n",186);
      		for(x=0; x<gumax; x++)
      		{
            	gotoxy(20,x+13);	printf("%c %s",186,mapel[x]);
         		gotoxy(41,x+13);	printf(": %.2f\n",nilai[x][hasil]);
         		gotoxy(100,x+13);	putchar(186);
         		sum+=nilai[x][hasil];
      		}
      		rata=sum/gumax;
      		gotoxy(20,x+13);	garis2(78,204,205,185);
      		gotoxy(20,x+14);	printf("%c Jumlah\t\t: %.2f", 186, sum);
      		gotoxy(20,x+15);	printf("%c Rata-Rata\t\t: %.2f", 186, rata);
      		gotoxy(20,x+16);	garis2(78,200,205,188);
      		gotoxy(100,x+14);	putchar(186);
      		gotoxy(100,x+15);	putchar(186);
            if(akses[hasil]==8)
            {
            	gotoxy(20,x+17);	printf("SISWA DITOLAK");
            }

            getch();
            goto bank;
         }

      }

      else
      {
      	gotoxy(40,21);	printf("Pilihan Tidak Ada");
         getch();
         goto bank;
      }
   }

   else if (guru==3)
	{
   	gajih:
   	clrscr();
      gotoxy(40,9);	printf("------------------------------------------");
   	gotoxy(40,10);	printf("|||||||||||     GAJIH GURU     |||||||||||");
		gotoxy(40,11);	printf("------------------------------------------");

		gotoxy(40,13);	printf ("1 - Honorer");
   	gotoxy(40,14);	printf ("2 - PNS");
      gotoxy(40,16);	printf ("0 - Kembali");

   	gotoxy(40,18);	printf ("Masukkan Status Anda\t:");

      gajih=-1;
      fflush(stdin);
      scanf("%d",&gajih);

      if (gajih==0)
      	goto guru;

   	else if (gajih==1)
      {
      	gajeha:
      	clrscr();
	      gotoxy(40,9);	printf ("            == Gajih Guru Honorer ==                 ");
   	   gotoxy(40,10);	printf ("_____________________________________________________");
      	gotoxy(40,11);	printf ("Gajih Pokok\t: Rp 1.500.000.00,-\tperbulan            ");
	      gotoxy(40,12);	printf ("Upah Mengajar\t: Rp 30.000.00,-\tperjam             ");
   	   gotoxy(40,13);	printf ("_____________________________________________________");
      	gotoxy(40,14);	printf ("Masukkan Jumlah Jam Mengajar Anda Hari Ini : ");

         Jmengajar=-1;
      	fflush(stdin);
	      scanf ("%d",&Jmengajar);
         if(Jmengajar<0)
         {
         	gotoxy(40,16);	printf("Jam Mengajar Tidak Valid");
            getch();
            goto gajeha;
         }
   	   Gmengajar=(Jmengajar*30000);
      	Jgaji=Gmengajar+1500000;
	      clrscr();
   	   gotoxy(40,10);	printf ("Jumlah Gajih Mengajar anda\t:%d,-",Gmengajar);
      	gotoxy(40,11);	printf ("Gajih Pokok Anda\t\t\t:1.500.000.00,-");
	      gotoxy(40,12);	printf ("Total Gajih Anda\t\t\t:%d,-",Jgaji);
   	   gotoxy(40,14);	printf ("*Gajih mengajar Anda dapat diambil di bagian tata Usaha");
         gotoxy(40,15); printf ("*untuk gajih pokok hanya dapat diambil setelah tanggal 1");
      	getch();
         goto guru;
      }

	   else if (gajih==2)
      {
         gajehb:
      	clrscr();
	      gotoxy(40,10);	printf ("             == Gajih Guru PNS ==                    ");
   	   gotoxy(40,11);	printf ("_____________________________________________________");
      	gotoxy(40,12);	printf ("Gajih pokok\t: Rp 2.000.000.00,-\tperbulan            ");
	      gotoxy(40,13);	printf ("Upah mengajar\t: Rp 30.000.00,-\tperjam             ");
   	   gotoxy(40,14);	printf ("_____________________________________________________");
      	gotoxy(40,15);	printf ("Masukkan Jumlah Jam Mengajar Anda Hari Ini : ");

         Jmengajar=-1;
      	fflush(stdin);
	      scanf ("%d",&Jmengajar);
         if(Jmengajar<0)
         {
         	gotoxy(40,17);	printf("Jam Mengajar Tidak Valid");
            getch();
            goto gajehb;
         }
   	   Gmengajar=(Jmengajar*30000);
      	Jgaji=Gmengajar+2000000;
	      clrscr();
   	   gotoxy(40,10);	printf ("Jumlah Gajih Mengajar anda\t:%d,-",Gmengajar);
      	gotoxy(40,11);	printf ("Gajih Pokok Anda \t\t:2.000.000.00,-");
	      gotoxy(40,12);	printf ("Total Gajih Anda\t\t\t:%d,-",Jgaji);
   	   gotoxy(40,14);	printf ("*Gajih mengajar Anda dapat diambil di bagian tata Usaha");
         gotoxy(40,15); printf ("*untuk gajih pokok hanya dapat diambil setelah tanggal 1");
      	getch();
         goto guru;
      }
      else
      {
      	gotoxy(40,20);	printf("Pilihan Tidak Tersedia");
         getch();
         goto gajih;
      }
   }

	else if(guru==4)
	{
   	clrscr();
   	for(int y=8; y<=16; y++)
      {
      	gotoxy(100,y);	putchar(186);
      }
   	gotoxy(20,8);		garis2(78,201,205,187);
		gotoxy(20,9);		printf("%c Nama\t\t: %s",186, namaguru[id]);
      gotoxy(20,10);		printf("%c ID\t\t\t: %s",186, idguru[id]);
		gotoxy(20,11);		printf("%c Tempat/Tgl Lahir\t: %s"	,186, ttlguru[id]);
		gotoxy(20,12);		printf("%c Jenis Kelamin\t: ",186);
		if(jenisguru[id] == 1)
			printf("laki-laki\n");
		else
			printf("Perempuan\n");
		gotoxy(20,13);		printf("%c Alamat\t\t: %s", 186, alamatguru[id]);
      gotoxy(20,14);		printf("%c Mata Pelajaran\t: %s", 186, mapel[id]);
      gotoxy(20,15);		garis2(78,204,205,185);
      gotoxy(20,16);		printf("%c Jadwal Mengajar :", 186);		gotoxy(100,16);	putchar(186);
      gotoxy(20,17);		printf("%c %s", 186, jadwalngajar[id]);	gotoxy(100,17);	putchar(186);
      gotoxy(20,18);		garis2(78,200,205,188);
		getch();
		goto guru;
   }
   else
   {
   	gotoxy(40,21);	printf("Pilihan Tidak Ada");
      getch();
      goto guru;
   }
   return(0);
}

yofi(int id)
{
	int pilihan, pilihanb, x;
   float jumlah, rata;

   pilihan:
   clrscr();
	gotoxy(40,9);	garis2(42,'/',205,'\\');
	gotoxy(39,10);	puts("||              ***Menu Siswa***             ||");
	gotoxy(40,11);	garis2(42,'\\',205,'/');
	gotoxy(37,13);	garis2(48,201,205,187);
	gotoxy(37,14);	printf("%c   1.Data Pribadi                                %c", 186, 186);
   gotoxy(37,15); printf("%c   2.Jadwal Kelas                                %c", 186, 186);
   gotoxy(37,16); printf("%c   3.Pendaftaran Ulang                           %c", 186, 186);
   gotoxy(37,17); printf("%c   4.Ganti Pin                                   %c", 186, 186);
   gotoxy(37,18);	garis2(48,204,205,185);
   gotoxy(37,19); printf("%c   0.Keluar                                      %c", 186, 186);
   gotoxy(37,20);	garis2(48,200,205,188);
	gotoxy(40,21);	puts("Select Please = ");

   pilihan=-1;
   fflush(stdin);
	gotoxy(56,21);	scanf("%d",&pilihan);

	if(pilihan==1)
	{
		clrscr();
   	for(int y=4; y<=12; y++)
      {
      	gotoxy(100,y);	putchar(186);
      }
      jumlah=0;
   	gotoxy(20,4);		garis2(78,201,205,187);
		gotoxy(20,5);		printf("%c Nama\t\t: %s",186, namasiswa[id]);
      gotoxy(20,6);		printf("%c ID\t\t\t: %s",186, idsiswa[id]);
		gotoxy(20,7);		printf("%c Tempat/Tgl Lahir\t: %s"	,186, ttlsiswa[id]);
		gotoxy(20,8);		printf("%c Jenis Kelamin\t: ",186);
		if(jenissiswa[id] == 1)
			printf("laki-laki\n");
		else
			printf("Perempuan\n");
		gotoxy(20,9);		printf("%c Asal Sekolah\t: %s"	,186, asalsiswa[id]);
		gotoxy(20,10);		printf("%c Alamat\t\t: %s"	,186, alamatsiswa[id]);
      gotoxy(20,11);		garis2(78,204,205,185);
		gotoxy(20,12);		printf("%c Nilai : \n",186);
      for(x=0; x<gumax; x++)
      {
      	gotoxy(20,x+13);	printf("%c %s",186,mapel[x]);
         gotoxy(41,x+13);	printf(": %.2f\n",nilai[x][id]);
         gotoxy(100,x+13);	putchar(186);
         jumlah+=nilai[x][id];
      }
      rata=jumlah/gumax;
      gotoxy(20,x+13);	garis2(78,204,205,185);
      gotoxy(20,x+14);	printf("%c Jumlah\t\t: %.2f", 186, jumlah);
      gotoxy(20,x+15);	printf("%c Rata-Rata\t\t: %.2f", 186, rata);
      gotoxy(20,x+16);	garis2(78,200,205,188);
      gotoxy(100,x+14);	putchar(186);
      gotoxy(100,x+15);	putchar(186);

		getch();
		goto pilihan;
	}

	else if(pilihan==2)
	{
   	jadwal:
      clrscr();
		gotoxy(30,12);		printf("-------------------**SILAHKAN PILIH**---------------------");
		gotoxy(30,14);		printf("**=======================================================**");
		gotoxy(30,15);		printf("| 1.Jadwal Piket\t2.Jadwal Pelajaran\t|    0.Kembali |");
		gotoxy(30,16);		printf("**=======================================================**");
		gotoxy(30,18);		printf("Select Please = ");

      pilihanb=-1;
		fflush(stdin);
      scanf("%d",&pilihanb);

      if(pilihanb==0)
      {
      	goto pilihan;
      }

      else if(pilihanb==1)
      {
	  		clrscr();
			gotoxy(28,10);	printf("     \t\t*=*=*JADWAL PIKET KELAS*=*=*\n");
			gotoxy(28,11);	printf("*===================================================================*\n");
         gotoxy(28,12);	printf("|| NO || SENIN  || SELASA || RABU   || KAMIS  || JUM'AT || SABTU  ||\n");
			gotoxy(28,13);	printf("*===================================================================*\n");
			gotoxy(28,14);	printf("|| 1  || ROFI   || RICKY  || HENDRA || SUNDARI|| MAUL   || ISRA   ||\n");
			gotoxy(28,15);	printf("|| 2  || ALDI   || RIZAL  || GADIS  || RAIHAN || AINI   || DANDI  ||\n");
			gotoxy(28,16);	printf("|| 3  || HARIS  || RENDY  || FIRASY || OYOT   || KANSEH || RIFKI  ||\n");
			gotoxy(28,17);	printf("|| 4  || JOSHUA || RISMA  ||        ||        ||        ||        ||\n");
			gotoxy(28,18);	printf("*===================================================================*");
			getch();
			goto jadwal;
		}
		else if(pilihanb==2)
		{
			clrscr();
			gotoxy(28,10);	printf("\t\t\t*=*=*JADWAL PELAJARAN*=*=*\n");
			gotoxy(28,11);	printf("*========================================================================*\n");
         gotoxy(28,12);	printf("|| NO || SENIN   || SELASA  || RABU    || KAMIS   || JUM'AT  || SABTU   ||\n");
			gotoxy(28,13);	printf("*========================================================================*\n");
			gotoxy(28,14);	printf("|| 1  || B.INDO  || BIOLOGI || SEJARAH || FISIKA  || SENAM   || FISIKA  ||\n");
			gotoxy(28,15);	printf("|| 2  || KIMIA   || PENJAS  || PKN     || KIMIA   || AGAMA   || PKN     ||\n");
			gotoxy(28,16);	printf("|| 3  || MTK     ||         || EKONOMI || BIOLOGI ||         || PRAMUKA ||\n");
			gotoxy(28,17);	printf("|| 4  ||         ||         ||         || MTK     ||         ||         ||\n");
			gotoxy(28,18);	printf("*========================================================================*");
			getch();
			goto jadwal;
		}

      else
      {
      	gotoxy(30,20);	printf("Harap Masukkan Pilihan Yang Benar");
         getch();
         goto jadwal;
      }
	}

	else if(pilihan==3)
	{
		clrscr();
		if(akses[id]==1)
   	{
   		int tgl=-1, bln=-1, thn=-1;
         gotoxy(40,8);	printf("Pendaftaran Ulang Dibuka Mulai Tanggal 5-6-2016");
         gotoxy(40,9);	printf("Dan Akan Ditutup Pada 6-7-2016");
      	gotoxy(43,11);	fflush(stdin);	printf("Masukkan Tanggal\t\t: ");	scanf("%d",&tgl);
         gotoxy(43,12);	fflush(stdin);	printf("Masukkan Bulan\t\t: ");    scanf("%d",&bln);
         gotoxy(43,13);	fflush(stdin);	printf("Masukkan Tahun\t\t: ");    scanf("%d",&thn);

         if(thn<0)
         {
         	gotoxy(43,15);	printf("Tahun Tidak Valid");
         }
         else if(thn<2016)
         {
         	if(bln<1 || bln>12)
            {
            	gotoxy(43,15);	printf("Bulan Tidak Valid");
            }
            else if(bln==1 || bln==3 || bln==5 || bln==7 || bln==8 || bln==10 || bln==12)
            {
            	if(tgl<1 || tgl>31)
               {
                  gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
             	else
               {
                  gotoxy(43,15);	printf("Pendaftaran Ulang Belum Dibuka");
               }
            }
            else if(bln==4 || bln==6 || bln==9 || bln==11)
            {
            	if(tgl<1	|| tgl>30)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
               else
               {
               	gotoxy(43,15);	printf("Pendaftaran Belum Dibuka");
               }
            }
            else if(bln==2)
            {
               if(thn==0)
               {
               	if(tgl<1 || tgl>29)
						{
                  	gotoxy(43,15);	printf("Tanggal Tidak Valid");
                  }
                  else
                  {
                  	gotoxy(43,15);	printf("Pendaftaran Belum Dibuka");
                  }
               }
            	else if(thn%4==0)
               {
               	if(tgl<1 || tgl>29)
						{
                  	gotoxy(43,15);	printf("Tanggal Tidak Valid");
                  }
                  else
                  {
                  	gotoxy(43,15);	printf("Pendaftaran Belum Dibuka");
                  }
               }
               else
               {
                	if(tgl<1 || tgl>28)
						{
                  	gotoxy(43,15);	printf("Tanggal Tidak Valid");
                  }
                  else
                  {
                  	gotoxy(43,15);	printf("Pendaftaran Belum Dibuka");
                  }
               }
            }

         }
         else if(thn==2016)
         {
         	if(bln<1 || bln>12)
            {
            	gotoxy(43,15);	printf("Bulan Tidak Valid");
            }
            else if(bln==1 || bln==3 || bln==5)
            {
            	if(tgl<1 || tgl>31)
               {
                  gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
             	else
         		{
               	gotoxy(43,15);	printf("Pendaftaran Ulang Belum Dibuka");
               }
            }
            else if(bln==2)
            {
            	if(tgl<1 || tgl>28)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
             	else
         		{
               	gotoxy(43,15);	printf("Pendaftaran Ulang Belum Dibuka");
               }
            }
            else if(bln==4)
            {
            	if(tgl<1	|| tgl>30)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
               else
               {
               	gotoxy(43,15);	printf("Pendaftaran Ulang Belum Dibuka");
               }
            }
            else if(bln==6)
            {
            	if(tgl<1 || tgl>30)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
               else if(tgl<5)
               {
               	gotoxy(43,15);	printf("Pendaftaran Ulang Belum Dibuka");
               }
               else
               {
   					gotoxy(43,15);	printf("Terima Kasih, Pendaftaran Ulang Sedang Diproses");
      				akses[id]++;
      				getch();
      				goto pilihan;
               }
            }
            else if(bln==7)
            {
            	if(tgl<1 || tgl>31)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
               else if(tgl>7)
               {
               	gotoxy(43,15);	printf("Pendaftaran Ulang Telah Ditutup");
               }
               else
               {
   					gotoxy(43,15);	printf("Terima Kasih, Pendaftaran Ulang Sedang Diproses");
      				akses[id]++;
      				getch();
      				goto pilihan;
               }
            }
            else if(bln==8 || bln==10 || bln==12)
            {
            	if(tgl<1 || tgl>31)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
             	else
         		{
               	gotoxy(43,15);	printf("Pendaftaran Ulang Telah Ditutup");
               }
            }
            else
            {
            	if(tgl<1 || tgl>30)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
             	else
         		{
               	gotoxy(43,15);	printf("Pendaftaran Ulang Telah Ditutup");
               }
            }
         }
         else
         {
         	if(bln<1 || bln>12)
            {
            	gotoxy(43,15);	printf("Bulan Tidak Valid");
            }
            else if(bln==1 || bln==3 || bln==5 || bln==7 || bln==8 || bln==10 || bln==12)
            {
            	if(tgl<1 || tgl>31)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
             	else
         		{
               	gotoxy(43,15);	printf("Pendaftaran Ulang Telah Ditutup");
               }
            }
            else if(bln==4 || bln==6 || bln==9 || bln==11)
            {
            	if(tgl<1	|| tgl>30)
               {
               	gotoxy(43,15);	printf("Tanggal Tidak Valid");
               }
               else
               {
               	gotoxy(43,15);	printf("Pendaftaran Telah Ditutup");
               }
            }
            else if(bln==2)
            {
               if(thn==0)
               {
               	if(tgl<1 || tgl>29)
						{
                  	gotoxy(43,15);	printf("Tanggal Tidak Valid");
                  }
                  else
                  {
                  	gotoxy(43,15);	printf("Pendaftaran Telah Ditutup");
                  }
               }
            	else if(thn%4==0)
               {
               	if(tgl<1 || tgl>29)
						{
                  	gotoxy(43,15);	printf("Tanggal Tidak Valid");
                  }
                  else
                  {
                  	gotoxy(43,15);	printf("Pendaftaran Telah Ditutup");
               	}
               }
               else
               {
                	if(tgl<1 || tgl>28)
						{
                  	gotoxy(43,15);	printf("Tanggal Tidak Valid");
                  }
                  else
                  {
                  	gotoxy(43,15);	printf("Pendaftaran Telah Ditutup");
                  }
               }
            }

         }
         getch();
         goto pilihan;
   	}

		else if(akses[id]==2)
   	{
   		gotoxy(45,15);	printf("Data Anda Belum Dikonfirmasi");
      	getch();
     		goto pilihan;
   	}

		else if(akses[id]==3)
   	{
   		gotoxy(45,15);	printf("Data Anda Sudah Dikonfirmasi");
      	getch();
      	goto pilihan;
   	}
   }

	else if(pilihan==4)
   {
   	pin:
      clrscr();
   	gotoxy(38,12);		garis2(50,201,205,187);
      gotoxy(38,14);		garis2(50,200,205,188);
      gotoxy(90,13);		putchar(186);
   	gotoxy(38,13);		printf("%c Masukkan Pin Baru : ",186);

      for(x=0; x<60; x++)
      {
      	pinsiswa[id][x]=0;
      }
      int baru[60];
      for(x=0; x<x+1; x++)
   	{
   		baru[x]=getch();
         pinsiswa[id][x]=(char)baru[x];                                          		//meminta password
   		if(pinsiswa[id][x]==13)
         {
      		pinsiswa[id][x]=0;
   			break;
         }
      	else if(pinsiswa[id][x]==8)
   		{
        		if(x!=0)
      		{
         		printf("\b \b");
         		pinsiswa[id][x]=0;
         		pinsiswa[id][x]=0;
            	x-=2;
         	}
         	else
					x--;
      	}
      	else
      		putchar('*');
   	}

      if(pinsiswa[id][0]==0)
      {
      	gotoxy(45,16);	printf("Pin Belum Dimasukkan");
         getch();
         goto pin;
      }

      gotoxy(45,16);	printf("Pin Berhasil Diganti");
      getch();
      goto pilihan;
	}

   else if(pilihan==0);

   else
   {
   	gotoxy(40,23);	printf("Tidak Ada Pilihan");
      getch();
      goto pilihan;
   }
   return(0);
}

cogan()
{
	int a,b,c,d,x,idbaru,exp;
   umum:
   clrscr();
   gotoxy(40,10);	printf("       -------------       ");
	gotoxy(40,11);	printf("       | Menu Umum |       ");
   gotoxy(40,12);	printf("---------------------------");
	gotoxy(40,13);	printf("| 1.Tentang sekolah       |");
	gotoxy(40,14);	printf("| 2.Kelas                 |");
	gotoxy(40,15);	printf("| 3.Ekskul                |");
	gotoxy(40,16);	printf("| 4.Siswa berprestasi     |");
	gotoxy(40,17);	printf("| 5.Pendaftaran           |");
   gotoxy(40,18);	printf("| 0.Keluar                |");
   gotoxy(40,19);	printf("---------------------------");
   gotoxy(40,21);	printf("---------------------------");
	gotoxy(40,20);	printf("| Masukkan Pilihan : ");

   a=-1;
   fflush(stdin);
	scanf("%d",&a);
   if(a==0);
	else if(a==1)
   {
   	about:
   	clrscr();
   	gotoxy(40,10);	printf("    -------------------    ");
		gotoxy(40,11);	printf("    | Tentang Sekolah |    ");
   	gotoxy(40,12);	printf("---------------------------");
      gotoxy(40,13);	printf("| 1.Visi misi             |");
      gotoxy(40,14);	printf("| 2.Guru dan staf         |");
      gotoxy(40,15);	printf("| 0.Kembali               |");
   	gotoxy(40,16);	printf("---------------------------");
   	gotoxy(40,18);	printf("---------------------------");
		gotoxy(40,17);	printf("| Masukkan Pilihan : ");

      b=-1;
      fflush(stdin);
      scanf("%d",&b);
      if(b==0)
      	goto umum;
      if(b==1)
      {
         clrscr();
         gotoxy(40,9);	printf("         --------          ");
			gotoxy(40,10);	printf("         | Visi |          ");
   		gotoxy(40,11);	printf("---------------------------");

         gotoxy(40,12);	printf("1. Menumbuhkan Sikap Pemberontak Pada Ketidakadilan");
         gotoxy(40,13);	printf("2. Memberikan Pelayanan Terbaik Kepada Masyarakat");
         gotoxy(40,14);	printf("3. Memberikan Motivasi Tentang Kemanusiaan");

         gotoxy(40,16);	printf("         --------          ");
			gotoxy(40,17);	printf("         | Misi |          ");
   		gotoxy(40,18);	printf("---------------------------");

         gotoxy(40,19);	printf("1. Meruntuhkan Tindak Asusila dan Kekerasan");
         gotoxy(40,20);	printf("2. Mencerdaskan Siswa Agar Tumbuh Baik");
         gotoxy(40,21);	printf("3. Menguasai Ilmu Sosial Yang Luar Biasa");
         getch();
         goto about;
      }
      else if(b==2)
      {
         clrscr();
         gotoxy(40,8);	printf("Guru dan staff");
         for(x=0; x<gumax; x++)
         {
         	gotoxy(40,x+9);	printf("-%s", namaguru[x]);
         }
         gotoxy(40,x+10);	printf("Staff :");
         gotoxy(40,x+11);	printf("-Harijanti");
         gotoxy(40,x+12);	printf("-Firdaus Akbar");
         gotoxy(40,x+13);	printf("-Bartolomeo");
      	getch();
         goto about;
      }
      else
      {
      	gotoxy(40,19);	printf("Pilihan Tidak Tersedia");
         getch();
         goto about;
      }
   }
   else if(a==2)
   {
   	clrscr();
      gotoxy(43,9);	printf("         ---------         ");
      gotoxy(43,10);	printf("         | Kelas |         ");
      gotoxy(43,11);	printf("----------------------------");
      gotoxy(29,12);	printf("Sekolah Kami Masih Tergolong Sekolah Baru, Oleh Karena Itu");
      gotoxy(22,13);	printf("SMA Kami Hanya Memiliki 1 buah Kelas Dengan Jumlah Siswa Sebanyak %d Siswa\n",sismax);
      gotoxy(33,14);	printf("Mohon Maaf Atas Ketidaknyamanan Dari Sekolah Kami");
      getch();
      goto umum;
  	}
  	else if(a==3)
   {
      skull:
      clrscr();
      gotoxy(43,10);	printf("        ----------         ");
      gotoxy(43,11);	printf("        | Ekskul |         ");
      gotoxy(43,12);	printf("---------------------------");
   	gotoxy(43,13);	printf("| 1.Ekskul Voli           |");
      gotoxy(43,14);	printf("| 2.Ekskul Basket         |");
      gotoxy(43,15);	printf("| 0.Kembali               |");
      gotoxy(43,16);	printf("---------------------------");
      gotoxy(43,18);	printf("---------------------------");
	  	gotoxy(43,17);	printf("| Masukkan Pilihan : ");

      c=-1;
      fflush(stdin);
    	scanf("%d",&c);
      if(c==0)
      	goto umum;
   	else if(c==1)
	  	{
			clrscr();
         gotoxy(40,10);	printf("      ---------------      ");
      	gotoxy(40,11);	printf("      | Ekskul Voli |      ");
      	gotoxy(40,12);	printf("---------------------------");
  		   gotoxy(40,13);	printf("Ekskull yang menambah kekuatan pukulan tangan anda");
         gotoxy(40,14);	printf("Cocok bagi anda yang ingin menjadi petinju");
         gotoxy(40,15);	printf("Hubungi CP, kami jika ingin mendaftar");
         getch();
         goto skull;
   	}
	   else if(c==2)
	  	{
   	  	clrscr();
         gotoxy(43,10);	printf("     -----------------     ");
      	gotoxy(43,11);	printf("     | Ekskul Basket |     ");
      	gotoxy(43,12);	printf("---------------------------");
		  	gotoxy(40,13);	printf("Ekskull yang sangat bermanfaat bagi kesehatan");
         gotoxy(40,14);	printf("Juga membuat anda menjadi lebih terkenal");
         gotoxy(40,15);	printf("Cocok bagi anda yang ingin menjadi boyband");
         gotoxy(40,16);	printf("Hubungi CP kami jika ingin mendaftar");
         getch();
         goto skull;
   	}
	   else
  		{
	   	gotoxy(43,19);	printf("Pilihan Tidak Tersedia");
         getch();
         goto skull;
   	}
	}
   else if(a==4)
   {
   	clrscr();
      gotoxy(43,10);	printf("   ---------------------   ");
      gotoxy(43,11);	printf("   | Siswa Berprestasi |   ");
      gotoxy(43,12);	printf("---------------------------");
	   gotoxy(40,13);	printf("1.Aldi\t: Juara Lomba Cerdas Cermat Tingkat SD");
      gotoxy(40,14);	printf("2.Rofi\t: Mendapat Nominasi Kating Ter-Hits");
      gotoxy(40,15); printf("3.Arief\t: Siswa Ter-Hits Satu Sekolah");
      gotoxy(40,16);	printf("4.Rendy\t: Menang Catur Melawan Aldi 3 kali");
      gotoxy(40,17);	printf("5.Haris\t: Juara MTQ Tingkat Kelurahan");
      gotoxy(40,18);	printf("6.Rizal\t: Nominasi Program Penghancur Dunia Terbaik");
      getch();
      goto umum;
   }
	else if(a==5)
	{
   	daftar:
   	clrscr();
      gotoxy(40,10);	printf("      ---------------      ");
      gotoxy(40,11);	printf("      | Pendaftaran |      ");
      gotoxy(40,12);	printf("---------------------------");
	   gotoxy(40,13);	printf("| 1.Guru                  |");
      gotoxy(40,14);	printf("| 2.Siswa                 |");
      gotoxy(40,15);	printf("| 0.Kembali               |");
      gotoxy(40,16);	printf("---------------------------");
      gotoxy(40,18);	printf("---------------------------");
   	gotoxy(40,17);	printf("| Masukkan Pilihan : ");

      d=-1;
      fflush(stdin);
	   scanf("%d",&d);
      if(d==0)
      	goto umum;
      else if(d==1)
      {
      	if(lowongan<2)
			{
				idbaru=lowongan+10;
            clrscr();
            gotoxy(30,10);	printf("                       --------------------                        ");
      		gotoxy(30,11);	printf("                       | Pendaftaran Guru |                        ");
      		gotoxy(30,12);	printf("-------------------------------------------------------------------");
				gotoxy(30,13);	printf("| Masukkan Nama    :                                              |");
				gotoxy(30,14);	printf("| Tempat/Tgl Lahir :                                              |");
				gotoxy(30,15);	printf("| Alamat           :                                              |");
				gotoxy(30,16);	printf("| Mata Pelajaran   :                                              |");
				gotoxy(30,17);	printf("| Pengalaman Kerja :                                        Tahun |");
      		gotoxy(30,18);	printf("-------------------------------------------------------------------");
            gotoxy(30,20);	printf("*Syarat Untuk Diterima Adalah Memiliki Pengalaman Kerja Minimal 5 Tahun");

            while(namaguru[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,13);	gets(namaguru[idbaru]);
            }

            while(ttlguru[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,14);	gets(ttlguru[idbaru]);
            }

            while(alamatguru[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,15);	gets(alamatguru[idbaru]);
            }

            while(mapel[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,16);	gets(mapel[idbaru]);
            }

            exp:
            gotoxy(51,17);
            printf("                                       Tahun");
            printf("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            printf("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
            exp=-1;
            fflush(stdin);
            scanf("%d",&exp);
            if(exp<0)
            {
             	gotoxy(30,22);	printf("Pengalaman Tidak Valid");
					getch();
               printf("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
               printf("                      ");
               printf("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
               goto exp;
            }
				else if(exp >= 5)
				{
					while(1)
					{
               	jenka:
						clrscr();
						gotoxy(30,13);	printf("Selamat, Anda Memenuhi Persyaratan");
						gotoxy(30,15);	printf("1. Laki-laki");
						gotoxy(30,16);	printf("0. Perempuan");
						gotoxy(30,17);	printf("Masukkan Jenis Kelamin Anda : ");

                  jenisguru[idbaru]=-1;
      				fflush(stdin);
						scanf("%d",&jenisguru[idbaru]);
						if(jenisguru[idbaru]!=1 && jenisguru[idbaru]!=0)
                  {
							gotoxy(30,19);	printf("Jenis Kelamin Tidak Tersedia");
                     getch();
                     goto jenka;
                  }
						else
							break;
					}

					gotoxy(30,19);	printf("Masukkan PIN : ");

               while(pinguru[idbaru][0]==0)
   	         {
      	      	fflush(stdin);
         	   	gets(pinguru[idbaru]);
	            }

               gotoxy(30,21);
					printf("Selamat, Anda Sudah Diterima Menjadi Guru Dengan ID %s",idguru[idbaru]);
               lowongan++;
               gumax++;
               getch();
					goto daftar;

				}
				else
				{
					gotoxy(30,22);	printf("Maaf, Anda Tidak Memenuhi Persyaratan");
					for(x=0; x<60; x++)
					{
						namaguru[idbaru][x]=0;
						ttlguru[idbaru][x]=0;
						alamatguru[idbaru][x]=0;
						mapel[idbaru][x]=0;
					}
               getch();
               goto daftar;
				}
			}
			else
			{
				gotoxy(40,19);	printf("Maaf, Kami Sedang Tidak Menerima Lowongan");
            getch();
            goto daftar;
			}
      }
      else if(d==2)
      {
	      if(kuota<2)
			{

				idbaru=kuota+20;
         	clrscr();

            gotoxy(30,10);	printf("                       ---------------------                       ");
      		gotoxy(30,11);	printf("                       | Pendaftaran Siswa |                       ");
      		gotoxy(30,12);	printf("-------------------------------------------------------------------");
				gotoxy(30,13);	printf("| Masukkan Nama    :                                              |");
				gotoxy(30,14);	printf("| Tempat/Tgl Lahir :                                              |");
				gotoxy(30,15);	printf("| Alamat           :                                              |");
				gotoxy(30,16);	printf("| Asal Sekolah     :                                              |");
      		gotoxy(30,17);	printf("-------------------------------------------------------------------");

            while(namasiswa[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,13);	gets(namasiswa[idbaru]);
            }

            while(ttlsiswa[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,14);	gets(ttlsiswa[idbaru]);
            }

            while(alamatsiswa[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,15);	gets(alamatsiswa[idbaru]);
            }

            while(asalsiswa[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(51,16);	gets(asalsiswa[idbaru]);
            }

				while(1)
				{
					clrscr();
					gotoxy(30,13);	printf("1. Laki-laki");
					gotoxy(30,14);	printf("0. Perempuan");
					gotoxy(30,15);	printf("Masukkan Jenis Kelamin Anda : ");

               jenissiswa[idbaru]=-1;
      			fflush(stdin);
					scanf("%d",&jenissiswa[idbaru]);
					if(jenissiswa[idbaru]!=1 && jenissiswa[idbaru]!=0)
               {
                  gotoxy(30,17);	printf("Jenis Kelamin Tidak Tersedia");
                  getch();
               }
					else
						break;
				}
            gotoxy(30,17);
            fflush(stdin);

				printf("Masukkan PIN : ");

            while(pinsiswa[idbaru][0]==0)
            {
            	fflush(stdin);
            	gotoxy(45,17);	gets(pinsiswa[idbaru]);
            }
				kuota++;
				akses[idbaru]=9;
            gotoxy(30,19);	printf("Terima Kasih Telah Mendaftar, ID Anda Adalah %s",idsiswa[idbaru]);
            gotoxy(30,20); printf("Anda Dapat Login Setelah Data Anda Dikonfirmasikan Oleh Guru");
            sistar++;
            getch();
            goto daftar;
			}
			else
			{
				gotoxy(40,19);	printf("Maaf, Kuota Penerimaan Siswa Baru Telah Habis");
            getch();
            goto daftar;
			}

      }
      else
      {
      	gotoxy(40,19);	printf("Pilihan Tidak Tersedia");
         getch();
         goto daftar;
      }
   }
   else
	{
   	gotoxy(40,22);	printf("Pilihan Tidak Tersedia");
      getch();
      goto umum;
   }
   return(0);
}

int login(int menu)                                      							  //fungsi login
{
	int x, id, salah=0;
   char nama[60], pass[60];

   login:

   clrscr();

   gotoxy(40,11);
   printf("%c",201);	garis(13);	printf("%c",187);

	if(menu==1)
   {
   	gotoxy(40,12);	printf("%c LOGIN GURU  %c",186,186);
   }
   else if(menu==2)
   {
   	gotoxy(40,12);	printf("%c LOGIN SISWA %c",186,186);
   }
   gotoxy(36,13);
   printf("%c",201);	garis(50); 	printf("%c",187);

	gotoxy(36,14);	printf("%c Masukkan ID       : ",186);
   gotoxy(87,14);	printf("%c",186);

   gotoxy(36,15);
   printf("%c",204);	garis(50); 	printf("%c",185);

	gotoxy(36,16);	printf("%c Masukkan Password : ",186);
   gotoxy(87,16);	printf("%c",186);

   gotoxy(36,17);
   printf("%c",200);	garis(50); 	printf("%c",188);

   nama[0]=0;
   while(nama[0]==0)
   {
  		gotoxy(58,14);
      fflush(stdin);	gets(nama);                                                   		//meminta nama
   }
   int passn[60];

	gotoxy(58,16);
	for(x=0; x<x+1; x++)
   {
   	passn[x]=getch();                                                          		//meminta password
      pass[x]=(char)passn[x];

   	if(pass[x]==13)
      {
      	if(x!=0)
      	{
         	pass[x]=0;
   			break;
         }
         else
         	x--;
      }
      else if(pass[x]==8)
   	{
      	if(x!=0)
      	{
         	printf("\b \b");
         	pass[x]=0;
         	pass[x-1]=0;
            x-=2;
         }
         else
         	x--;
      }
      else
      	putchar('*');
   }

   gotoxy(45,19);

   if(menu==1)                                                                      //untuk guru
   {
   	for(x=0; x<gumax; x++)
   	{
			if(strcmp(idguru[x],nama)==0)                                        		//cek nama
			{
				if(strcmp(pinguru[x],pass)==0)                                      		//cek password
				{
         		printf("ID dan Password Diterima");
            	break;
         	}
   			else
   			{
         		printf("Password Salah");
            	x=999;
               salah++;
               if(salah!=3)
   				{
               	getch();
               	goto login;
      			}
               	else
               {
         			gotoxy(45,21);	printf("Anda Melakukan 3 kali Kesalahan Berturut-Turut");
      				gotoxy(45,22);	printf("Program Dikembalikan Ke Menu Utama");
               	break;
      			}
         	}
			}
   	}
   }
   else if(menu==2)                                                                 //untuk siswa
   {
      for(x=0; x<sistar; x++)
   	{
			if(strcmp(idsiswa[x],nama)==0)                                       		//cek nama
			{
				if(strcmp(pinsiswa[x],pass)==0)                                     		//cek password
				{
               if(akses[x]==9)
               {
                  printf("Anda Tidak Memiliki Akses ke Menu Ini");
                  x=999;
                  break;
               }
               else if(akses[x]==8)
               {
                	printf("Registrasi Anda Tidak Diterima");
                  x=999;
                  break;
               }
               else
               {
						printf("ID dan Password Diterima");
            		break;
               }
         	}
   			else
   			{
         		printf("Password Salah");
               salah++;
            	x=999;
               if(salah!=3)
   				{
               	getch();
               	goto login;
      			}
               else
      			{
         			gotoxy(45,21);	printf("Anda Melakukan 3 kali Kesalahan Berturut-Turut");
      				gotoxy(45,22);	printf("Program Dikembalikan Ke Menu Utama");
         			break;
      			}
         	}
			}
   	}
   }
	if(x==sistar || x==gumax)
   {
   	printf("ID atau Password Salah");
      salah++;
      x=999;
      if(salah!=3)
   	{
   		getch();
      	goto login;
      }
   	else
      {
         gotoxy(45,21);	printf("Anda Melakukan 3 kali Kesalahan Berturut-Turut");
      	gotoxy(45,22);	printf("Program Dikembalikan Ke Menu Utama");
      }
   }
   id=x;
   getch();

   return(id);
}

main()                                                                          //fungsi utama
{
	int x, y, a, menu, id;

   char title[60]="SMA SUZURAN ISLAM KHATOLIK!";

   textcolor(12);
   gotoxy(40,12);	cprintf("^=============================^");
   gotoxy(40,13);	cprintf("|                             |");
   gotoxy(40,14);	cprintf("\"=============================\"");

   textcolor(15);
   gotoxy(42,13);	cprintf("%s",title);

   gotoxy(50,16);	printf("Loading.");

   for(x=0; x<2; x++)
   {
   	for(int y=1; y<=50; y++)
      {
    		Sleep(1);
      	if(kbhit())		break;
      }
      printf(".");

      for(int y=1; y<=50; y++)
      {
    		Sleep(1);
      	if(kbhit())		break;
      }
      printf(".");

	  	for(int y=1; y<=50; y++)
      {
    		Sleep(1);
      	if(kbhit())		break;
      }
      printf("\b\b  \b\b");
   }

   clrscr();
   gotoxy(35,13);
   printf("Tekan sembarang Tombol Untuk Memulai");
   getch();


   for(a=0; a<=30; a++)
   {
   	Sleep(1);
   	judul:                                                                         		//judul
      system("color 0b");
      clrscr();
   	for(x=40,y=70; x<=43; x++,y--)
   	{
   		gotoxy(x+a,9);			printf("%c",187);
	      gotoxy(x+a+1,10);		printf("%c",187);
			gotoxy(x+a+2,11);		printf("%c",187);
			gotoxy(x+a+2,12);		printf("%c",188);
			gotoxy(x+a+1,13);		printf("%c",188);
   	   gotoxy(x+a,14);		printf("%c",188);

	      gotoxy(y-a,9);			printf("%c",201);
   	   gotoxy(y-a-1,10);		printf("%c",201);
			gotoxy(y-a-2,11);		printf("%c",201);
			gotoxy(y-a-2,12);		printf("%c",200);
			gotoxy(y-a-1,13);		printf("%c",200);
      	gotoxy(y-a,14);		printf("%c",200);

         gotoxy(y-a,10);		printf("%c",188);
         gotoxy(y-a-1,11);   	printf("%c",188);
         gotoxy(y-a-1,12);  	printf("%c",187);
         gotoxy(y-a,13); 		printf("%c",187);

         gotoxy(x+a,10);	  	printf("%c",200);
         gotoxy(x+a+1,11);  	printf("%c",200);
         gotoxy(x+a+1,12);    printf("%c",201);
         gotoxy(x+a,13); 		printf("%c",201);
	   }
	}
   gotoxy(41,9);
   for(a=0; a<29; a++)
   printf("%c",205);

   gotoxy(41,14);
   for(a=0; a<29; a++)
   printf("%c",205);

   gotoxy(49,11);
   for(x=0; x<11; x++){printf("%c",title[x]);}
   gotoxy(47,12);
   for(x=12; x<27; x++){printf("%c",title[x]);}

   Sleep(100);
   system("color 0b");

   gotoxy(37,16); puts("Tekan Tombol Sesuai Dengan Menu Anda : ");
   gotoxy(40,17);	puts("1. Guru");
   gotoxy(40,18);	puts("2. Murid");
   gotoxy(40,19); puts("3. Umum");
   gotoxy(40,20);	puts("0. Exit");
   gotoxy(54,22);	puts("_");
   gotoxy(54,23); puts("|");

   a=30;

   for(y=0; y<16&&!kbhit(); y++)
   {
	   gotoxy(49,11);
	   for(x=0; x<11&&!kbhit(); x++){
   	textcolor(y);cprintf("%c",title[x]);Sleep(30);}
   	gotoxy(47,12);
   	for(x=12; x<27&&!kbhit(); x++){
   	textcolor(y);cprintf("%c",title[x]);Sleep(30);}
      if(y==15)
      	y=0;
   }
   gotoxy(76,16);

   menu=-1;
   fflush(stdin);
   scanf("%i",&menu);                                                           		//pemilihan menu
   if(menu==1)                                                                  		//guru
   {
   	hancurkan();
      clrscr();

      gotoxy(54,22);	puts("_");
   	gotoxy(54,23); puts("|");

      id=login(menu);
      if(id==sismax || id==999)
      {
      	goto judul;
      }
      hancurkan2();
      system("color 0d");

      haris(id);//punyax haris();
      goto judul;
   }
   else if(menu==2)                                                             		//siswa
   {
   	hancurkan();
      clrscr();

      gotoxy(54,22);	puts("_");
   	gotoxy(54,23); puts("|");

      id=login(menu);
      if(id==sismax || id==999){
      	goto judul;
      }
      hancurkan2();
      system("color 0a");

      yofi(id);//punyax rofi

      goto judul;
   }
   else if(menu==3)                                                             		//umum
   {
   	hancurkan();
      system("color 0e");
      cogan();//joshua
      goto judul;
   }
   else if(menu==0)
   {
		goto selesai;
   }
   else
   {
   	clrscr();
      gotoxy(46,13);printf("Pilihan Tidak Ada");
      getch();
      goto judul;
   }
   selesai:                                                                         //selesai
   hancurkan();
   gotoxy(49,13);puts("Good Bye");
   Sleep(1000);
}
