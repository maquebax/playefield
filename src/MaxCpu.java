public class MaxCpu {
    public static void main(String[] args){
        while (true){
            Thread t =  new Thread(() -> { long i  = 2L; while(true){ i = i * i; System.out.println(i);}});
            t.start();
        }
    }
}