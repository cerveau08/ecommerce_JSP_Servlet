package sn.isi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sn.isi.entities.Commande;
import sn.isi.hibernateutil.HibernateUtil;

public class CommandeImpl implements ICommande{
	
	private Transaction transaction;
	@Override
	public int add(Commande commande) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(commande);
			transaction.commit();
			return 1;
		} catch (Exception e2) {
			return 0;
		}
	}

	@Override
	public List<Commande> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(Commande.class).list();
	}
	
	@Override
	public boolean update(Commande commande) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.merge(commande);
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
			session.delete(session.get(Commande.class,  id));
			transaction.commit();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
	@Override
	public Commande get(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session.get(Commande.class, id));
		return (Commande) session.get(Commande.class, id);
	}
}
