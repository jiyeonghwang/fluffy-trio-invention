package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main5618JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(input[i]);
        Arrays.sort(arr);

        for(int i=1; i<arr[0]; i++){
            boolean flag = true;
            for (int j : arr) {
                if (j % i != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag)  System.out.println(i);
        }
    }
}
