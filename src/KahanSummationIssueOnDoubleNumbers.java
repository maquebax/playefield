import java.util.Locale;

public class KahanSummationIssueOnDoubleNumbers {

    public static void main(String[] args){
        double a = 1004.000;
        double b = 1300.485;
        double c = a + b - 2.000 ;
         System.out.println("*********** "+c);
         System.out.println("*********** "+Double.valueOf(String.format(Locale.US,"%.2f",a+b-2.335)).doubleValue());
    }
}
