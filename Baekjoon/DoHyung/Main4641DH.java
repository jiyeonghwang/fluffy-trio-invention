package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4641DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        StringBuilder sb = new StringBuilder();
        while (!(input=br.readLine()).equals("-1")) {
            StringTokenizer st = new StringTokenizer(input);
            int n = st.countTokens();
            int[] check = new int[200];
            int[] arr = new int[n];

            for (int i=0;i<n-1;i++) {
                int num = Integer.parseInt(st.nextToken());
                check[num] = 1;
                arr[i] = num;
            }

            int count = 0;
            for (int i=0;i<arr.length;i++) {
                if (check[arr[i]*2] == 1) {
                    count++;
                }
            }

            sb.append(count+"\n");
        }

        System.out.println(sb);
    }
}
