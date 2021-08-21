package Jisu;

import java.io.*;

public class Main3028JS {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] cups = {true, false, false};
        char[] charArray = br.readLine().toCharArray();
        int answer = 0;

        for (char x:charArray){
            switch (x){
                case 'A':
                    boolean tmpA = cups[0];
                    cups[0] = cups[1];
                    cups[1] = tmpA;
                    break;
                case 'B':
                    boolean tmpB = cups[1];
                    cups[1] = cups[2];
                    cups[2] = tmpB;
                    break;
                case 'C':
                    boolean tmpC = cups[2];
                    cups[2] = cups[0];
                    cups[0] = tmpC;
                    break;
            }
        }

        for(int i = 0; i < cups.length; i ++){
            if (cups[i]) answer = i+1;
        }
        System.out.println(answer);
    }
}
