package Currency;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency inr= Currency.getInstance("INR");
		Currency usd= Currency.getInstance("USD");
		System.out.println("INR Code: "+inr.getCurrencyCode());
		System.out.println("US symbol: "+usd.getSymbol());
		
		//WHY: Same amount, diff countries
		BigDecimal amount= new BigDecimal("125000.75");
		
		//HOW: Locale based currency formatting
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN")); 
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat ukFormat = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.println("India Format: "+ indiaFormat.format(amount));
		System.out.println("US Format: "+ usFormat.format(amount));
		System.out.println("UK Format: "+ ukFormat.format(amount));
		
	}

}
