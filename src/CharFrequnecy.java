import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequnecy {
    public static void main(String[] args) {


        String inputString = "Java Concept Of The Day";
        Map<Character, Long> countMap = inputString.chars()
                                                  // .filter(c->c !=' ')
                                                   .mapToObj(c->(char)c)
                                                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("frequnecy of each character: " + countMap);
         countMap.entrySet().stream().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
    }
}