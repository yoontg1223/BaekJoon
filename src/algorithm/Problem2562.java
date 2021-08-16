package algorithm;

import java.util.Scanner;

/**
 * 백준 2562번
 */
public class Problem2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] A = new int [9];
        for (int i = 0; i < 9; i++) {
            A[i] = s.nextInt();
        }
        int max = A[0];
        int B = 1;
        for (int i = 0; i < 9; i++) {
            if (max < A[i]) {
                max = A[i];
                B = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(B);
    }
}
