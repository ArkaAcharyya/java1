package Access_Modifier.package1;

import Access_Modifier.package2.Parent;

public class Child extends Parent{
//	@Override
//	public void method1() {
//		System.out.println("Override method 1");
//	}
//	@Override
//	protected void method2() {
//		System.out.println("Override method 2");
//	}
//	
//	void method3() {
//		System.out.println("Override method 3");
//	}
	public static void main(String[] args) {
		Child c=new Child();
		c.method1();
		c.method2();`
	}
}
