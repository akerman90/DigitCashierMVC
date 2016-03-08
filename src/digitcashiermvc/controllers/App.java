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
		
		
		controller.setViewLogin(viewLogin);
		controller.setViewCashier(viewCashier);
		CashierEmployee cashierEmployee = new CashierEmployee(new char[]{2,3,4});
		AdminEmployee adminEmployee = new AdminEmployee(new char[]{2,3,4});
		controller.setAdminEmployee(adminEmployee);
		controller.setCashierEmployee(cashierEmployee);

	}

}
