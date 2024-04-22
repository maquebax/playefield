import java.io.*;

class FileDataWriter extends Thread {
    File file;
    FileInputStream fileOS = null;


    FileDataWriter(File file) {
        this.file = file;
    }

    public void run() {
        try {
            fileOS = new FileInputStream(file);

            int i = 0;
            while ((i = fileOS.read()) != -1) {
                System.out.print((char) i);
                Thread.sleep(10);
            }

            fileOS.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}