package sliding1;

public class Driver {
	public static int subStr(String str,int k){
        int i=0,j=0;
        int n=str.length();
        int sum=0;
        //int startInd=-1;
        while(j<n){
            sum+=(int)(str.charAt(j));
            while(sum>k && i<=j) {
            	sum-=(int)(str.charAt(i));
            	i++;
            }
            if(sum==k) {
            	return i;
            }
            j++;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefghijklxyzmnopqrstuvwxyz";
        System.out.println(subStr(str,363));
	}

}
