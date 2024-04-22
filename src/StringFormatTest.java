import java.util.UUID;

public class StringFormatTest {

    public static void main(String[] args) {
        UUID id = null;
        String test = "http";
        String operator = "opr1", instanceid = "navis_dbz";
        StringBuilder builder = new StringBuilder();
        if (!test.contains("http"))
            builder.append("http://");
        builder.append("genericentity/entities?operator=")
                .append(operator).append("&instanceid=")
                .append(instanceid).append("size=2147483647");

        System.out.println("************************************* " + id);
    }
}
