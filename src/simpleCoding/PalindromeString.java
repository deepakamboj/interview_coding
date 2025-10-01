package simpleCoding;

import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {


        String str = "No lemon no melon".replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals( reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        //java 8

        boolean isPalindrome = IntStream.rangeClosed(0, str.length()/2)
                                        .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        if (isPalindrome)
        {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}