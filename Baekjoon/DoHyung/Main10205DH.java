package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10205DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            sb.append("Data Set ").append(i+1).append(":\n");

            int heads = Integer.parseInt(br.readLine());
            String attack = br.readLine();

            for (int j=0;j<attack.length();j++) {
                if (attack.charAt(j) == 'c') {
                    heads++;
                } else {
                    heads--;
                }
            }

            sb.append(heads).append("\n\n");
        }

        System.out.println(sb);
    }
}
