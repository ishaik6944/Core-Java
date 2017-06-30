package com.info.cardjava;

import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

class  Cardnum extends RuntimeException {
	public Cardnum(String m) {
		super(m);
	}
}

class cVV extends RuntimeException {
	public cVV(String m){
		super(m);
	}

}

//class CardName extends RuntimeException {

//}
class ExpiryDate extends RuntimeException{
     public ExpiryDate(String m){
    	 super(m);
     }
	
}

public class CardDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please Enter Valid Card Number:");
		} catch (InputMismatchException | NumberFormatException e) {
			e.printStackTrace();
		}
		String number = sc.next();
		boolean numberCheck = false;
		numberCheck = isValid(number);
		if (numberCheck) {
			System.out.println("Card num is valid.");
		} else {
			throw new Cardnum("Card Number check failed, according to Luhn Algo.s");
		}
		String cardType = Cardtype(number);
		System.out.println("Your card type is " + cardType.toUpperCase());
		// System.out.println("Enter CardType:");
		// String cardtype=sc.next();
		System.out.println("Ener CVV :");
		String cVV = sc.next();
		boolean value=cVV(cVV);
		if(value){
			System.out.println("CVV is Valid.");
		}else {
			throw new cVV("CVV Numbers Length is not Correct according to card name.");
		}
		System.out.println("Enter the Expiry Date of Card:");
		int y =sc.nextInt();
		int m=sc.nextInt();
		YearMonth currentdate= YearMonth.now();
		YearMonth ExpiryDate=YearMonth.of(y,m);
		if(ExpiryDate.isAfter((currentdate))){
			System.out.println("The Expiry Date is Valid.Your Transaction is Processed.");
		}else{
			throw new ExpiryDate("The Expirydate of Card is Expired,Unable to Process Transaction.");
		}	
		
	}

	private static boolean isValid(String number) {
		int sum = 0;
		boolean alternate = false;
		for (int i = number.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(number.substring(i, i + 1));
			if (alternate) {
				n *= 2;
				if (n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum += n;
			alternate = !alternate;
		}
		return (sum % 10 == 0);
	}

	public static String Cardtype(String number) {
		
		if (number.startsWith("4") && number.length() == 16)
			return "Visa";
		else if (number.startsWith("5") && number.length() == 16)
			return "MasterCard";
		else if (number.startsWith("6") && number.length() == 16)
			return "Discover";
		else if (number.startsWith("37") && number.length() == 15)
			return "American Express";
		else
			return "Unknown type";
	}

private static boolean cVV(String cvv) {
		if (cvv.length() == 4)
			return true;
		else if (cvv.length() == 3)
			return true;
		else
			return false;
	}
}
