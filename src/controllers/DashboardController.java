package controllers;

import views.admin.DashboardPage;

public class DashboardController {

    
    
    public void toView() {
        DashboardPage dashboardPage = new DashboardPage();

        dashboardPage.menu();
    }
}
