package Object_Class.toString;

public class Employee {
	String name;
	int id;
	Employee(String name, int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return " name is: "+this.name+" id is: "+this.id;
	}
}
