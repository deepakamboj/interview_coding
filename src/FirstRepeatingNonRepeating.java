import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingNonRepeating {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s","").toLowerCase();

        Map<String,Long> countMap = Arrays.stream(inputString.split(""))
                                          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String firstRepeatingChar =countMap.entrySet().stream().filter(entry->entry.getValue()>1)
                                                                .map(entry->entry.getKey())
                                                                .findFirst()
                                                                .get();
        System.out.println("First repeating character: "+firstRepeatingChar);

        //for non-repeating character
        String nonRepeating = countMap.entrySet().stream()
                                       .filter(entry->entry.getValue()==1)
                                       .map(entry->entry.getKey())
                                        .findFirst()
                                        .get();
        System.out.println("First non-repeating character : "+nonRepeating);
//        Function.identity() → group by character itself
//        LinkedHashMap::new → preserve original order
//        Collectors.counting() → count occurrences

    }
}
