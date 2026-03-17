package BigInteger;

import java.math.BigDecimal;

public class Driver {
	public static void main(String[] args) {
		
		//Floating point numbers
		double a=0.1;
		double b=0.2;
		
		//why not using double for transactions
		System.out.println("Result is: "+(0.1+0.2));
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal sum= bd1.add(bd2);
		System.out.println("BigDecimal result: "+sum);
		
		BigDecimal tax = new BigDecimal("0.345");
		BigDecimal sum1=sum.add(tax);
		
		System.out.println("Big Decimal result 2: "+sum1);
	}
}
