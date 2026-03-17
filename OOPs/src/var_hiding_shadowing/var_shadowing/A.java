package var_hiding_shadowing.var_shadowing;

public class A {
	int x=10;
	static int y=20;
	void show() {
		int x=20;
		int y=30;
//		System.out.println(x);
//		System.out.println(this.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(A.y);
	}
	public static void main(String[] args) {
		new A().show();
	}
}
