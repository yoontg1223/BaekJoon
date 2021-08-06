package algorithm;

import java.util.Scanner;

/**
 * 백준 10952번
 */
public class Problem10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        while (A + B != 0) {
            System.out.println(A + B);
            A = s.nextInt();
            B = s.nextInt();
        }
    }
}