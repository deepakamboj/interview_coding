package simpleCoding;

import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        System.out.println("Sum of array : "+sum);
        Double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average of array :"+average);
    }
}
