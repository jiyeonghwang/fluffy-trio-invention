package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main11170DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i=0;i<t;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            for (int j=n;j<=m;j++) {
                sb.append(j);
            }

            int zeros = sb.toString().replaceAll("[1-9]", "").length();
            answer.append(zeros+"\n");
        }

        System.out.println(answer);
    }

}

