import models.Admin;
import views.LoginPage;

public class App {

    public static void initial(){
        Admin.initial();
    }
    public static void main(String[] args) throws Exception {
        LoginPage lp = new LoginPage();
        initial();
        lp.formLogin();
    }
}
