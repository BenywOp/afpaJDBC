package entite;

import java.io.Serializable;

public class Adresse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idAdr;	
	private int numAdr;
	private String rueAdr;
	private String villeAdr;
	private int cpAdr;
	
	
	
	public Adresse() {
		
	}
	
	public int getIdAdr() {
		return idAdr;
	}
	
	public void setIdAdr(int idAdr) {
		this.idAdr = idAdr;
	}
	
	public int getNumAdr() {
		return numAdr;
	}
	
	public void setNumAdr(int numAdr) {
		this.numAdr = numAdr;
	}
	
	public String getRueAdr() {
		return rueAdr;
	}
	
	public void setRueAdr(String rueAdr) {
		this.rueAdr = rueAdr;
	}
	
	public String getVilleAdr() {
		return villeAdr;
	}
	
	public void setVilleAdr(String villeAdr) {
		this.villeAdr = villeAdr;
	}
	
	public int getCpAdr() {
		return cpAdr;
	}
	
	public void setCpAdr(int cpAdr) {
		this.cpAdr = cpAdr;
	}
	
}
