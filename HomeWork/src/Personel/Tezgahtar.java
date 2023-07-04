package Personel;

public class Tezgahtar extends Personel {
	private double satıs;

	public Tezgahtar(String ad, double satıs) {
		super(ad);
		this.satıs = satıs;
	kazancEkle(satıs);
	
	
	}
	public void kazancEkle(double kazanc) {
	 super.setToplamKazanc(kazanc);
	}
	@Override
	public void maasHesapla() {
		double tezgahtarMaas;
		if (satıs >= 10000 && satıs < 20000) {
			tezgahtarMaas = super.getUcret() +satıs * 0.05;
		} else if (satıs > 20000)
			tezgahtarMaas = super.getUcret() +satıs * 0.07;

		else {
			tezgahtarMaas = super.getUcret();
		}
		 super.setToplamGider(tezgahtarMaas);
		System.out.println("Tezgahrain bu  ayki  satisi :"+ satıs+"\n bu  ayki maasi "+tezgahtarMaas);
	}
}
