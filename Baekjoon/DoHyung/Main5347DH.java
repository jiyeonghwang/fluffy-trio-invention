package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5347DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long num1 = Long.parseLong(st.nextToken());
            long num2 = Long.parseLong(st.nextToken());

            sb.append(LCM(Math.min(num1, num2), Math.max(num1, num2))+"\n");
        }

        System.out.println(sb);
    }

    public static long LCM(long smallNum, long bigNum) {
        long gcd = GCD(smallNum, bigNum);
        long lcm = (smallNum * bigNum) / gcd;

        return lcm;
    }

    public static long GCD(long smallNum, long bigNum) {
        long mod;
        while ((mod = bigNum % smallNum) > 0) {
            bigNum = smallNum;
            smallNum = mod;
            mod = bigNum % smallNum;
        }
        return smallNum;
    }
}