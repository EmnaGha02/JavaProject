package Login_Sys;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

//import  com.mysql.cj.protocol.Resultset;

import EsapcePatient.Patient;
import EspaceAdmin.Admin;
import EspaceMedecin.Doctor;
import UserRegisration.RegisterPatient;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

import java.sql.*;

public class login_S {

protected static final String JOptionPAne = null;
private JFrame frame;
private JTextField txtid;
	private JPasswordField txtPassword;

	/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				login_S window = new login_S();
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
public login_S() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.setBounds(200, 200, 500, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Login");
	lblNewLabel.setBounds(217, 32, 70, 15);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel lblid = new JLabel("ID");
	lblid.setBounds(56, 86, 92, 15);
	frame.getContentPane().add(lblid);
	
	JLabel lblPassword = new JLabel("Password");
	lblPassword.setBounds(53, 145, 70, 15);
	frame.getContentPane().add(lblPassword);
	
	txtid = new JTextField();
	txtid.setBounds(217, 84, 192, 24);
	frame.getContentPane().add(txtid);
	txtid.setColumns(10);
	
	txtPassword = new JPasswordField();
	txtPassword.setBounds(217, 141, 192, 24);
	frame.getContentPane().add(txtPassword);
	
	JLabel lblAs = new JLabel("As : ");
	lblAs.setBounds(56, 197, 70, 15);
	frame.getContentPane().add(lblAs);
	
	JComboBox txtPosition = new JComboBox();
	//txtPosition.setModel(new DefaultComboBoxModel(new String[] {"Patient ", "Doctor ", "Admin"}));
	txtPosition.addItem("Select Position ");
	txtPosition.addItem("Doctor");
	txtPosition.addItem("Patient");
	txtPosition.addItem("Admin");
	
	txtPosition.setBounds(219, 192, 115, 24);
	frame.getContentPane().add(txtPosition);
	
	
	JButton btnRegister = new JButton("Login");
	btnRegister.setActionCommand("login");
	btnRegister.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String password = txtPassword.getText();
			String username = txtid.getText();
			//String txtPosition = String.valueof(txtPosition.getSelectedItem)
			
			String value=txtPosition.getSelectedItem().toString();
			 // login to admin 
			if ( password.contains("admin") && username.contains("admin") && value =="Admin" ) {
				
				txtPassword.setText(null);
				txtid.setText(null);
				
				// todkhel lel esapce admin 
				
				
				Admin info = new Admin();
				Admin.main(null);
			}

			else 
			{
				
				JOptionPane.showConfirmDialog(null, "Invalid Login details" , "Login Error ", JOptionPane.ERROR_MESSAGE  );
			}
			
			// login to doctor  or patient  
			try {
				//access to DataBase 
				//   ? means  what 
				
			String query = "SELECT * FROM accountDoctor WHERE  txtId=? and txtPassword=? ";
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountDoctor", "root", "root");
			
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1,username );
			pst.setString( 2, password);
			ResultSet rs =pst.executeQuery () ; 
			
			if (rs.next() ) {
				JOptionPane.showMessageDialog(btnRegister, this, "username and password matched , login successfully done ! ", 0);}
			
			if (value =="Doctor")
			{	Doctor jf = new Doctor();
				Doctor.main(null);
				
			}
			else if ( value =="Patient ") {
				Patient jf = new Patient();
				Patient.main(null);
				
			}
			else {
				JOptionPane.showMessageDialog(btnRegister, this, "username and password don't match , please try again ", 0);
			}
				
			}catch (Exception ex) {
                JOptionPane.showMessageDialog(btnRegister, this, ex.getMessage(), 0);
                
            }
			
			
		}
	});
	
	
	btnRegister.setBounds(56, 234, 117, 25);
	frame.getContentPane().add(btnRegister);
	
	
	
	JButton btnReset = new JButton("reset ");
	btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			txtid.setText(null);
			txtPassword.setText(null);
		
		}
	});
	
	
	
	btnReset.setBounds(217, 234, 117, 25);
	frame.getContentPane().add(btnReset);
	
	JButton btnCancel = new JButton("exit");
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			JFrame frmLoginSystem = new JFrame("exit") ;
			if( JOptionPane.showConfirmDialog(frmLoginSystem , "Confirm if you want to exit" , "Login Systems " , 
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}

				
				
			}
		});
		btnCancel.setBounds(371, 234, 117, 25);
		frame.getContentPane().add(btnCancel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 224, 476, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 59, 476, 2);
		frame.getContentPane().add(separator_1);
	}
}
