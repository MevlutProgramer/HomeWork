package Hayvanlar;

public class EtOburKara extends KaraHayvanları {
	public EtOburKara(String ad,String habitat,String beslenme ) {
		super(ad,habitat,beslenme);
		
	}
public void beslen(){
System.out.println("Et yendi ");	


}
public void avlan(String av) {
	System.out.println(av+" Avlandi");
}
}
