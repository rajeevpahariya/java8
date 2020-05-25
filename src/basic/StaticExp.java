package basic;

public class StaticExp {
	public static int count = 10;
	public int num = 20;
	
	public static void main(String[] args) {
		System.out.println("Ststic count: "+ count);
		System.out.println("Non Static count: "+ new StaticExp().num); // Compilation issue. has to with object
		// Paste
		paste();
		new StaticExp().print();
	}
	
	public void print(){
		System.out.println("Print Static: "+ count);
		System.out.println("Print non-Static: "+ num);
	}
	
	public static void paste(){
		System.out.println("Paste Static :: "+ count);
		System.out.println("Paste non-Static :: "+ new StaticExp().num);
	}
	
	// SIB
	static {
		System.out.println("SIB Block test");
		count++;
	}
}
