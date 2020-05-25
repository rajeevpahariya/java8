package basic;

public class EmployeeTest {
	public static void main(String[] args) {
		
		try{
			
			Employee emp = new Employee("Rajeev", 100, 1800000, "1988-15-07");
			Manager mng = new Manager("Amar", 100, 2000000, "1989-12-07","Civil");
			Engineer eng = new Engineer("Swadedsh", 100, 800000, "1988-31-03","Delivery","Civil");
			
			printEmp(emp);
			printEmp(mng);
			printEmp(eng);
			
			// Overloading or virtual overloading
			
			Employee emp1 = new Manager("Ranu", 100, 3000000, "1987-12-07","EC");
			printEmp(emp1); // toString method will be called from the Manager as runtime will 
							// look for object reference which is manager.
			
			Manager mng1 = (Manager) emp1;
			//Manager mng2 = (Manager) emp; // Classcast exception
			//Engineer eng1 = (Engineer) emp1; // Classcast exp
			Employee emp2 = eng;
			printEmp(mng1);
			printEmp(emp2);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void printEmp(Employee emp) {
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(emp);
	}
}

