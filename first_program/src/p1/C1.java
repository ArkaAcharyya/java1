package p1;

import java.util.Scanner;

public class C1 {
//	public static void m1() {
//		System.out.println("From m1");
//	}
//	private static void privateMethod() {
//		System.out.println("From private");
//	}
//	protected static void protectedMethod() {
//		System.out.println("From protected");
//	}
//	static void defaultMethod() {
//		System.out.println("From default");
//		
//	}
	//	public static void varArgs(double ...ds) {
//		for (int i = 0; i < ds.length; i++) {
//			System.out.println(ds[i]);
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
				//System.out.println(" ");
				
			}
			System.out.println();
		}
	}
	public static void varArgs(double ... ds) {
		System.out.println(ds[0]);
	}
}
