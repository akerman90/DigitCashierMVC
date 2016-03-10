package digitcashiermvc.controllers;

import digitcashiermvc.models.AdminEmployee;
import digitcashiermvc.models.CashierEmployee;

import digitcashiermvc.views.ViewCashier;
import digitcashiermvc.views.ViewLogin;

public class App {

	public static void main(String[] args) {
		Controller controller = new Controller();
		ViewLogin viewLogin = new ViewLogin(controller);
		ViewCashier viewCashier = new ViewCashier(controller);
		CashierEmployee cashierEmployee = new CashierEmployee("234");
		AdminEmployee adminEmployee = new AdminEmployee("345");
		controller.setAdminEmployee(adminEmployee);
		controller.setCashierEmployee(cashierEmployee);
		
		
		controller.setViewLogin(viewLogin);
		controller.setViewCashier(viewCashier);

	}

}
