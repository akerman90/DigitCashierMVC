package digitcashiermvc.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

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
		if (ae.getActionCommand().equals("Login")) {
			String password = viewLogin.getPasswordFieldPassword();
			
			if (password.equals(cashierEmployee.getPassword()) && viewLogin.getComboBoxSelectedItem().equals("Cashier")) {
				viewLogin.dispose();
				viewCashier.setVisible(true);
			}
			
			if (password.equals(adminEmployee.getPassword()) && viewLogin.getComboBoxSelectedItem().equals("Admin")) {
				viewLogin.dispose();
				viewCashier.setVisible(true);
			}
		}else if (ae.getActionCommand().equals("LogoutCashier")) {
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
	
