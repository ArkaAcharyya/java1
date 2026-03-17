package objects;



public class user_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user us1 = new user("ABC","password1");
		user us2 = new user("ABCD","password2","address");
		System.out.println(us1.email);
		System.out.println(us1.password);
		System.out.println(us1.address);
		
		System.out.println(us2.email);
		System.out.println(us2.password);
		System.out.println(us2.address);
		
	}

}
