import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListNode {

    public static void main(String[] args) {
  /*  ListNode a = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode b = new ListNode(5,new ListNode(6,new ListNode(4)));*/
        //ListNode a = new ListNode(9,new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9))))));
        ListNode a = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode b = new ListNode(9);
//        ListNode b = new ListNode(9, new ListNode(9,new ListNode(9)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.addTwoNumbers(a, b).toString());

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode output = null, head = null;
        List<ListNode> outputlist = new ArrayList<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {

                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            if (output == null) {
                output = new ListNode(sum % 10);
                head = output;
            } else {

                output.next = new ListNode(sum % 10);
                output = output.next;
            }

            sum = sum / 10;

        }

        output.next = new ListNode(sum);


        return head;
    }

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode next = this.next;
        String ans = " " + val + ",";
        while (next != null) {
            ans = ans + next.val + ",";
            next = next.next;
        }

        return ans.substring(0, ans.lastIndexOf(','));
    }


}
