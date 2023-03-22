package tpTrierArticlev2;

import java.util.Comparator;

public class CompareMarque implements Comparator<Article> {
	@Override
	public int compare(Article o1, Article o2) {
		return o1.getMarque().compareToIgnoreCase(o2.getMarque());
	}
}