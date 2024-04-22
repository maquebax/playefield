package ThreadField;

import java.util.List;
import java.util.concurrent.Callable;

public class CallableTest {
   public static void main(String[] args){


   }
}

class CallableTestClass implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello World";
    }


    //improve the below method  to return the name if it is not null
    public void testCopilot(){
        String name = "Hello World";

        if(name == null){
            System.out.println(name);
        }
        if(name !=null){
            System.out.println("null ah irruku");
        }

    }



}

