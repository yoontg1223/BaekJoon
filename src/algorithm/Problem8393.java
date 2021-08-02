package algorithm;

import java.util.Scanner;

/**
 * 백준 8393번
 */
public class Problem8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        System.out.println((A * (A + 1)) / 2);
    }
}

//public class Problem8393 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int A = s.nextInt();
//        int B = 0;
//        for(int i = 1; i < A + 1; i++) {
//            B = B + i;
//        }
//        System.out.println(B);
//    }
//}
