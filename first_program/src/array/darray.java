package array;

import java.util.Scanner;

public class darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] arr=new int[4][4];
//		int r=arr.length;
//		int c=arr[0].length;
//		System.out.println(r*c);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions: ");
		int n=sc.nextInt();
		int [][] arr= new int[n][n];
		int val=n*n;
		System.out.println("Enter "+val+" values: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"  ");
			}
		}
	}

}
