package corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimilarAndDecreasingNumbers {
    public static void main(String[] args) {
        String text = "543";

        // Define the regular expression pattern
        String pattern = ".*(\\d)(\\d-1)(\\d-2).*";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher for the input text
        Matcher matcher = regex.matcher(text);
        System.out.println(matcher);

       
        // Find and print matching numbers
        while (matcher.find()) {
       
            System.out.println(text);
        }
    }
}
