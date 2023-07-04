package Personel;

public class Mudur extends Personel {

	
	public Mudur(String ad) {
		super(ad);
	}
	@Override
	public void maasHesapla() {
		double mudurMaasi=super.getUcret()*2.5;
		 super.setToplamGider(mudurMaasi);
System.out.println("Mudur maası :"+mudurMaasi);	
}
}
