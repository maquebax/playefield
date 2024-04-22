
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class GenericTest {
//    List<String> list = List.of("","");
    double num = 1d;
    public static void main (String[] args){
        testHashtable();

    }

    static void testCopyOnWriteArrayList(){
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[]{1,2,3,4});
        list.stream().forEach(a->{if(a==4) list.add(5);System.out.println("*******"+a);});

        list.stream().forEach(System.out::println);
    }

    static void testHashtable() {
        ConcurrentHashMap<Integer, String> ht1 = new ConcurrentHashMap<>();
        ht1.put(1, "1");
        ht1.put(2, "2");
        ht1.put(3, "3");
        ht1.put(4, "4");

        ht1.entrySet().forEach((k->{if(k.getKey()==4)ht1.put(5,"5"); System.out.println(k.getValue());}));
        HashMap hm1 = new HashMap<String,String> ();
        hm1.put("1","1");
        hm1.put("2","2");
        hm1.put("3","3");
        hm1.put("4","4");
//        hm1.entrySet().forEach((k)->{if(k.equals("4"))hm1.put("5","5"); System.out.println(k);});


    }
}
