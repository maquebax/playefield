public class TryCatch {
    public static Integer someMethod(String s) {
        Integer i;
        try {
            i = new Integer(s);
            return i;
        } catch (NumberFormatException e) {
            i = new Integer(7);
            return i;
        } finally {
            i = new Integer(10);
        }


    }

    public static void main(String[] args) {
        System.out.println("********************* out " + someMethod("1sasd0"));
    }


}
