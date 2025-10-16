package extraAskedLogic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortBasedonFrequency {
	// int[] inputArray= {2,2,1,3,3,3,4,4,4,4,5,6,7,8};
	//int[] output = [1, 5, 6, 7, 8, 2, 2, 3, 3, 3, 4, 4, 4, 4];
	public static void main(String[] args) {
		int[] inputArray= {2,2,1,3,3,3,4,4,4,4,5,6,7,8};
		Map<Integer, Long> frequnecyMap = Arrays.stream(inputArray)
				                           .boxed()
				                           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//frequnecyMap.replace(1, 10L);
		System.out.println(frequnecyMap);
		List<Integer> list = Arrays.stream(inputArray)
				                   .boxed()
				                   .sorted(Comparator.comparing(frequnecyMap::get))
				                   .collect(Collectors.toList());
		System.out.println(list);
		

//frequencyMap::get-->Function that takes key and returns value-->Long (count)
//.sorted(Comparator.comparingLong(frequnecyMap::get).reversed())-->[4, 4, 4, 4, 3, 3, 3, 2, 2, 1, 5, 6, 7, 8]
	}

}
