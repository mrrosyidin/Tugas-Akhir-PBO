package controllers;

import entities.GunEntity;
import entities.DetailTransactionEntity;
import entities.TransactionEntity;
import models.Transaction;
import utils.*;
import views.Transaction.TambahListData;
import models.Gun;

public class TransactionController {
    
    public void tambahTransaction(){
        TambahListData tld = new TambahListData();

        String dateTime = LocalDate.now();
        int code = Transaction.getLastCode() + 1;

        Transaction.createTransaction(new TransactionEntity(code, dateTime, null));

        tld.tambahList(code);
    }

    public void tambahDetailTansaction(int code, String item, int jumlah){
        GunEntity gun = Gun.searchGun(item);

        Transaction.createTransaction(code, new DetailTransactionEntity(gun.getNama(), jumlah, gun.getHarga()));
    }

    public void updateTransaction(int code, String item, int jumlah){
        GunEntity gun = Gun.searchGun(item);
        Transaction.updateTransaction(code, new DetailTransactionEntity(item, jumlah, gun.getHarga()));
    }

    public void hapusTransaction(int code){
        Transaction.removeTransaction(code);
    }

    public void hapus_DetailTransaction(int code, String item){
        Transaction.remove_DetailTransaction(code, item);
    }

    public DetailTransactionEntity cari(int code, String item){
        return Transaction.searchTransaction(code, item);
    }
}