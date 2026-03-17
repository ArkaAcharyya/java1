package string;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		StringBuilder str = new StringBuilder(sc.nextLine());
		StringBuilder str2=new StringBuilder("");
		int i=0;
		while(i<str.length() && str.charAt(i)==' ') {
			i++;
		}
		while(i<str.length()) {
			str2.append(str.charAt(i++));
		}
		System.out.println("Original string: "+str);
		System.out.println("New string: "+str2);
	}

}
