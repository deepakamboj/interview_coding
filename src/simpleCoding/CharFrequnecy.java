package simpleCoding;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharFrequnecy {
    public static void main(String[] args) {


        String inputString = "Java Concept Of The Day";
        inputString.chars()
                .filter(c->c !=' ')
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);//print using entrySet without saving into Map variable


         //second way

        Map<String, Long> countChar = Stream.of(inputString.split(""))
                                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countChar.forEach((key,value)->System.out.println(key+" "+value));//print using forEach

        System.out.println("frequnecy of each character: " + countChar);//or print directly


    }
}