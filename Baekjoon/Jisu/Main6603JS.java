package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main6603JS {
    public static int k;
    public static int[] s;
    public static int[] answer;
    public static void dfs(int depth, int start){
        if (depth==6) {
            StringBuilder sb = new StringBuilder();
            for (int x:answer) sb.append(x).append(" ");
            System.out.println(sb);
            return;
        }
        for(int i=start ;i<k; i++) {
            answer[depth] = s[i];
            dfs(depth + 1, i+1);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] testCase = br.readLine().split(" ");
            if (testCase[0].equals("0")) break;;

            k = Integer.parseInt(testCase[0]);
            s = new int[k];
            answer = new int[6];
            for (int i = 0; i < k; i++) s[i] = Integer.parseInt(testCase[i+1]);
            dfs(0, 0);
            System.out.println();
        }
    }
}
