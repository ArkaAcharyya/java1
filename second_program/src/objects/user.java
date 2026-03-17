package objects;

public class user {
	String email;
	String password;
	public user(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	String address;
	public user(String email, String password, String address) {
		this(email,password);
		this.address = address;
	}
	
}
