
public class CarteCredit {

	private String numéro_de_carte;
	private String date_expiration;
	private String code_secret;
	
	
	public CarteCredit(String numéro_de_carte, String date_expiration, String code_secret) {
		this.numéro_de_carte = numéro_de_carte;
		this.date_expiration = date_expiration;
		this.code_secret = code_secret;
	}


	public String getNuméro_de_carte() {
		return numéro_de_carte;
	}


	public void setNuméro_de_carte(String numéro_de_carte) {
		this.numéro_de_carte = numéro_de_carte;
	}


	public String getDate_expiration() {
		return date_expiration;
	}


	public void setDate_expiration(String date_expiration) {
		this.date_expiration = date_expiration;
	}


	public String getCode_secret() {
		return code_secret;
	}


	public void setCode_secret(String code_secret) {
		this.code_secret = code_secret;
	}
	
	
	
}
