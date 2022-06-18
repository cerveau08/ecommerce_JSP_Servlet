package sn.isi.dto;

import java.sql.Date;

import sn.isi.entities.Commande;

public class PaiementDto {

	private int id;
	private Date date;
	private Commande commande;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
}
