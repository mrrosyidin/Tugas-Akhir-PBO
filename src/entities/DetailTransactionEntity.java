package entities;

public class DetailTransactionEntity {
    private GunEntity item;
    private int quantity;

    public DetailTransactionEntity(GunEntity item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public GunEntity getItem() {
        return this.item;
    }

    public void setItem(GunEntity item) {
        this.item = item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
