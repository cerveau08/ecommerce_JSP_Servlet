package sn.isi.dao;

import java.util.List;


import sn.isi.entities.LignePanier;

public interface ILignePanier {
	
	public int add(LignePanier lignePanier);
	public List<LignePanier> getAll();
	public boolean update(LignePanier lignePanier);
	public boolean delete(int id);
	public LignePanier get(int id);
}
