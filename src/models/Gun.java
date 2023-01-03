package models;

import java.util.ArrayList;

import entities.GunEntity;

public class Gun {
    private static ArrayList<GunEntity> gun = new ArrayList<>();

    public static void createGun(GunEntity gunBaru){
        gun.add(gunBaru);
    }

    public static void updateGun(GunEntity gunEdited){
        int index = indexGun(gunEdited.getnomorseri());

        try {
            gun.set(index, gunEdited);
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    public static void removeGun(String find){
        int index = indexGun(find);

        try {
            gun.remove(index);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static GunEntity searchGun(String find){
        for (GunEntity gunEntity : gun){
            if(gunEntity.getnomorseri().equals(find))
                return gunEntity;
            else if (gunEntity.getNama().equals(find))
                return gunEntity;
        }
        return null;
    }

    public static int indexGun(String find){
        GunEntity searchgun = searchGun(find);
        return gun.indexOf(searchgun);
    }

    public static ArrayList<GunEntity> allGun(){
        return gun;
    }
}
