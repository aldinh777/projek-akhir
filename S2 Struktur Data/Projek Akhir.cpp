#include "stdio.h"
#include "conio.h"
#include "string.h"

struct		pet
{
 	char		name[30];
   int		element;
   int		hp;
   int		atk;
   int		def;
};

struct		player
{
	char		name[30];
   char		pass[30];
   int		duit;
   int		akses;
   int		ipet;
  	float		skor;
   player	*next;
   player	*prev;
   pet		*pets[3];
};

struct     	sorter
{
	player	*data;
   sorter	*next;
   sorter	*prev;
};

struct		voucher
{
	char		kode[20];
   int		bal;
   voucher	*next;
};

struct		report
{
	char		judul[50];
   char		deskripsi[300];
   char		pelapor[30];
   report	*next;
};

player 	*head=NULL,	*tail=NULL, *admin=NULL, *current=NULL;
sorter	*frst=NULL,	*last=NULL;
voucher	*kupon=NULL;
report	*lapor=NULL;

int RANDOMIZE = 1;
int REPORT = -1;

void		debug();
void		owner();
int 		pilih(int x, int y, int awal, int akhir, char *style);
player 	*login();
void 		adduser();
void		deluser(player *data);
void		tampilandata();
void     mainmenu();
void		laporan();
void		kupongratis();
int		boom();
void		minigames();
void		petmenu();
void 		batlepet();
void		fight(player *enemy);
void		petinfo(int slot);
void		addpet(int slot);
void 		database();
void		tampil(player *data);
void		profiledit(player *data);
void		sorting(int mode);
void		searching(char cari[30]);
void		transfer();

main()                                                                          //main
{
	int n;
   player *play;
   char info[20];

   owner();
   awal:
   clrscr();

	printf("\t==============================\n");
	printf("\t||vvvvvvvvvvvvvvvvvvvvvvvvvv||\n");
	printf("\t||--->                  <---||\n");
	printf("\t||----->    Social    <-----||\n");
	printf("\t||------->  Magical <-------||\n");
	printf("\t||----->   Transfer   <-----||\n");
	printf("\t||--->     Portable     <---||\n");
	printf("\t||^^^^^^^^^^^^^^^^^^^^^^^^^^||\n");
	printf("\t==============================\n");
   printf("\n\t\tLOG IN");
   printf("\n\t\t REGISTER");
   printf("\n\t\t  EXIT");

	n = pilih(7, 11, 11, 13, "--->>");
   if(n==11)
   {
   	play = login();
      if(play==NULL)
      {
      	printf("\n\n\n\t==> Username atau Password Salah");
         getch();
      }
      else if(play->akses!=4)
      {
      	if(play->akses==1)
         	printf("\n\n\n\t==> Hello Admin");
         else if(play->akses==2)
         	printf("\n\n\n\t==> Hello GM");
         else
         	printf("\n\n\n\t==> Hello Player");
         getch();
      	mainmenu();
      }
      else
      {
      	printf("\n\n\n\t==> Thou Has Been Banned");
      	getch();
      }
      goto awal;
   }
   else if(n==12)
   {
   	adduser();
      goto awal;
   }
   else
   	clrscr();
	printf("\n\n\n\n\n\t\t<< Goodbye >> ");

   fflush(stdin);	gets(info);
   if(strcmp(info,"see")==0)
   {
   	debug();
      goto awal;
   }
}

void debug()                                                                    //fungsi debug
{
	player *play;

   clrscr();
   play=admin;
   for(int i=0; play!=NULL; i++)
   {
      printf("\t%d. %s : %s -->%d-->%d-->%.2f\n",i,play->name,play->pass,play->duit,play->akses,play->skor);
      play=play->next;
   }
   printf("\n\thead : %s\n", head->name);
   printf("\ttail : %s\n", tail->name);
   getch();
}

void owner()                                                                    //owner
{
	admin = new player;
   strcpy(admin->name,"Admin");
   strcpy(admin->pass,"root");
   admin->duit=0;
   admin->akses=1;
   admin->skor=0;
   admin->next=head;
   admin->prev=NULL;
   admin->ipet=0;
   for(int i=0; i<3; i++)
   	admin->pets[i]=NULL;
}

int pilih(int x, int y, int awal, int akhir, char *style)                       //pilih
{
	int chooz = 0;

	while(chooz!=13)
   {
   	gotoxy(x,y);	printf(style);
      chooz=getch();
      gotoxy(x,y);	printf("     ");
      if(chooz=='s' || chooz=='S')
      {
      	if(y==akhir)
         	y=awal;
         else
      		y++;
      }
      else if(chooz=='w' || chooz=='W')
      {
      	if(y==awal)
         	y=akhir;
         else
      		y--;
      }
   }
   return (y);
}

player *login()                                                                 //login
{
	clrscr();
   char	name[30],	pass[30];
   player	*login;

   name[0]=0;	pass[0]=0;
   login = admin;
   fflush(stdin);
   printf("\t\t\tLOGIN PAGE");
   printf("\n\n\t===============================================");
   printf("\n\t Username\t: ");
   printf("\n\t===============================================");
   printf("\n\t Password\t: ");
   printf("\n\t===============================================");
   while(name[0]==0)
	{
   	gotoxy(27,4); 		gets(name);
   }
   while(pass[0]==0)
   {
   	gotoxy(27,6);	 	gets(pass);
   }
   while(login!=NULL)
   {
		if(strcmpi(login->name, name)==0 && strcmp(login->pass, pass)==0)
      	break;
      else
      	login = login->next;
   }
   current=login;
   return(login);
}

void adduser()                                                                  //tambah user
{
	clrscr();
   player	*baru, *cek;
   sorter	*puga;

   baru	= new player;
   puga 	= new sorter;
   puga->data = baru;
   cek = admin;
   baru->name[0]=0;
   baru->pass[0]=0;

   fflush(stdin);
   printf("\t\t\tREGISTRATION PAGE");
   printf("\n\n\t===============================================");
   printf("\n\t Username Baru : ");
   printf("\n\t===============================================");
   printf("\n\t Password Baru : ");
   printf("\n\t===============================================");
   while(baru->name[0]==0)
	{
   	gotoxy(26,4); 		gets(baru->name);
   }
   while(baru->pass[0]==0)
   {
   	gotoxy(26,6);	 	gets(baru->pass);
   }

   while(cek!=NULL)
   {
		if(strcmpi(cek->name, baru->name) == 0)
      	break;
      else
      	cek = cek->next;
   }

   if(cek!=NULL)
   	printf("\n\n\n\t==> Nama Sudah Ada");
   else
   {
   	baru->duit = 1000;
	   baru->akses = 3;
   	baru->skor = 0;
	   baru->ipet = 0;
   	for(int i=0; i<3; i++)
	   	baru->pets[3]=NULL;
   	if(head==NULL)
	   {
   		admin->next = baru;
   		baru->next = NULL;
	      baru->prev = NULL;
   		head=tail=baru;

	      puga->next = NULL;
   	   puga->prev = NULL;
      	frst=last=puga;
	   }
   	else
	   {
   	   tail->next = baru;
   		baru->next = NULL;
	      baru->prev = tail;
   	   tail=baru;

	      last->next = puga;
   	   puga->next = NULL;
      	puga->prev = last;
 	     last=puga;
   	}
      printf("\n\n\n\t==> Registrasi Berhasil");
   }
   getch();
}

void tampilandata()                                                             //just nampilin doang
{
	gotoxy(40,3);	printf("|--------------------------------|");
	gotoxy(40,4);	printf("| Nama %s",current->name);
   gotoxy(40,5);	printf("|--------------------------------|");
   gotoxy(40,6);	printf("| Duit : Rp %d", current->duit);
   gotoxy(40,7);	printf("| Skor : %.2f", current->skor);
	gotoxy(40,8);	printf("|--------------------------------|");
}

void mainmenu()                                                                 //mainmenu
{
	int n=4;
   mainmenu:
   if(current->akses==1 || current->akses==2)
   	current->duit = 999999999;
	clrscr();
   printf("\t\t||MENU||\n\n");
   printf("\t\t/====================\\\n");
   printf("\t\t| + Profil           |\n");
   printf("\t\t| + Database         |\n");
   printf("\t\t| + Pet              |\n");
   printf("\t\t| + Mainkan MiniGame |\n");
   if(current->akses == 1)
   {
   printf("\t\t| + Tambah Voucher   |\n");
   printf("\t\t| + Lihat Laporan    |\n");
   }
   else
   {
   printf("\t\t| + Redeem Voucher   |\n");
   printf("\t\t| + Lapokan Sesuatu  |\n");
   }
   printf("\t\t| + Transfer Uang    |\n");
   printf("\t\t| - Log Out          |\n");
   printf("\t\t\\====================/\n");
   tampilandata();
   n = pilih(10,n,4,11,"-->>>");
   if(n==4)
   {
   	profiledit(current);
      goto mainmenu;
   }
   else if(n==5)
   {
   	database();
      goto mainmenu;
   }
   else if(n==6)
   {
   	petmenu();
      goto mainmenu;
   }
   else if(n==7)
   {
   	minigames();
      goto mainmenu;
   }
	else if(n==8)
   {
   	kupongratis();
      goto mainmenu;
   }
   else if(n==9)
   {
   	laporan();
      goto mainmenu;
   }
   else if(n==10)
   {
   	transfer();
      goto mainmenu;
   }
   else
   	current=NULL;
}

void laporan()         																			  //laporan
{
	int n;
   report *baru, *helper;

	clrscr();
   printf("\t!!!LAPORAN!!!\n\n");
	if(current->akses == 1 || current->akses == 2)
   {
   	if(lapor==NULL)
      {
      	printf("\tTidak Ada Laporan");
         getch();
      }
      else
      {
      	printf("\t< Kembali >\n");
         printf("\t< Hapus Laporan Ini>\n\n");
         printf("\t=======================================\n");
      	printf("\t| Judul       : %s\n", lapor->judul);
      	printf("\t| Pelapor     : %s\n", lapor->pelapor);
         printf("\t=========================================\n\n");
         printf("\t\t%s\n\n", lapor->deskripsi);
         printf("\t<=======================================>\n");
         printf("\t| Laporan Tersisa : %d", REPORT);
         n = pilih(3,3,3,4,"->");
         if(n==4)
         {
         	lapor = lapor->next;
         	REPORT--;
         }
      }
   }
   else
   {
   	baru = new report;
		printf("\tTulis Judul : ");		gets(baru->judul);
      printf("\tTulis Deskripsi : ");	gets(baru->deskripsi);
   	strcpy(baru->pelapor,current->name);
      baru->next = NULL;
      if(lapor==NULL)
      {
         lapor = baru;
         REPORT = 0;
      }
      else
      {
      	helper = lapor;
      	while(helper->next!=NULL)
         	helper=helper->next;
         helper->next = baru;
         REPORT++;
      }
      printf("\n\n\tTERLAPORKAN");
      getch();
   }
}

void kupongratis()                                                              //voucher atau kupon
{
	voucher *baru, *helper, *flag=NULL;
   char kode[20];
	int n;

	clrscr();
	if(current->akses == 1 || current->akses == 2)
   {
   	printf("\t==||Menu Voucher||==\n\n");
      printf("\t< Tambah >\n");
      printf("\t< Kembali >\n\n");
      printf("\tDaftar Voucher : \n");
      if(kupon==NULL)
      	printf("\t<Tidak Ada>");
      else
      {
      	helper = kupon;
      	while(helper!=NULL)
         {
         	printf("\t%s\t: %d\n", helper->kode, helper->bal);
         	helper=helper->next;
         }
      }
      n = pilih(3,3,3,4,"->");
      if(n==3)
      {
      	clrscr();
         baru = new voucher;
         printf("\t))))) VOUCHER (((((\n\n");
         printf("\t=======================================================\n");
         printf("\t|| Masukkan Kode Voucher    : \n");
         printf("\t=======================================================\n");
         printf("\t|| Masukkan Penambahan Uang : \n");
         printf("\t=======================================================\n");
         fflush(stdin);
         baru->kode[0]=0;
         while(baru->kode[0]==0)
         {
         	gotoxy(39,4);	gets(baru->kode);
         }
         fflush(stdin);
         gotoxy(39,6);	scanf("%d",&baru->bal);
         baru->next = kupon;
         kupon = baru;
         printf("\n\n\n\t==> Tertambah");
         getch();
      }
   }
   else
   {
   	printf("\t=======================================================\n");
      printf("\t|| Masukkan Kode Voucher    : \n");
      printf("\t=======================================================\n");
      fflush(stdin);
      kode[0]=0;
      while(kode[0]==0)
      {
      	gotoxy(39,2);	gets(kode);
      }
      helper = kupon;
      while(helper!=NULL)
      {
      	if(strcmp(kode,helper->kode)==0)
         	flag = helper;
      	helper=helper->next;
      }
      if(flag==NULL)
      	printf("\n\n\t==> Maaf, Kode Kupon Salah");
      else
      {
      	current->duit += flag->bal;
      	printf("\n\n\t==> Berhasil, Uang anda bertambah Rp %d", flag->bal);

         if(flag==kupon)
         {
         	kupon=flag->next;
         }
         else
         {
	         helper = kupon;
   			while(helper!=NULL)
      	   {
   	      	if(helper->next == flag)
	            	helper->next = flag->next;
	         	helper=helper->next;
         	}
         }
      }
      getch();
   }
}

int boom()                                                                      //fungsi random
{
	RANDOMIZE *= ((612+RANDOMIZE) * (102-RANDOMIZE) * RANDOMIZE);
   RANDOMIZE %= 100000;
   if(RANDOMIZE<0)
   	RANDOMIZE *= -1;
   return RANDOMIZE;
}

void minigames()                                                                //minigames
{
	int n, lawan;

   minigame:
   lawan = boom()%3;
	clrscr();
   printf("\t<Gunting Batu Kertas>\n\n");
   printf("\t< Gunting >\n");
   printf("\t< Batu >\n");
   printf("\t< Kertas >\n");
   n = pilih(3,3,3,5,"-->");
   n = n-3;
   gotoxy(1,7);
	printf("\t>>Pilihanmu       : ");
   if(n==0)
   	printf("Gunting");
   else if(n==1)
   	printf("Batu");
   else if(n==2)
   	printf("Kertas");
   printf("\n\n\t>>Lawanmu memilih : ");
   if(lawan==0)
		printf("Gunting");
   else if(lawan==1)
   	printf("Batu");
   else if(lawan==2)
   	printf("Kertas");

	printf("\n\n\t>>Hasil : ");
   if(n==lawan)
   {
   	printf("< Imbang >, +Rp 200 +skor 65");
   	current->duit+=200;
      current->skor+=65;
   }
   else if((n==0 && lawan==1)||(n==1 && lawan==2)||(n==2 && lawan==0))
   {
   	printf("< Kalah >, +Rp 1, +skor 0.5");
      current->duit+=1;
      current->skor+=0.5;
   }
   else
   {
   	printf("< Menang >, +Rp 500, +skor 125");
   	current->duit+=500;
      current->skor+=125;
   }
   printf("\n\tDuit Anda : %d\n", current->duit);
   printf("\n\t\tMain Lagi");
   printf("\n\t\tKembali");
   n = pilih(10,14,14,15,"-->>>");
   if(n==14)
   	goto minigame;
}

void petmenu()                                                                  //pet menu
{
   int n ,i, a;

   petmenu:
   a = current->ipet;
	clrscr();
	printf("\t\t^^ PET MENU ^^\n\n");
   printf("\t\t||============================>>\n");
   printf("\t\t|| Pet Utama : ");
   if(current->pets[a]==NULL)
   	printf("(Kosong)\n");
   else
     	printf("%s | HP = %d\n", current->pets[a]->name, current->pets[a]->hp);
   printf("\t\t||============================>>\n\n");

   printf("\t\t||============================>>\n");
   printf("\t\t|| < Daftar Pet >\n");
   printf("\t\t|| < Battle >\n");
   printf("\t\t|| < Kembali >\n");
   printf("\t\t||============================>>");
   n = pilih(10,8,8,10,"-->");
   if(n==8)
   {
   	n=3;
   	petlist:
   	clrscr();
      printf("\t\t>- Pet List -<\n\n");
   	for(i=0; i<3; i++)
      {
      	if(current->pets[i]==NULL)
         	printf("\t\t%d. - <Tidak Ada> -\n", i+1);
         else
         	printf("\t\t%d. %s\n",i+1 ,current->pets[i]->name);
      }
      printf("\t\t< Tambah > : Rp 2000\n");
      printf("\t\t< Kembali >");
      n = pilih(10,n,3,7,"-->");
      if(n<6)
      {
      	if(current->pets[n-3]==NULL)
         	goto petlist;
         else
         {
         	petinfo(n-3);
         	goto petlist;
         }
      }
      else if(n==6)
      {
      	if(current->duit <2000)
         {
         	clrscr();
            printf("\n\n\n\n\n\t\t< Duit Anda Kurang Banyak >");
            getch();
         	goto petlist;
         }
         else
         {
         	current->duit-=2000;
	   		clrscr();
   	      printf("\t\t< Pilih Slot >\n\n");
      	   for(i=0; i<3; i++)
	      	{
		      	if(current->pets[i]==NULL)
   		      	printf("\t\t%d. - <Tidak Ada> -\n", i+1);
      		   else
	         		printf("\t\t%d. %s\n",i+1 ,current->pets[i]->name);
   	   	}
      	   n=pilih(10,3,3,5,"-->");
	         if(current->pets[n-3]==NULL)
   	      {
      	   	addpet(n-3);
         		goto petlist;
	         }
				else
      	   {
         		clrscr();
	         	printf("\n\n\n\n\n\t\t< Sudah Terisi >");
   	      	getch();
      	   }
         	goto petlist;
      	}
      }
      else
      	goto petmenu;
   }
   else if(n==9)
   {
   	if(current->pets[current->ipet]==NULL)
      {
      	clrscr();
      	printf("\n\n\n\n\n\t\t< Pet Utama Tidak Ada >");
         getch();
      }
      else
   		batlepet();
      goto petmenu;
   }
}

void batlepet()                                                                 //batle pet
{
	player *help;
   int i,n;

   batlepet:
	clrscr();
   printf("\tPilih Lawanmu : \n\n");
   if(current->akses == 2 || current->akses == 3)
   	help = admin;
   else
   	help = head;
   if(help==NULL)
   {
   	printf("\t\tLawan Tidak Ada");
   	getch();
   }
   else
   {
	   for(i=0; help!=NULL; i++)
   	{
   		printf("\t\t- %s\n", help->name);
	   	help = help->next;
   	}
		printf("\t\tBatal");
   	n = pilih(10,3,3,i+3,"-->");
   	if(n < i+3)
      {
      	n-=3;
      	if(current->akses == 2 || current->akses == 3)
         	help = admin;
         else
         	help = head;
         for(i=0; help!=NULL; i++)
         {
         	if(i == n)
            	break;
         	help = help->next;
         }
         printf("\n%s\n", help->name);
         if(current==help)
         {
         	clrscr();
            printf("\n\n\n\n\n\t\t< Itu Dirimu Sendiri >");
            getch();
            goto batlepet;
         }
         else if(help->pets[help->ipet] == NULL)
         {
         	clrscr();
         	printf("\n\n\n\n\n\t\t< Dia Tidak Punya Pet >");
            getch();
            goto batlepet;
         }
         else if(help->pets[help->ipet]->hp == 1)
         {
         	clrscr();
            printf("\n\n\n\n\n\t\t< Pet Lawan Sedang Sekarat >");
            getch();
            goto batlepet;
         }
         else
         	fight(help);
      }
   }
}

void fight(player *enemy)																		  //bertarung
{
	int a, b;
   a = current->ipet;
   b = enemy->ipet;

   while(1)
   {
   	enemy->pets[b]->hp -= (current->pets[a]->atk * 2) - (enemy->pets[b]->def * 3);
      if(enemy->pets[b]->hp <= 0)
      {
      	enemy->pets[b]->hp = 0;
         break;
      }
      current->pets[a]->hp -= (enemy->pets[b]->atk * 2) - (current->pets[a]->def * 3) ;
      if(current->pets[a]->hp <= 0)
      {
      	current->pets[a]->hp = 0;
         break;
      }
   }

	clrscr();
   printf("\t< Hasil />\n\n");
   printf("\tPet Milikmu : \n");
   printf("\t%s | HP = %d\n\n", current->pets[a]->name, current->pets[a]->hp);
   printf("\tPet Lawan   : \n");
   printf("\t%s | HP = %d\n\n", enemy->pets[b]->name, enemy->pets[b]->hp);
   if(current->pets[a]->hp >  enemy->pets[b]->hp)
   {
   	printf("\tMenang : atk +5, def +5");
   	enemy->pets[b]->hp = 1;
      current->pets[a]->atk += 5;
      current->pets[a]->def += 5;
   }
   else
   {
   	printf("\tKalah");
   	current->pets[a]->hp = 1;
   }
   getch();
}

void petinfo(int slot)                                                          //info pet
{
	int n, heal;

	pinfo:
	heal = 9999 - current->pets[slot]->hp;
	clrscr();
   printf("\t<> PET STATS <>\n\n");
   printf("\t//=============================<\n");
   printf("\t|| Nama   : %s\n", current->pets[slot]->name);
   printf("\t||=============================<\n");
   printf("\t|| Jenis  : ");
   if(current->pets[slot]->element==1)
   	printf("Kucing\n");
   else if(current->pets[slot]->element==2)
   	printf("Anjing\n");
   else
   	printf("Serigala\n");
   printf("\t|| HP     : %d\n", current->pets[slot]->hp);
   printf("\t|| Atk    : %d\n", current->pets[slot]->atk);
   printf("\t|| Deff   : %d\n", current->pets[slot]->def);
   printf("\t\\\\=============================<\n\n");
   printf("\t< Kembali >\n");
	printf("\t< Jadikan Pet Utama >\n");
   printf("\t< Pulihkan HP > : Rp %d\n", heal);
   printf("\t< Hapus >");
   n = pilih(3,12,12,15,"-->");
   if(n==13)
   	current->ipet = slot;
   else if(n==14)
   {
    	if(current->duit < heal)
      {
      	clrscr();
         printf("\n\n\n\n\n\t\t< Duitmu Kurang Banyak >");
      	getch();
         goto pinfo;
      }
      else
      {
      	current->duit -= heal;
         current->pets[slot]->hp += heal;
      	clrscr();
         printf("\n\n\n\n\n\t\t< Telah Dipulihkan >");
         getch();
         goto pinfo;
      }
   }
	else if(n==15)
   	current->pets[slot]=NULL;
}

void addpet(int slot)                                                           //tambah pet
{
	pet	*baru;
   int	n;

   baru = new pet;
	clrscr();
   printf("\tPilih Jenis : \n\n");
   printf("\t< Kucing >\n");
   printf("\t< Anjing >\n");
   printf("\t< Serigala >");
   n = pilih(3,3,3,5,"-->");
   baru->element = n-2;
   if(n==3)
   {
   	baru->hp = 9999;
      baru->atk = 200;
      baru->def = 30;
   }
   else if(n==4)
   {
   	baru->hp = 9999;
      baru->atk = 180;
      baru->def = 50;
   }
   else if(n==5)
   {
   	baru->hp = 9999;
      baru->atk = 150;
      baru->def = 80;
   }
   baru->name[0]=0;
   while(baru->name[0]==0)
   {
   	clrscr();
	   printf("\t||> Jenis Hewan     : ");
   	if(n==3)
	   	printf("Kucing");
   	else if(n==4)
	   	printf("Anjing");
   	else if(n==5)
   		printf("Serigala");
	   fflush(stdin);
   	printf("\n\t||> Masukkan Nama   : ");
   	gets(baru->name);
   }
   current->pets[slot] = baru;
}

void database()                                                                 //database
{
	int i, n=3, mode=1, asc=1;
	sorter	*play;
   char		search[30];

   database:
   clrscr();

	printf("\t--> Database <--\n\n");
   if(head==NULL)
   {
   	printf("\t| (Kosong) |\n");
   	printf("\t< Kembali >");
   	pilih(3,4,4,4,"-->");
   }
	else
   {
   	if(asc==1)
   		play = frst;
   	else
   		play = last;
   	sorting(mode);

   	printf("\t< Sort >\n");
   	printf("\t< Search >--------------------------\n");
   	for(i=1; play!=NULL; i++)
   	{
         if(mode == 1)
      		printf("\t| %d . %s\n", i,play->data->name);
         else if(mode == 2)
      		printf("\t| %d . %s : %d\n", i,play->data->name,play->data->duit);
         else if(mode == 3)
      		printf("\t| %d . %s : %.2f\n", i,play->data->name,play->data->skor);
         else if(mode == 4)
      		printf("\t| %d . %s\n", i,play->data->name);
         else if(mode == 5)
         {
      		printf("\t%d . %s : ", i,play->data->name);
            if(play->data->akses == 2)
            	printf("GM\n");
            else if(play->data->akses == 3)
            	printf("Player\n");
            else
            	printf("Banned\n");
         }
         if(asc==1)
         	play=play->next;
         else
         	play=play->prev;
   	}
   	printf("\t< Kembali >-------------------------\n");
   	n = pilih(3,n,3,4+i,"-->");
      if(n==3)
      {
      	clrscr();
         printf("\t< Sort Berdasarkan >\n\n");
         printf("\t<^Nama^>\n");
         printf("\t<^Uang^>\n");
         printf("\t<^Skor^>\n");
         printf("\t<^Waktu Mendaftar^>\n");
         printf("\t<^Pangkat^>");
         n = pilih(3,3,3,7,"-->");
         if(mode==n-2)
         {
         	if(asc==1)
            	asc=0;
            else
            	asc=1;
         }
         mode = n-2;
         n = 3;
         goto database;
      }
      else if(n==4)
      {
      	search[0]=0;
         while(search[0]==0)
         {
         	gotoxy(27,3);
         	printf("Masukkan String : ");	gets(search);
			}
         searching(search);
       	goto database;
      }
      else if(n>4 && n<4+i)
      {
      	if(asc==1)
         	play = frst;
         else
         	play = last;
      	for(i=1; play!=NULL; i++)
         {
         	if(i==n-4)
            	break;
         	if(asc==1)
            	play = play->next;
            else
            	play = play->prev;
         }
         tampil(play->data);
         goto database;
      }
   }
}

void tampil(player *data)                                                       //tampilkan data
{
	int n;
	clrscr();
   printf("\t\t||==Biodata==||\n\n");
   printf("\t//===================================||\n");
   printf("\t|| Nama     : %s\n", data->name);
   if(current->akses == 1)
   	printf("\t|| Password : %s\n", data->pass);
   printf("\t||===================================||\n");
   printf("\t|| Duit     : %d\n", data->duit);
   printf("\t|| Skor     : %.2f\n", data->skor);
   printf("\t|| Status   : ");
   if(data->akses == 2)
   	printf("GM\n");
   else if(data->akses ==3)
   	printf("Player\n");
   else
   	printf("Banned\n");
   printf("\t\\\\===================================||\n\n");

   if(current->akses == 1)
   {
   	printf("\t< Kembali >\n");
   	printf("\t< Edit >\n");
      if(data->akses == 4)
      {
      	printf("\t< UnBann >\n");
         printf("\t< Hapus >\n");
      	n = pilih(3,12,12,15,"->");
         if(n==13)
      		profiledit(data);
         else if(n==14)
         	data->akses = 3;
         else if(n==15)
         	deluser(data);
      }
      else
      {
      	if(data->akses == 2)
      		printf("\t< Turunkan Menjadi Player >\n");
	      else if(data->akses == 3)
   	   	printf("\t< Angkat Menjadi GM >\n");
      	printf("\t< Bann >\n");
      	printf("\t< Hapus >\n");
      	n = pilih(3,12,12,16,"->");
         if(n==13)
      		profiledit(data);
         else if(n==14)
      	{
         	if(data->akses == 3)
         		data->akses = 2;
         	else
         		data->akses = 3;
      	}
         else if(n==15)
         	data->akses = 4;
         else if(n==16)
         	deluser(data);
      }
   }
   else if(current->akses == 2)
   {
		if(data->akses == 2)
      {
      	printf("\n\t< Kembali >");
         pilih(3,12,12,12,"-->");
      }
   	else if(data->akses == 3)
      {
      	printf("\n\t< Kembali >");
         printf("\n\t< Banned >");
         n = pilih(3,12,12,13,"-->");
         if(n==13)
         	data->akses = 4;
      }
      else if(data->akses == 4)
      {
      	printf("\n\t< Kembali >");
         printf("\n\t< Unbann >");
         n = pilih(3,12,12,13,"-->");
         if(n==13)
         	data->akses = 3;
      }
   }
   else if(current->akses == 3)
   {
   	printf("\n\t< Kembali >");
      pilih(3,12,12,12,"-->");
   }
}

void deluser(player *data)                                                      //hapus data
{
	sorter *help;
   help = frst;

   if(data==head && data==tail)
   {
   	head = NULL;
      tail = NULL;
   	admin->next = head;
   }
	else if(data==head)
   {
   	head = data->next;
      head->prev = NULL;
      data->next = NULL;
      data->prev = NULL;
   	admin->next = head;
   }
   else if(data==tail)
   {
   	tail = data->prev;
      tail->next = NULL;
      data->next = NULL;
      data->prev = NULL;
   }
   else
   {
   	data->next->prev = data->prev;
      data->prev->next = data->next;
      data->next = NULL;
      data->prev = NULL;
   }

   while(help!=NULL)
   {
   	if(help->data == data)
         break;
   	help = help->next;
   }

   if(help==frst && help==last)
   {
   	frst = NULL;
      last = NULL;
   }
   else if(help==frst)
   {
   	frst = help->next;
      frst->prev = NULL;
      help->next = NULL;
      help->prev = NULL;
   }
   else if(help==last)
   {
   	last = help->prev;
      last->next = NULL;
      help->next = NULL;
      help->prev = NULL;
   }
   else
   {
   	help->next->prev = help->prev;
      help->prev->next = help->next;
      help->next = NULL;
      help->prev = NULL;
   }
}

void profiledit(player *data)                                                    //editing data
{
	int n=4;
	player *edit;
   edit = new player;
   *edit = *data;
   adminedit:
	clrscr();
   printf("\t< Editing... />\n\n");
   printf("\t=============================\n");
   printf("\t|| Nama  : %s\n", edit->name);
   printf("\t|| Pass  : %s\n", edit->pass);
   printf("\t|| Duit  = %d\n", edit->duit);
   printf("\t|| Skor  = %.2f\n", edit->skor);
   printf("\t========= <Simpan> ==========\n");
   printf("\t          <Kembali>            ");
   n = pilih(2,n,4,9,"->");
   if(n==4)
   {
   	edit->name[0]=0;
      gotoxy(20,4);	printf("                              ");
   	while(edit->name[0]==0)
   	{
         gotoxy(20,4);	fflush(stdin);	gets(edit->name);
      }
      goto adminedit;
   }
   else if(n==5)
   {
   	edit->pass[0]=0;
   	gotoxy(20,5);	printf("                              ");
      while(edit->pass[0]==0)
   	{
      	gotoxy(20,5);	fflush(stdin);	gets(edit->pass);
      }
      goto adminedit;
   }
   else if(n==6)
   {
   	if(current->akses == 1)
      {
   		gotoxy(20,6);	printf("                              ");
      	gotoxy(20,6);	fflush(stdin);	scanf("%d",&edit->duit);
      }
      goto adminedit;
   }
   else if(n==7)
   {
   	if(current->akses == 1)
      {
      	gotoxy(20,7);	printf("                              ");
      	gotoxy(20,7);	fflush(stdin);	scanf("%f",&edit->skor);
      }
      goto adminedit;
   }
   else if(n==8)
   	*data = *edit;
}

void sorting(int mode)                                                          //sorting
{
	sorter	*sort1, *sort2;
   player	*swap;
   sort1 = sort2 = frst;
   while(sort1!=NULL)
   {
   	sort2 = sort1;
      while(sort2!=NULL)
   	{
      	if(mode==1)
      	{
         	if(strcmp(sort1->data->name, sort2->data->name) > 0)
         	{
            	swap = sort1->data;
	            sort1->data = sort2->data;
   	         sort2->data = swap;
      	   }
         }
         else if(mode==2)
      	{
         	if(sort1->data->duit < sort2->data->duit)
         	{
         		swap = sort1->data;
	            sort1->data = sort2->data;
   	         sort2->data = swap;
      	   }
         }
         else if(mode==3)
      	{
         	if(sort1->data->skor < sort2->data->skor)
         	{
         		swap = sort1->data;
	            sort1->data = sort2->data;
   	         sort2->data = swap;
      	   }
         }
         else if(mode==4)
      	{
         	if(sort1->data > sort2->data)
         	{
         		swap = sort1->data;
	            sort1->data = sort2->data;
   	         sort2->data = swap;
      	   }
         }
         else if(mode==5)
      	{
         	if(sort1->data->akses > sort2->data->akses)
         	{
         		swap = sort1->data;
	            sort1->data = sort2->data;
   	         sort2->data = swap;
      	   }
         }
      	sort2 = sort2->next;
      }
   	sort1 = sort1->next;
   }
}

void searching(char	cari[30])                                                  //searching
{
	int i, j, k, l=0, n;
   int xcari;
   sorter	*play, *flag[999];

	clrscr();
	for(i=0; i<30 && cari[i]!=0; i++);
   xcari = i;
	play = frst;
   while(play!=NULL)
   {
   	for(i=0; i<30-xcari; i++)
      {
      	for(j=0, k=i; cari[j]!=0; j++, k++)
         	if(cari[j] != play->data->name[k])
            	break;
         if(xcari==j)
         {
         	flag[l]=play;
            l++;
            break;
         }
      }
      play = play->next;
   }
   if(l > 0)
   {
   	printf("\tDitemukan %d data\n", l);
   	for(i=0; i<l; i++)
      	printf("\n\t%d. %s", i+1, flag[i]->data->name);
      printf("\n\tKembali");
      n = pilih(3,3,3,3+l,">>");
   	if(n>=3 && n<3+l)
      {
      	tampil(flag[n-3]->data);
      }
   }
   else
   {
   	printf("\n\tData Not Found");
   	getch();
   }
}

void transfer()
{
	player *help;
   char id[30];
   int jumlah;
	clrscr();
   fflush(stdin);
   printf("\t< Masukkan Username yang ingin di transfer : ");	gets(id);
   help = admin;
   while(help!=NULL)
   {
   	if(strcmp(help->name, id) == 0)
      	break;
   	help = help->next;
   }
   if(help==NULL)
   	printf("\n\t< Username Tidak Ditemukan >");
   else if(help == current)
   	printf("\n\t< Tidak Bisa Transfer ke Diri Sendiri >");
   else if(help->akses == 4)
   	printf("\n\t< Akun Sedang Di Banned >");
   else if(help->akses == 2)
   	printf("\n\t< GM Tidak Perlu Di Transfer Karna Sudah Kaya Raya >");
   else if(help->akses == 1)
   	printf("\n\t< Admin Sudah Terlanjur Kaya");
   else if(help->akses == 3)
   {
   	clrscr();
   	printf("\t=============================================\n");
      printf("\t| Tujuan Transfer : %s\n", help->name);
      printf("\t=============================================\n");
      printf("\t| Uang Anda : %d\n", current->duit);
      printf("\t| Uang Dia  : %d\n", help->duit);
      printf("\t| Masukkan Nominal Transfer : \n");
      printf("\t=============================================\n");
      gotoxy(39,5);	fflush(stdin);	scanf("%d", &jumlah);
      if(jumlah > current->duit)
      	printf("\n\n\t==> Uang Anda Tidak Mencukupi");
      else
      {
      	current->duit -= jumlah;
         help->duit += jumlah;
         printf("\n\n\t==> Transaksi Berhasil");
         printf("\n\t==> Sisa Uang : Rp %d", current->duit);
      }
	}
   getch();
}
