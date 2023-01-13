package models;

import java.util.ArrayList;

import entities.CashierTransactionEntity;
import entities.DetailTransactionEntity;
import entities.GunEntity;
import views.admin.DashboardPage;

public class main {
    public static void main(String[]args){
        Transaction tr = new Transaction();
        ArrayList<DetailTransactionEntity> dte = new ArrayList<>();
        dte.add(new DetailTransactionEntity(new GunEntity("null", "null", 0), 1));
        dte.add(new DetailTransactionEntity(new GunEntity("ooryaa", "null", 3000), 9));
        dte.add(new DetailTransactionEntity(new GunEntity("demera", "null", 7000), 4));

        Transaction.createTransaction(new CashierTransactionEntity(1,"2", dte));
        Transaction.createTransaction(new CashierTransactionEntity(2,"3", dte));
        //tr.transaction.get(0).getDetailTransaction().set(0, new DetailTransactionEntity(new GunEntity("api", "null", 7), 7000));
        //System.out.println(tr.indexTransaction(1));
        //System.out.println(tr.indexTransaction(1,"null"));
        //DetailTransactionEntity dt = tr.searchTransaction(1, "demera");
        //System.out.println(dt.getItem().getNama());
        //tr.remove_DetailTransaction(1, "ooryaa");
        //tr.transaction.get(0).getDetailTransaction().remove(1);
        new DashboardPage().cetakDataTransaction();
        System.out.println(tr.transaction.get(0).getDetailTransaction().get(0).getItem().getNama());
    }
}
