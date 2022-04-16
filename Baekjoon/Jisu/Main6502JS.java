package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main6502JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 1;
        while(true){
            String input = br.readLine();
            if (input.equals("0")) break;

            String[] inputArr = input.split(" ");
            int r = Integer.parseInt(inputArr[0]);
            double w = Integer.parseInt(inputArr[1]);
            double l = Integer.parseInt(inputArr[2]);

            double w2 = w/2, l2 = (l/2)*(l/2);
            if(r>=Math.sqrt(w2+l2)) System.out.println("Pizza "+idx+" fits on the table.");
            else System.out.println("Pizza "+idx+" does not fit on the table.");
            idx+=1;
        }

    }
}
