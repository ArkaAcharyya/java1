package ProblemSolving;

public class problem1 {
	public static int thirdLargest(int arr[]) {
        // code here
        int n=arr.length;
        if(n<3){
            return -1;
        }
        int l=0,sl=0,tl=0;
        for(int i=0;i<n;i++){
            int val=arr[i];
            if(val>=l){
                tl=sl;
                sl=l;
                l=val;
            }
            else if(val>=sl){
                tl=sl;
                sl=val;
            }
            else if(val>=tl){
                tl=val;
            }
        }
        return tl;
        
    }
}
