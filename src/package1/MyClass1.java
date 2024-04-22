package package1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

class MyClass1 extends MyClass12 implements Interface1 {
    static int a;

    static {
        a++;
    }

    MyClass1() {
        a = 4;

    }

    MyClass1(int a) {


        this.a = a;

    }

    public void printHello() {

        Integer d = 454;

        oombu();

    }

    @Override
    public void dostuff() {

    }

    @Override
    public void oombu() {

    }

    public double somemetho(long a, byte b, double d) {
        return a + b + d;
    }

    public static void main(String[] args) {
        new MyClass1().oombu();
        String s = false + " " + true;
        LocalDateTime dt = LocalDateTime.now();


        int i;
        char c;
        final String s1 = "";
        final Object o = new Object();


        System.out.println(Integer.MAX_VALUE);

    }

    @Override
    protected void method1() {
    }


}

