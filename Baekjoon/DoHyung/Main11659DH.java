package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] sums = new int[n+1];
        int sum = 0;
        for (int i=1;i<=n;i++) {
            sum += Integer.parseInt(st.nextToken());
            sums[i] = sum;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken());

            sb.append(sums[end]-sums[start]+"\n");
        }

        System.out.println(sb);
    }
}
