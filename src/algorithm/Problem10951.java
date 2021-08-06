package algorithm;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 백준 10951번
 */
public class Problem10951 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A,B;
        while (true) {
            try {
                A = s.nextInt();
                B = s.nextInt();
                System.out.println(A + B);
            }
            catch (NoSuchElementException e) {
                break;
            }
        }
    }
}
