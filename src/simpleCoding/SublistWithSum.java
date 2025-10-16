package simpleCoding;

import java.util.Arrays;
import java.util.List;

import java.util.*;

public class SublistWithSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int targetSum = 6;
        list.addFirst(4);
      System.out.println(list);
      
        for (int i = 0; i < list.size(); i++) {
            int sum = 0;
            for (int j = i; j < list.size(); j++) {
            	  sum = sum+list.get(j);
                if (sum == targetSum) {
                    System.out.println("Sublist with sum " + targetSum + ": " + list.subList(i, j + 1));
                }
            }
        }
    }
}
