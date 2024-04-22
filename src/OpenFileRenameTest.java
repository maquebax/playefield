import java.io.*;

public class OpenFileRenameTest {
    public static void main(String args[]) throws InterruptedException {
        File file = new File("Test1.txt");
        File target = new File("Test2.txt");
        FileDataWriter fileDataWriter = new FileDataWriter(file);
        fileDataWriter.start();
        fileDataWriter.join();
        System.out.println("Result : " + file.renameTo(target));

    }


}
