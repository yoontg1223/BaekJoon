package algorithm;
import java.util.Scanner;

/**
 * 백준 1002번
 */
public class Problem1002 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int A = s.nextInt();
            int B = s.nextInt();
            int C = s.nextInt();
            int D = s.nextInt();
            int E = s.nextInt();
            int F = s.nextInt();
            System.out.println(solve(A,B,C,D,E,F));
        }

    }

    public  static int solve(int A , int B , int C , int D , int E , int F) {
        if(A == D && B == E) {
            if(C == F) {
                return -1;
            }
            else {
                return 0;
            }
        }
        double G = Math.sqrt(Math.pow(D - A,2) + Math.pow(E - B,2));
        if(C + F == G || Math.abs(C - F) == G) {
            return 1;
        }
        if(C + F > G) {
            if(Math.abs(C - F) > G) {
                return 0;
            }
            return 2;
        }
        if(C + F < G) {
            return 0;
        }
        return 0;
    }
}
