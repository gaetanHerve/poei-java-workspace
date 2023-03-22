package tpTrierArticle;


public class Article implements Comparable<Article> {
	private String marque;
	private int prix;

	
	public Article(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Article [marque=" + marque + ", prix=" + prix + "]";
	}

	@Override
	public int compareTo(Article o) {
		int result = this.marque.toLowerCase().compareTo(o.marque.toLowerCase());
		if (result == 0)
			result = ((Integer)this.prix).compareTo(o.prix);
		return result;
	}
	
}
