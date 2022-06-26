package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1138DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] info = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            info[i] = Integer.parseInt(st.nextToken());
        }

        int[] line = new int[n];
        for (int i=1;i<=n;i++) {
            int pass = info[i-1];

            for (int j=0;j< line.length;j++) {
                if (line[j] == 0) {
                    if (pass == 0) {
                        line[j] = i;
                        break;
                    } else {
                        pass--;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            sb.append(line[i]+" ");
        }

        System.out.println(sb);
    }
}