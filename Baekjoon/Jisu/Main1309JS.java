package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1309JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] cage = new int[n+1][3];
        cage[1][0] = 1; cage[1][1] = 1; cage[1][2] = 1;

        for(int i=2; i<=n; i++){
            cage[i][0] = (cage[i-1][0] + cage[i-1][1] + cage[i-1][2])%9901;
            cage[i][1] = (cage[i-1][0] + cage[i-1][2])%9901;
            cage[i][2] = (cage[i-1][0] + cage[i-1][1])%9901;

        }
        int answer = cage[n][0] + cage[n][1] + cage[n][2];
        System.out.println(answer%9901);
    }
}
