package simpleCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeperateZeros {

	public static void main(String[] args) {
		int[] arr = {14, 0, 5, 2, 0, 3, 0};
		//starts with zeros
//		//way 1
//		int[] result = IntStream.concat(Arrays.stream(arr).filter(n->n==0),Arrays.stream(arr).filter(n->n!=0)).toArray();
//		System.out.println("Starts with zeros : "+Arrays.toString(result));
		
		//way 2
		List<Integer> list = Arrays.asList(14, 0, 5, 2, 0, 3, 0);
		Stream.concat(list.stream().filter(n->n==0), list.stream().filter(n->n!=0)).forEach(x->System.out.print(x+" "));
		
		//Ends with zeros
		Stream<Integer> listResult = Stream.concat(list.stream().filter(n->n!=0), list.stream().filter(n->n==0));
		System.out.println();
		listResult.forEach(x->System.out.print(x+" "));
	}

}
