import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Playfield {

    public static void main(String args[]){
        boolean one = true;
        boolean two = true;

        Set<Integer> mySet = new TreeSet<>();
        List<Integer> myList = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<Integer>();
        for (int i =0;i<3;i++){
            mySet.add(i);
            myList.add(i);
        }
        for (int i =0;i<=3;i++){
            mySet.remove(i);
//            myList.remove(i);
        }
        System.out.println("mySet "+mySet);
        System.out.println("myList "+myList);
        System.out.println("**********"+(!one||two));
    }
}
