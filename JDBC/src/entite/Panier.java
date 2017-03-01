package entite;

public class Panier {

	private int idCmd;
	private int idArticle;
	private int quantiteCmdClient;

	public int getIdCmd() {
		return idCmd;
	}

	public void setIdCmd(int idCmd) {
		this.idCmd = idCmd;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getQuantiteCmdClient() {
		return quantiteCmdClient;
	}

	public void setQuantiteCmdClient(int quantiteCmdClient) {
		this.quantiteCmdClient = quantiteCmdClient;
	}

}
