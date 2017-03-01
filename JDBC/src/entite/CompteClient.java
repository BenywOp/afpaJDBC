package entite;

import java.util.HashMap;
import java.util.Map;

public class CompteClient {

	private Client client;
	private Adresse adresse;
	private Facture facture;
	
	private Map<Integer, Facture> listFacture = new HashMap<Integer, Facture>();
	
	
	public CompteClient(String login, String password) {
		
	}




	public Client getClient(String login, String password) {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Adresse getAdresse(int idClient) {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

}
