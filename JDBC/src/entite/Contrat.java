package entite;

import java.io.Serializable;

public class Contrat implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	private int idContrat;
	private int idStatut;
	private String dateDebut;
	private String dateFin;
	
	
	public Contrat() {		
	}
	
	
	public int getIdContrat(){
		return idContrat;
	}

	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}
	
	public int getIdStatut() {
		return idStatut;
	}


	public void setIdStatut(int idStatut) {
		this.idStatut = idStatut;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
		public String getDateFin() {
			return dateFin;
	}

		public void setDateFin(String dateFin) {
			this.dateFin = dateFin;
	
		
	}
}