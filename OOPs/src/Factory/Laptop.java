package Factory;

public class Laptop {
	private static Laptop laptop;
	private Laptop() {
		
	}
	
	public static Laptop laptopFactory() {
		// TODO Auto-generated constructor stub
		if(laptop==null) {
			System.out.println("Object created 1st time");
			laptop=new Laptop();
		}
		else {
			System.out.println("previously created object");
		}
		return laptop;
	} 
		
	
}
