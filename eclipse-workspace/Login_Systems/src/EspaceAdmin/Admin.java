package EspaceAdmin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin {

	private JFrame frame;

	/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Admin window = new Admin();
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
public Admin() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.setBounds(500, 500, 600, 381);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("consulter les fiches medecins");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
	});
	btnNewButton.setBounds(160, 24, 257, 25);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnGrerLesDossiers = new JButton("gérer les dossiers medicals");
	btnGrerLesDossiers.setBounds(160, 78, 257, 25);
	frame.getContentPane().add(btnGrerLesDossiers);
	
	JButton btnGrerLesRendez = new JButton("gérer les rendez vous");
	btnGrerLesRendez.setBounds(160, 135, 257, 25);
	frame.getContentPane().add(btnGrerLesRendez);
	
	JButton btnGrezLesFiches = new JButton("gérez les fiches des consultations");
	btnGrezLesFiches.setBounds(135, 188, 307, 25);
	frame.getContentPane().add(btnGrezLesFiches);
	
	JButton btnConsulterLesCalendriers = new JButton("consulter les calendriers");
	btnConsulterLesCalendriers.setBounds(160, 238, 257, 25);
	frame.getContentPane().add(btnConsulterLesCalendriers);
	
	JButton btnCalculerLesFactures = new JButton("calculer les factures et gérer les paiements");
		btnCalculerLesFactures.setBounds(160, 291, 257, 25);
		frame.getContentPane().add(btnCalculerLesFactures);
	}

}
