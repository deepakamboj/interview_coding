package simpleCoding;

import java.util.*;
import java.util.function.Function;
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

        String input = "Java Concept Of The Day".replaceAll("//s","").toLowerCase();
        Map<String,Long> cm = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

cm.entrySet().stream()
        .filter(entry->entry.getValue()>1)
        .forEach(i->System.out.println(i.getKey()));

    }
}
