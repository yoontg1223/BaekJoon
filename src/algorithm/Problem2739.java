package algorithm;

import java.util.Scanner;

/**
 * 백준 2739번
 */
public class Problem2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for (int i = 1; i < 10; i++) {
            int B = A * i;
            System.out.println(A + " * " + i + " = " + B);
        }
    }
}
