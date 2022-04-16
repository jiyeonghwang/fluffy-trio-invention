package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main8974JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);

        int value = 1, answer = 0, count = 0;
        for(int i = 1; i<=b; i++){
            count+=1;
            if(i>=a) answer+=value;
            if(count==value) {
                value+=1;
                count=0;
            }
        }
        System.out.print(answer);
    }
}
