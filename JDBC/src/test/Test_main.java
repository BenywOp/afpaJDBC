package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bdd.AccessDao;
import entite.Adresse;
import entite.Article;
import entite.Client;
import entite.CommandeShow;
import entite.CompteWeb;
import entite.Contrat;
import entite.Equipement;
import entite.Facture;
import utils.Utils;

public class Test_main {
	
	private static AccessDao  cd_ = new AccessDao();
	private static Utils u = new Utils();
	
	
	public static boolean traite(String user, String pass) {
		CompteWeb compte = cd_.connectionCompteClient(user, pass);
		// Si le login & mot de passe correspond, alors il y aura une réponse NON NULL, si l'un des deux ne correspond pas alors il y a une réponse NULL et cela return FALSE!
		if (compte != null)
			return true; 
			return false;
	}
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
//				
//		ArrayList<Client> coucou = cd_.afficheClient("Benjamin");
//		new Utils().afficheClient(coucou);
//		
//		System.out.println("SPLIT");
//		
//		ArrayList<Adresse> coucou1 = cd_.afficheAdresse("Benjamin");
//		new Utils().afficheAdresse(coucou1);
//		
//		System.out.println("SPLIT");
//		
//		ArrayList<Facture> blabla1 = cd_.afficheFacture("Benjamin");
//		new Utils().afficheFacture(blabla1);
//		
		String user = "Benjamin";
		String pass = "benji";
		int idCmd  = 855;
		int idClient = 510;
		
		
		traite(user, pass);
		
		
		CommandeShow b = cd_.afficheCommande(idCmd, idClient);
		System.out.println("\n********************************************************************************************");
		System.out.println("Contrat pour l'id contrat " +idCmd +" : " +idClient);		
		System.out.println("********************************************************************************************");
		new Utils().afficheCommande(b);		
		System.out.println("\n");		
		cd_.disconnection();
		
		
		
		
		
		
		
//		int ref_contrat = 300;
//		int ref_contrat2 = 305;
//		int ref_client = 505;
//		int ref_equipement = 885;
//		String user = "Benjamin";
//		String password = "benji";
		
//		ArrayList<Article> listArticle = cd_.afficheTableArticle();
//		new Utils().afficheMultipleArticle(listArticle);
		


//		 affiche les compte web
//		CompteWeb B = cd_.connectionCompteClient(user, password);		
//		new Utils().afficheCompteWeb(B);
		
//		
//		 affiche le client associé au ID entré

	
		// Affiche le client selon l'id client choisi

		

		
		
	 	//Affiche table contrat
//		ArrayList kiki = cd_.afficheTableContrat();
//		new Utils().afficheMultipleContrat(kiki);
//		cd_.disconnection();
		
//		ArrayList<Equipement> RORO1 = new ArrayList<Equipement>();
//		ArrayList<Article> RORO = new ArrayList<Article>();
//		
//		cd_.afficheTableArticle(RORO);
//		new Utils().afficheMultipleArticle(RORO);
		
//		cd_.afficheTableEquipement(RORO1);
//		new Utils().afficheMultipleEquipement(RORO1);
//		
		
//		Contrat a  = cd_.findContrat(ref_contrat);	
//		System.out.println("\n********************************************************************************************");
//		System.out.println("Contrat pour l'id contrat " +ref_contrat +" : ");		
//		System.out.println("********************************************************************************************");
//		new Utils().afficheContrat(a);		
//		System.out.println("\n");		
//		cd_.disconnection();
//		
//		
//		
//		Contrat b = cd_.findContratByEquipements(ref_equipement);
//		System.out.println("\n********************************************************************************************");
//		System.out.println("Contrat pour l'id contrat " +ref_equipement +" : ");		
//		System.out.println("********************************************************************************************");
//		new Utils().afficheContrat(b);		
//		System.out.println("\n");		
//		cd_.disconnection();
//		
//		
//		
//		ArrayList blabla = cd_.findContratByClient(ref_client);
//		System.out.println("\n********************************************************************************************");
//		System.out.println("Liste du/des contrat(s) associés à l'id client :" +ref_client);
//		System.out.println("********************************************************************************************");
//		new Utils().afficheMultipleContrat(blabla);	
//		System.out.println("\n");	
//		cd_.disconnection();
//		
//		
//		
//		ArrayList cuicui = cd_.findEquipementByContrat(ref_contrat2);
//		System.out.println("\n********************************************************************************************");
//		System.out.println("Liste d'équipements associé au contrat:" +ref_contrat2);
//		System.out.println("********************************************************************************************");
//		new Utils().afficheMultipleEquipement(cuicui);	
//		System.out.println("\n");	
		
//		
//	 	//Affiche table contrat
//		ArrayList kiki = cd_.afficheTableContrat();
//		new Utils().afficheMultipleContrat(kiki);
//		cd_.disconnection();
		
		
	}






}
