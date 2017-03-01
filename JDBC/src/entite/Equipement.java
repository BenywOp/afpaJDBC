package entite;

import java.io.Serializable;

public class Equipement implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idEquipement;
	private int idCentre;
	private int idContrat;
	private int idModele;
	private String refEquipement;
	private String libEquipement;
	
	
	public Equipement () {
		
	}	
	
	
	public int getIdEquipement() {
		return idEquipement;
	}

	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
	}

	public int getIdCentre() {
		return idCentre;
	}
	public void setIdCentre(int idCentre) {
		this.idCentre = idCentre;
	}
	public int getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}
	public int getIdModele() {
		return idModele;
	}
	public void setIdModele(int idModele) {
		this.idModele = idModele;
	}
	public String getRefEquipement() {
		return refEquipement;
	}
	public void setRefEquipement(String refEquipement) {
		this.refEquipement = refEquipement;
	}
	public String getLibEquipement() {
		return libEquipement;
	}
	public void setLibEquipement(String libEquipement) {
		this.libEquipement = libEquipement;
	}
	
}