import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {


        String str = "No lemon no melon";
        String original = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals( reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        //java 8
         int length=original.length();
        boolean isPalindrome = IntStream.rangeClosed(0, length/2)
                                        .allMatch(i->original.charAt(i)==original.charAt(length-i-1));
        if (isPalindrome)
        {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}