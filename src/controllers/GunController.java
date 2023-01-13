package controllers;

import java.util.ArrayList;

import entities.GunEntity;
import models.Gun;

public class GunController {
    public void tambahGun(String nama, String nomorseri, int harga){
        if (searchGun(nomorseri) == null){
            GunEntity gun = new GunEntity(nama, nomorseri, harga);
            Gun.createGun(gun);
        }
    }

    public void updateGun(String item, String nama, String nomorseri, int harga){
        int index = indexGun(item);
        
        Gun.updateGun(index, new GunEntity(nama, nomorseri, harga));
    }

    public void hapusGun(String find){
        int index = indexGun(find);

        Gun.removeGun(index);
    }

    public GunEntity searchGun(String find){
        ArrayList<GunEntity> gun = Gun.allGun();

        for (GunEntity gunEntity : gun){
            if(gunEntity.getnomorseri().equals(find))
                return gunEntity;
            else if (gunEntity.getNama().equals(find))
                return gunEntity;
        }
        return null;
    }

    public int indexGun(String find){
        ArrayList<GunEntity> gun = Gun.allGun();

        GunEntity searchgun = searchGun(find);
        return gun.indexOf(searchgun);
    }
}
