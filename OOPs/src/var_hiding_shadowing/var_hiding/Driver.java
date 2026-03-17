package var_hiding_shadowing.var_hiding;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.x);
		Child c = new Child();
		System.out.println(c.x);
	}

}
