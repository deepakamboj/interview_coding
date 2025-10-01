package simpleCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array =  {5, 1, 7, 3, 9, 6};
        int[] reversed = IntStream.rangeClosed(1, array.length)
                                  .map(i->array[array.length-i])
                                  .toArray();
        System.out.println(Arrays.toString(reversed));
       // Arrays.stream(array).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
