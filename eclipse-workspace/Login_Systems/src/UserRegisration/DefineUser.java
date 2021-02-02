package UserRegisration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DefineUser {

	private JFrame frame;

	/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				DefineUser window = new DefineUser();
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
public DefineUser() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblRegisterAs = new JLabel("Register As : ");
	lblRegisterAs.setFont(new Font("Dialog", Font.BOLD, 27));
	lblRegisterAs.setForeground(UIManager.getColor("Button.focus"));
	lblRegisterAs.setBounds(117, 12, 215, 70);
	frame.getContentPane().add(lblRegisterAs);
	
	JComboBox comboBox = new JComboBox();
	
	//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Patient ", "Doctor ", "Admin"}));
	
	comboBox.addItem("Select Position ");
	comboBox.addItem("Doctor");
	comboBox.addItem("Patient");
	comboBox.addItem("Admin");
	
	comboBox.setBounds(133, 120, 170, 30);
	frame.getContentPane().add(comboBox);
	
	JButton btnNewButton = new JButton("OK");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String value=comboBox.getSelectedItem().toString();
			if (value =="Patient") {
				RegisterPatient jf = new RegisterPatient();
				RegisterPatient.main(null);
			}
			else if (value == "Doctor") {
				registerMedecin jf = new registerMedecin();
				registerMedecin.main(null);
			}
			else if (value == "Admin")
				{
					RegisterAdmin jf = new RegisterAdmin();
					RegisterAdmin.main(null);
					
				}
					
				
			}
		});
		btnNewButton.setBounds(165, 205, 117, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
