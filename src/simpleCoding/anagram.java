package simpleCoding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagram {
    public static void main(String[] args) {
        String s1= "Mother in law".replaceAll("\\s","").toLowerCase();
        String s2="Hitler woman".replaceAll("\\s","").toLowerCase();
        s1 = Stream.of(s1.split(""))
                        .sorted()
                        .collect(Collectors.joining());
        s2 = Stream.of(s2.split(""))
                        .sorted()
                       .collect(Collectors.joining());
        if(s1.equals(s2)) {
            System.out.println("An anagram");
        }else{
            System.out.println("Not An anagram");
        }


        boolean isAnagram = Arrays.equals(s1.chars()
                                            .sorted()
                                            .toArray(), s2.chars()
                                                           .sorted()
                                                           .toArray());

        System.out.println(isAnagram?"An anagram":"Not anagram");
        
     //   java 7
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       if( Arrays.equals(arr1, arr2)) {
    	   System.out.println("anagram");
       }else {
    	   System.out.println("not anagram");   
    	  
       }
   


    }
}
