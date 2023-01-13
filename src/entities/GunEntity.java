package entities;

public class GunEntity {
    protected String nama;
    protected String nomorseri;
    protected int harga;

    public GunEntity(String nama, String nomorseri, int harga) {
        this.nama = nama;
        this.nomorseri = nomorseri;
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getnomorseri() {
        return this.nomorseri;
    }

    public void setnomorseri(String nomorseri) {
        this.nomorseri = nomorseri;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
