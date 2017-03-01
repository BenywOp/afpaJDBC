package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDao {
// NE PAS OUBLIEZ : ENLEVEZ "projet3" & "benji" de user & pass pour utiliser correctement l'ihm.
	// NE PAS OUBLIEZ : ENLEVEZ "projet3" & "benji" de user & pass pour utiliser correctement l'ihm.
	// NE PAS OUBLIEZ : ENLEVEZ "projet3" & "benji" de user & pass pour utiliser correctement l'ihm.
	
	static final String URL_XE = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static String user = "projet3";
	static String pass = "benji";

	static Connection connect_;
	static Statement statement_;
	static PreparedStatement pstatement_;
	static ResultSet resultSet_;
	protected String msgError = "Erreur Base de données";

	protected ConnectDao() {
	}
	
	// ***********************************************************

	static private Connection connection(String driver, String bd, String user, String pass) {
		try {
			String s = Class.forName(driver).getCanonicalName();
			Class.forName(driver);
			connect_ = DriverManager.getConnection(bd, user, pass);
			System.out.println("// ConnectDao.java - Connexion à la base effectuée " + s);
		} catch (Exception ev) {
			ev.printStackTrace();
			System.out.println("// ConnectDao.java - Connexion à la base " + bd + " impossible ");
			return null;
		}
		System.out.println("// ConnectDao.java - Connexion à la base effectuée " + connect_.toString());
		return connect_;
	}
	
// ***********************************************************
	
	static public Connection connection(String user, String pass) {
		Connection c = connection(driver,URL_XE, user, pass);	
		if (connect_ == null)  
			c = connection(driver,URL_XE, user, pass);	
		return c;
	}
	
// ***********************************************************
    
    static public void razStatements() {
 		System.out.println("Raz statements " + connect_.toString());
 		try {
 			if (statement_ != null)
 				statement_.close();
 			if (resultSet_ != null)
 				resultSet_.close();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	}
 // ***********************************************************
    
 	static public void razStatements(Statement statement_, ResultSet resultSet_) {
 		System.out.println("Raz statements " + connect_.toString());
 		try {
 			if (statement_ != null)
 				statement_.close();
 			if (resultSet_ != null)
 				resultSet_.close();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	}
	
 // ***********************************************************
 	
	synchronized public void createStatement() {

		connect_ = getConnect_() ;
		 
		try {
			this.statement_ =  connect_.createStatement();			 
		} catch (SQLException e) {
			System.out
					.println("//// AccessPool - Erreur SQL création statement dataSource");
			e.printStackTrace();
		}

	}
	
	// ***********************************************************
	
	public static Connection getConnect_() {
		
		if (connect_ == null)
			connection(user, pass);
		return connect_;
	}

	// ***********************************************************
	
	static public void disconnection() {
		if (connect_ != null) {
			try {
				connect_.close();
				connect_ = null;
			} catch (Exception ex) {
			}
		}
		System.out.println("// ConnectDao.java - Déconnexion de la base effectuée ");
	}

}
