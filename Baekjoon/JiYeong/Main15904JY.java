package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main15904JY {
    public String solution(String x) {
        int result = 0;

        for(char c : x.toCharArray()) {
            if (c == 'U' && result == 0) {
                result = 1;
            } else if ( c == 'P' && result == 2) {
                result = 3;
            } else if ( c == 'C' && result == 1) {
                result = 2;
            } else if ( c == 'C' && result == 3) {
                return "I love UCPC";
            }
        }

        return "I hate UCPC";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        ArrayList<String> list = new ArrayList<>();

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String x = br.readLine();
            Main15904JY main = new Main15904JY();
            System.out.println(main.solution(x));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}

