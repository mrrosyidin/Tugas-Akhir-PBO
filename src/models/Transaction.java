package models;

import java.util.ArrayList;

import entities.DetailTransactionEntity;
import entities.TransactionEntity;

public class Transaction {
    public static ArrayList<TransactionEntity> transaction = new ArrayList<>();

    public static void createTransaction(TransactionEntity newTransaction){
        transaction.add(newTransaction);

    }

    public static void createTransaction(int code, DetailTransactionEntity newListTransaction){
        int index = indexTransaction(code);
        transaction.get(index).listTransaction.add(newListTransaction);
    }
 
    // public static void updateTransaction(TransactionEntity transactionEdited){
    //     int index = indexTransaction(transactionEdited.getCode());

    //     try {
    //         transaction.set(index, transactionEdited);
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }

    public static void updateTransaction(int code, DetailTransactionEntity newDetailTransaction){
        int index = indexTransaction(code);
        int index2 = indexTransaction(index, newDetailTransaction.getItem());
        transaction.get(index).listTransaction.set(index2, newDetailTransaction);
    }

    public static void removeTransaction(int code){
        int index = indexTransaction(code);

        try {
            transaction.remove(index);
        } catch (Exception e) {
           System.out.println(e);
        }
    }

    public static void remove_DetailTransaction(int code, String detailBarang){
        int index = indexTransaction(getLastCode(), detailBarang);
        int index2 = indexTransaction(index, detailBarang);
        transaction.get(index).listTransaction.remove(index2);
    }

    public static TransactionEntity searchTransaction(int code){
        for (TransactionEntity TransactionEntity : transaction){
            if (TransactionEntity.getCode() == code){
                return TransactionEntity;
            }
        }
        return null;
    }

    public static DetailTransactionEntity searchTransaction(int code, String detailBarang){
        for (TransactionEntity transactionEntity : transaction){
            if (transactionEntity.getCode() == code){
                for (DetailTransactionEntity detailTransactionEntity : transactionEntity.listTransaction){
                    if (detailTransactionEntity.getItem().equals(detailBarang))
                        return detailTransactionEntity;
                }
            }
            
        }
        return null;
    }

    public static int indexTransaction(int code){
        TransactionEntity searchTransaction = searchTransaction(code);
        return transaction.indexOf(searchTransaction);
    }

    public static int indexTransaction(int code, String detailBarang){
        DetailTransactionEntity searchDetailTransaction = searchTransaction(code, detailBarang);
        return transaction.get(code).listTransaction.indexOf(searchDetailTransaction);
    }

    public static ArrayList<TransactionEntity> allTransaction(){
        return transaction;
    }

    public static int getLastCode(){
        if (transaction.get(transaction.size()-1) != null){
            return transaction.get(transaction.size()-1).getCode();
        }
        else{
            return 0;
        }
    }
}