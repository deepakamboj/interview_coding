package simpleCoding;

import java.util.Arrays;
import java.util.List;

public class GetLastElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
       String lastElement= listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
        System.out.println(lastElement);
    }
}
