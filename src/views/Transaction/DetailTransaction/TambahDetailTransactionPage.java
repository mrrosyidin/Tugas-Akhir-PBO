package views.Transaction.DetailTransaction;

import java.util.Scanner;

import controllers.TransactionController;

public class TambahDetailTransactionPage {
    Scanner input = new Scanner(System.in);

    public void tambahDetailTransaction(int code){
        boolean hasil;
        String item = "";
        int jumlah = 0;

        try {
            System.out.print("Masukkan nama barang atau code barang : ");
        item = input.nextLine();
        System.out.print("Masukkan jumlah barang : ");
        jumlah = input.nextInt();
        input.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        

        hasil = new TransactionController().tambahDetailTansaction(code, item, jumlah);
        if (hasil == false)
            System.out.println("data tidak ditemukan");
    }
}
