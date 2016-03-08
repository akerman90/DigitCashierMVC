package digitcashiermvc.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import digitcashiermvc.models.AdminEmployee;
import digitcashiermvc.models.CashierEmployee;

import digitcashiermvc.models.Product;
import digitcashiermvc.views.ViewCashier;
import digitcashiermvc.views.ViewLogin;

public class Controller implements ActionListener {
	
	ViewLogin viewLogin;
	ViewCashier viewCashier;
	CashierEmployee cashierEmployee;
	AdminEmployee adminEmployee;
	ArrayList<Product> product;
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		char[] password = viewLogin.btnLoginClick();
		if (password == cashierEmployee.getPassword()) {
			viewLogin.dispose();
			viewCashier.setVisible(true);
		}
			
		if (password == adminEmployee.getPassword()) {
			viewCashier.dispose();
			viewLogin.setVisible(true);
		}

	}
	
	public void setViewLogin(ViewLogin viewLogin){
		this.viewLogin = viewLogin;
	}
	
	public void setViewCashier(ViewCashier viewCashier){
		this.viewCashier = viewCashier;
	}
	
	
	public void setCashierEmployee(CashierEmployee cashierEmployee) {
		this.cashierEmployee = cashierEmployee;
	}

	public void setAdminEmployee(AdminEmployee adminEmployee) {
		this.adminEmployee = adminEmployee;
	}

	public void addProduct(Product product){
		this.product.add(product);	
	}
	
	
	
}
	
