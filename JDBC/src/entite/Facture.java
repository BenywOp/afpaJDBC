package entite;

import java.sql.Date;

public class Facture {
	private int idFacture;
	private Date dateFacture;
	private long montantTtc;
	private int idClient;
	



	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public long getMontantTtc() {
		return montantTtc;
	}

	public void setMontantTtc(long montantTtc) {
		this.montantTtc = montantTtc;
	}

}
