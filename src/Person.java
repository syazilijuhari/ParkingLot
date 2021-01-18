public class Person implements Data{
	private static String personID;
	private static String category;
	
	public Person(String i, String c) {
		personID = i;
		category = c;
	}
	
	public static String getID() {
		return personID;
	}
	
	public static String getCategory() {
		return category;	
	}
	
	public void getInfo() {
		System.out.println(personID + " " + category);
	}
}

class Student extends Person {
	public Student(String i, String c) {
		super(i,c);
	}
	
	public void display() {
		super.getInfo();
	}
}

class Staff extends Person {
	public Staff(String i, String c) {
		super(i,c);
	}
	public void display() {
		super.getInfo();
	}
}