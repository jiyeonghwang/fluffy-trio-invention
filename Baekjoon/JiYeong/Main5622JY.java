package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5622JY{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int result = 0;
        for (char c : input) {
            if (c == 'A' || c == 'B' || c == 'C') {
                result += 2;
            } else if (c == 'D' || c == 'E' || c == 'F') {
                result += 3;
            } else if (c == 'G' || c == 'H' || c == 'I') {
                result += 4;
            } else if (c == 'J' || c == 'K' || c == 'L') {
                result += 5;
            } else if (c == 'M' || c == 'N' || c == 'O') {
                result += 6;
            } else if (c == 'P' || c == 'Q' || c == 'R' || c== 'S') {
                result += 7;
            } else if (c == 'T' || c == 'U' || c == 'V') {
                result += 8;
            } else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                result += 9;
            }
        }

        System.out.println(result + input.length);
    }
}
