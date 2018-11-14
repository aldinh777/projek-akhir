package mainclass;

import resource.Input;
import actor.*;
import error.MenuTidakAdaException;
import java.util.InputMismatchException;

public class Utama implements Input{
    public static void main(String[] args) {
        System.out.println("Perdagangan Black Market!!!");
        boolean loop = true;
        do {
            System.out.println("==================================================");
            System.out.println("1. Pembeli");
            System.out.println("2. Pemasok");
            System.out.println("3. Penjual");
            System.out.print("Pilih : ");
            try{
                switch (in.nextInt()) {
                    case 1:
                        Pembeli.menu();
                        break;
                    case 2:
                        Pemasok.menu();
                        break;
                    case 3:
                        Penjual.login();
                        break;
                    case 0:
                        loop = false;
                        break;
                    default:
                        throw new MenuTidakAdaException();
                }
            }catch (InputMismatchException ex) {
                System.out.println("Error Saat Pemilihan di Menu Utama");
                in.nextLine();
            }catch (MenuTidakAdaException ex) {
                System.out.println("Menu Tidak Ada");
            }
        } while (loop);
    }
}
