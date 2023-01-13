package views.Senjata;

import java.util.Scanner;

import controllers.GunController;

public class HapusBarangPage {
    Scanner input = new Scanner(System.in);
    
    public void hapusBarang(){
        System.out.print("Masukkan nama atau nomor seri senjata yang akan dihapus : ");
        String item = input.nextLine();

        if (new GunController().searchGun(item) != null)
            new GunController().hapusGun(item);
        else
            System.out.println("nama atau nomor seri tidak ada");
    }
}
