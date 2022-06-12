package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10974JS {
    public static int n;
    public static int[] numbers;
    public static boolean[] check;
    public static int[] result;

    public static void dfs(int depth){
        if(depth==n) {
            for(int i:result) System.out.print(i+" ");
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++) {
            if(check[i]) continue;
            if (!check[i]) {
                check[i] = true;
                result[depth] = numbers[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        check = new boolean[n];
        result = new int[n];
        for(int i=0; i<n; i++) numbers[i] = i+1;

        dfs(0);
    }
}
