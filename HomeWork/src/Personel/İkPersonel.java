package Personel;

public class İkPersonel extends Personel {
	public İkPersonel(String ad) {
		super(ad);
	}
	
	
	
	@Override
	public void maasHesapla() {
	 double ikMaas=super.getUcret()*1.5;
	 super.setToplamGider(ikMaas);
	 System.out.println("ik uzmani maasi : "+ikMaas);
	}

}
