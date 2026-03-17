package Downcasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent p = new Parent();
//		Child c=(Child)p; // ClassCastException
		System.out.println("Start");
		Child c = new Child();
		System.out.println(c);
		Parent upcastedVar = c;
		System.out.println(upcastedVar);
		Child downCastedVar=(Child) upcastedVar;
		System.out.println(downCastedVar);
		//here all have same address but what matters is the datatype in which it is being stored
		//parent type cannot be stored directly in child without explicit typecasting
		//however parent type can be stored in parent and child type in child
		downCastedVar.pm();
		downCastedVar.cm();
		
		System.out.println("End");
		
	}

}
