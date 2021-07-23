package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11383DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] ori = new String[n];
        for (int i=0;i<n;i++) {
            ori[i] = br.readLine();
        }

        String[] ext = new String[n];
        for (int i=0;i<n;i++) {
            ext[i] = br.readLine();
        }

        boolean isSame = true;

        for (int i=0;i<n;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<m;j++) {
                sb.append(ori[i].charAt(j)).append(ori[i].charAt(j));
            }

            if (!sb.toString().equals(ext[i])) {
                isSame = false;
                break;
            }
        }

        System.out.println((isSame)?"Eyfa":"Not Eyfa");
    }
}
