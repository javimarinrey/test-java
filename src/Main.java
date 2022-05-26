import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> infoSendEmail;

    public static void main(String[] args) {

        Float f = 10.95F;
        String s = "" + f;
        String s1 = String.format("%.2f", f);

        System.out.println(f);
        System.out.println(s);
        System.out.println(s1);

    }
}
