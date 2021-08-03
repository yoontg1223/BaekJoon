package algorithm;

import java.util.Scanner;

/**
 * 백준 2438번
 */
public class Problem2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
