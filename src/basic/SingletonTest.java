package basic;

public class SingletonTest {
	public static void main(String[] args) {
		DBConfigSingleton db1 = DBConfigSingleton.getInstance();
		DBConfigSingleton db2 = DBConfigSingleton.getInstance();
		if(db1==db2) 
			System.out.println("Same DB Config Object");
		else 
			System.out.println("Different DB Config Object");
		
		System.out.println(db1);
		
	}
}
