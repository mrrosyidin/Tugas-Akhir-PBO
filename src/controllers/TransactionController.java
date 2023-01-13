package controllers;

import java.util.ArrayList;

import entities.*;
import models.Transaction;
import utils.*;
import views.Transaction.UpdateTransaksiPage;

public class TransactionController {
    
    public void tambahTransaction(){
        
        String dateTime = LocalDate.now();
        int code = Transaction.getLastCode() + 1;

        Transaction.createTransaction(new CashierTransactionEntity(code, dateTime));

        new UpdateTransaksiPage().updateMenu(code);
    }

    public boolean tambahDetailTansaction(int code, String item, int jumlah){
        GunEntity gun = new GunController().searchGun(item);
        int index = indexTransaction(code);

        try {

            Transaction.createTransaction(index, new DetailTransactionEntity(gun, jumlah));
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
}

    public void updateTransaction(int code, String item, int jumlah){
        GunEntity gun = new GunController().searchGun(item);
        int index = indexTransaction(code);
        int index2 = indexTransaction(code, item);

        Transaction.updateTransaction(index, index2, new DetailTransactionEntity(gun, jumlah));
    }

    public void hapusTransaction(int code){
        int index = indexTransaction(code);

        Transaction.removeTransaction(index);
    }

    public void hapusDetailTransaction(int code, String item){
        int index1 = indexTransaction(code);
        int index2 = indexTransaction(code, item);

        Transaction.remove_DetailTransaction(index1, index2);
    }

    // public DetailTransactionEntity cari(int code, String item){
    //     return Transaction.searchTransaction(code, item);
    // }

    // public TransactionEntity cari(int code){
    //     return Transaction.searchTransaction(code);
    // }

    public TransactionEntity searchTransaction(int code){
        ArrayList<TransactionEntity> transaction = Transaction.allTransaction();

        for (TransactionEntity TransactionEntity : transaction){
            if (TransactionEntity.getCode() == code){
                return TransactionEntity;
            }
        }
        return null;
    }

    public DetailTransactionEntity searchTransaction(int code, String item){
        ArrayList<TransactionEntity> transaction = Transaction.allTransaction();

        for (TransactionEntity transactionEntity : transaction){
            if (transactionEntity.getCode() == code){
                for (DetailTransactionEntity detailTransactionEntity : transactionEntity.getDetailTransaction()){
                    if (detailTransactionEntity.getItem().getNama().equals(item))
                        return detailTransactionEntity;
                    else if (detailTransactionEntity.getItem().getnomorseri().equals(item))
                        return detailTransactionEntity;
                }
            }
            
        }
        return null;
    }

    public int indexTransaction(int code){
        ArrayList<TransactionEntity> transaction = Transaction.allTransaction();

        TransactionEntity searchTransaction = searchTransaction(code);
        return transaction.indexOf(searchTransaction);
    }

    public int indexTransaction(int code, String detailBarang){
        ArrayList<TransactionEntity> transaction = Transaction.allTransaction();
        int index = indexTransaction(code);
        DetailTransactionEntity searchDetailTransaction = searchTransaction(code, detailBarang);

        return transaction.get(index).getDetailTransaction().indexOf(searchDetailTransaction);
    }
}