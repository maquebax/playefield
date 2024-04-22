package ThreadJoinAndFork;

public class ThreadPlay implements Runnable {


    @Override
    public void run() {
        int i = 1000;
        while (i-- > 0) {
            System.out.println("*************************" + i);
        }
    }


    public static void main(String[] args ) throws InterruptedException {
        Thread th1 = new Thread(new ThreadPlay());
        th1.start();
        Thread.sleep(1);
        th1.join();
        System.exit(0);
    }
}
