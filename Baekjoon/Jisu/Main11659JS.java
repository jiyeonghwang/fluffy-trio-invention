package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11659JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = br.readLine().split(" ");
        int n = Integer.parseInt(inputStr[0]), m = Integer.parseInt(inputStr[1]);

        String[] numArr = br.readLine().split(" ");

        int[] sumArr = new int[n+1];
        sumArr[1] = Integer.parseInt(numArr[0]);
        for(int i=2; i<=n; i++){
            sumArr[i] = Integer.parseInt(numArr[i-1]) + sumArr[i-1];
        }

        int count = 1;
        while (count<=m){
            String[] range = br.readLine().split(" ");
            int i= Integer.parseInt(range[0]), j = Integer.parseInt(range[1]);
            System.out.println(sumArr[j]-sumArr[i-1]);
            count +=1;
        }
    }
}
