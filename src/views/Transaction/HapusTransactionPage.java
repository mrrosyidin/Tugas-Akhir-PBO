package views.Transaction;

import java.util.Scanner;

import controllers.TransactionController;

public class HapusTransactionPage {
    Scanner input = new Scanner(System.in);
    public void hapusTransaction(){
        System.out.print("Masukkan code transaksi yang akan diahapus : ");
        int code = input.nextInt();
        input.nextLine();

        if (new TransactionController().searchTransaction(code) != null)
            new TransactionController().hapusTransaction(code);
        else
            System.out.println("Data tidak ditemukan");
    }
}
