package algorithm;

import java.util.Scanner;

/**
 * 백준 9498번
 */
public class Problem9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if (90 <= A && A <= 100) {
            System.out.println("A");
        }
        else if (80 <= A && A <= 89) {
            System.out.println("B");
        }
        else if (70 <= A && A <= 79) {
            System.out.println("C");
        }
        else if (60 <= A && A <= 69) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
