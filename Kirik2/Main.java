import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println("My Baby Left Me (at " + dateFormat.format(new Date()) + ")");
    }
}
