package sn.isi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sn.isi.entities.Paiement;
import sn.isi.hibernateutil.HibernateUtil;

public class PaiementImpl implements IPaiement{
	
	private Transaction transaction;
	@Override
	public int add(Paiement paiement) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(paiement);
			transaction.commit();
			return 1;
		} catch (Exception e2) {
			return 0;
		}
	}

	@Override
	public List<Paiement> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(Paiement.class).list();
	}
	
	@Override
	public boolean update(Paiement paiement) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.merge(paiement);
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
			session.delete(session.get(Paiement.class,  id));
			transaction.commit();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
	@Override
	public Paiement get(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session.get(Paiement.class, id));
		return (Paiement) session.get(Paiement.class, id);
	}
}
