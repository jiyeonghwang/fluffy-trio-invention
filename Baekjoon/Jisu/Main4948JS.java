package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4948JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            if (input.equals("0")) break;

            int n = Integer.parseInt(input);
            if (n == 1) {
                System.out.println(1);
                continue;
            }

            int answer = 0;
            for(int i=n+1; i<=n*2; i++){
                boolean flag = true;
                for(int j=2; j<Math.sqrt(i); j++){
                    if (i%j==0) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer+=1;
            }
            System.out.println(answer);
        }
    }
}
