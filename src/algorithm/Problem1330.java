package algorithm;

import java.util.Scanner;

/**
 * 백준 1330번
 */
public class Problem1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        if(A > B) {
            System.out.println(">");
        }
        else if(A < B) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}
