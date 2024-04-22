package algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = " ";
        System.out.println("the long substring is " + getLongestSubString(str));

    }

    private static int getLongestSubString(String str) {

        String longestString = "", buffer = "";
        for (int j = 0; j < str.length(); j++) {
            buffer = "";
            for (int i = j; i < str.length(); i++) {
                if (!buffer.contains("" + str.charAt(i))) {
                    buffer = buffer + str.charAt(i);
                } else {
                    break;
                }
            }
            if (longestString.length() < buffer.length()) {
                longestString = buffer;
            }
        }


        return longestString.length();
    }

   /* private static String getLongestSubString(String str) {

        Set<Character> longestSet = new HashSet<>();
        Set<Character> subSet = new HashSet<>();
        for(int i = 0; i  < str.length(); i++ ){
            subSet = new HashSet<>();
            for(int j = i ; j< str.length();j++){
                if(subSet.contains(str.charAt(j))){
                   break;
                }
                subSet.add(str.charAt(j));
            }
            if(subSet.size()>longestSet.size()){
                longestSet = subSet;
            }
        }

       return longestSet.toString();
    }*/
}
