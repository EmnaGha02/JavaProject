package Wlc;

import java.awt.EventQueue;


import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import EspaceAdmin.Admin;

import Login_Sys.login_S;
import UserRegisration.DefineUser;
import UserRegisration.RegisterPatient;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcoming {

	private JFrame frame;

	/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				welcoming window = new welcoming();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}


/**
 * Create the application.
 */
public welcoming() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.setBounds(300, 300, 600, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblWelcomeToOur = new JLabel("         welcome to our Hospital ");
	lblWelcomeToOur.setBounds(178, 12, 238, 41);
	frame.getContentPane().add(lblWelcomeToOur);
	
	JButton btnLogin = new JButton("Login ");
	btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			login_S jf = new login_S();
			login_S.main(null);
			
			
			
			
		}
	});
	btnLogin.setBounds(47, 134, 117, 25);
	frame.getContentPane().add(btnLogin);
	
	JButton btnRegister = new JButton("Register");
	btnRegister.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			DefineUser jf = new DefineUser();
			DefineUser.main(null);
			
			
		}
	});
	btnRegister.setBounds(227, 134, 117, 25);
	frame.getContentPane().add(btnRegister);
	
	JButton btncancel = new JButton("cancel");
	btncancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			JFrame frmLoginSystem = new JFrame("exit") ;
			if( JOptionPane.showConfirmDialog(frmLoginSystem , "Confirm if you want to exit" , "Login Systems " , 
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
			}
		});
		btncancel.setBounds(411, 134, 117, 25);
		frame.getContentPane().add(btncancel);
	}
}
