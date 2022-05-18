package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main13410JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] gugudan = new int[k+1];
        for(int i=1; i<=k; i++){
            int reverse = 0;
            int num = n*i;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            gugudan[i] = reverse;
        }
        Arrays.sort(gugudan);
        System.out.println(gugudan[gugudan.length-1]);
    }
}
