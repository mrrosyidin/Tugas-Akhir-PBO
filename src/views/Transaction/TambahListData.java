package views.Transaction;
import java.util.Scanner;

public class TambahListData {
    Scanner input = new Scanner(System.in);
    public void tambahList(int code){
        String loop;

        do{
            System.out.print("Masukkan nama barang atau code barang : ");
            System.out.print("Masukkan jumlah barang : ");


            System.out.print("Apakah ingin menambah list lagi (y/n)? ");
            loop = input.next(); 
        }while(loop == "y" || loop == "Y");

    }
}
