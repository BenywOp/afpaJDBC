package entite;

import java.io.Serializable;

public class Centre implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idCentre;
	private int idAdresse;
	private int idClient;
	private int telCentre;
	
	
	public Centre() {
		
	}
	
	public int getIdCentre() {
		return idCentre;
	}
	public void setIdCentre(int idCentre) {
		this.idCentre = idCentre;
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
	public int getTelCentre() {
		return telCentre;
	}
	public void setTelCentre(int telCentre) {
		this.telCentre = telCentre;
	}
	

}