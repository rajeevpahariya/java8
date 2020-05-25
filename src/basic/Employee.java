package basic;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private String dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public Employee(String name, int id, double salary, String dob) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee Name: "+ getName() + "\n"+
						  "Id: "+getId() + "\n"+
						  "DOB: "+ getDob() + "\n"+
						  "Salary: "+ getSalary();
	}
}
