package string;

import java.util.Scanner;

public class Palindrome {
	public static boolean check(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i++)!=str.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		if(check(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
