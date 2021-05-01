package oopIntroHomework;

public class Course {

	public Course() {
		System.out.println("empty arrays");
	}
	
	public Course(int id,String name,double hour,String teacher) {
		this();
		this.id = id;
		this.name =name;
		this.hour=hour;
		this.teacher = teacher;
	}
	
	int id;
	String name;
	double hour;
	String teacher;
}

