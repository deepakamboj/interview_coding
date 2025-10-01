package simpleCoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingNonRepeating {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s","").toLowerCase();

        Map<String,Long> countMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                                               LinkedHashMap::new,
                                               Collectors.counting()));
        String firstRepeatingChar = countMap
                                   .entrySet()
                                   .stream()
                                   .filter(entry->entry.getValue()>1)
                                   .map(entry->entry.getKey())
                                   .findFirst()
                                   .get();
        System.out.println("First repeating character: "+firstRepeatingChar);

        //for non-repeating character
        String nonRepeating = countMap.entrySet().stream()
                                       .filter(entry->entry.getValue()==1)
                                       .map(entry->entry.getKey())
                                        .findFirst()
                                        .get();
        System.out.println("First non-repeating character : "+nonRepeating);
//        Function.identity() → group by character itself
//        LinkedHashMap::new → preserve original order
//        Collectors.counting() → count occurrences

        //java 7
        //store frequency while preserving the order
        Map<Character,Long> mapCount = new LinkedHashMap<>();
        for(char c :  inputString.toCharArray()){
            mapCount.put(c,mapCount.getOrDefault(c,0L)+1);//c='j' apears first time->(j,0)->0+1

        }
        for(Map.Entry<Character,Long> entry: mapCount.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non-repeating character : "+entry.getKey());
                return;
            }
        }


    }
}
