public class ParkingLot implements Data {
	private static String personID;
	private static String category;
	private static String plate;
	private static String type;
	
	public ParkingLot(String i, String c, String p, String t) {
		personID = i;
		category = c;
		plate = p;
		type = t;
	}
	
	public static String getID() {
		return personID;
	}
	
	public static String getCategory() {
		return category;
	}
	
	public static String getPlateNo() {
		return plate;
	}
	
	public static String getType() {
		return type;
	}
	
	public void getInfo() {
		System.out.println(personID + " " + category + " " + plate + " " + type);
	}
}

class ManagerLot extends ParkingLot {
	public ManagerLot(String i, String c, String p, String t) {
		super(i,c,p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}

class StaffLot extends ParkingLot {
	public StaffLot(String i, String c, String p, String t) {
		super(i,c,p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}

class GeneralLot extends ParkingLot {
	public GeneralLot(String i, String c, String p, String t) {
		super(i,c,p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}

class MotorLot extends ParkingLot {
	public MotorLot(String i, String c, String p, String t) {
		super(i,c,p,t);
	}
	
	public void display() {
		super.getInfo();
	}
}