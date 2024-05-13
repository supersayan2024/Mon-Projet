
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FenetreLogin extends JFrame{
	
	// conteneur
	JPanel panel = new JPanel();

	// image bonhomme
	ImageIcon user_icon = new ImageIcon("user-interface.png");
	
	JLabel label_code_utilisateur = new JLabel("code_utilisateur:");
	JLabel label_mdp = new JLabel("mot de passe:");
	JLabel user_label = new JLabel(user_icon);
	
	
	// les champs de text
	JTextField tf_code_utilisateur = new JTextField(20);
	JPasswordField tf_mdp = new JPasswordField(20);
	JButton btn_login = new JButton("Se connecter");

	public FenetreLogin() {
		this.setSize(300, 531);
		this.setTitle("Login");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.add(user_label, BorderLayout.SOUTH);
		
		tf_code_utilisateur.setPreferredSize(new Dimension(200, 40));
		tf_mdp.setPreferredSize(new Dimension(200, 40));
		panel.add(user_label);
		panel.add(label_code_utilisateur);
		panel.add(tf_code_utilisateur);		
		panel.add(label_mdp);
		panel.add(tf_mdp);
		panel.add(btn_login);
		this.getContentPane().add(panel);
		this.setVisible(true);
		
		btn_login.addActionListener(e->{
			if(tf_code_utilisateur.getText().equalsIgnoreCase("yves") && 
				new String(tf_mdp.getPassword()).equalsIgnoreCase("yves123")) {
				this.dispose();
				new FenetrePrincipale();				
			}else {
				JOptionPane.showMessageDialog(null, "code utilisateur ou mot de pass erroné");
				tf_code_utilisateur.setText("");
				tf_mdp.setText("");
			}
		});
		
	}
	
	
}
