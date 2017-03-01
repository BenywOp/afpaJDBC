package bdd;

import entite.Adresse;
import entite.Client;
import entite.CompteClient;
import entite.CompteWeb;
import entite.Facture;

public class Methods_ii {
	
	

	public void addCompteClient(Client client, Adresse adresse, Facture facture) {
		CompteWeb compteWeb = new CompteWeb();		

		
		CompteClient compteClient = new CompteClient(compteWeb.getLogin(), compteWeb.getPassword());
		compteClient.setClient(client);
		compteClient.setAdresse(adresse);
		compteClient.setFacture(facture);
		
		
	}
	
	
	
	
}
