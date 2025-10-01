package simpleCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        Map<Boolean, List<Integer>> partMap = numbers.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        List<Integer> evenNumbers = partMap.get(true);
        List<Integer> oddNumbers = partMap.get(false);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }


}