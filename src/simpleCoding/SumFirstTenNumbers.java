package simpleCoding;

import java.util.stream.IntStream;

public class SumFirstTenNumbers {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();
        System.out.println(sum);
    }
}
