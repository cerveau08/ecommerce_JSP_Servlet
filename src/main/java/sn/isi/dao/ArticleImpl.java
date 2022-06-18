package sn.isi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import sn.isi.entities.Article;
import sn.isi.hibernateutil.HibernateUtil;

public class ArticleImpl implements IArticle{

	private Transaction transaction;
	@Override
	public int add(Article article) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(article);
			transaction.commit();
			return 1;
		} catch (Exception e2) {
			return 0;
		}
	}
	
	

	@Override
	public List<Article> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createCriteria(Article.class).list();
	}
	
	@Override
	public boolean update(Article article) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.merge(article);
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
			session.delete(session.get(Article.class,  id));
			transaction.commit();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
	@Override
	public Article get(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session.get(Article.class, id));
		return (Article) session.get(Article.class, id);
	}
}
