package entite;

public class CommandeShow {

	// D permet d'éviter d'avoir des variables ayant le même nom dans 2 classes
	// différentes!
	private int idClientD;
	private int idCmdD;
	private int quantiteCmdClientD;
	private String libArticleD;
	private String statutCommande;
	private long prixD;
	private long prixTotalD;
	
	

	public int getIdClientD() {
		return idClientD;
	}

	public void setIdClientD(int idClientD) {
		this.idClientD = idClientD;
	}

	public int getIdCmdD() {
		return idCmdD;
	}

	public void setIdCmdD(int idCmdD) {
		this.idCmdD = idCmdD;
	}

	public int getQuantiteCmdClientD() {
		return quantiteCmdClientD;
	}

	public void setQuantiteCmdClientD(int quantiteCmdClientD) {
		this.quantiteCmdClientD = quantiteCmdClientD;
	}

	public String getLibArticleD() {
		return libArticleD;
	}

	public void setLibArticleD(String libArticleD) {
		this.libArticleD = libArticleD;
	}
	
	public String getStatutCommande() {
		return statutCommande;
	}

	public void setStatutCommande(String statutCommande) {
		this.statutCommande = statutCommande;
	}


	public long getPrixD() {
		return prixD;
	}

	public void setPrixD(long prixD) {
		this.prixD = prixD;
	}

	public long getPrixTotalD() {
		return prixTotalD;
	}

	public void setPrixTotalD(long prixTotalD) {
		this.prixTotalD = prixTotalD;
	}

}
