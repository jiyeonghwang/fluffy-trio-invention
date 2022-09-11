package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main9375DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nOfTestCases = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<nOfTestCases;i++) {
            int nOfClothes = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<String, Integer>();

            for (int j=0;j<nOfClothes;j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                map.put(type, map.getOrDefault(type, 0)+1);
            }

            int count = 0;

            if (map.size() != 1) {
                int total = 1;

                for (String key:map.keySet()) {
                    total *= map.get(key)+1;
                }

                count += (total-1);
            } else {
                count = nOfClothes;
            }

            sb.append(count+"\n");
        }

        System.out.println(sb);
    }
}
