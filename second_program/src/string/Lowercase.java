package string;

import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		StringBuilder str = new StringBuilder(sc.nextLine());
		System.out.println("Your string is "+str);
		StringBuilder str2=new StringBuilder("");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				str2.append((char)(str.charAt(i)+32));
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				str2.append((char)(str.charAt(i)-32));
			}
			else {
				str2.append(str.charAt(i));
			}

		}
		System.out.println(str2.toString());

	}

}
