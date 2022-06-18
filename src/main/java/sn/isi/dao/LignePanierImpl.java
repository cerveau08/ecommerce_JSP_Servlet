package sn.isi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sn.isi.entities.LignePanier;
import sn.isi.hibernateutil.HibernateUtil;

public class LignePanierImpl implements ILignePanier{
	
	private Transaction transaction;
	@Override
	public int add(LignePanier lignePanier) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(lignePanier);
			transaction.commit();
			return 1;
		} catch (Exception e2) {
			return 0;
		}
	}

	@Override
	public List<LignePanier> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(LignePanier.class).list();
	}
	
	@Override
	public boolean update(LignePanier lignePanier) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.merge(lignePanier);
			transaction.commit();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
	@Override
	public boolean delete(int id) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.delete(session.get(LignePanier.class,  id));
			transaction.commit();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
	@Override
	public LignePanier get(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session.get(LignePanier.class, id));
		return (LignePanier) session.get(LignePanier.class, id);
	}
}
