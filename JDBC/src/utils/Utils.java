package utils;

import entite.Contrat;
import entite.Client;
import entite.CommandeShow;
import entite.CompteWeb;
import entite.Centre;

import java.util.ArrayList;
import java.util.List;

import bdd.AccessDao;
import entite.Adresse;
import entite.Article;
import entite.Equipement;
import entite.Facture;





public class Utils {

	// Affiche un contrat	
	public  void afficheContrat(Object o) {		
		if(o == null){
			System.out.println("Impossible d'afficher un objet null");
			return;
		}		
		if (o instanceof Contrat) {
			Contrat a = (Contrat) o ;
			System.out.println("ID_Contrat: " + a.getIdContrat() +"\t\t ID_STATUT: "+a.getIdStatut() + "\t\t Date debut de contrat: "
					+ a.getDateDebut() + "\t Date_fin_contrat:" + " " + a.getDateFin());
		}			
	}
	
	// Affiche une commande et ses extensions
	public  void afficheCommande(Object o) {		
		if(o == null){
			System.out.println("Impossible d'afficher un objet null");
			return;
		}		
		if (o instanceof CommandeShow) {
			CommandeShow c = (CommandeShow) o;
			System.out.println("ID CMD " + c.getIdCmdD() +"\t\t QTE_CMD_ARTICLE "+c.getQuantiteCmdClientD()+ "\t\t LIB ARTICLE "
					+ c.getLibArticleD() + "\t PRIX ARTICLES" + " " + c.getPrixD() + " STATUT CMD " +c.getStatutCommande());
		}			
	}
	
	
	
	// Affiche un compte web
	public  void afficheCompteWeb(Object o) {		
		if(o == null){
			System.out.println("Impossible d'afficher un objet null");
			return;
		}		
		if (o instanceof CompteWeb) {
			CompteWeb a = (CompteWeb) o ;
			System.out.println("Login: " + a.getLogin() +"\t\t Password: "+a.getPassword() + "\t\t Id Client: "
					+ a.getIdClient());
		}			
	}	
	
	
	// Affiche un compte web
//	public void afficheCompteWeb(ArrayList statementSelect) {
//		for (Object a : statementSelect) {
//			System.out.println(((CompteWeb) a).getLogin());
//			System.out.println(((CompteWeb) a).getPassword());
//			System.out.println(((CompteWeb) a).getIdClient());
//			System.out.println("-----------------------");
//		}
//	}
	
	// Affiche un client
	
	
	public void afficheClient(ArrayList statementSelect) {
		for (Object a : statementSelect) {
			System.out.println(((Client) a).getIdClient() +"ID CLI");			
			System.out.println(((Client) a).getIdAdresse() +"ID ADR");
			System.out.println(((Client) a).getNomClient() +"NOM CLI");
			System.out.println(((Client) a).getPrenomClient() +"PRENOM CLI");
			System.out.println(((Client) a).getTelClient() +"TEL CLI");
			System.out.println(((Client) a).getTypeClient() +"TYPE CLI");
		}
	}
	
	// Affiche une adresse
	public void afficheAdresse(ArrayList statementSelect) {
		for (Object a : statementSelect) {
			System.out.println(((Adresse) a).getIdAdr() +" // ID ADR");
			System.out.println(((Adresse) a).getNumAdr() +" // numéro");
			System.out.println(((Adresse) a).getRueAdr() +" // Rue");
			System.out.println(((Adresse) a).getCpAdr() +" // CP");
			System.out.println(((Adresse) a).getVilleAdr() +"// Ville");
		}
	}
	
	
	// Affiche une adresse
	public void afficheFacture(ArrayList statementSelect) {
		for (Object a : statementSelect) {
			System.out.println(((Facture) a).getIdFacture() +" // id_facture");
			System.out.println(((Facture) a).getIdClient() +" // id_client");
			System.out.println(((Facture) a).getDateFacture() +" Date_facture");
			System.out.println(((Facture) a).getMontantTtc() +" Montant");
		}
	}
	
	
	public void afficheMultipleContrat(ArrayList statementSelect){
		
		for (Object a : statementSelect) { // Corresponds à chaque ligne
			System.out.print(((Contrat) a).getIdContrat() + "\t\t");
			System.out.print(((Contrat) a).getIdStatut() + "\t\t\t");
			System.out.print(((Contrat) a).getDateDebut() + "\t\t\t");
			System.out.print(((Contrat) a).getDateFin() + "\t\t");
			System.out.println("\t");
		}
	
	
	}
	
	
	
public void afficheMultipleEquipement(ArrayList statementSelect){
		
		for (Object a : statementSelect) { // Corresponds à chaque ligne
			System.out.print(((Equipement) a).getIdCentre() + "\t\t");
			System.out.print(((Equipement) a).getIdContrat() + "\t\t\t");
			System.out.print(((Equipement) a).getIdEquipement() + "\t\t\t");
			System.out.print(((Equipement) a).getIdModele() + "\t\t");
			System.out.println(((Equipement) a).getLibEquipement() + "\t\t");
			System.out.println(((Equipement) a).getRefEquipement() + "\t\t");
			
			System.out.println("\t");
		}
	
	}


public void afficheMultipleArticle(ArrayList<?> statementSelect) {
	System.out.println("TEST AFFICHE");
	
	for (Object a : statementSelect) {
		System.out.print(((Article) a).getIdArticle() + "\t\t");
		System.out.print(((Article) a).getLibArticle() + "\t\t\t");
		System.out.print(((Article) a).getPrixArticle() + "\t\t\t");
		System.out.print(((Article) a).getQteCommande() + "\t\t");
		System.out.println(((Article) a).getDelaiLivraison()+ "\t\t");
		System.out.println(((Article) a).getStock() + "\t\t");
		System.out.println(((Article) a).getQteMini() + "\t\t");
		System.out.println(((Article) a).getQteRepare() + "\t\t");
		
		
		System.out.println("\t");
		
		
	}
}


	
}