import java.util.Arrays;
import java.util.stream.IntStream;

public class SortTwoInOne {
    public static void main(String[] args) {


        int[] a = new int[] {4, 2, 5, 1};
        int[] b = new int[] {8, 1, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

       System.out.println(c);//implicitly toString call of Object class
        System.out.println(c.toString());//explicitly toString call of Object class
        //above two lines will use Object class toString method and will print string representation not the actual content

    }
}
