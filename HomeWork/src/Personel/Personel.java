package Personel;

public class Personel {
private String adSoyad;
private final double ucret=11402;
private static int sayac;
private static double toplamGider=0;
private static double toplamKazanc=0;
private static final double  kira =50000;

public Personel(String ad) {
	this.adSoyad=adSoyad;
	sayac++;
}
public static double getToplamGider() {
	return toplamGider;
}
public static void setToplamGider(double toplamGider) {
	Personel.toplamGider += toplamGider;
}
public double getUcret() {
	return ucret;
}
public static int getSayac() {
	return sayac;
}
public static double getToplamKazanc() {
	return toplamKazanc;
}
public static void setToplamKazanc(double toplamKazanc) {
	Personel.toplamKazanc += toplamKazanc;
}

public void maasHesapla() {
	System.out.println("Personel  sinifi maas hesapla");
}
public  void karZarar(double kazanc,double gider ) {
	double durum=kazanc-gider-this.kira;
	if(durum<0) {
		System.out.println("bu ayki  zararimimiz : "+durum );
	}else {
		System.out.println("Bu ayki  karimiz : "+durum );
	}
}
}
