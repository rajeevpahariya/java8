package Date;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Person(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}
}
