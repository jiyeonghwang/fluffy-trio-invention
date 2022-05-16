package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11170JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int answer = 0;

            for(int j=n; j<=m; j++){
                String str = String.valueOf(j);
                answer += str.length() - str.replace("0", "").length();
            }
            System.out.println(answer);
        }
    }
}
