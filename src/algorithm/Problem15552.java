package algorithm;

import java.io.*;

/**
 * 백준 15552번
 */
public class Problem15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String[] s = bf.readLine().split(" ");
            int fst = Integer.parseInt(s[0]);
            int snd = Integer.parseInt(s[1]);
            bw.write(Integer.toString(fst + snd));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
