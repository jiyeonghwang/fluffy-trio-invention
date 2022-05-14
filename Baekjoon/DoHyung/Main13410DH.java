package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main13410DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=k;i++) {
            int num = Integer.parseInt(sb.append(i*n).reverse().toString());
            answer = Math.max(answer, num);

            sb.setLength(0);
        }

        System.out.println(answer);
    }

}

