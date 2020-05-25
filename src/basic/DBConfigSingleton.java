package basic;

public class DBConfigSingleton {
	private String hostNamel;
	private String port;
	private String userName;
	private String password;
	public String getHostNamel() {
		return hostNamel;
	}
	public void setHostNamel(String hostNamel) {
		this.hostNamel = hostNamel;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Step 1
	private static final DBConfigSingleton config = new DBConfigSingleton();
	
	// Step 2 - Private Constructor
	
	private DBConfigSingleton(){
		this.hostNamel="www.test.com";
		this.port="8080";
		this.userName="rajeev";
		this.password="Rjaeev@12345";
	}
	
	// Step 3 - method to get the #step1 object
	
	public static DBConfigSingleton getInstance(){
		return config;
	}	
	
	@Override
	public String toString() {
		return "DBConfigSingleton [hostNamel=" + hostNamel + ", port=" + port + ", userName=" + userName + ", password="
				+ password + "]";
	}
}
