package Object_Class.clone;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101);
		Employee e2=(Employee)(e1.clone());
		System.out.println(e1);
		System.out.println(e2);
	}

}
