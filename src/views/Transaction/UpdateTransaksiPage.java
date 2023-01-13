package views.Transaction;

import java.util.Scanner;

import controllers.TransactionController;
import entities.DetailTransactionEntity;
import entities.TransactionEntity;
import views.Transaction.DetailTransaction.TambahDetailTransactionPage;
import views.Transaction.DetailTransaction.UpdateDetailTransactioPage;
import views.Transaction.DetailTransaction.hapusDetailTransactioPage;

public class UpdateTransaksiPage{
    Scanner input = new Scanner(System.in);

    public void updateTransaksi(){
        System.out.println("Masukkan code transaksi yang akan diupdate : ");
        int code = input.nextInt();
        input.nextLine();

        if (new TransactionController().searchTransaction(code) != null)
            updateMenu(code);
        else
            System.out.println("code transaksi tidak ditemukan");
    }

    public void updateMenu(int code){
        int pilihmenu;
        TransactionEntity transaction = new TransactionController().searchTransaction(code);
        if (transaction == null)
            System.out.println("fu");
        do{
            System.out.println();
            System.out.println("\n===================================================");
            System.out.println("Code Transaksi      : "+transaction.getCode());
            System.out.println("Tanggal transaksi   : "+transaction.getDateTime());
            System.out.println("---------------------------------------------------");
            System.out.println("nama barang \t|jumlah \t|harga");
            for (DetailTransactionEntity dt : transaction.getDetailTransaction()){
                System.out.println(dt.getItem().getNama()+"\t\t|"+dt.getQuantity()+"\t\t|"+dt.getItem().getHarga());
            }
            System.out.println("---------------------------------------------------");
            System.out.print("""
                    1. Tambah data
                    2. Update data
                    3. Hapus data
                    0. Kembali
                    Masukan Menu : """);

            pilihmenu = input.nextInt();
            input.nextLine();

            switchUpdateMenu(code, pilihmenu);

        } while (pilihmenu != 0);
    }

    public void switchUpdateMenu(int code,int menu){
        switch (menu) {
            case 1:
                new TambahDetailTransactionPage().tambahDetailTransaction(code);;
                break;

            case 2:
                new UpdateDetailTransactioPage().updateDetailTransaction(code);
                break;

            case 3:
                new hapusDetailTransactioPage().hapusDetailTransaction(code);
                break;

            case 0:
                System.out.println("Bye...");
                break;

            default:
                System.out.println("Menu Tidak Valid !");
                break;
        }
    }
}