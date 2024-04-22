package ThreadField;

import java.util.ArrayList;
import java.util.List;

public class SampleWorkerThread implements Runnable {

    List<JunkObject>  junkList = new ArrayList<>();

    @Override
    public void run() {
        long i = 1;
        while(true){
            junkList.add(new JunkObject());
            i=i*i++;
        }
    }
}

 class JunkObject {
    String junk = "oijdasdsoijssssssssssssssssssssssssssssssssssaoijdoisajdaoijdoisajdaoijdoisajdoisajdisaoj"+
            "oijdasdsoijssssssssssssssssssssssssssssssssssaoijdoisajdaoijdoisajdaoijdoisajdoisajdisaoj"+
            "oijdasdsoijssssssssssssssssssssssssssssssssssaoijdoisajdaoijdoisajdaoijdoisajdoisajdisaoj";



}
