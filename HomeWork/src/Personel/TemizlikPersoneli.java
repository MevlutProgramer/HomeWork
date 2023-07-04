package Personel;

public class TemizlikPersoneli extends Personel{

	public TemizlikPersoneli(String ad) {
		super (ad);
	}
	@Override
	public void maasHesapla() {
 super.setToplamGider(super.getUcret());
	System.out.println("Temizlik personeli maasi "+super.getUcret());
	}
}
