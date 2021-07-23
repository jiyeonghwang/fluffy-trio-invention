package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1357JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] number = br.readLine().split(" ");
        int[] reverse = new int[2];

        for (int i = 0; i<number.length; i++){
            int front = Integer.parseInt(number[i]);
            int tmp = 0;
            while(front > 0){
                tmp = 10 * tmp + (front % 10);
                front = front/10;
            }
            reverse[i] = tmp;
        }
        int sum = reverse[0] + reverse[1];
        int answer = 0;
        while(sum > 0){
            answer = answer * 10 + (sum%10);
            sum = sum/10;
        }
        System.out.println(answer);
    }
}
