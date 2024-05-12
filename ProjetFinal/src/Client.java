



public class Client extends Personne{ 

	private String date_inscription;
	private String couriel;
    private String password;
    
	public Client(String nom, String prenom, String sexe,String date_inscription, String couriel, String password) {
		super(nom, prenom, sexe);
		this.date_inscription = date_inscription;
		this.couriel = couriel;
		this.password = password;
	}

	public String getCouriel() {
		return this.couriel;
	}
	public void setCouriel(String couriel) {
		this.couriel = couriel;
	}
    
}
