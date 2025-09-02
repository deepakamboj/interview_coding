import java.util.Arrays;
import java.util.List;

public class StartWithDigit {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("123", "apple", "9lives", "hello", "42world");
        listOfStrings.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
