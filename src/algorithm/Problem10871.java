package algorithm;

import java.util.Scanner;

/**
 * 백준 10871번
 */
public class Problem10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        for (int i = 0; i < A; i++) {
            int C = s.nextInt();
            if (B > C) {
                System.out.println(C);
            }
        }
    }
}
