package algorithm;

import java.util.Scanner;

/**
 * 백준 10818번
 */
public class Problem10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int[] B = new int[A];
        for (int i = 0; i < A; i++) {
            B[i] = s.nextInt();
        }
        int min = B[0];
        int max = B[0];
        for (int i = 0; i < A; i++) {
            if (min > B[i]) {
                min = B[i];
            }
            if (max < B[i]) {
                max = B[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
