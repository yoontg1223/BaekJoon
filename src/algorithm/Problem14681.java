package algorithm;

import java.util.Scanner;

/**
 * 백준 14681번
 */
public class Problem14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        if (A > 0) {
            if (B > 0) {
                System.out.println("1");
            }
            else {
                System.out.println("4");
            }
        }
        else {
            if (B > 0) {
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }
        }
    }
}
