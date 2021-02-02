package EsapcePatient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient {

	private JFrame frame;

	/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Patient window = new Patient();
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
public Patient() {
	initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 450);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JButton btnrdv = new JButton("faire un rendez vous ");
btnrdv.setBounds(116, 28, 218, 25);
frame.getContentPane().add(btnrdv);

JButton btnConsulterFacture = new JButton("consulter facture");
btnConsulterFacture.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	}
});
btnConsulterFacture.setBounds(116, 225, 218, 25);
frame.getContentPane().add(btnConsulterFacture);

JButton btnModifierRendezVous = new JButton("modifier rendez vous ");
btnModifierRendezVous.setBounds(116, 88, 218, 25);
frame.getContentPane().add(btnModifierRendezVous);

JButton btnSupprimerRendezVous = new JButton("supprimer rendez vous");
btnSupprimerRendezVous.setBounds(116, 155, 218, 25);
frame.getContentPane().add(btnSupprimerRendezVous);

JButton btnVoirLaFiche = new JButton("voir la fiche de la consultation");
btnVoirLaFiche.setBounds(94, 297, 262, 25);
frame.getContentPane().add(btnVoirLaFiche);

JButton btnVoirHistoriqueDu = new JButton("voir historique du dossier médical");
		btnVoirHistoriqueDu.setBounds(80, 364, 290, 25);
		frame.getContentPane().add(btnVoirHistoriqueDu);
	}

}
