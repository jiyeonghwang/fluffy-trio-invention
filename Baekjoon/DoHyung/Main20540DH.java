package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20540DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (char c:mbti.toCharArray()) {
            if (c == 'E') {
                sb.append("I");
            } else if (c == 'I') {
                sb.append("E");
            } else if (c == 'S') {
                sb.append("N");
            } else if (c == 'N') {
                sb.append("S");
            } else if (c == 'T') {
                sb.append("F");
            } else if (c == 'F') {
                sb.append("T");
            } else if (c == 'J') {
                sb.append("P");
            } else if (c == 'P') {
                sb.append("J");
            }
        }

        System.out.println(sb);
    }
}
