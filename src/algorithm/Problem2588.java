package algorithm;

import java.util.Scanner;

/**
 * 백준 2588번
 */
public class Problem2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = B % 10;
        int D = (B / 10) % 10;
        int E = B / 100;
        System.out.println(A * C);
        System.out.println(A * D);
        System.out.println(A * E);
        System.out.println(A * B);
    }
}
