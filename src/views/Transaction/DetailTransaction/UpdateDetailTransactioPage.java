package views.Transaction.DetailTransaction;

import java.util.Scanner;

import controllers.TransactionController;

public class UpdateDetailTransactioPage {
    Scanner input = new Scanner(System.in);

    public void updateDetailTransaction(int code){
        System.out.print("Masukkan nama atau nomor seri barang yang akan di update: ");
        String item = input.nextLine();

        if (new TransactionController().searchTransaction(code, item) != null)
            inputDetailTransaction(code, item);
        else
            System.out.println("nama atau nomor seri tidak ditemukan");
    }

    public void inputDetailTransaction(int code, String item){
        System.out.print("Masukkan jumlah barang : ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        new TransactionController().updateTransaction(code, item, jumlah);
    }
}
