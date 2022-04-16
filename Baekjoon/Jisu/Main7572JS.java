package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main7572JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] gan = new int[10];
        String[] zi = new String[12];

        for(int i=0; i<10; i++) gan[i] = i;
        for(int i=0; i<12; i++) zi[i] = String.valueOf((char)('A'+i));

        int ganIdx = 0, ziIdx = 0, remainder = n%60;

        if (remainder < 4){
            ganIdx = gan.length - (4-remainder);
            ziIdx = zi.length - (4-remainder);
        }

        for(int i=4; i<n%60; i++){
            ganIdx +=1;
            ziIdx+=1;
            if (ganIdx==10) ganIdx =0;
            if (ziIdx==12) ziIdx = 0;
        }
        String answer = zi[ziIdx] + gan[ganIdx];
        System.out.print(answer);
    }
}
