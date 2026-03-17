package array;

import java.util.Scanner;

public class segregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows (> 0): ");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns (> 0): ");
		int c=sc.nextInt();
		int [][] arr=new int[r][c];
		System.out.println("Enter "+r*c+" values: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		printer(arr);
		if(singletonMat(arr)) {
			System.out.println("Given matrix is a singleton matrix");
		}
		if(rowMat(arr)) {
			System.out.println("Given matrix is a row matrix");
		}
		if(colMat(arr)) {
			System.out.println("Given matrix is a column matrix");
		}
		if(squareMat(arr)) {
			System.out.println("Given matrix is square matrix ");
			if(nullMat(arr)) {
				System.out.println("Given matrix is also a null marix");
			}
			if(identityMat(arr)) {
				System.out.println("Given matrix is also an identity matrix");
			}
			if(diagonalMat(arr)) {
				System.out.println("Given matrix is also a diagonal matrix");
			}
		}
		else {
			System.out.println("Given matrix is a rectangular matrix");
		}

	}
	public static void printer(int[][]arr) {
		System.out.println("Printing array elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public static boolean singletonMat(int[][] arr) {
		return (arr.length==1 && arr[0].length==1)?true:false;
	}
	public static boolean rowMat(int[][] arr) {
		return (arr.length==1)?true:false;
	}
	public static boolean colMat(int[][] arr) {
		return (arr[0].length==1)?true:false;
	}
	public static boolean recMat(int[][] arr) {
		return (arr.length!=arr[0].length)?true:false;
	}
	public static boolean squareMat(int [][] arr) {
		return (arr.length==arr[0].length)?true:false;
	}
	public static boolean nullMat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!=0) return false;
				
			}
		}
		return true;
	}
	public static boolean identityMat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==j) {
					if(arr[i][j]!=1) return false;
				}
				else{
					if(arr[i][j]!=0) return false;
				}
			}
		}
		return true;
	}
	public static boolean diagonalMat(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
	        for(int j=0;j<arr[0].length;j++) {
	            if(i==j) {
	                if(arr[i][j] == 0) return false;
	            } else {
	                if(arr[i][j] != 0) return false;
	            }
	        }
	    }
	    return true;
	}

}
