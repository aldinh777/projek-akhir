package actor;

import error.*;
import java.util.InputMismatchException;
import resource.*;

public class Pemasok extends User{
    public static int counter = 0;
    public static Pemasok log = null;
    
    public Pemasok(String nick){
      this.nick = nick;
      this.id = ++counter;
    }
    public void addCart(){
        System.out.println("==================================================");
        in.nextLine();
        System.out.print("Masukkan Nama Barang: "); String name = in.nextLine();
        int jumlah;
        double harga;
        boolean loop = true;
        do{
            jumlah = 0; harga = 0;
            try{
                System.out.print("Masukkan Jumlah Barang : "); jumlah = in.nextInt();
                if(jumlah<0){
                    throw new BarangKokMinusException();
                }else if (jumlah==0) {
                    throw new BarangKokKosongException();
                }
                System.out.print("Masukkan Harga per Barang : BTC. "); harga = in.nextDouble();
                if (harga<0) {
                    throw new HargaMinusException();
                }
                else if(harga==0){
                    throw new HargaTakAdaException();
                }
            }catch (InputMismatchException ex) {
                System.out.println("Harap Masukkan Dengan Benar");
                in.nextLine();
                continue;
            }catch (BarangKokMinusException ex) {
                System.out.println("Tolong Jumlah barangnya ditambah");
                return;
            }catch (BarangKokKosongException ex) {
                System.out.println("Kalo Kosong, Apa yang mau dijual");
                return;
            }catch (HargaMinusException ex) {
                System.out.println("Harganya tolong dinaikan");
                return;
            }catch (HargaTakAdaException ex) {
                System.out.println("Kami tidak menerima barang yang tak berharga");
                return;
            }
            loop = false;
        }while(loop);

        addCart(new Barang(this, name, jumlah, harga));
        System.out.println("Barang "+name+" Sebanyak "+jumlah+" Dengan Harga per Barang BTC. "+harga+" Telah Tertambah ke Daftar Jual");
    }
    @Override
    public void verify() {
        System.out.println("==================================================");
        if (cart.isEmpty()) {
            System.out.println("Anda Belum Menambah Barang Apapun");
            return;
        }
        in.nextLine();
        System.out.print("Kapan, Dimana, dan Bagaimana barang akan anda kirim : ");  String desc = in.nextLine();
        System.out.print("Masukkan bitcoin address anda : ");   String btc = in.nextLine();
        Penjual.addRequest(new Request(this, desc, btc));
        status = Stat.verifying;
    }
    public static void menu(){
        boolean loop = true;
        if(log == null){
            System.out.print("Masukkan Nickname : ");
            in.nextLine();
            log = new Pemasok(in.nextLine());
        }
        do {
            try{
                System.out.println("==================================================");
                switch (log.status) {
                    case none:
                        System.out.println("Hai "+log.nick);
                        System.out.println("1. Tambah List");
                        System.out.println("2. Hapus List");
                        System.out.println("3. Verifikasi");
                        System.out.println("4. Log Out");
                        System.out.print("Pilih : ");
                        switch (in.nextInt()) {
                            case 1:
                                log.addCart();
                                break;
                            case 2:
                                log.myList();
                                break;
                            case 3:
                                log.verify();
                                break;
                            case 4:
                                log = null;
                            case 0:
                                loop = false;
                                break;
                            default:
                                throw new MenuTidakAdaException();
                        }
                        break;
                    default:
                        switch (log.status) {
                            case verifying:        
                                System.out.println("Silahkan Tunggu Konfirmasi Dari Kami");
                                break;
                            case pending:
                                System.out.println("Barang sudah boleh dikirimkan kemari");
                                break;
                            case completed:
                                System.out.println("Pengiriman selesai. Uang akan ditransfer ke bitcoin address anda");
                                break;
                            case rejected:
                                System.out.println("Barang yang anda tawarkan kami tolak");
                                break;
                        }
                        System.out.println("1. Log Out");
                        System.out.print("Pilih : ");
                        switch (in.nextInt()) {
                            case 1:
                                log = null;
                            case 0:
                                loop = false;
                                break;
                            default:
                                throw new MenuTidakAdaException();
                        }
                        break;
                }
            }catch (InputMismatchException ex) {
                System.out.println("Inputan Tidak Jelas");
                in.nextLine();
            }catch (MenuTidakAdaException ex) {
                System.out.println("Menu Tidak Ada");
            }
        } while (loop);    
    }
}