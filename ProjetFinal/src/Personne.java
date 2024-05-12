

public class Personne {
	
	protected String nom;
	protected String pernom;
	protected String sex;
	
	public Personne(String nom, String pernom, String sex) {
		this.nom = nom;
		this.pernom = pernom;
		this.sex = sex;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPernom() {
		return pernom;
	}

	public void setPernom(String pernom) {
		this.pernom = pernom;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
