package views.Senjata;

import java.util.Scanner;

import controllers.GunController;

public class TambahBarangPage {
    Scanner input = new Scanner(System.in);

    public void tambahSenjata(){
        System.out.print("Masukkan nama senjata : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nomor seri senjata : ");
        String nomorseri = input.nextLine();
        System.out.print("Masukkan harga senjata : ");
        int harga = input.nextInt();
        input.nextLine();

        if (new GunController().searchGun(nomorseri) == null)
            new GunController().tambahGun(nama, nomorseri, harga);
        else 
            System.out.println("barang sudah ada");            
    }
}
