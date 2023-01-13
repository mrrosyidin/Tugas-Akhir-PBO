package models;

import java.util.ArrayList;

import entities.CashierTransactionEntity;
import entities.DetailTransactionEntity;
import entities.GunEntity;
import entities.TransactionEntity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Transaction {
    public static ArrayList<TransactionEntity> transaction = new ArrayList<>();

    @Test
    public void test(){
        ArrayList<DetailTransactionEntity> dt = new ArrayList<DetailTransactionEntity>();
        dt.add(new DetailTransactionEntity(new GunEntity("null", "null", 4), 7));
        createTransaction(new CashierTransactionEntity(3, "3", dt));
        createTransaction(new CashierTransactionEntity(1,"2"));
        createTransaction(3, new DetailTransactionEntity(new GunEntity("null", "null", 44), 2000));
        remove_DetailTransaction(0, 0);
        assertEquals("null" ,transaction.get(0).getDetailTransaction().get(0).getItem().getNama());
    }
    
    public static void createTransaction(CashierTransactionEntity newTransaction){
        transaction.add(newTransaction);
    }

    public static void createTransaction(int index, DetailTransactionEntity newDetailTransaction){

        transaction.get(index).getDetailTransaction().add(newDetailTransaction);
    }
 
    // public static void updateTransaction(TransactionEntity transactionEdited){
    //     int index = indexTransaction(transactionEdited.getCode());

    //     try {
    //         transaction.set(index, transactionEdited);
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }

    public static void updateTransaction(int index1, int index2, DetailTransactionEntity newDetailTransaction){
        
        transaction.get(index1).getDetailTransaction().set(index2, newDetailTransaction);
    }

    public static void removeTransaction(int index){

        try {
            transaction.remove(index);
        } catch (Exception e) {
           System.out.println(e);
        }
    }

    public static void remove_DetailTransaction(int index1, int index2){
       
        transaction.get(index1).getDetailTransaction().remove(index2);
    }

    public static ArrayList<TransactionEntity> allTransaction(){
        return transaction;
    }

    public static int getLastCode(){
        try {

            if (transaction.get(transaction.size()-1) != null)
                return transaction.get(transaction.size()-1).getCode();
            
        } catch (Exception e) {
            
        }
        return 0;
    }
}