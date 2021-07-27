package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1003번
 */
public class Problem1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        int U = Integer.parseInt(T);
        for (int j = 0; j < U; j++) {
            String A = br.readLine();
            int B = Integer.parseInt(A);
            if (B == 0) {
                System.out.println(1 + " " + 0);
            }
            else {
                int[] array1 = new int[B + 1];
                array1[1] = 1;
                for (int i = 2; i < B + 1; i++) {
                    array1[i] = array1[i - 1] + array1[i - 2];
                }
                System.out.println(array1[B - 1] + " " + array1[B]);
            }
        }
    }
}