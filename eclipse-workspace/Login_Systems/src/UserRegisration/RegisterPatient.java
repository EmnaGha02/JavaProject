package UserRegisration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPatient {

	private JFrame frame;
	private JTextField txtCin;
	private JLabel lblNewLabel_1;
	private JTextField txtFullname;
	private JLabel lblFamilyName;
	private JTextField txtId;
	private JLabel lblId;
	private JTextField txtPassword;
	private JLabel lblPassword;
	private JTextField txtMail;
	private JLabel lblMail;
	private JTextField txtSpeciality;
	private JLabel lblSpeciali;
	private JTextField txtAboutme;
	private JLabel lblSpeciality;
	private JLabel lblRegisterAsDoctor;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPatient window = new RegisterPatient();
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
	public RegisterPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCin = new JTextField();
		txtCin.setColumns(10);
		txtCin.setBounds(138, 105, 204, 33);
		frame.getContentPane().add(txtCin);
		
		lblNewLabel_1 = new JLabel("CIN : ");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(54, 105, 133, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtFullname = new JTextField();
		txtFullname.setColumns(10);
		txtFullname.setBounds(138, 169, 204, 33);
		frame.getContentPane().add(txtFullname);
		
		lblFamilyName = new JLabel("full name : ");
		lblFamilyName.setForeground(Color.DARK_GRAY);
		lblFamilyName.setBounds(54, 169, 133, 33);
		frame.getContentPane().add(lblFamilyName);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(138, 229, 204, 33);
		frame.getContentPane().add(txtId);
		
		lblId = new JLabel("id : ");
		lblId.setForeground(Color.DARK_GRAY);
		lblId.setBounds(54, 229, 133, 33);
		frame.getContentPane().add(lblId);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(138, 287, 204, 33);
		frame.getContentPane().add(txtPassword);
		
		lblPassword = new JLabel("password : ");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setBounds(54, 287, 133, 33);
		frame.getContentPane().add(lblPassword);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(138, 359, 204, 33);
		frame.getContentPane().add(txtMail);
		
		lblMail = new JLabel("mail : ");
		lblMail.setForeground(Color.DARK_GRAY);
		lblMail.setBounds(54, 359, 133, 33);
		frame.getContentPane().add(lblMail);
		
		
		lblRegisterAsDoctor = new JLabel("Register as a Patient ");
		lblRegisterAsDoctor.setFont(new Font("Dialog", Font.BOLD, 26));
		lblRegisterAsDoctor.setBounds(101, 22, 327, 57);
		frame.getContentPane().add(lblRegisterAsDoctor);
		
		btnNewButton = new JButton("Submit ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cin = txtCin.getText();
				int len = cin.length();
                String fullname = txtFullname.getText();
                String id = txtId.getText();
                String Password = txtPassword.getText();
                String Mail = txtMail.getText();
               
                
                String msg = "" + fullname;
                msg += " \n";
                if (len != 8) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid CIN ");
                }

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "root");
                     //store into accountPatiennt 
                    
                    String query = "INSERT INTO accountPatient  values('" + cin + "','" + fullname + "','" + id + "','" +
                        Password + "','" + Mail + "','" + "')";
                    
                    // test exist wale 
                    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Welcome, " + msg + "Your account is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				
				
				
			}
		});
		btnNewButton.setBounds(179, 634, 117, 25);
		frame.getContentPane().add(btnNewButton);
	}

}
