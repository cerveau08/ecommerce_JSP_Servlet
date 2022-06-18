package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Panier;

public interface IPanier {
	
	public int add(Panier panier);
	public List<Panier> getAll();
	public boolean update(Panier panier);
	public boolean delete(int id);
	public Panier get(int id);
}
