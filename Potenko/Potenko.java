import java.text.SimpleDateFormat;
import java.util.Date;

public class Potenko {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("Hello world      " + dateFormat.format(new Date()));
    }
}
