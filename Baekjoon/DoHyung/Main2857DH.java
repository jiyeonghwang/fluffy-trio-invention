package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2857DH {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<5;i++) {
            if (br.readLine().contains("FBI")) {
                sb.append(i+1).append(" ");
            }
        }

        if (sb.length() == 0) {
            sb.append("HE GOT AWAY!");
        }

        System.out.println(sb);
    }
}
