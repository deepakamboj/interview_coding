import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueString {
    public static void main(String[] args) {
        List<String> listOfstrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStrings = listOfstrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrings);
    }

}
