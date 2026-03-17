package Object_Class.Equals;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1 = new Candidate("A",22,1);
		Candidate c2 = new Candidate("A",22,1);
		
		Candidate c3=null;
		Candidate c4=c2;
		System.out.println(c3.equals(c2));
		System.out.println(c4.equals(c2));
		System.out.println(c2.equals(c1));
	}

}
