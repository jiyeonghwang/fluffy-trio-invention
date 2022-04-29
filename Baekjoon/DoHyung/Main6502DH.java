package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6502DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = 1;
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            int r = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            double d = Math.sqrt(w*w+l*l);
            if (d <= r*2) {
                sb.append("Pizza "+n+" fits on the table.\n");
            } else {
                sb.append("Pizza "+n+" does not fit on the table.\n");
            }

            n++;
        }

        System.out.println(sb);
    }
}