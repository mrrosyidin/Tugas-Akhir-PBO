package entities;

import java.util.ArrayList;

public abstract class AbstarctTransactionEntity {
    protected int code;
    protected String dateTime;
    protected ArrayList<DetailTransactionEntity> detailTransaction = new ArrayList<>();

    public AbstarctTransactionEntity(int code, String dateTime, ArrayList<DetailTransactionEntity> detailTransaction) {
        this.code = code;
        this.dateTime = dateTime;
        this.detailTransaction = detailTransaction;
    }

    public AbstarctTransactionEntity(int code, String dateTime) {
        this.code = code;
        this.dateTime = dateTime;
    }

}
