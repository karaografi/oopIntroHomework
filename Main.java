package oopIntroHomework;



public class Main {
	public static void main(String[] args) {
		
		
		Course course1 = new Course(1,"C# + Angular ",20,"Engin Demiroð");
		
		Course course2 = new Course(1,"Java + React ",30,"Engin Demiroð");
		
		Course course3 = new Course(1,"Basic Programming ",15,"Engin Demiroð");
		
		
		Course[] courses = {course1,course2,course3};
				
		for (Course course : courses) {
					
		System.out.println(course.name);
		}
				
		System.out.println(courses.length);
		
		System.out.println("--------------------");
		
		System.out.println("Ödev 1");
		Odev odev1 = new Odev();
		odev1.id=1;
		odev1.name ="Kodlama.io sitesine gidiniz. : Ödev Cevabý:";
		
		Odev odev2 = new Odev();
		odev2.id=2;
		odev2.name ="Özellik nesnesi olarak tanýmladýðýmýzý düþündüðünüz iki örnek veriniz. : Ödev Cevabý:";
		
		Odev odev3 = new Odev();
		odev3.id=3;
		odev3.name ="Bunlara ait class, contructor yapýlarýný oluþturup diziye ekleyip listeleyiniz. : Ödev Cevabý:";
		
		Odev odev4 = new Odev();
		odev4.id=4;
		odev4.name ="Ýþ sýnýfý olarak tanýmladýðýmýzý düþündüðünüz bir class oluþturunuz. En az iki metot yazýnýz.: Ödev Cevabý:";

		Odev[] odevs = {odev1,odev2,odev3,odev4};
		
		for(Odev odev : odevs) {
			System.out.println(odev.name);
		}
		
		System.out.println("--------------------");
		
		OdevManager odevManager = new OdevManager();
		odevManager.addToDatabase(odev1);
		odevManager.addToDatabase(odev2);
		odevManager.addToDatabase(odev3);
		odevManager.addToDatabase(odev4);
		
		System.out.println("--------------------");
		
		odevManager.finishAndContinue(odev1);
		odevManager.finishAndContinue(odev2);
		odevManager.finishAndContinue(odev3);
		odevManager.finishAndContinue(odev4);

	}
}
