package sn.isi.dto;

import java.util.ArrayList;
import java.util.List;

public class ArticleDto {

	private int id;
	private String nom;
	private Double stock;
	private List<String> lignePagniers = new ArrayList<String>();
	
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
	public List<String> getLignePagniers() {
		return lignePagniers;
	}
	public void setLignePagniers(List<String> lignePagniers) {
		this.lignePagniers = lignePagniers;
	}
	
	
	
}
