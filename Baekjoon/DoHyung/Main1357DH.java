package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1357DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder(st.nextToken());
        int first = Integer.parseInt(sb.reverse().toString());

        sb = new StringBuilder(st.nextToken());
        int second = Integer.parseInt(sb.reverse().toString());

        sb = new StringBuilder(String.valueOf(first+second));
        int answer = Integer.parseInt(sb.reverse().toString());

        System.out.println(answer);
    }
}
