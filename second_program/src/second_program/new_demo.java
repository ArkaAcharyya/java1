package second_program;

public class new_demo {
	//final int i=9;
	static {
		System.out.println("Hello");
	}
	static int var=print();
	public static void main(String[] args) {
		System.out.println("main");
	}
	public static int print() {
		System.out.println("*");
		return 1;
    }
}
