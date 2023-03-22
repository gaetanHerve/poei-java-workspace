package tpTrierArticlev2;

import java.util.Comparator;

public class CompareMarquePrix implements Comparator<Article>{

	@Override
	public int compare(Article o1, Article o2) {
		int result = o1.getMarque().compareToIgnoreCase(o2.getMarque());
		if (result == 0)
			result = ((Integer)o1.getPrix()).compareTo(o2.getPrix());
		return result;
	}

}
