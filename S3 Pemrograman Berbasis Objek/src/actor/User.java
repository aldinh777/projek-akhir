package actor;

import java.util.InputMismatchException;
import java.util.LinkedList;
import resource.*;

public abstract class User implements Input{
    protected int id;
    protected String nick;
    protected LinkedList<Barang> cart;
    protected Stat status;
    
    public static int user_counter = 0;
    
    public User(){
        user_counter++;
        cart = new LinkedList<>();
        status = Stat.none;
    }
    public String getNick(){
        return nick;
    }
    public Stat getStatus(){
        return status;
    }
    public LinkedList<Barang> getCart(){
        return cart;
    }
    protected void addCart(Barang tambah){
        cart.add(tambah);
    }
    protected void remCart(int index){
        cart.remove(index);
    }
    protected void myList() {
        do{
            System.out.println("==================================================");
            if(cart.isEmpty()){
                System.out.println("Anda tidak memiliki/menambah sesuatu");
                return;
            }
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i+1)+". "+cart.get(i).getNama()+" : "+cart.get(i).getHarga()+" ("+cart.get(i).getJumlah()+")");
            }
            try{
                System.out.print("Pilih yang ingin dihapus : ");    int num = in.nextInt();
                if(num==0)  break;
                else if (this instanceof Pembeli) {
                    Pembeli.forsale.add(cart.get(num-1));
                    cart.remove(num-1);
                }
                else        remCart(num-1);
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("Pilihan Kelewatan");
            }catch (InputMismatchException ex) {
                System.out.println("Inputan Tidak Jelas");
                in.nextLine();
            }
        }while(true);
    }
    protected abstract void verify();
}