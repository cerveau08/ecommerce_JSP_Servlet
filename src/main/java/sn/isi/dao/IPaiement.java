package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Paiement;

public interface IPaiement {
	
	public int add(Paiement paiement);
	public List<Paiement> getAll();
	public boolean update(Paiement paiement);
	public boolean delete(int id);
	public Paiement get(int id);
	
}
