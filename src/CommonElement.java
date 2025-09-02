import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(71, 21, 34, 89, 56, 28));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(12, 56, 17, 21, 94, 34));

         list3.retainAll(list4);// retain only the elements also present in list4
        System.out.println("common elements"+list3);
// We have to use growable array not fixed (given by Arrays.asList()) if we want to add/remove
    }
}

