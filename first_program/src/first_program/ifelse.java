package first_program;

public class ifelse {
    static int method(char c) {
    	int a;
    	if(c>='A' && c<='Z') {
			a=0;
			
		}
		else if(c>='a' && c<='z') {
			a=1;
			
		}
		else if(c>='0' && c<='9') {
			a=2;
		}
		else {
			a=3;
		}
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='$';
		int val=method(c);
		switch(val) {
		case 0:
			System.out.println("uppercase");
			break;
		case 1:
			System.out.println("lowercase");
			break;
		case 2:
			System.out.println("numbers");
			break;
		default:
			System.out.println("special case");
			break;
			
		}

	}

}
