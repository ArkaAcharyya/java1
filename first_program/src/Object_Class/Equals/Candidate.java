package Object_Class.Equals;

public class Candidate {
	String name;
	int age;
	int roll;
	public Candidate(String name,int age, int roll){
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
//	public Candidate(String name2, int age2, int roll2) {
//		// TODO Auto-generated constructor stub
//	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			System.out.println("First block as they are pointing to same reference");
			return true;
		}
		
		if(obj==null || getClass()!=obj.getClass()) {
			System.out.println("Either obj is null or they are of different class");
			return false;
		}
		Candidate c=(Candidate)obj;
		if(this.name==c.name) {
			System.out.println("object have same name");
			return true;
		}
		return false;
	}
}
