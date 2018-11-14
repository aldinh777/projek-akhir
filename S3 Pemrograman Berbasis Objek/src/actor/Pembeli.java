package actor;

import error.MenuTidakAdaException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import resource.*;

public class Pembeli extends User{

    public static int counter = 0;
    public static Pembeli log = null;
    public static LinkedList<Barang> forsale = new LinkedList<>();

    public Pembeli(String nick){
        this.nick = nick;
        this.id = ++counter;
    }
    @Override
    public void verify() {
        in.nextLine();
        if(cart.isEmpty()){
            System.out.println("Anda Belum Menambah Barang Apapun");
            return;
        }
        System.out.print("Kapan, Dimana, dan Bagaimana barang akan dikirim : ");  String desc = in.nextLine();
        System.out.print("Masukkan bitcoin address anda : ");   String btc = in.nextLine();
        Penjual.addRequest(new Request(this, desc, btc));
        status = Stat.verifying;
    }
    private void listOnSale() {
        do{
            System.out.println("==================================================");
            if(forsale.isEmpty()){
                System.out.println("Tidak ada yang bisa dibeli");
                return;
            }
            for (int i = 0; i < forsale.size(); i++) {
                System.out.println((i+1)+". "+forsale.get(i));
            }
            try{
                System.out.print("Pilih barang yang ingin dibeli : ");  int index = in.nextInt();
                if(index==0){
                    break;
                }
                addCart(forsale.get(index-1));
                forsale.remove(index-1);
            }catch (InputMismatchException ex) {
                System.out.println("Inputan Tidak Jelas");
                in.nextLine();
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Pilihan Kelewatan");
            }
        }while(true);
    }
    public static void menu() {
        boolean loop = true;
        if(log == null){
            in.nextLine();
            System.out.print("Masukkan Nickname : ");
            log = new Pembeli(in.nextLine());
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
                                log.listOnSale();
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
                                double price = 0;
                                for (int i = 0; i < log.cart.size(); i++){
                                    price += log.cart.get(i).getHarga()*log.cart.get(i).getJumlah();
                                }
                                System.out.println("Silahkan Kirim Sebanyak BTC "+price+" ke address 1c2t11iaiv965iahvc6");
                                break;
                            case completed:
                                System.out.println("Permintaan sudah di verifikasi. Barang akan dikirim sesegera mungkin");
                                break;
                            case rejected:
                                System.out.println("Permintaan pembelian anda kami tolak");
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
                                System.out.println("Inputan tidak ada di list");
                        }
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