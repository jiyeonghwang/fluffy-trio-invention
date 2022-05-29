package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main12836DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] account = new long[n];

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<q;i++) {
            st = new StringTokenizer(br.readLine());
            if (Integer.parseInt(st.nextToken()) == 1) {
                account[Integer.parseInt(st.nextToken())-1] += Long.parseLong(st.nextToken());
            } else {
                long sum = 0;
                int start = Integer.parseInt(st.nextToken())-1;
                int end = Integer.parseInt(st.nextToken());
                for (int j=start;j<end;j++) {
                    sum += account[j];
                }
                sb.append(sum+"\n");
            }
        }

        System.out.println(sb);
    }
}
