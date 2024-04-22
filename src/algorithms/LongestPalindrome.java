package algorithms;

import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Timer;

import static java.time.temporal.ChronoUnit.SECONDS;

public class LongestPalindrome {

    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();

        String someString = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
//     String someString = "babad";
//        String someString = "madam";
        System.out.println("the longest palindrome from " + someString + " is :" + getLongestPalindrom(someString));
        System.out.println(t1.until(LocalTime.now(), SECONDS));

    }

    private static String getLongestPalindrom(String someString) {
        int startIndex, endIndex;
        String longestPalindrome = "";
        if (someString.length() == 1)
            return someString;
        for (int i = 0; i < someString.length() - 1; i++) {
            startIndex = i;
            for (int j = someString.length(); j >= i + 1; j--) {
                endIndex = j;
                if (isPalindrome(someString.substring(startIndex, endIndex))) {
                    if (longestPalindrome.length() < (endIndex - startIndex)) {
                        longestPalindrome = someString.substring(startIndex, endIndex);
                    }
                    break;
                }
            }
        }


        return longestPalindrome;

    }

    static boolean isPalindrome(String someString) {
        /*String reverseString = "";
        int j = 0;
        for(int i = someString.length()-1 ; i>=0;i--){

            if(!(someString.charAt(i) == someString.charAt(j)))
                break;
                reverseString = reverseString+someString.charAt(i) ;
            j++;
        }*/
        StringBuilder builder = new StringBuilder(someString);
        String reveseString = builder.reverse().toString();
        return reveseString.equals(someString);
        /*if(reverseString.equals(someString)){
            return true;
        }
        return  false;*/
    }
}
