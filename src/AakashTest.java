

public class AakashTest {

    public static void main(String args[]) {
        Student std = new Student();
        std.name = "aakash";

        if (std.name == "aakash") {
            System.out.println("the sum of 4 and 5 is " + std.add(4, 5));
        } else {
            System.out.println("the sub of 10 and 5 is " + std.sub(10, 5));
        }

    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

}
