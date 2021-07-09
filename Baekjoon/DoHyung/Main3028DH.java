package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3028DH {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int ball = 1;
        for (char c:input.toCharArray()) {
            if (c == 'A') {
                if (ball == 1) {
                    ball = 2;
                } else if (ball == 2) {
                    ball = 1;
                }
            } else if (c == 'B') {
                if (ball == 2) {
                    ball = 3;
                } else if (ball == 3) {
                    ball = 2;
                }
            } else {
                if (ball == 1) {
                    ball = 3;
                } else if (ball == 3) {
                    ball = 1;
                }
            }
        }

        System.out.println(ball);
    }

}

