package method_overloading;

public class Demo {
//	public static void addition() {
//		//base1
//	}
//	public static void addition(double op1, double op2) {
//		//base 2
//	}
//	public static void addition(float op1, double op2) {
//		//base 3
//	}
//	public static void addition(double op1, char op2, double op3) {
//		//base 4
//	}
	public void addition() {
		//base1
		System.out.println("Base 1");
	}
	public void addition(double op1, double op2) {
		//base 2
		System.out.println("Base 2");
	}
	public void addition(float op1, double op2) {
		//base 3
		System.out.println("Base 3");
	}
	public void addition(double op1, char op2, double op3) {
		//base 4
		System.out.println("Base 4");
	}
}

