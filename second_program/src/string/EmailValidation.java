package string;

public class EmailValidation {
	static String email="arka.acaharyya03@gmail.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isValid(String email) {
		
		if(!email.contains("@")) {
			return false;
		}
		if(email.indexOf("@")!=email.lastIndexOf("@")) {
			return false;
		}
		//if(email.endsWith("@gmail.com)||email)
		return true;
	}

}
