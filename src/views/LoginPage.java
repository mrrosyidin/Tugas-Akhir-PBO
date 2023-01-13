package views;

import java.util.Scanner;

import controllers.AdminController;
import controllers.DashboardController;

public class LoginPage {
    Scanner input = new Scanner(System.in);
    AdminController _loginC = new AdminController();

    public void formLogin() {
        while (true) {
            String username, password;
            
            System.out.println("----- LOGIN ADMIN -----");
            System.out.print("Masukan Username: ");
            username = input.nextLine();

            System.out.print("Masukan Password: ");
            password = input.nextLine();

            boolean status = _loginC.loginProccess(username, password);

            if (status) {
               
                new DashboardController().toView();

            } else {
                System.out.println("Username atau Password SALAH !");
                System.out.println();
            }
        }
    }
}
