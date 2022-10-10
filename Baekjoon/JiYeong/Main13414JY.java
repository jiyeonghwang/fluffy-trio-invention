package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main13414JY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> hs = new LinkedHashSet<>();
        while (total > 0) {
            String s = br.readLine();
            if (hs.contains(s)) hs.remove(s);
            hs.add(s);
            total--;
        }

        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if(--max < 1) break;
        }
    }
}
