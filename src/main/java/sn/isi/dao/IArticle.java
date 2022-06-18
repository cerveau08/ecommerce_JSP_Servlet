package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Article;

public interface IArticle {

	public int add(Article article);
	public List<Article> getAll();
	public boolean update(Article article);
	public boolean delete(int id);
	public Article get(int id);
}
