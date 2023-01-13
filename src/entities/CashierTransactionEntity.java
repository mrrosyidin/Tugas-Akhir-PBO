package entities;

import java.util.ArrayList;

public class CashierTransactionEntity extends AbstarctTransactionEntity implements TransactionEntity{
    public CashierTransactionEntity(int code, String dateTime, ArrayList<DetailTransactionEntity> detailTransaction) {
        super(code,dateTime,detailTransaction);
    }

    public CashierTransactionEntity(int code, String dateTime) {
        super(code,dateTime);
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

    public ArrayList<DetailTransactionEntity> getDetailTransaction() {
        return this.detailTransaction;
    }

    public void setDetailTransaction(ArrayList<DetailTransactionEntity> detailTransaction){
        this.detailTransaction = detailTransaction;
    }
}