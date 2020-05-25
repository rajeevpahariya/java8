
public class TextXYZ {
	public static void main(String[] args) {
		String s = "Name: " +"Rajeev"+ "\n" + "LName: "+ "Gupta";
		System.out.println(s);
		
		String str = "Rajeev";
		
		switch (str) {
		case "Rajeev1":
			System.out.println("Rajeev1");
			System.out.println("Rajeev1");
			break;
		case "Rajeev":
			System.out.println("Rajeev");
			System.out.println("Rajeev");
			System.out.println("Rajeev");
			break;
		default:
			break;
		}
	}
}

class Test5{
	private String name;
	public Test5(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}