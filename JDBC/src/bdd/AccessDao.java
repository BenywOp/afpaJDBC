package bdd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import entite.Adresse;
import entite.Article;
import entite.Client;
import entite.Commande;
import entite.CommandeShow;
import entite.CompteClient;
import entite.CompteWeb;
import entite.Contrat;
import entite.Equipement;
import entite.Facture;
import utils.Utils;

public class AccessDao extends ConnectDao{

	public AccessDao() {

	}
	
	
	// REQUETE SQL DU LOGIN & PASSWORD 
	// *******************************************************	
	public CompteWeb connectionCompteClient(String user, String pass) {
		PreparedStatement pstatement_ = null;
		ResultSet resultSet_ = null;
		connect_ = getConnect_();
		try {
			String sql = "SELECT login, id_client FROM compteweb WHERE login = ? AND password = ? ";
			pstatement_ = connect_.prepareStatement(sql);
			pstatement_.setString(1, (String) user);
			pstatement_.setString(2, (String) pass);
			System.out.println(user +"  //reference");		
			resultSet_ = pstatement_.executeQuery();			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			razStatements();
			return null;
		}
		ArrayList<CompteWeb> statementSelect = new ArrayList<CompteWeb>();
		resultSetToCompteWeb(resultSet_, statementSelect);
		razStatements(pstatement_, resultSet_);
		return statementSelect.get(0);
	}
	
			
	// AFFICHE TABLE ARTICLE
	// *******************************************************	
	public ArrayList<Article> afficheTableArticle() {

		PreparedStatement pstatement_ = null;
		ResultSet resultSet_ = null;
		connect_ = getConnect_();
		try {
			String sql = "SELECT * FROM article";
			pstatement_ = connect_.prepareStatement(sql);
			resultSet_ = pstatement_.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			razStatements();
			return null;
		}
		ArrayList<Article> statementSelect = new ArrayList<Article>();
		resultSetToArticle(resultSet_, statementSelect);
		System.out.println(resultSet_ + "resultSetloooooooooo");
		System.out.println(statementSelect + "statementSeleeeeeeeeeeeeeee");
		razStatements(pstatement_, resultSet_);
		return statementSelect;
	}
	
	
	// AFFICHE COMMANDE & PANIER & ARTICLES	 PAR LOGIN
	public CommandeShow afficheCommande(Object ref, Object ref2) {
		PreparedStatement pstatement_ = null;
		ResultSet resultSet_ = null;
		connect_ = getConnect_();
		try {		
			String sql ="SELECT PANIER.ID_CMD, QUANTITE_CMD_CLIENT, LIB_ARTICLE, (PRIX_ARTICLE*QUANTITE_CMD_CLIENT) "
					+ "AS PRIX, STATUT_COMMANDE " 
						+"FROM COMMANDE "
						+"JOIN PANIER on COMMANDE.id_cmd=PANIER.id_cmd "
						+"JOIN ARTICLE on PANIER.id_article=ARTICLE.id_article "
						+ "WHERE COMMANDE.id_cmd = ? AND COMMANDE.id_client = ? ";
			pstatement_ = connect_.prepareStatement(sql);
			pstatement_.setInt(1, (int) ref);
			pstatement_.setInt(2, (int) ref2);
			System.out.println(ref + " REF ");
			System.out.println(ref2 +"REF 2 ");
			resultSet_ = pstatement_.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			razStatements();
			return null;
		}
		ArrayList<CommandeShow> statementSelect = new ArrayList<CommandeShow>();
		resultSetToCommande(resultSet_, statementSelect);		
		razStatements(pstatement_, resultSet_);
		return statementSelect.get(0);
	}	
	
	// AFFICHAGE CLIENTS  &  ADRESSE  &  FACTURE PAR / ! \ LOGIN / ! \
	// AFFICHAGE CLIENTS  &  ADRESSE  &  FACTURE PAR / ! \ LOGIN / ! \
	// AFFICHAGE CLIENTS  &  ADRESSE  &  FACTURE PAR / ! \ LOGIN / ! \
	// AFFICHAGE CLIENTS  &  ADRESSE  &  FACTURE PAR / ! \ LOGIN / ! \
	// ***************************************************************
	// Attention au manque d'espace dans les requêtes SQL lors d'un retour chariot /!\ /!\
	// AFFICHE CLIENT PAR LOGIN
	// ***************************************************************	
	public ArrayList<Client> afficheClient(String ref) {
		PreparedStatement pstatement_ = null;
		ResultSet resultSet_ = null;
		connect_ = getConnect_();
		try {		
			String sql =" SELECT CLIENTS.id_client, CLIENTS.id_adr, nom_client, prenom_client, tel_client, type_client "
					+ "from COMPTEWEB "
					+ "join CLIENTS on COMPTEWEB.id_client=CLIENTS.id_client "
					+ "join ADRESSES on CLIENTS.id_adr=ADRESSES.id_adr "
					+ "join FACTURE on CLIENTS.id_client=FACTURE.id_client "
					+ "WHERE LOGIN = ? ";
			pstatement_ = connect_.prepareStatement(sql);
			pstatement_.setString(1, (String) ref);
			resultSet_ = pstatement_.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			razStatements();
			return null;
		}
		ArrayList<Client> statementSelect = new ArrayList<Client>();
		resultSetToClient(resultSet_, statementSelect);		
		razStatements(pstatement_, resultSet_);
		return statementSelect;
	}	
	
	
	// FIND ADRESSE PAR LOGIN
	// *******************************************************	
	public ArrayList<Adresse> afficheAdresse(Object ref) {
		PreparedStatement pstatement_ = null;
		ResultSet resultSet_ = null;
		connect_ = getConnect_();
		try {
			String sql =" SELECT ADRESSES.id_adr, num_adr, rue_adr, cp_adr, ville_adr "
					+ "FROM ADRESSES "
					+ "JOIN CLIENTS ON ADRESSES.id_adr = CLIENTS.id_adr "
					+ "JOIN COMPTEWEB ON CLIENTS.id_client=COMPTEWEB.id_client "
					+ "WHERE LOGIN = ? ";
			pstatement_ = connect_.prepareStatement(sql);
			pstatement_.setString(1, (String) ref);
			resultSet_ = pstatement_.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			razStatements();
			return null;
		}
		ArrayList<Adresse> statementSelect = new ArrayList<Adresse>();
		resultSetToAdresse(resultSet_, statementSelect);		
		razStatements(pstatement_, resultSet_);
		return statementSelect;
	}
	
	
	// **************************************************************************
	// FIND FACTURE PAR LOGIN
	public ArrayList<Facture> afficheFacture(Object ref) {
		PreparedStatement pstatement_ = null;
		ResultSet resultSet_ = null;
		connect_ = getConnect_();
		try {
			String sql =" SELECT FACTURE.id_facture, FACTURE.id_client, date_facture, montant_ttc "
					+ "FROM FACTURE "
					+ "JOIN CLIENTS ON FACTURE.id_client = CLIENTS.id_client "
					+ "JOIN COMPTEWEB ON CLIENTS.id_client=COMPTEWEB.id_client "
					+ "WHERE LOGIN = ? ";
			pstatement_ = connect_.prepareStatement(sql);
			pstatement_.setString(1, (String) ref);
			resultSet_ = pstatement_.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			razStatements();
			return null;
		}
		ArrayList<Facture> statementSelect = new ArrayList<Facture>();
		resultSetToFacture(resultSet_, statementSelect);		
		razStatements(pstatement_, resultSet_);
		return statementSelect;
	}	
	
	
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN	// RESULTSET MAN
	// ***************************************************************
	public void resultSetToEquipement(ResultSet resultSet_, ArrayList<Equipement> statementSelect) {
		try {
			while (resultSet_.next()) {
				Equipement a = new Equipement();
				a.setIdCentre(resultSet_.getInt("ID_CENTRE"));
				a.setIdContrat(resultSet_.getInt("ID_CONTRAT"));
				a.setIdEquipement(resultSet_.getInt("ID_EQUIPEMENT"));
				a.setIdModele(resultSet_.getInt("ID_MODELE"));
				a.setRefEquipement(resultSet_.getString("REF_EQUIPEMENT"));
				a.setLibEquipement(resultSet_.getString("LIB_EQUIPEMENT"));
				statementSelect.add(a);
			}

		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();
		}
	}

	// ***********************************
	// ***********************************
	public void resultSetToContrat(ResultSet resultSet_, ArrayList<Contrat> statementSelect) {
		// générer le résultat
		try {
			while (resultSet_.next()) { // recopier dans la collection
				Contrat unContrat = new Contrat();
				unContrat.setIdContrat(resultSet_.getInt("ID_CONTRAT"));
				unContrat.setIdStatut(resultSet_.getInt("ID_STATUT"));
				unContrat.setDateDebut(resultSet_.getString("DATE_DEBUT"));
				unContrat.setDateFin(resultSet_.getString("DATE_FIN"));
				statementSelect.add(unContrat);
			}

		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();
		}
	}
	
	// ***********************************
	// ***********************************
	public void resultSetToFacture(ResultSet resultSet_, ArrayList<Facture> statementSelect) {
		// générer le résultat
		try {
			while (resultSet_.next()) { // recopier dans la collection
				Facture uneFacture = new Facture();
				uneFacture.setIdFacture(resultSet_.getInt("ID_FACTURE"));				
				uneFacture.setIdClient(resultSet_.getInt("ID_CLIENT"));
				uneFacture.setDateFacture(resultSet_.getDate("DATE_FACTURE"));
				uneFacture.setMontantTtc(resultSet_.getLong("MONTANT_TTC"));
				statementSelect.add(uneFacture);
			}
		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();
		}
	}

	// ***********************************
	// ***********************************
	public void resultSetToArticle(ResultSet resultSet_, ArrayList<Article> statementSelect) {

		try {
			while (resultSet_.next()) {
				Article a = new Article();
				a.setIdArticle(resultSet_.getInt("ID_ARTICLE"));
				a.setLibArticle(resultSet_.getString("LIB_ARTICLE"));
				a.setPrixArticle(resultSet_.getInt("PRIX_ARTICLE"));
				a.setQteCommande(resultSet_.getInt("QUANTITE_CMD"));
				a.setDelaiLivraison(resultSet_.getInt("DELAI_LIVRAISON"));
				a.setStock(resultSet_.getInt("STOCK"));
				a.setQteMini(resultSet_.getInt("QUANTITE_MINI"));
				a.setQteRepare(resultSet_.getInt("QUANTITE_REPARE"));
				statementSelect.add(a);
			}
		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();
		}
	}

	// ***********************************
	// ***********************************
	public void resultSetToClient(ResultSet resultSet_, ArrayList<Client> statementSelect) {

		try {
			while (resultSet_.next()) {
				Client a = new Client();
				a.setIdClient(resultSet_.getInt("ID_CLIENT"));
				a.setIdAdresse(resultSet_.getInt("ID_ADR"));
				a.setNomClient(resultSet_.getString("NOM_CLIENT"));
				a.setPrenomClient(resultSet_.getString("PRENOM_CLIENT"));
				a.setTelClient(resultSet_.getInt("TEL_CLIENT"));
				a.setTypeClient(resultSet_.getString("TYPE_CLIENT"));
				statementSelect.add(a);
			}
		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();

		}
	}
	
	// ***********************************
	// ***********************************
	public void resultSetToAdresse(ResultSet resultSet_, ArrayList<Adresse> statementSelect) {

		try {
			while (resultSet_.next()) {
				Adresse a = new Adresse();
				a.setIdAdr(resultSet_.getInt("ID_ADR"));
				a.setNumAdr(resultSet_.getInt("NUM_ADR"));
				a.setRueAdr(resultSet_.getString("RUE_ADR"));
				a.setCpAdr(resultSet_.getInt("CP_ADR"));
				a.setVilleAdr(resultSet_.getString("VILLE_ADR"));
				statementSelect.add(a);
			}
		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();

		}
	}
	
	// ***********************************
	// ***********************************
	public void resultSetToCompteWeb(ResultSet resultSet_, ArrayList<CompteWeb> statementSelect) {
		// générer le résultat
		try {
			while (resultSet_.next()) { // recopier dans la collection
				CompteWeb compteWeb = new CompteWeb();
				compteWeb.setLogin(resultSet_.getString("login"));
//				compteWeb.setPassword(resultSet_.getString("password"));
				compteWeb.setIdClient(resultSet_.getInt("id_client"));
				statementSelect.add(compteWeb);
			}
		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();
		}
	}
		
	// ***********************************
//	QUANTITE_CMD_CLIENT, LIB_ARTICLE, (PRIX_ARTICLE*QUANTITE_CMD_CLIENT) "
//			+ "AS PRIX, STATUT_COMMANDE " 
	
	// ***********************************
	public void resultSetToCommande(ResultSet resultSet_, ArrayList<CommandeShow> statementSelect) {
		
		try {
			while (resultSet_.next()) { // recopier dans la collection
				CommandeShow commandeShow = new CommandeShow();			
				commandeShow.setIdCmdD(resultSet_.getInt("ID_CMD"));	
				commandeShow.setQuantiteCmdClientD(resultSet_.getInt("QUANTITE_CMD_CLIENT"));
				commandeShow.setLibArticleD(resultSet_.getString("LIB_ARTICLE"));
				commandeShow.setPrixD(resultSet_.getLong("PRIX"));
				commandeShow.setStatutCommande(resultSet_.getString("STATUT_COMMANDE"));				
				statementSelect.add(commandeShow);
			}

		} catch (SQLException e) {
			razStatements();
			e.printStackTrace();
		}
	}
	

}
