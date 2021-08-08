package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1769DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;

        if (input.length() == 1) {

        } else {
            long num = 0L;

            while (true) {
                count++;
                for (int i=0;i<input.length();i++) {
                    num+=input.charAt(i)-'0';

                }

                input = String.valueOf(num);
                if (num<10) {
                    break;
                } else {
                    num = 0L;
                }
            }
        }

        if (Integer.parseInt(input)%3 == 0) {
            System.out.println(count+"\nYES");
        } else {
            System.out.println(count+"\nNO");
        }
    }
}
