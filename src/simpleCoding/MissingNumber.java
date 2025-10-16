package simpleCoding;

import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Find the missing number in an array.
		 *  int[] nums = {1,3,4,5} 
		 *  output = 2
		 */
		int[] nums = {1,3,4,5};
		int n = nums.length+1;
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		for(int num:nums) {
			actualSum+=num;
		}
		int missingNumber = expectedSum-actualSum;
		System.out.println(missingNumber+" - is missing");
		
		//java 8
		int realSum = IntStream.of(nums).sum();
		int missedNumber = expectedSum-realSum;
		System.out.println(missedNumber+" - is missing");
	}

}
