package etc;

import java.util.*;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 100 && n >= -100) {
            String s = String.valueOf(n);
            System.out.println("good job");
        } else {
            System.out.println("wrong");
        }
    }
}