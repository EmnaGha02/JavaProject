package EspaceMedecin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Doctor {

	private JFrame frame;

	/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Doctor window = new Doctor();
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
public Doctor() {
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
	
	JButton btnNewButton = new JButton("modifier fiche personel");
	btnNewButton.setBounds(181, 46, 237, 25);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnCreationDossierMedical = new JButton("créer dossier medical");
	btnCreationDossierMedical.setBounds(181, 109, 237, 25);
	frame.getContentPane().add(btnCreationDossierMedical);
	
	JButton btnModifierDossierMedical = new JButton("modifier dossier medical");
	btnModifierDossierMedical.setBounds(181, 146, 237, 25);
	frame.getContentPane().add(btnModifierDossierMedical);
	
	JButton btnSupprimerDossierMedical = new JButton("supprimer dossier medical");
	btnSupprimerDossierMedical.setBounds(181, 183, 237, 25);
	frame.getContentPane().add(btnSupprimerDossierMedical);
	
	JButton btnVoirCalendrier = new JButton("voir calendrier ");
	btnVoirCalendrier.setBounds(181, 236, 237, 25);
	frame.getContentPane().add(btnVoirCalendrier);
	
	JButton btnNewButton_1 = new JButton("créer fiche consultaion");
		btnNewButton_1.setBounds(181, 283, 237, 25);
		frame.getContentPane().add(btnNewButton_1);
	}

}
