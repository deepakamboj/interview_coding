package extraAskedLogic;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullandEmptyandWhitespace {
	//remove null and empty and print remaining strings using java 8
	public static void main(String[] args) {
		List<String> items = Arrays.asList("Java", "", null, " " ,"Stream");
		
		items.stream().filter(s->Objects.nonNull(s)) //Objects::nonNull
		              .filter(s->!s.trim().isEmpty())
		              .forEach(System.out::println);
		
	}

}
/*
 * Objects::nonNull → filters out all null values safely. 
 * s ->!s.trim().isEmpty() → removes empty ("") and blank (" ") strings.
 * s.isEmpty()     // → returns true or false
   s.trim()        // → returns a String (after removing spaces)
   ! (Logical NOT)-->reverses the boolean result.Keeps strings that are not empty after trimming.

 */

