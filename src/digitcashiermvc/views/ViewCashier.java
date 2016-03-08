package digitcashiermvc.views;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class ViewCashier extends JFrame{
	
	public ViewCashier(ActionListener controller) {
		getContentPane().setLayout(null);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogout.setBounds(342, 13, 111, 33);
		btnLogout.setActionCommand("LogoutCashier");
		btnLogout.addActionListener(controller);
		getContentPane().add(btnLogout);
		
		setTitle("Login");
		setSize(498, 330);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
}
