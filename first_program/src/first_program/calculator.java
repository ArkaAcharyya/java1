package first_program;

import java.util.Scanner;

public class calculator {
	public static double add(double d1, double d2) {
		return d1+d2;
	}
	public static double sub(double d1, double d2) {
		return d1-d2;
	}
	public static double div(double d1, double d2) {
		return d1/d2;
	}
	public static double mul(double d1, double d2) {
		return d1*d2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator!");
		System.out.println("Enter first operand: ");
		double op1=sc.nextDouble();
		System.out.println("Enter the operation: ");
		char op=sc.next().charAt(0);
		System.out.println("Enter second operand: ");
		double op2=sc.nextDouble();
		double d=0;
		switch(op) {
		case '+':
			d=add(op1,op2);
			break;
		case '-':
			d=sub(op1,op2);
			break;
		case '/':
			d=div(op1,op2);
			break;
		case '*':
			
			d=mul(op1,op2);
			break;
		}
		System.out.println("answer is: ");
		System.out.println(d);
	}

}
