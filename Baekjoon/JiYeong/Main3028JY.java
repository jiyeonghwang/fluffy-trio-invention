package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3028JY {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] clist = br.readLine().toCharArray();

        int[] result = {1, 0, 0};
        int temp = 0;

        for (char c : clist) {
            if ( c == 'A') {
                temp = result[1];
                result[1] = result[0];
                result[0] = temp;
            } else if ( c == 'B') {
                temp = result[2];
                result[2] = result[1];
                result[1] = temp;
            } else if ( c == 'C') {
                temp = result[2];
                result[2] = result[0];
                result[0] = temp;
            }
        }

        if (result[0] == 1) {
            System.out.println(1);
        } else if (result[1] == 1) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}

