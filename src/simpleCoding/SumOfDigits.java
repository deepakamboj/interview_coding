package simpleCoding;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 12345;
        int addition = String.valueOf(number)    // "12345"
                .chars()                        // IntStream of ascii value of each '1','2','3','4','5'
                .map(c -> c - '0')          // convert char to int('1'-'0'= 49-48 = 1)
                .sum();                        // sum all digits

        System.out.println(addition);
    }
}
