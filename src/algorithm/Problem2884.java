package algorithm;

import java.util.Scanner;

/**
 * 백준 2884번
 */
public class Problem2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = 60 * A + B - 45;
        if (C < 0) {
            System.out.print("23" + " ");
            System.out.println(60 + (C % 60));
        }
        else {
            System.out.print(C / 60);
            System.out.print(" ");
            System.out.print(C % 60);
        }
    }
}