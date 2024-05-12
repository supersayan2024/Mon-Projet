

public class Acteur extends Personne{
	
	protected String nom_personnage;
	protected String d�but_emploi;
	protected String fin_emploi;
	protected String cachet;
	
	
	public Acteur(String nom, String prenom, String sexe, String nom_personnage, String d�but_emploi, String fin_emploi, String cachet) {
		super(nom, prenom, sexe);
		this.nom_personnage = nom_personnage;
		this.d�but_emploi = d�but_emploi;
		this.fin_emploi = fin_emploi;
		this.cachet = cachet;
	}


	public String getNom_personnage() {
		return nom_personnage;
	}


	public void setNom_personnage(String nom_personnage) {
		this.nom_personnage = nom_personnage;
	}


	public String getD�but_emploi() {
		return d�but_emploi;
	}


	public void setD�but_emploi(String d�but_emploi) {
		this.d�but_emploi = d�but_emploi;
	}


	public String getFin_emploi() {
		return fin_emploi;
	}


	public void setFin_emploi(String fin_emploi) {
		this.fin_emploi = fin_emploi;
	}


	public String getCachet() {
		return cachet;
	}


	public void setCachet(String cachet) {
		this.cachet = cachet;
	}
	
	

}



