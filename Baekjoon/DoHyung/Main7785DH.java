package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main7785DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Comparator<String> comparator = (s1,s2) -> s2.compareTo(s1);
        TreeMap<String, Integer> logMap = new TreeMap<String, Integer>(comparator);
        StringTokenizer st = null;
        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                logMap.put(name, 1);
            } else {
                logMap.remove(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s:logMap.keySet()) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}