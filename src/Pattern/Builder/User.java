package Pattern.Builder;

public class User{
	private String givenName;
	private String surname;
	private String email;
	private String gender;
	private String phoneNumber;
	private int age;
	
	private User (UserBuilder builder){
		this.givenName=builder.givenName;
		this.surname=builder.surname;
		this.email=builder.email;
		this.gender=builder.gender;
		this.phoneNumber=builder.phoneNumber;
		this.age=builder.age;
	}
	
	public String getGivenName() {
		return givenName;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "User [givenName=" + givenName + ", surname=" + surname + ", email=" + email + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
	}

	public static class UserBuilder{
		private String givenName;
		private String surname;
		private String email;
		private String gender;
		private String phoneNumber;
		private int age;
		
		public UserBuilder() {
			super();
		}
		
		public UserBuilder age(int age){
			this.age=age;
			return this;
		}
		public UserBuilder givenName(String name){
			this.givenName=name;
			return this;
		}
		public UserBuilder surname(String surname){
			this.surname=surname;
			return this;
		}
		public UserBuilder gender(String gender){
			this.gender=gender;
			return this;
		}
		public UserBuilder email(String email){
			this.email=email;
			return this;
		}
		public UserBuilder phoneNumber(String phoneNumber){
			this.phoneNumber=phoneNumber;
			return this;
		}
		
		public User build(){
			User user = new User(this);
			return user;
		}
	}
	
}
