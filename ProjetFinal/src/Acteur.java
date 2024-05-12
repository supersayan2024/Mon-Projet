

public class Acteur extends Personne{
	
	protected String nom_personnage;
	protected String début_emploi;
	protected String fin_emploi;
	protected String cachet;
	
	
	public Acteur(String nom, String prenom, String sexe, String nom_personnage, String début_emploi, String fin_emploi, String cachet) {
		super(nom, prenom, sexe);
		this.nom_personnage = nom_personnage;
		this.début_emploi = début_emploi;
		this.fin_emploi = fin_emploi;
		this.cachet = cachet;
	}


	public String getNom_personnage() {
		return nom_personnage;
	}


	public void setNom_personnage(String nom_personnage) {
		this.nom_personnage = nom_personnage;
	}


	public String getDébut_emploi() {
		return début_emploi;
	}


	public void setDébut_emploi(String début_emploi) {
		this.début_emploi = début_emploi;
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



