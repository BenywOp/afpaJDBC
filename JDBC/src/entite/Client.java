package entite;

import java.io.Serializable;

public class Client implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idClient;
	private int idAdresse;
	private String nomClient;
	private String prenomClient;
	private int telClient;
	private String typeClient;
	
	
	
	public Client(){
		
	}
	
	public Client(int idClient, int idAdresse, String nomClient, String prenomClient, int telClient,
			String typeClient) {
		super();
		this.idClient = idClient;
		this.idAdresse = idAdresse;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telClient = telClient;
		this.typeClient = typeClient;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public String getNomClient() {
		return nomClient;
	}
	
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public String getPrenomClient() {
		return prenomClient;
	}
	
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	
	public int getTelClient() {
		return telClient;
	}
	
	public void setTelClient(int telClient) {
		this.telClient = telClient;
	}
	
	public String getTypeClient() {
		return typeClient;
	}
	
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	
}
