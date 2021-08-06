package algorithm;

import java.util.Scanner;

/**
 * 백준 1110번
 */
public class Problem1110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = A;
        int G = 0;
        while (true) {
            int F = B % 10;
            if (B < 10) {
                B = 10 * B;
            }
            int C = B / 10;
            int D = B % 10;
            int E = (C + D) % 10;
            B = F * 10 + E;
            G = G + 1;
            if (A == B) {
                System.out.println(G);
                break;
            }
        }
    }
}