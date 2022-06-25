package Jisu;

import java.util.Scanner;

public class Main1182JS {
    public static int n;
    public static int s;
    public static int answer;
    public static int[] numbers;
    public static void dfs(int depth, int sum){
        if(depth == n) {
            if (sum == s) answer+=1;
            return;
        }
        dfs(depth+1, sum);
        dfs(depth+1, sum+numbers[depth]);
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();
        numbers = new int[n];

        for(int i=0; i<n; i++) numbers[i] = sc.nextInt();

        dfs(0, 0);

        if (s==0) answer -=1;
        System.out.println(answer);
    }
}