package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5218DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();

            sb.append("Distances:");
            for (int j=0;j<first.length();j++) {
                int diff = second.charAt(j)-first.charAt(j);
                if (diff<0) {
                    diff += 26;
                }
                sb.append(" ").append(diff);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}

