package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1769JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int count = 0;
        while (number.length() >= 2){
            long tmp = 0;
            count +=1;
            for (int j = 0; j<number.length(); j++){
                tmp += Long.parseLong(String.valueOf(number.charAt(j)));
            }
            number = String.valueOf(tmp);
        }
        System.out.println(count);
        if (Integer.parseInt(number) % 3 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
