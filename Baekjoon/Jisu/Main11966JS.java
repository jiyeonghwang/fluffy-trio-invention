package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11966JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n==1){
            System.out.println(1);
            return;
        }

        int idx = 1;
        while(idx<=30){
            int result = (int)Math.pow(2, idx);
            if (result==n) {
                System.out.println(1);
                break;
            }
            else if (result<n) idx+=1;
            else {
                System.out.println(0);
                break;
            }
        }
    }
}
