package first_program;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter 3 digit num: ");
		short num = userInput.nextShort();
		System.out.print("Enter name: ");
		String name = userInput.nextLine();
 
		System.out.println("Num: " + num);
		System.out.println("Name: " + name);

	}

}
