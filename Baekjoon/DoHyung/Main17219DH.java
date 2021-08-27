package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main17219DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int find = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();

            map.put(site, password);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<find;i++) {
            sb.append(map.get(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}
