package views.Transaction.DetailTransaction;

import java.util.Scanner;

public class TambahDetailTransactionPage {
    Scanner input = new Scanner(System.in);

    public void tambahDetailTransaction(int code){
        String loop;

        do{
            System.out.print("Masukkan nama barang atau code barang : ");
            System.out.print("Masukkan jumlah barang : ");


            System.out.print("Apakah ingin menambah list lagi (y/n)? ");
            loop = input.next(); 
            input.nextLine();
        }while(loop == "y" || loop == "Y");
    }
}
