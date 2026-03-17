package string;

public class Decl {

	public static void main(String[] args) {
		String str1="Kunal";
		String str2="Kunal";
		String str4="Rajesh";
		String str3=new String("Kunal");
		String str5=new String("Kunal");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str5));
		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());
		if(str1==str2) System.out.println("same block");
		if(str1!=str3) System.out.println("diff block");
		if(str3!=str5) System.out.println("again diff");
	}

}
