package main;

import sn.isi.dao.ArticleImpl;
import sn.isi.dao.IArticle;
import sn.isi.dao.IUser;
import sn.isi.dao.UserImpl;
import sn.isi.entities.Article;
import sn.isi.entities.User;

public class Main {

	public static void main(String[] args) {

//		Article article = new Article();
//		article.setNom("ordinateur");
//		article.setStock(20.0);
//		
//		IArticle adao = new ArticleImpl();
//		int result = adao.add(article);
		
		User user = new User();
		user.setEmail("feuz@gmail.com");
		user.setPassword("cerveau");
		user.setPrenom("Fatoumata");
		user.setNom("Coly");
		
		IUser udao = new UserImpl();
		int resultUser = udao.add(user);
		
		udao.list(user).stream()
				.forEach(a->System.out.println("Id : " + a.getId() + " , Nom : " + a.getNom()));

	}
}
