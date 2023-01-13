package controllers;

import entities.AdminEntity;
import models.Admin;

public class AdminController {

    public boolean loginProccess(String username, String password){
        AdminEntity admin = Admin.searchUsername(username);

        if (admin != null){
            if (admin.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
