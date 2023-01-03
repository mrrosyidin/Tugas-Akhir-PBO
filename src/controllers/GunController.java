package controllers;

import entities.GunEntity;
import models.Gun;

public class GunController {
    public void tambahGun(String nama, String nomorseri, int harga, String feed, String caliber, String klasifikasi){
        if (Gun.searchGun(nomorseri) == null){
            GunEntity gun = new GunEntity(nama, nomorseri, harga, feed, caliber, klasifikasi);
            Gun.createGun(gun);
        }
    }

    public void updateGun(String nama, String nomorseri, int harga, String feed, String caliber, String klasifikasi){
        GunEntity gun = new GunEntity(nama, nomorseri, harga, feed, caliber, klasifikasi);
        Gun.updateGun(gun);
    }

    public void hapusGun(String find){
        Gun.removeGun(find);
    }
}
