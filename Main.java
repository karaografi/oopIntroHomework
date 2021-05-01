package oopIntroHomework;



public class Main {
	public static void main(String[] args) {
		
		
		Course course1 = new Course(1,"C# + Angular ",20,"Engin Demiro�");
		
		Course course2 = new Course(1,"Java + React ",30,"Engin Demiro�");
		
		Course course3 = new Course(1,"Basic Programming ",15,"Engin Demiro�");
		
		
		Course[] courses = {course1,course2,course3};
				
		for (Course course : courses) {
					
		System.out.println(course.name);
		}
				
		System.out.println(courses.length);
		
		System.out.println("--------------------");
		
		System.out.println("�dev 1");
		Odev odev1 = new Odev();
		odev1.id=1;
		odev1.name ="Kodlama.io sitesine gidiniz. : �dev Cevab�:";
		
		Odev odev2 = new Odev();
		odev2.id=2;
		odev2.name ="�zellik nesnesi olarak tan�mlad���m�z� d���nd���n�z iki �rnek veriniz. : �dev Cevab�:";
		
		Odev odev3 = new Odev();
		odev3.id=3;
		odev3.name ="Bunlara ait class, contructor yap�lar�n� olu�turup diziye ekleyip listeleyiniz. : �dev Cevab�:";
		
		Odev odev4 = new Odev();
		odev4.id=4;
		odev4.name ="�� s�n�f� olarak tan�mlad���m�z� d���nd���n�z bir class olu�turunuz. En az iki metot yaz�n�z.: �dev Cevab�:";

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
