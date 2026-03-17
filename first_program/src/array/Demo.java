package array;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Started");
//		Object[] arr=new Object[5];
//		arr[0]=true;
//		arr[1]=(byte)1;
//		arr[2]='k';
//		arr[3]="someString";
//		arr[4]=123456789L;
//		//arr[5]=false;
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("Ended");
		Object[] o1 = {12345678L,"string",1};
		boolean[] b1= {true,false};
		boolean[] b2= {true,false};
		char[] c1= {'k','i','l'};
		char[] c2= {'k','i','l'};
		Object[] o2 = {12345678L,"string",1};
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
	public void print1(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

}
