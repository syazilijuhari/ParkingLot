public class Vehicle implements Data {
	private static String plate;
	private static String type;
	
	public Vehicle(String p, String t) {
		plate = p;
		type = t;
	}
	
	public static String getPlateNo() {
		return plate;
	}
	
	public static String getType() {
		return type;
	}
	
	public void getInfo() {
		System.out.println(plate + " " + type);
	}
}

class Car extends Vehicle {
	public Car(String p, String t) {
		super(p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}

class Motorcycle extends Vehicle {
	public Motorcycle(String p, String t) {
		super(p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}

class Bus extends Vehicle {
	public Bus(String p, String t) {
		super(p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}

class Lorry extends Vehicle {
	public Lorry(String p, String t) {
		super(p,t);
	}
}