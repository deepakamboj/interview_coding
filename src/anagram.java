import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagram {
    public static void main(String[] args) {
        String s1= "Mother in law";
        String s2="Hitler woman";
        s1 = Stream.of(s1.replaceAll("\\s","")
                        .split(""))
                        .map(String::toLowerCase)
                        .sorted()
                        .collect(Collectors.joining());
        s2 = Stream.of(s2.replaceAll("\\s","")
                       .split(""))
                       .map(String::toLowerCase)
                       .sorted()
                       .collect(Collectors.joining());
        if(s1.equals(s2)) {
            System.out.println("An anagram");
        }else{
            System.out.println("Not An anagram");
        }


        boolean isAnagram = Arrays.equals(s1.replaceAll("\\s","")
                                            .toLowerCase()
                                            .chars()
                                            .sorted()
                                            .toArray(), s2.replaceAll("\\s","")
                                                                   .toLowerCase()
                                                                   .chars()
                                                                   .sorted()
                                                                   .toArray());

        System.out.println(isAnagram?"An anagram":"Not anagram");


    }
}
