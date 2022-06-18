package sn.isi.dto;

import java.util.ArrayList;
import java.util.List;

public class PanierDto {

	private int id;
	private Double quantite;
	private int prix;
	private List<String> lignePagniers = new ArrayList<String>();
	private List<String> commandes = new ArrayList<String>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getQuantite() {
		return quantite;
	}
	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public List<String> getLignePagniers() {
		return lignePagniers;
	}
	public void setLignePagniers(List<String> lignePagniers) {
		this.lignePagniers = lignePagniers;
	}
	public List<String> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<String> commandes) {
		this.commandes = commandes;
	}
	
	
}
