package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11966DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println("1");
            return;
        }

        while (n > 1) {
            if (n%2 == 0) {
                n/=2;
            } else {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}
