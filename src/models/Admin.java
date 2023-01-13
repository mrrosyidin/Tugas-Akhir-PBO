package models;

import java.util.ArrayList;

import entities.AdminEntity;

public class Admin {
    public static ArrayList<AdminEntity> admin = new ArrayList<>();

    public static AdminEntity searchUsername(String username){
        for (AdminEntity adminEntity : admin){
            if (adminEntity.getUsername().equals(username)){
                return adminEntity;
            }
        }
        return null;
    }

    public static void initial(){

        admin.add(new AdminEntity("admin", "admin", "admin"));
    }
}
