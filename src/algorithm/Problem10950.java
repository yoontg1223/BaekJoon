package algorithm;

import java.util.Scanner;

/**
 * 백준 10950번
 */
public class Problem10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i = 0; i < T; i++) {
            System.out.println(s.nextInt() + s.nextInt());
        }
    }
}
