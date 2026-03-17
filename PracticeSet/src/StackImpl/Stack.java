package StackImpl;

public class Stack{
	private static int[] stArr;
	private static int top;
	private static int capacity;
	public Stack(int size) {
		capacity=size;
		stArr = new int[capacity];
		top=-1;
	}
	public static void push(int value) {
		if(top==capacity-1) {
			System.out.println("Stack overflow");
			return;
		}
		stArr[++top]=value;
		System.out.println(value+" is pushed into the stack");
	}
	public static int pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int value=stArr[top--];
		System.out.println(value+ " is popped");
		return value;
	}
	public static void peek() {
		if(top==-1) {
			System.out.println("Empty stack");
			return;
		}
		System.out.println("The topmost element is "+stArr[top]);
	}
}
