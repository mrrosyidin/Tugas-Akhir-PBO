package views.Transaction.DetailTransaction;

import java.util.Scanner;

import controllers.TransactionController;

public class hapusDetailTransactioPage {
    Scanner input = new Scanner(System.in);

    public void hapusDetailTransaction(int code){
        System.out.println("Masukkan nama atau nomorseri barang : ");
        String item = input.nextLine();

        if (new TransactionController().searchTransaction(code, item) != null)
            new TransactionController().hapusDetailTransaction(code, item);
        else
            System.out.println("nama atau nomor seri barang tidak ditemukan");
    }
}
