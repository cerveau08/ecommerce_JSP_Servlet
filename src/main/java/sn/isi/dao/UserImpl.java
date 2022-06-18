package sn.isi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sn.isi.entities.User;
import sn.isi.hibernateutil.HibernateUtil;

public class UserImpl extends RepositoryImpl <User> implements IUser{
	
//	private Transaction transaction;
//	@Override
//	public int add(User user) {
//		try {
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			transaction = session.beginTransaction();
//			session.save(user);
//			transaction.commit();
//			return 1;
//		} catch (Exception e2) {
//			return 0;
//		}
//	}
//
//	@Override
//	public List<User> getAll() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		return session.createCriteria(User.class).list();
//	}
//	
//	@Override
//	public boolean update(User user) {
//		try {
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			transaction = session.beginTransaction();
//			session.merge(user);
//			transaction.commit();
//			return true;
//		} catch (Exception e2) {
//			return false;
//		}
//	}
//	
//	@Override
//	public boolean delete(int id) {
//		try {
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			transaction = session.beginTransaction();
//			session.delete(session.get(User.class,  id));
//			transaction.commit();
//			return true;
//		} catch (Exception e2) {
//			return false;
//		}
//	}
//	
//	@Override
//	public User get(int id) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		return (User) session.get(User.class, id);
//	}
//	
//	@Override
//	public User login(String email, String password) {
//		try {
//			Session session = HibernateUtil.getSessionFactory().openSession();
//			return (User) session.createQuery("select u from User u where u.email LIKE :em AND u.password LIKE :pass")
//	           .setString("em", email)
//	           .setString("pass", password)
//	           .uniqueResult();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
}
