package simpleCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindNthLargest {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("second largest : "+findNthLargest(listOfIntegers,2));
    }
    public static int findNthLargest(List<Integer> list, int n){
      return list.stream().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().get();
    }
}
