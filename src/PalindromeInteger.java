import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PalindromeInteger {
    public static void main(String[] args) {
        int number = 12321;
        int original = number;
        int reverse=0;
        while(number>0){
            int digit = number % 10;
            reverse = reverse*10 + digit;
            number = number/10;
        }
        if(original==reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }


        //java 8
       String str= String.valueOf(number);//converted into string then string wala logic hi lgega
        boolean isPalindrome = IntStream.rangeClosed(0, str.length()/2)
                                        .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        if(isPalindrome){
            System.out.println("palindrome");
        }else{
        System.out.println("not palindrome");

        }
    }}
//difference between range() and rangeClosed()
//✅ Use range(0, len/2) for palindrome check (minimal comparisons).
//rangeClosed(0, len/2) works too, but adds an extra (redundant) check.
//        For "abba" (length=4 → length/2=2):
//        range(0, 2) → indices [0,1] → compare a==a and b==b ✅
//        rangeClosed(0, 2) → indices [0,1,2] → compares middle b==b again (redundant but not harmful).

//        For "abcba" (length=5 → length/2=2):
//        range(0, 2) → [0,1] → compare a==a and b==b ✅
//        rangeClosed(0, 2) → [0,1,2] → compares middle c==c too (unnecessary).
