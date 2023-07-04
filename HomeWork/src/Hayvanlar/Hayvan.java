package Hayvanlar;

public class Hayvan {

	private String ad;
	private String habitat;
	public Hayvan(String ad, String habitat) {
		this.ad=ad;
		this.habitat=habitat;
		System.out.println("Hayvan yaratildi");
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	} 
	public void solunum() {
		System.out.println("Solunum yapildi");
		
	}
	
}
