package oopIntroHomework;


public class OdevManager {
	public void addToDatabase(Odev odev) {
		System.out.println("Veri Taban�na Eklendi :"+ odev.name);
	}
	
	public void finishAndContinue(Odev odev) {
		System.out.println("Bitir Ve Devam Et :"+ odev.name + "Di�er �deve Ge�iliyor...");
	}
}
