

public class Employe {

	private String date_embauche;
	private String code_utilisateur;
	private String password;
	private String type_acc�s;
	
	public Employe(String date_embauche, String code_utilisateur, String password, String type_acc�s) {
		this.date_embauche = date_embauche;
		this.code_utilisateur = code_utilisateur;
		this.password = password;
		this.type_acc�s = type_acc�s;
	}

	public String getDate_embauche() {
		return date_embauche;
	}

	public void setDate_embauche(String date_embauche) {
		this.date_embauche = date_embauche;
	}

	public String getCode_utilisateur() {
		return code_utilisateur;
	}

	public void setCode_utilisateur(String code_utilisateur) {
		this.code_utilisateur = code_utilisateur;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType_acc�s() {
		return type_acc�s;
	}

	public void setType_acc�s(String type_acc�s) {
		this.type_acc�s = type_acc�s;
	}
	
	
	
	
}

