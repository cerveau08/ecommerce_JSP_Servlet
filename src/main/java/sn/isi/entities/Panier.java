package sn.isi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Panier implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private Double quantite;
	@Column(length = 150, nullable = false)
	private int prix;
	@OneToMany(mappedBy = "panier", fetch = FetchType.EAGER)
	private List<LignePanier> lignePagniers = new ArrayList<LignePanier>();
	@OneToMany(mappedBy = "panier", fetch = FetchType.EAGER)
	private List<Commande> commandes = new ArrayList<Commande>();
	
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
	public List<LignePanier> getLignePagniers() {
		return lignePagniers;
	}
	public void setLignePagniers(List<LignePanier> lignePagniers) {
		this.lignePagniers = lignePagniers;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
}
