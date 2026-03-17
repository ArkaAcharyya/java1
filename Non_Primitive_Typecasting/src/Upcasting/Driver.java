package Upcasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		Parent p1 = c1;
		p1.pm();
		System.out.println(p1.p);
//		cannot access child members by using upcasted variable
//		p1.cm();
//		System.out.println(p1.c);
			
	}

}
