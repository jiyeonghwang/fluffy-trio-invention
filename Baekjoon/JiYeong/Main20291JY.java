package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main20291JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        while (cnt > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            String name = st.nextToken();
            String type = st.nextToken();
            if (map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }

            cnt--;
        }

        // List<String> typeList = map.keySet().stream().sorted().toList();
        List<String> typeList = new ArrayList<>(map.keySet());
        Collections.sort(typeList);

        for (String s : typeList) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
