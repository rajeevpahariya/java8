package basic;

public class Engineer extends Manager{

	private String stream;

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public Engineer(String name, int id, double salary, String dob, String dept, String stream) {
		super(name, id, salary, dob,dept);
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"+
				"Stream: "+getStream();
	}
}
