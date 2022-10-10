package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main9375JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Map<String, Integer> map;
        while (cnt > 0) {
            map = new HashMap<>();
            int total = Integer.parseInt(br.readLine());
            while (total > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                if (map.containsKey(type)) {
                    map.put(type, map.get(type) + 1);
                } else {
                    map.put(type, 1);
                }
                total--;
            }

            int result = 1;
            for (int i : map.values()) {
                result *= i+1;
            }

            cnt--;

            System.out.println(result-1);
        }
    }
}
