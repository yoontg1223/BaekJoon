package algorithm;

import java.util.Scanner;

/**
 * 백준 11021번
 */
public class Problem11021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for (int i = 1; i <= A; i++) {
            System.out.println("Case" +" #" + i + ": " + (s.nextInt() + s.nextInt()));
        }
    }
}
