import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicate {
    public static void main(String[] args) {


        //Extract duplicate numbers
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = listOfIntegers.stream()
                                                      .filter(i->!uniqueNumbers.add(i))
                                                      .collect(Collectors.toSet());
        System.out.println(duplicateNumbers);



        //Extract duplicate characters
        String inputString = "Java Concept Of The Day".replaceAll("\\s","").toLowerCase();
        Set<String> uniqueChars = new HashSet<>();
        Set<String> duplicateChars = Arrays.stream(inputString.split(""))
                                           .filter(ch->!uniqueChars.add(ch))
                                           .collect(Collectors.toSet());
        System.out.println(duplicateChars);


    }
}
