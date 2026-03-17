package first_program;

import java.util.Scanner;

public class days_in_a_month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=userInput.nextInt();
		System.out.println("Enter a year");
		int year=userInput.nextInt();
		switch(num) {
		case 2:
			if((year%400==0)||(year%100!=0 && year%4==0)) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		}
	}

}
