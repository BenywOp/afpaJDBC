package entite;

import java.io.Serializable;

public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idArticle;
	private String libArticle;
	private int prixArticle;
	private int qteCommande;
	private int delaiLivraison;
	private int stock;
	private int qteMini;
	private int qteRepare;
	
	
	public Article() {
		
	}
	
	
	
	
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getLibArticle() {
		return libArticle;
	}
	public void setLibArticle(String libArticle) {
		this.libArticle = libArticle;
	}
	public int getPrixArticle() {
		return prixArticle;
	}
	public void setPrixArticle(int prixArticle) {
		this.prixArticle = prixArticle;
	}
	public int getQteCommande() {
		return qteCommande;
	}
	public void setQteCommande(int qteCommande) {
		this.qteCommande = qteCommande;
	}
	public int getDelaiLivraison() {
		return delaiLivraison;
	}
	public void setDelaiLivraison(int delaiLivraison) {
		this.delaiLivraison = delaiLivraison;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getQteMini() {
		return qteMini;
	}
	public void setQteMini(int qteMini) {
		this.qteMini = qteMini;
	}
	public int getQteRepare() {
		return qteRepare;
	}
	public void setQteRepare(int qteRepare) {
		this.qteRepare = qteRepare;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
