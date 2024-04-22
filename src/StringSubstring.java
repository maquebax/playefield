public class StringSubstring {
    static String mbeanInfo = "org.apache.activemq:brokerName=xps-amq-broker_LPC-NZLYT-LCT-MAIN,destinationName=bridge.LPC/NZLYT/LCT/MAIN,destinationType=Queue,type=Broker";

    public static void main(String args[]) {
        System.out.println(mbeanInfo);
        System.out.println(mbeanInfo.substring(31));
        int brokerName = mbeanInfo.indexOf("brokerName");
        int destName = mbeanInfo.indexOf("destinationName");
        int destType = mbeanInfo.indexOf("destinationType");
        System.out.println("**************************");
        System.out.println(mbeanInfo.substring(brokerName + 11, destName - 1));
        System.out.println(mbeanInfo.substring(destName + 16, destType - 1));
        System.out.println(mbeanInfo.substring(destType + 16));

    }
}
