package views.Senjata;

import java.util.Scanner;

import controllers.GunController;

public class UpdateBarangPage {
    Scanner input = new Scanner(System.in);
    
    public void updateBarang(){
        System.out.print("Masukkan nama atau nomor seri senjata yang akan diedit : ");
        String item = input.nextLine();

        if (new GunController().searchGun(item) != null)
            inputBarang(item);
        else
            System.out.println("nama atau nomor seri barang tidak ada");
    }

    public void inputBarang(String item){
        System.out.print("Masukkan nama senjata : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor seri senjata : ");
        String nomorseri = input.nextLine();
        System.out.print("Masukkan harga senjata : ");
        int harga = input.nextInt();
        input.nextLine();

        new GunController().updateGun(item, nama, nomorseri, harga);
    }
}
