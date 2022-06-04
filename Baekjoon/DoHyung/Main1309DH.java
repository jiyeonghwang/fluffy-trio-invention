package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1309DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] cage = new long[n+1][3];
        Arrays.fill(cage[1], 1);

        for (int i=2;i<=n;i++) {
            cage[i][0] = (cage[i-1][0] + cage[i-1][1] + cage[i-1][2])%9901;
            cage[i][1] = (cage[i-1][0] + cage[i-1][2])%9901;
            cage[i][2] = (cage[i-1][0] + cage[i-1][1])%9901;
        }

        long sum = 0;
        for (int i=0;i<3;i++) {
            sum += cage[n][i];
        }

        System.out.println(sum%9901);
    }
}
