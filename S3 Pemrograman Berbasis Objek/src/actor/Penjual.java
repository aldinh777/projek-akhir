package actor;

import error.MenuTidakAdaException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import resource.*;

public class Penjual implements Input{
    private static final String id = "aldi";
    private static final String pass = "modulgundul";
    private static final LinkedList<Barang> stock = new LinkedList<>();
    private static final LinkedList<Request> req_pembeli = new LinkedList<>();
    private static final LinkedList<Request> req_pemasok = new LinkedList<>();
    
    private static void accept(LinkedList<Request> r, int index){
        System.out.println("==================================================");
        if(r.get(index).getUser() instanceof Pembeli){
            r.get(index).getUser().status = Stat.completed;
            System.out.println("Transaksi Selesai");
            r.remove(index);
        }
        else if(r.get(index).getUser() instanceof Pemasok){
            switch (r.get(index).getUser().status) {
                case verifying:
                    r.get(index).getUser().status = Stat.pending;
                    System.out.println("Menunggu Barang Dari Pemasok Terkirim");
                    break;
                case pending:
                    r.get(index).getUser().status = Stat.completed;
                    System.out.println("Transaksi Selesai");
                    addStock(r.get(index).getUser().cart);
                    r.remove(index);
                    break;
            }
        }
    }
    private static void reject(LinkedList<Request> r, int index){
        System.out.println("==================================================");
        System.out.println("Request Telah Ditolak");
        r.get(index).getUser().status = Stat.rejected;
        if(r.get(index).getUser() instanceof Pembeli){
            addStock(r.get(index).getUser().cart);
        }
        r.remove(index);
    }
    private static void addStock(LinkedList<Barang> barangs){
        for (int i = 0; i < barangs.size(); i++) {
            stock.add(barangs.get(i));
        }
    }
    private static void addForSale(Barang barang){
        System.out.println("==================================================");
        Pembeli.forsale.add(barang);
        System.out.println("Barang Tertambah");
    }
    private static void processRequest(LinkedList<Request> r, int index){
        System.out.println("==================================================");
        System.out.println("Nick : "+r.get(index).getUser().nick);
        double price = 0;
        for (int i = 0; i < r.get(index).getUser().cart.size(); i++) {
            price += r.get(index).getUser().cart.get(i).getHarga()*r.get(index).getUser().cart.get(i).getJumlah();
        }
        System.out.println("Total Harga : BTC. "+price);
        System.out.println("Deskripsi : "+r.get(index).getDesc());
        System.out.println("Barang : ");
        for (int i = 0; i < r.get(index).getUser().cart.size(); i++) {
            System.out.println("- "+r.get(index).getUser().cart.get(i));
        }
        System.out.println("1. Accept");
        System.out.println("2. Reject");
        System.out.print("Pilih : ");
        try{
            switch (in.nextInt()) {
                case 1:
                    accept(r, index);
                    break;
                case 2:
                    reject(r, index);
                    break;
                default:
                    throw new MenuTidakAdaException();
            }
        }catch (InputMismatchException ex) {
            System.out.println("Inputan Tidak Jelas");
            in.nextLine();
        }catch (MenuTidakAdaException ex) {
            System.out.println("Menu Tidak Ada");
        }
    }
    private static void listRequest(LinkedList<Request> r){        
        do{
            System.out.println("==================================================");
            if(r.isEmpty()){
                System.out.println("Tidak Ada Request");
                return;
            }
            for (int i = 0; i < r.size(); i++) {
                System.out.println((i+1)+". "+r.get(i));
            }
            try{ 
                System.out.print("Pilih yang ingin diproses : ");   int num = in.nextInt();
                if(num==0)  break;
                else        processRequest(r, num-1);
            }catch (InputMismatchException ex) {
                System.out.println("Inputan Tidak Jelas");
                in.nextLine();
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Pilihan Kelewatan");
            }
        }while(true);
    }
    private static void listStock(){
        do{
            System.out.println("==================================================");
            if(stock.isEmpty()){
                System.out.println("Barang Kosong");
                return;
            }
            for (int i = 0; i < stock.size(); i++) {
                System.out.println((i+1)+". "+stock.get(i));
            }
            try{
                System.out.print("Pilih yang ingin dijual : ");    int num = in.nextInt();
                if(num==0)  break;
                else{
                    addForSale(stock.get(num-1));
                    stock.remove(num-1);
                }
            }catch (InputMismatchException ex) {
                System.out.println("Inputan Tidak Jelas");
                in.nextLine();
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Pilihan Kelewatan");
            }
        }while(true);
    }
    private static void menu(){
        boolean loop = true;
        do{
            System.out.println("==================================================");
            System.out.println("1. Request Pembeli");
            System.out.println("2. Request Pemasok");
            System.out.println("3. Tambah Barang untuk Dijual");
            System.out.print("Pilih : ");
            try{
                switch (in.nextInt()) {
                    case 1:
                        listRequest(req_pembeli);
                        break;
                    case 2:
                        listRequest(req_pemasok);
                        break;
                    case 3:
                        listStock();
                        break;
                    case 0:
                        loop = false;
                        break;
                    default:
                        throw new MenuTidakAdaException();
                }
            }catch (InputMismatchException ex) {
                System.out.println("Inputan Tidak Jelas");
                in.nextLine();
            }catch (MenuTidakAdaException ex) {
                System.out.println("Menu Tidak Ada");
            }
        }while(loop);
    }
    public static void addRequest(Request baru){
        if(baru.getUser() instanceof Pembeli){
            req_pembeli.add(baru);
        }
        else if(baru.getUser() instanceof Pemasok){
            req_pemasok.add(baru);
        }
    }
    public static void login(){
        System.out.println("==================================================");
        in.nextLine();
        System.out.print("Masukkan ID : "); String log_id = in.nextLine();
        System.out.print("Masukkan Pass : ");   String log_pass = in.nextLine();
        if(log_id.equals(Penjual.id)&&log_pass.equals(Penjual.pass))    menu();
        else    System.out.println("ID ATAU PASSWORD SALAH");
    }
}