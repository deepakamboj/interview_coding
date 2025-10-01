package simpleCoding;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = number > 1 && IntStream.rangeClosed(2, number/2)
                              .noneMatch(i -> number % i == 0);
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");

        }
    }
}