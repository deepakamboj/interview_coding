package extraAskedLogic;

import javax.imageio.stream.ImageInputStream;

public class PermutationsOfString {
    //Function to swap characters
    private static String swap(String str,int i,int j){
        char[] arr = str.toCharArray();
        
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return new String(arr);
    }
    private static void generatePermutations(String str,int left,int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int k = left; k <= right; k++) {
                str = swap(str, left, k);                    //swap
                generatePermutations(str, left + 1, right);   //recurse
                str = swap(str, left, k);                    //backtrack
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        generatePermutations(str,0,str.length()-1);
    }
}
