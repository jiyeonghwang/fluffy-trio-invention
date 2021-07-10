package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20540JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] oopResult = br.readLine().toCharArray();
        String result = "";

        for (char c : oopResult) {
            if (c == 'E') {
                result += "I";
            } else if (c == 'I') {
                result += "E";
            } else if (c == 'S') {
                result += "N";
            } else if (c == 'N') {
                result += "S";
            } else if (c == 'T') {
                result += "F";
            } else if (c == 'F') {
                result += "T";
            } else if (c == 'J') {
                result += "P";
            } else if (c == 'P') {
                result += "J";
            }
        }

        System.out.println(result);
    }
}
