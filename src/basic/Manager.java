package basic;

public class Manager extends Employee{

	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Manager(String name, int id, double salary, String dob, String dept) {
		super(name, id, salary, dob);
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"+
				"Dept: "+getDept();
	}
}
