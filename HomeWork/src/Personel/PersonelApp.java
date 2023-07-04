package Personel;

public class PersonelApp {
	/*
	 * Personel sınıfı Temizlikci müdür ik uzmanı Tezgahtar askari ucret 11402tl
	 * tezgahtar yaptıgı satis uzerinden prim satisi 10000- 20000 %5 20000> %7 ik
	 * uzmanı askari ucretin %150 müdür askari ucretin %250
	 */
	public static void main(String[] args) {

		Personel temizlikci = new TemizlikPersoneli("Ahmet Durdu ");
		Personel müdür = new Mudur("Ahmet okudu");
		Personel İkPersonel = new İkPersonel("Mehmet Kacti ");
	
		Personel tezgahtar1 = new Tezgahtar("Veli Kacti ", 18500);
		Personel tezgahtar2 = new Tezgahtar("ayse Kacti ", 28500);
		Personel tezgahtar3 = new Tezgahtar("dilara  Kacti ", 38500);
		Personel tezgahtar4 = new Tezgahtar("hüseyin Kacti ", 8500);

		System.out.println(" kurumda calisan toplam  personel  sayisi: " + temizlikci.getSayac());

		temizlikci.maasHesapla();
		System.out.println("----------------");
		müdür.maasHesapla();
		System.out.println("----------------");
		İkPersonel.maasHesapla();
		System.out.println("----------------");
		tezgahtar1.maasHesapla();
		System.out.println("----------------");
		tezgahtar2.maasHesapla();
		System.out.println("----------------");
		tezgahtar3.maasHesapla();
		System.out.println("----------------");
		tezgahtar4.maasHesapla();
		System.out.println("----------------");
 
		
		
		
		
System.out.println("---------------");
		System.out.println("Kurumun toplam personel gideri : " + temizlikci.getToplamGider());
		System.out.println("----------------");
		System.out.println("Kurumun toplam kazanci : "+temizlikci.getToplamKazanc());
		temizlikci.karZarar(temizlikci.getToplamKazanc(), temizlikci.getToplamGider());
	}
}
