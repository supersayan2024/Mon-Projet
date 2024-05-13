



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FenetrePrincipale extends JFrame{
	
	JPanel panel = new JPanel();

	ImageIcon user_icon = new ImageIcon("user-interface.png");
	
//	JLabel label_code_utilisateur = new JLabel("code_utilisateur:");
//	JLabel label_mdp = new JLabel("mot de passe:");
//	JLabel user_label = new JLabel(user_icon);
//	
//	JTextField tf_code_utilisateur = new JTextField(20);
//	JPasswordField tf_mdp = new JPasswordField(20);
//	JButton btn = new JButton("Login");

	public FenetrePrincipale() {
		this.setSize(1062, 600);
		this.setTitle("Accueil");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//this.add(user_label, BorderLayout.SOUTH);

//		panel.add(user_label);
//		panel.add(label_code_utilisateur);
//		panel.add(tf_code_utilisateur);		
//		panel.add(label_mdp);
//		panel.add(tf_mdp);
//		panel.add(btn);
		this.getContentPane().add(panel);
		this.setVisible(true);
	}
	
	
}





