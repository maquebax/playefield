package package2;

import package1.MyClass12;

import java.util.HashSet;
import java.util.Set;

public class Myclass extends MyClass12 {
    @Override
    protected void method1() {

    }

    public static void main(String[] args){
        MyClass12 cla = new MyClass12() {
            @Override
            protected void method1() {

            }
        };

        Set<String> newset = new HashSet<>();
        newset.contains("");

    }
}
