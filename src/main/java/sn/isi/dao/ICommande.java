package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Commande;

public interface ICommande {
	
	public int add(Commande commande);
	public List<Commande> getAll();
	public boolean update(Commande commande);
	public boolean delete(int id);
	public Commande get(int id);
}
