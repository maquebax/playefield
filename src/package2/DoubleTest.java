package package2;

import java.util.LinkedList;
import java.util.Stack;

public class DoubleTest {
    static double num = 86400.00D;
    static double numOfDays = 456877D;

    public static void main(String[] args) {
        System.out.println("NUmber of days :  " + (numOfDays / num));
        System.out.println("NUmber of days :  " + (long) (numOfDays / num));

    }
}
