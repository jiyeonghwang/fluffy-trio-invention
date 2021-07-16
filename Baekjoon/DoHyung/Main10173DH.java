package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10173DH {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = null;
        while (!(input = br.readLine()).equals("EOI")) {
            if (input.toLowerCase().contains("nemo")) {
                sb.append("Found").append("\n");
            } else {
                sb.append("Missing").append("\n");
            }
        }

        System.out.println(sb);
    }
}
