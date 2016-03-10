package digitcashiermvc.views;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import javafx.scene.control.ComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;

public class ViewLogin extends JFrame implements Observer{
	private JPasswordField passwordField;
	private JComboBox comboBox;
	public ViewLogin() {
		
		
	}
	
	public ViewLogin(ActionListener controller){
		
		getContentPane().setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUser.setBounds(12, 13, 103, 23);
		getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(12, 49, 103, 22);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 49, 83, 22);
		getContentPane().add(passwordField);
		
		comboBox = new JComboBox(new String[]{"Cashier","Admin","Boss"});
		comboBox.setBounds(127, 13, 83, 22);
		getContentPane().add(comboBox);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(61, 84, 103, 33);
		getContentPane().add(btnLogin);
		btnLogin.setActionCommand("Login");
		btnLogin.addActionListener(controller);
		
		setTitle("Login");
		setSize(250, 190);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public String getPasswordFieldPassword(){
		char[] password = passwordField.getPassword();
		String stringPassword = new String(password);
		return stringPassword;
	}
	
	public String getComboBoxSelectedItem(){
		return (String) comboBox.getSelectedItem();
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
