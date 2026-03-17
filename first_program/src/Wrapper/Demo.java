package Wrapper;

public class Demo {
	public static void func1(String s) {
		long value=(long)(Byte.parseByte(s));
		if(value>127 || value<-128) {
			System.out.println("Out of Range");
			return;
		}
		byte val=0;
		if(s.charAt(0)=='+' || s.charAt(0)=='-') {
			if(s.length()==1) {
				System.out.println("Not a Number");
			}
			else if(s.length()>1) {
				if(s.charAt(1)=='+' || s.charAt(1)=='-') {
					System.out.println("Not a number");
				}
				else {
					for(int i=0;i<s.length();i++) {
						int fact=1;
						if(s.charAt(i)=='+'||s.charAt(i)=='-') {
							System.out.println("Not a number");
							return;
						}
						else if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) {
							continue;
						}
						else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
							val=(byte) (val+ (byte)val*fact);
							fact*=10;
						}
					}
					System.out.println("The number is: "+val);
				}
			}
		}

	}
	public static void main(String[] args) {
//		byte b=7;
//		System.out.println("b : "+b);
//		//wrapping;
//		Byte b1=b;
//		System.out.println("b1 : "+b1);
//		//unwrapping
//		byte b2=b1;
//		System.out.println("b2 : "+b2);
//		String bStr="7";
//		System.out.println("Type of bStr: "+bStr.getClass());
//		//Parsing using Constructor
//		Byte b3=new Byte(bStr);
//		System.out.println("b3: "+b3);
//		System.out.println("Type of b3: "+b3.getClass());
//		//Parse method
//		byte b4=Byte.parseByte(bStr); 
		String[] arr= {"-1","+1","1","-0","+0","0","1+","1-","++","--","a","a0","a9","!",""," ","129", "a-9"};
		for (String s : arr) {
            try {
                byte b = Byte.parseByte(s);
                System.out.println(b);
            } catch (Exception e) {
                func1(s);
            }
        }
		
	}
}
