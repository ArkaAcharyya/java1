package array;

public class col_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1},{2,4},{3}};
		boolean val=(check(arr)==true);
		if(val) {
			System.out.println("column matrix");
		}
		else {
			System.out.println("not a column matrix");
		}
	}
	public static boolean check(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length!=1) {
				return false;
			}
		}
		return true;
	}

}
