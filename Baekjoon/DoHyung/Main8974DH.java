package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8974DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int sum = 0;
        int num = 1;
        int count = 0;
        int idx = 0;
        while (idx < end) {
            if (start-1 <= idx) {
                sum += num;
            }
            count++;

            if (count == num) {
                num++;
                count = 0;
            }
            idx++;
        }

        System.out.println(sum);
    }
}
