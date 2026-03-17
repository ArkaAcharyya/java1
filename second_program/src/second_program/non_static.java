package second_program;

public class non_static {
	
	{
		System.out.println("blocks");
	}
	static {
		System.out.println("static block");
	}
	int i=f();
	static int j=f1();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
	    non_static d1=new non_static();
	    //non_static d2=new non_static();
		System.out.println("End of main");

	}
	public int f() {
		System.out.println("function f");
		return 1;
	}
	public static int f1() {
		System.out.println("function f1");
		return 1;
	}
	non_static(){
		System.out.println("Constructor");
	}

}
