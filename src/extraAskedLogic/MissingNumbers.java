package extraAskedLogic;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {

		int a[] = {9, 8, 6, 5, 3, 2, 12, 14, 16, 18, 19};

        Arrays.sort(a); // Sort the array first
        //[2, 3, 5, 6, 8, 9, 12, 14, 16, 18, 19]
        

        System.out.print("Missing numbers: ");
        for (int i = 1; i <= 20; i++) {
            boolean found = false;
            for (int num : a) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
            	
                System.out.print(i + " ");
            }
        }
	}

}
