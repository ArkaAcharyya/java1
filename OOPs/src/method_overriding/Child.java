package method_overriding;

import java.util.Scanner;

public class Child extends Parent{
	@Override
	public void printStar() {
		System.out.println("Enter number of stars: ");
		Scanner userInput=new Scanner(System.in);
		int count=userInput.nextInt();
		userInput.close();
		for(int i=0;i<count;i++) {
			System.out.println("*");
		}
	}
}
