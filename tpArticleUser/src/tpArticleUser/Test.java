package tpArticleUser;

import model.Article;

public class Test {

	public static void main(String[] args) {
		testArticle();
	}
	
	static void testArticle() {
		Article article = new Article("monArticle", 12.5);
		System.out.println(article);
	}

}
