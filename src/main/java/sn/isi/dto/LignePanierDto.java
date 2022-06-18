package sn.isi.dto;

import sn.isi.entities.Article;
import sn.isi.entities.Panier;

public class LignePanierDto {

	private int id;
	private Article article;
	private Panier panier;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	
}
