package basic;

public class EmployeeShare {
	public static final long manager = 100;
	public static final long eng = 50;
	public static final long employee = 10;
	
	public long getShare(Employee emp){
		long share = 0;
		if(emp instanceof Engineer){
			share = eng;
		}else if(emp instanceof Manager){
			share = manager;
		}else{
			share = employee;
		}
		return share;
	}
}
