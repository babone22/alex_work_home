import java.util.Arrays;
import java.util.List;

/**
 * Created by alex on 16/02/2017.
 */
public class MapStreamFilter {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Hello", "Salut", "Cartof");
        lista.stream()
                .filter((s) -> s.startsWith("S"))
                .forEach(System.out::println);

        String test = "ab";

        System.out.println(test.split(""));
    }


}
