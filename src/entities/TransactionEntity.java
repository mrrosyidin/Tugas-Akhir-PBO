package entities;

import java.util.ArrayList;

public class TransactionEntity {
    private int code;
    private String dateTime;
    
    public ArrayList<DetailTransactionEntity> listTransaction = new ArrayList<>();

    public TransactionEntity(int code, String dateTime, ArrayList<DetailTransactionEntity> listTransaction) {
        this.code = code;
        this.dateTime = dateTime;
        this.listTransaction = listTransaction;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public ArrayList<DetailTransactionEntity> getListTransaction() {
        return this.listTransaction;
    }

    public void setListTransaction(ArrayList<DetailTransactionEntity> listTransaction) {
        this.listTransaction = listTransaction;
    }  
}
