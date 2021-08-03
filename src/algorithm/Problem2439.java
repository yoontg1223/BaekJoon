package algorithm;

import java.util.Scanner;

/**
 * 백준 2439번
 */
public class Problem2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for (int i = 1; i <= A; i++) {
            for (int k = A - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
