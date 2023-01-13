package models;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import entities.GunEntity;

import org.junit.Test;

public class Gun {
    private static ArrayList<GunEntity> gun = new ArrayList<>();

    @Test
    public void test2(){
        createGun(new GunEntity("AK47", "928hrd", 70000));
        createGun(new GunEntity("AWM", "92834hd", 90000));
        updateGun(0,new GunEntity("M14", "928hrd", 50000));
        removeGun(0);
        assertEquals("AWM", gun.get(0).getNama());
    }

    public static void createGun(GunEntity gunBaru){
        gun.add(gunBaru);
    }

    public static void updateGun(int index, GunEntity gunEdited){

        try {
            gun.set(index, gunEdited);
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    public static void removeGun(int index){

        try {
            gun.remove(index);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ArrayList<GunEntity> allGun(){
        return gun;
    }
}
