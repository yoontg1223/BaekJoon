package algorithm;

import java.util.Scanner;

/**
 * 백준 11022번
 */
public class Problem11022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for (int i = 1; i <= A; i++) {
            int B = s.nextInt();
            int C = s.nextInt();
            System.out.println("Case" +" #" + i + ": " + B + " + " + C + " = " + (B + C));
        }
    }
}
