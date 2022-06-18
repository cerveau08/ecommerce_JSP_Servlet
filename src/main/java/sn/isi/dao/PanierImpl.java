package sn.isi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sn.isi.entities.Panier;
import sn.isi.hibernateutil.HibernateUtil;

public class PanierImpl implements IPanier{
	
	private Transaction transaction;
	@Override
	public int add(Panier panier) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(panier);
			transaction.commit();
			return 1;
		} catch (Exception e2) {
			return 0;
		}
	}

	@Override
	public List<Panier> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(Panier.class).list();
	}
	
	@Override
	public boolean update(Panier panier) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.merge(panier);
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
			session.delete(session.get(Panier.class,  id));
			transaction.commit();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
	@Override
	public Panier get(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session.get(Panier.class, id));
		return (Panier) session.get(Panier.class, id);
	}
}
