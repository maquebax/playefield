import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RandomTesst {


    public static void main(String args[]) {
        Random random = new Random(143L);

        SecureRandom srandom = null;
        try {
            srandom = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
//        System.out.println(" 20 Random numbers generated using Random Class with constant seed "+printRNUsingRandom(20,random));
        System.out.println(" 20 Random numbers generated using SecureRandom Class " + printRNUsingRandom(20, srandom));
    }

    private static String printRNUsingRandom(int n, SecureRandom r) {
        String seq = "";

        for (int i = 0; i < n; i++) {

            seq = seq + r.nextInt(n) + ", ";
        }
        return seq;
    }

    private static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }
}
