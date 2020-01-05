package meinShop;

public class Article {

	public String beschreibung;
	public double ek;
	public double vk;
	public int bestand;

	public Article() {

	}
	
	public Article(String beschreibung, double ek, double vk, int bestand) {
		this();
		this.beschreibung = beschreibung;
		this.ek = ek;
		this.vk = vk;
		this.bestand = bestand;
	}

}
