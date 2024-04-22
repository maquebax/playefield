public class RecursionPractices {

    public static void main(String[] Args){
        recurse(5);
    }

    static void recurse(int n ){
        if(n == 0){
            System.out.println("***** "+n);
        }else if(n>0){
            System.out.println("***** "+n);
             recurse(n-1);

        }
        return
        ;
    }
}
