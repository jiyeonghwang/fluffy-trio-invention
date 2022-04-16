package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5347JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String input = br.readLine();

            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);

            int answer =0, mul = 1;
            while (true){
                if((a*mul)%b==0) {
                    answer = a*mul;
                    break;
                }
                mul+=1;
            }
            System.out.println(answer);
        }
    }
}
