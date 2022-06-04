package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1748JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int idx = 10, answer =0, digit=1;
        for(int i=1; i<=n; i++){
            if (i==idx) {
                idx *= 10;
                digit += 1;
            }
            answer+=digit;
        }
        System.out.println(answer);
    }
}
