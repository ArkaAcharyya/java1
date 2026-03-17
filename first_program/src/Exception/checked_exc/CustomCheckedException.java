package Exception.checked_exc;

public class CustomCheckedException {
//	public static Permit validateAge(int age) throws InvalidAgeException, RandomException{
	public static void validateAge(int age) throws InvalidAgeException, RandomException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 years or more");
		}
		else if(age<21) {
			System.out.println("Soft Drinks allowed");
			throw new RandomException("Random Exception ");
		}
		else {
			
			System.out.println("Hard Drinks allowed");
			//return Permit.HARD;
		}
		//return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try {
			try {
				validateAge(16);
			} catch (InvalidAgeException | RandomException e) {
				// TODO Auto-generated catch block
				System.out.println("Caught exception: "+e.getMessage() );
			}
//		} catch (InvalidAgeException e) {
//			// TODO: handle exception
//			System.out.println("Caught exception: "+e );
//		}
	}
}
