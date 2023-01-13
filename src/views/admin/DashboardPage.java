package views.admin;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.TransactionController;
import entities.DetailTransactionEntity;
import entities.GunEntity;
import entities.TransactionEntity;
import models.Gun;
import models.Transaction;
import views.Senjata.HapusBarangPage;
import views.Senjata.TambahBarangPage;
import views.Senjata.UpdateBarangPage;
import views.Transaction.HapusTransactionPage;
import views.Transaction.UpdateTransaksiPage;

public class DashboardPage {
    Scanner input = new Scanner(System.in);
    
    public void menu() {
        int pilihMenu = -1;

        do {
            System.out.println("\n========== MANAGEMENT TRANSAKSI ==========");

            System.out.print("""
                    1. Transaksi
                    2. Barang
                    0. Keluar
                    Masukan Menu : """);

            pilihMenu = input.nextInt();
            input.nextLine();

            switchMenu(pilihMenu);

        } while (pilihMenu != 0);
    }

    private void switchMenu(int menu) {
        switch (menu) {
            case 1:
                menuTransaksi();
                break;

            case 2:
                // Pindah View : Langsung Tembak Ke Class View
                menuSenjata();
                break;

            case 0:
                System.out.println("Bye...");
                break;

            default:
                System.out.println("Menu Tidak Valid !");
                break;
        }
    }

    public void menuTransaksi(){
        int pilihmenu;

        do {
            System.out.println();
            System.out.print("""
                    1. Tambah data transaksi
                    2. Update detail transaksi
                    3. Hapus data transaksi
                    4. Tampilkan data transaksi
                    0. Kembali
                    Masukan Menu : """);

            pilihmenu = input.nextInt();
            input.nextLine();

            switchMenuTransaksi(pilihmenu);

        } while (pilihmenu != 0);
    }

    public void switchMenuTransaksi(int menu){
        switch (menu) {
            case 1:
                new TransactionController().tambahTransaction();
                break;

            case 2:
                // Pindah View : Langsung Tembak Ke Class View
                new UpdateTransaksiPage().updateTransaksi();
                break;

            case 3:
                new HapusTransactionPage().hapusTransaction();
                break;

            case 4:
                cetakDataTransaction();
                break;

            case 0:
                System.out.println("Bye...");
                break;

            default:
                System.out.println("Menu Tidak Valid !");
                break;
        }
    }

    public void menuSenjata(){
        int pilihsubmenu;

        do {
            System.out.println();
            System.out.print("""
                    1. Tambah data barang
                    2. Update data barang
                    3. Hapus data barang
                    4. Tampilkan data barang
                    0. Kembali
                    Masukan Menu : """);

            pilihsubmenu = input.nextInt();
            input.nextLine();

            switchMenuSenjata(pilihsubmenu);

        } while (pilihsubmenu != 0);
    }

    public void switchMenuSenjata(int menu){
        switch (menu) {
            case 1:
                new TambahBarangPage().tambahSenjata();
                break;

            case 2:
                // Pindah View : Langsung Tembak Ke Class View
                new UpdateBarangPage().updateBarang();
                break;

            case 3:
                new HapusBarangPage().hapusBarang();
                break;

            case 4:
                cetakDataSenjata();
                break;

            case 0:
                System.out.println("Bye...");
                break;

            default:
                System.out.println("Menu Tidak Valid !");
                break;
        }
    }

    public void cetakDataTransaction(){
        ArrayList<TransactionEntity> transaction = Transaction.allTransaction();

        for (TransactionEntity te : transaction){

            System.out.println();
            System.out.println("=======================================================");
            System.out.println("code : "+te.getCode());
            System.out.println("tanggal : "+te.getDateTime());
            System.out.println("-------------------------------------------------------");
            System.out.println("nama barang \t|jumlah \t|harga \t\t|total");
            for (DetailTransactionEntity dt : te.getDetailTransaction()){
                System.out.println(dt.getItem().getNama()+"\t\t|"+dt.getQuantity()+"\t\t|"+dt.getItem().getHarga()+"\t\t|"+(dt.getQuantity()*dt.getItem().getHarga()));
            }
        }
    }

    public void cetakDataSenjata(){
        ArrayList<GunEntity> senjata = Gun.allGun();
        System.out.println();
        System.out.println("nama senajata \t nomor seri \t harga");
        System.out.println("=======================================================");
        for (GunEntity gun : senjata){
            System.out.println(gun.getNama()+"\t"+gun.getnomorseri()+"\t"+gun.getHarga());
        }
    }
}
