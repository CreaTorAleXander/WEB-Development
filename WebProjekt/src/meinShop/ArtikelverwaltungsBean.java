package meinShop;
import java.util.ArrayList;

public class ArtikelverwaltungsBean {
	
	public static ArrayList<Article> articles = new ArrayList<>();
	
	
	public ArtikelverwaltungsBean() {
		
	}
	public ArrayList<Article> getAllArticles(){
		return this.articles;
	}
}
