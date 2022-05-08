package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main6502JY {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        int cnt = 1;
        while (!(temp = br.readLine()).equals("0")) {
            String[] arr = temp.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            if ( (a*2)*(a*2) >= (b*b + c*c)) {
                System.out.println("Pizza " + cnt + " fits on the table.");
            } else {
                System.out.println("Pizza " + cnt + " does not fit on the table.");
            }
            cnt++;
        }
    }
}
