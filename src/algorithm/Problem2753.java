package algorithm;

import java.util.Scanner;

/**
 * 백준 2753번
 */
public class Problem2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if(A % 100 != 0) {
            if(A % 4 == 0) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        else if (A % 400 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
