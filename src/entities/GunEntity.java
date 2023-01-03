package entities;

public class GunEntity extends InfantryArmEntity{
    private String feed;
    private String caliber;
    private String klasifikasi;

    public GunEntity(String nama, String nomorseri, int harga, String feed, String caliber, String klasifikasi) {
        super(nama, nomorseri, harga);
        this.feed = feed;
        this.caliber = caliber;
        this.klasifikasi = klasifikasi;
    }

    public String getFeed() {
        return this.feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getCaliber() {
        return this.caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public String getKlasifikasi() {
        return this.klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }
}
