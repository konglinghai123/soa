package opensoa.drools.utility;

public class FunctionHelper {
	
	public static final String CURRENCY_USD = "USD";
	public static final String CURRENCY_EUR = "EUR";
	public static final String CURRENCY_GBP = "GBP";
	
	public static float currencyConverter (String currencyFrom, float price) {
		System.out.println("Calculating currency");
		if (currencyFrom.equalsIgnoreCase(CURRENCY_EUR)) 
			return price * 1.5f;
		else if (currencyFrom.equals(CURRENCY_GBP))
			return price * 1.35f;
		else if (currencyFrom.equals(CURRENCY_USD))
			return price;
		return 0;
	}
}
