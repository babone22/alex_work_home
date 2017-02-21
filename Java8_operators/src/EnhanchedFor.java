import java.util.Arrays;
import java.util.List;

/**
 * Created by alex on 16/02/2017.
 */
public class EnhanchedFor {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Hello", "testing", "stuff");

        for (String aMyList : myList) {
            System.out.println(aMyList.contains("stuff") ? "yes" : "nope");
        }

    }
}
