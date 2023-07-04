package Hayvanlar;

public class KaraHayvanları extends Hayvan{
 
	private String beslenme;
	
	public KaraHayvanları(String ad,String habitat, String beslenme) {
		super( ad,habitat); 
		this.beslenme=beslenme;
		 
		System.out.println("Kara hayvani yaratildi");
		
	}
	public void kos(int adım) {
		System.out.println(adım+" kosuldu");
	}
 
	
}
