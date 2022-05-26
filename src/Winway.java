import java.util.ArrayList;
import java.util.List;

public class Winway {


    public static List<String> infoSendEmail;

    public Winway() {
        this.infoSendEmail = new ArrayList<>();
        this.infoSendEmail.add("a");
    }

    public void set(String text) {
        this.infoSendEmail.add(text);
    }

    public void print() {
        System.out.println(this.infoSendEmail);
    }
}
