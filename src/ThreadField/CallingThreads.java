package ThreadField;

public class CallingThreads {

    public static void main(String[] args){
        while(true) {
            Thread st = new Thread(new SampleWorkerThread());
            st.start();
        }
    }
}
