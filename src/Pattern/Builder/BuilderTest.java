package Pattern.Builder;

public class BuilderTest {
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder().givenName("Rajeev")
									.surname("Gupta")
									.age(31)
									.gender("Male")
									.email("rgupta@pa.com")
									.phoneNumber("3556283789").build();
		
		User user2 = new User.UserBuilder().givenName("Amar")
									.surname("Nikhra")
									.age(32)
									.gender("Male")
									.email("aamr.nikhra@pa.com")
									.phoneNumber("7628376546").build();
		System.out.println(user1);
		System.out.println(user2);
									
	}
}
