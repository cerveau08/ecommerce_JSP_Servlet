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
public class Article implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String nom;
	@Column(length = 150, nullable = false)
	private Double stock;
	@OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
	private List<LignePanier> lignePagniers = new ArrayList<LignePanier>();
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getStock() {
		return stock;
	}
	
	public void setStock(Double stock) {
		this.stock = stock;
	}
	
	public List<LignePanier> getLignePagniers() {
		return lignePagniers;
	}
	
	public void setLignePagniers(List<LignePanier> lignePagniers) {
		this.lignePagniers = lignePagniers;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
