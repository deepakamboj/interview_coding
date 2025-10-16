package simpleCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array =  {5, 1, 7, 3, 9, 6};
		//way1
         Object[] array2 = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).toArray();
         System.out.println(Arrays.toString(array2));
         //way 2
        List<Integer> list = Arrays.asList(5, 1, 7, 3, 9, 6);
      
        List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list2);
    }
}
