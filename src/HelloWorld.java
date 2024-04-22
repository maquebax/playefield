import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("hey there lets see if this works nad build from here");


        Map<String, String> map1 = new HashMap<String, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();

        String a = new String("One");
        //String a1 = new String("One");

        map1.put(a, "1");
        map1.put(a, "1");

        Integer b = new Integer(1);
        Integer b1 = new Integer(1);


        map2.put(b, "one");
        map2.put(b1, "one");
        System.out.println("***********string map21** " + map1.size());
        System.out.println("***********string map2** " + map2.size());

    }

    public interface MyInterface {

    }

    public interface MyInterface2 {

    }

    public class MyClass {

    }
}
