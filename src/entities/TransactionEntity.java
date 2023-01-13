package entities;

import java.util.ArrayList;

public interface TransactionEntity {
    
    public int getCode();
    public void setCode(int code);
    public String getDateTime();
    public void setDateTime(String dateTime);
    public ArrayList<DetailTransactionEntity> getDetailTransaction();
    public void setDetailTransaction(ArrayList<DetailTransactionEntity> detailTransaction);
}
