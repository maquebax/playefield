import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyFileReader extends Thread {
    File file;

    MyFileReader(File file) {
        this.file = file;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.file))) {
            while (reader.readLine() != null) {
                System.out.println(reader.readLine());

            }
        } catch (Exception e) {

        }
    }
}
