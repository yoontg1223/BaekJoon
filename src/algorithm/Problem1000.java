package algorithm;

import java.util.Scanner;

/**
 * 백준 1000번
 */
public class Problem1000 {

    public static int test1(int A,int B){
        int C = A + B;
        return C;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int D = test1(A,B);
        System.out.println(D);
    }
}