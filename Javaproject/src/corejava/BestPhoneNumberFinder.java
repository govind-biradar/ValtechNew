package corejava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BestPhoneNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bestPhoneNumber = null;

        System.out.println("Enter 10 phone numbers:");

        for (int i = 0; i <2; i++) {
            System.out.print("Phone number " + (i + 1) + ": ");
            String phoneNumber = scanner.next();
            
            comapareTheNumber(phoneNumber);
            
           
        }

        scanner.close();

        System.out.println("The best phone number is: " + bestPhoneNumber);
    }

	public static void comapareTheNumber(String phoneNumber) {
        String bestPhoneNumber = null;
        System.out.println("hello");
        String pattern = ".*(\\d)\\1\\1\\1|(\\d)(\\d-1)(\\d-2).*";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(phoneNumber);
        System.out.println(matcher);
        if(matcher.find()) {
        	String matchingNumber = matcher.group();
            System.out.println(matchingNumber);
        }else {
        	System.out.println("Not Found");
        }
		
		
	}
}

